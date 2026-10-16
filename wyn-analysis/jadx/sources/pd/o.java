package pd;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import me.C3558a;

/* loaded from: classes5.dex */
public final class o extends p {

    /* renamed from: d, reason: collision with root package name */
    public static final C3558a f43583d;

    /* renamed from: e, reason: collision with root package name */
    public static final C3558a f43584e;

    /* renamed from: f, reason: collision with root package name */
    public static final C3558a f43585f;

    /* renamed from: g, reason: collision with root package name */
    public static final C3558a f43586g;

    /* renamed from: h, reason: collision with root package name */
    public static final C3558a f43587h;

    /* renamed from: i, reason: collision with root package name */
    public static final C3558a f43588i;

    /* renamed from: j, reason: collision with root package name */
    public static final Method f43589j;
    public static final Method k;

    /* renamed from: l, reason: collision with root package name */
    public static final Method f43590l;

    /* renamed from: m, reason: collision with root package name */
    public static final Method f43591m;

    /* renamed from: n, reason: collision with root package name */
    public static final Method f43592n;

    /* renamed from: o, reason: collision with root package name */
    public static final Method f43593o;

    /* renamed from: p, reason: collision with root package name */
    public static final Constructor f43594p;

    static {
        char c10;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Class<?> cls;
        Logger logger = p.f43595b;
        Class<?> cls2 = Boolean.TYPE;
        Constructor<?> constructor = null;
        f43583d = new C3558a(null, "setUseSessionTickets", cls2);
        f43584e = new C3558a(null, "setHostname", String.class);
        f43585f = new C3558a(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        f43586g = new C3558a(null, "setAlpnProtocols", byte[].class);
        f43587h = new C3558a(byte[].class, "getNpnSelectedProtocol", new Class[0]);
        f43588i = new C3558a(null, "setNpnProtocols", byte[].class);
        try {
            method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method3 = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                try {
                    method4 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                    try {
                        cls = Class.forName("android.net.ssl.SSLSockets");
                        c10 = 0;
                    } catch (ClassNotFoundException e7) {
                        e = e7;
                        c10 = 0;
                    } catch (NoSuchMethodException e10) {
                        e = e10;
                        c10 = 0;
                    }
                    try {
                        method2 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                        try {
                            method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
                        } catch (ClassNotFoundException e11) {
                            e = e11;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                            f43590l = method;
                            f43591m = method3;
                            f43592n = method4;
                            f43589j = method2;
                            k = method5;
                            Class[] clsArr = new Class[1];
                            clsArr[c10] = List.class;
                            method6 = SSLParameters.class.getMethod("setServerNames", clsArr);
                            Class<?> cls3 = Class.forName("javax.net.ssl.SNIHostName");
                            Class<?>[] clsArr2 = new Class[1];
                            clsArr2[c10] = String.class;
                            constructor = cls3.getConstructor(clsArr2);
                            f43593o = method6;
                            f43594p = constructor;
                        } catch (NoSuchMethodException e12) {
                            e = e12;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                            f43590l = method;
                            f43591m = method3;
                            f43592n = method4;
                            f43589j = method2;
                            k = method5;
                            Class[] clsArr3 = new Class[1];
                            clsArr3[c10] = List.class;
                            method6 = SSLParameters.class.getMethod("setServerNames", clsArr3);
                            Class<?> cls32 = Class.forName("javax.net.ssl.SNIHostName");
                            Class<?>[] clsArr22 = new Class[1];
                            clsArr22[c10] = String.class;
                            constructor = cls32.getConstructor(clsArr22);
                            f43593o = method6;
                            f43594p = constructor;
                        }
                    } catch (ClassNotFoundException e13) {
                        e = e13;
                        method2 = null;
                        logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f43590l = method;
                        f43591m = method3;
                        f43592n = method4;
                        f43589j = method2;
                        k = method5;
                        Class[] clsArr32 = new Class[1];
                        clsArr32[c10] = List.class;
                        method6 = SSLParameters.class.getMethod("setServerNames", clsArr32);
                        Class<?> cls322 = Class.forName("javax.net.ssl.SNIHostName");
                        Class<?>[] clsArr222 = new Class[1];
                        clsArr222[c10] = String.class;
                        constructor = cls322.getConstructor(clsArr222);
                        f43593o = method6;
                        f43594p = constructor;
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                        method2 = null;
                        logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f43590l = method;
                        f43591m = method3;
                        f43592n = method4;
                        f43589j = method2;
                        k = method5;
                        Class[] clsArr322 = new Class[1];
                        clsArr322[c10] = List.class;
                        method6 = SSLParameters.class.getMethod("setServerNames", clsArr322);
                        Class<?> cls3222 = Class.forName("javax.net.ssl.SNIHostName");
                        Class<?>[] clsArr2222 = new Class[1];
                        clsArr2222[c10] = String.class;
                        constructor = cls3222.getConstructor(clsArr2222);
                        f43593o = method6;
                        f43594p = constructor;
                    }
                } catch (ClassNotFoundException e15) {
                    e = e15;
                    c10 = 0;
                    method2 = null;
                    method4 = null;
                } catch (NoSuchMethodException e16) {
                    e = e16;
                    c10 = 0;
                    method2 = null;
                    method4 = null;
                }
            } catch (ClassNotFoundException e17) {
                e = e17;
                c10 = 0;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f43590l = method;
                f43591m = method3;
                f43592n = method4;
                f43589j = method2;
                k = method5;
                Class[] clsArr3222 = new Class[1];
                clsArr3222[c10] = List.class;
                method6 = SSLParameters.class.getMethod("setServerNames", clsArr3222);
                Class<?> cls32222 = Class.forName("javax.net.ssl.SNIHostName");
                Class<?>[] clsArr22222 = new Class[1];
                clsArr22222[c10] = String.class;
                constructor = cls32222.getConstructor(clsArr22222);
                f43593o = method6;
                f43594p = constructor;
            } catch (NoSuchMethodException e18) {
                e = e18;
                c10 = 0;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f43590l = method;
                f43591m = method3;
                f43592n = method4;
                f43589j = method2;
                k = method5;
                Class[] clsArr32222 = new Class[1];
                clsArr32222[c10] = List.class;
                method6 = SSLParameters.class.getMethod("setServerNames", clsArr32222);
                Class<?> cls322222 = Class.forName("javax.net.ssl.SNIHostName");
                Class<?>[] clsArr222222 = new Class[1];
                clsArr222222[c10] = String.class;
                constructor = cls322222.getConstructor(clsArr222222);
                f43593o = method6;
                f43594p = constructor;
            }
        } catch (ClassNotFoundException e19) {
            e = e19;
            c10 = 0;
            method = null;
            method2 = null;
        } catch (NoSuchMethodException e20) {
            e = e20;
            c10 = 0;
            method = null;
            method2 = null;
        }
        f43590l = method;
        f43591m = method3;
        f43592n = method4;
        f43589j = method2;
        k = method5;
        try {
            Class[] clsArr322222 = new Class[1];
            clsArr322222[c10] = List.class;
            method6 = SSLParameters.class.getMethod("setServerNames", clsArr322222);
        } catch (ClassNotFoundException e21) {
            e = e21;
            method6 = null;
        } catch (NoSuchMethodException e22) {
            e = e22;
            method6 = null;
        }
        try {
            Class<?> cls3222222 = Class.forName("javax.net.ssl.SNIHostName");
            Class<?>[] clsArr2222222 = new Class[1];
            clsArr2222222[c10] = String.class;
            constructor = cls3222222.getConstructor(clsArr2222222);
        } catch (ClassNotFoundException e23) {
            e = e23;
            logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
            f43593o = method6;
            f43594p = constructor;
        } catch (NoSuchMethodException e24) {
            e = e24;
            logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
            f43593o = method6;
            f43594p = constructor;
        }
        f43593o = method6;
        f43594p = constructor;
    }

