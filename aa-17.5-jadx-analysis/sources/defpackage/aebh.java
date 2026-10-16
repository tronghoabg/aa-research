package defpackage;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes3.dex */
final class aebh extends aebi {
    private static final Method d;
    private static final Method e;
    private static final Method f;
    private static final Method g;
    private static final Method h;
    private static final Method i;
    private static final Constructor j;
    private static final zre k = new zre((Class) null, "setUseSessionTickets", Boolean.TYPE);
    private static final zre l = new zre((Class) null, "setHostname", String.class);
    private static final zre m = new zre(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
    private static final zre n = new zre((Class) null, "setAlpnProtocols", byte[].class);
    private static final zre o = new zre(byte[].class, "getNpnSelectedProtocol", new Class[0]);
    private static final zre p = new zre((Class) null, "setNpnProtocols", byte[].class);

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:57|3)|(3:59|4|(5:61|5|53|6|7))|(2:65|8)|37|55|38|63|39|51|52|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:0|2|57|3|59|4|61|5|53|6|7|(2:65|8)|37|55|38|63|39|51|52|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0111, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0113, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0114, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0115, code lost:
    
        defpackage.aebi.a.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0124, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0125, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0126, code lost:
    
        defpackage.aebi.a.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r0);
     */
    static {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aebh.<clinit>():void");
    }

    @Override // defpackage.aebi
    public final String a(SSLSocket sSLSocket) {
        Method method = h;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                if (!(e3.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e3);
                }
                aebi.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        if (this.c.c() == 1) {
            try {
                byte[] bArr = (byte[]) m.d(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, aecd.b);
                }
            } catch (Exception e4) {
                aebi.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
            }
        }
        if (this.c.c() != 3) {
            try {
                byte[] bArr2 = (byte[]) o.d(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, aecd.b);
                }
            } catch (Exception e5) {
                aebi.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
            }
        }
        return null;
    }

    @Override // defpackage.aebi
    public final String b(SSLSocket sSLSocket, String str, List list) throws IOException {
        String strA = a(sSLSocket);
        return strA == null ? super.b(sSLSocket, str, list) : strA;
    }

    @Override // defpackage.aebi
    protected final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Constructor constructor;
        boolean z;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((aecb) it.next()).e);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (!str.contains("_")) {
                        try {
                            woy.S(adue.e(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
                            Method method2 = d;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                k.f(sSLSocket, true);
                            } else {
                                e.invoke(null, sSLSocket, true);
                            }
                            Method method3 = i;
                            if (method3 == null || (constructor = j) == null || zcv.c(zcu.a(str).a)) {
                                l.f(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException(e4);
            }
        }
        Method method4 = h;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                f.invoke(sSLParameters, strArr);
                z = true;
            } catch (InvocationTargetException e5) {
                if (!(e5.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e5;
                }
                aebi.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "configureTlsExtensions", "setApplicationProtocol unsupported, will try old methods");
            }
        } else {
            z = false;
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z && (method = g) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {aeca.e(list)};
        aeca aecaVar = this.c;
        if (aecaVar.c() == 1) {
            n.d(sSLSocket, objArr);
        }
        if (aecaVar.c() == 3) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        p.d(sSLSocket, objArr);
    }
}
