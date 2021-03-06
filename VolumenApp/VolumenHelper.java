package VolumenApp;


/**
* VolumenApp/VolumenHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Volumen.idl
* viernes 14 de noviembre de 2014 03:55:25 PM PET
*/

abstract public class VolumenHelper
{
  private static String  _id = "IDL:VolumenApp/Volumen:1.0";

  public static void insert (org.omg.CORBA.Any a, VolumenApp.Volumen that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static VolumenApp.Volumen extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (VolumenApp.VolumenHelper.id (), "Volumen");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static VolumenApp.Volumen read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_VolumenStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, VolumenApp.Volumen value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static VolumenApp.Volumen narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof VolumenApp.Volumen)
      return (VolumenApp.Volumen)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      VolumenApp._VolumenStub stub = new VolumenApp._VolumenStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static VolumenApp.Volumen unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof VolumenApp.Volumen)
      return (VolumenApp.Volumen)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      VolumenApp._VolumenStub stub = new VolumenApp._VolumenStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