    @Override // pd.p
    public final void a(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Constructor constructor;
        boolean z2;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((qd.l) it.next()).f44250a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (p.c(str)) {
                        Method method2 = f43589j;
                        if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                            f43583d.v(sSLSocket, Boolean.TRUE);
                        } else {
                            k.invoke(null, sSLSocket, Boolean.TRUE);
                        }
                        Method method3 = f43593o;
                        if (method3 == null || (constructor = f43594p) == null) {
                            f43584e.v(sSLSocket, str);
                        } else {
                            method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                        }
                    }
                } catch (InvocationTargetException e7) {
                    throw new RuntimeException(e7);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(e11);
            }
        }
        Method method4 = f43592n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, new Object[0]);
                f43590l.invoke(sSLParameters, strArr);
                z2 = true;
            } catch (InvocationTargetException e12) {
                if (!(e12.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e12;
                }
                p.f43595b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
            }
        } else {
            z2 = false;
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z2 && (method = f43591m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), new Object[0]))) {
            return;
        }
        Object[] objArr = {qd.k.b(list)};
        qd.k kVar = this.f43597a;
        if (kVar.e() == 1) {
            f43586g.w(sSLSocket, objArr);
        }
        if (kVar.e() == 3) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        f43588i.w(sSLSocket, objArr);
    }

    @Override // pd.p
    public final String b(SSLSocket sSLSocket) {
        Logger logger = p.f43595b;
        Method method = f43592n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e10) {
                if (!(e10.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e10);
                }
                logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        qd.k kVar = this.f43597a;
        if (kVar.e() == 1) {
            try {
                byte[] bArr = (byte[]) f43585f.w(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, qd.n.f44259b);
                }
            } catch (Exception e11) {
                logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e11);
            }
        }
        if (kVar.e() == 3) {
            return null;
        }
        try {
            byte[] bArr2 = (byte[]) f43587h.w(sSLSocket, new Object[0]);
            if (bArr2 != null) {
                return new String(bArr2, qd.n.f44259b);
            }
            return null;
        } catch (Exception e12) {
            logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e12);
            return null;
        }
    }

    @Override // pd.p
    public final String d(SSLSocket sSLSocket, String str, List list) {
        String strB = b(sSLSocket);
        return strB == null ? super.d(sSLSocket, str, list) : strB;
    }
}
