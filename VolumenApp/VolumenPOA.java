package VolumenApp;


/**
* VolumenApp/VolumenPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Volumen.idl
* viernes 14 de noviembre de 2014 03:55:25 PM PET
*/

public abstract class VolumenPOA extends org.omg.PortableServer.Servant
 implements VolumenApp.VolumenOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("volumen", new java.lang.Integer (0));
    _methods.put ("shutdown", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // VolumenApp/Volumen/volumen
       {
         double radio = in.read_double ();
         double $result = (double)0;
         $result = this.volumen (radio);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 1:  // VolumenApp/Volumen/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:VolumenApp/Volumen:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Volumen _this() 
  {
    return VolumenHelper.narrow(
    super._this_object());
  }

  public Volumen _this(org.omg.CORBA.ORB orb) 
  {
    return VolumenHelper.narrow(
    super._this_object(orb));
  }


} // class VolumenPOA