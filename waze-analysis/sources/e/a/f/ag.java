package e.a.f;

import e.a.d.dh;
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

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ag extends ah {

    /* renamed from: b, reason: collision with root package name */
    private static final Method f47632b;

    /* renamed from: c, reason: collision with root package name */
    private static final Method f47633c;

    /* renamed from: d, reason: collision with root package name */
    private static final Method f47634d;

    /* renamed from: e, reason: collision with root package name */
    private static final Method f47635e;

    /* renamed from: f, reason: collision with root package name */
    private static final Method f47636f;

    /* renamed from: g, reason: collision with root package name */
    private static final Method f47637g;

    /* renamed from: h, reason: collision with root package name */
    private static final Constructor f47638h;

    /* renamed from: i, reason: collision with root package name */
    private static final com.waze.stats.storage.c f47639i = new com.waze.stats.storage.c((Class) null, "setUseSessionTickets", Boolean.TYPE);

    /* renamed from: j, reason: collision with root package name */
    private static final com.waze.stats.storage.c f47640j = new com.waze.stats.storage.c((Class) null, "setHostname", String.class);

    /* renamed from: k, reason: collision with root package name */
    private static final com.waze.stats.storage.c f47641k = new com.waze.stats.storage.c(byte[].class, "getAlpnSelectedProtocol", new Class[0]);

    /* renamed from: l, reason: collision with root package name */
    private static final com.waze.stats.storage.c f47642l = new com.waze.stats.storage.c((Class) null, "setAlpnProtocols", byte[].class);
    private static final com.waze.stats.storage.c m = new com.waze.stats.storage.c(byte[].class, "getNpnSelectedProtocol", new Class[0]);
    private static final com.waze.stats.storage.c n = new com.waze.stats.storage.c((Class) null, "setNpnProtocols", byte[].class);

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|55|3|(3:59|4|(5:63|5|53|6|7))|(2:65|8)|37|61|38|57|39|51|52|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|55|3|59|4|(5:63|5|53|6|7)|(2:65|8)|37|61|38|57|39|51|52|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0113, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0115, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0117, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0118, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0119, code lost:
    
        e.a.f.ah.f47643b.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012b, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012c, code lost:
    
        e.a.f.ah.f47643b.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r0);
     */
    static {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.f.ag.<clinit>():void");
    }

    @Override // e.a.f.ah
    public final String a(SSLSocket sSLSocket) {
        Method method = f47636f;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                if (!(e3.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e3);
                }
                ah.f47643b.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        if (this.f47646a.c() == 1) {
            try {
                byte[] bArr = (byte[]) f47641k.h(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, e.a.f.a.o.f47605b);
                }
            } catch (Exception e4) {
                ah.f47643b.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
            }
        }
        if (this.f47646a.c() != 3) {
            try {
                byte[] bArr2 = (byte[]) m.h(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, e.a.f.a.o.f47605b);
                }
            } catch (Exception e5) {
                ah.f47643b.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
            }
        }
        return null;
    }

    @Override // e.a.f.ah
    public final String b(SSLSocket sSLSocket, String str, List list) {
        String strA = a(sSLSocket);
        return strA == null ? super.b(sSLSocket, str, list) : strA;
    }

    @Override // e.a.f.ah
    protected final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Constructor constructor;
        boolean z;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((e.a.f.a.m) it.next()).toString());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (!str.contains("_")) {
                        try {
                            com.google.d.b.an.q(dh.e(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
                            Method method2 = f47632b;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                f47639i.j(sSLSocket, true);
                            } else {
                                f47633c.invoke(null, sSLSocket, true);
                            }
                            Method method3 = f47637g;
                            if (method3 == null || (constructor = f47638h) == null || com.google.d.k.c.b(com.google.d.k.a.a(str).b())) {
                                f47640j.j(sSLSocket, str);
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
        Method method4 = f47636f;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                f47634d.invoke(sSLParameters, strArr);
                z = true;
            } catch (InvocationTargetException e5) {
                if (!(e5.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e5;
                }
                ah.f47643b.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "configureTlsExtensions", "setApplicationProtocol unsupported, will try old methods");
            }
        } else {
            z = false;
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z && (method = f47635e) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {e.a.f.a.l.g(list)};
        e.a.f.a.l lVar = this.f47646a;
        if (lVar.c() == 1) {
            f47642l.h(sSLSocket, objArr);
        }
        if (lVar.c() == 3) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        n.h(sSLSocket, objArr);
    }
}
