package defpackage;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class ajlx extends ajly {
    public static final String a = "OkHttp";
    public static final boolean b;
    private final List d;

    static {
        b = Build.VERSION.SDK_INT < 29;
    }

    public ajlx() throws ClassNotFoundException {
        ajmg[] ajmgVarArr = new ajmg[2];
        ajme ajmeVar = null;
        try {
            Class<?> cls = Class.forName(a.bK("com.android.org.conscrypt", ".OpenSSLSocketImpl"));
            cls.getClass();
            Class.forName(a.bK("com.android.org.conscrypt", ".OpenSSLSocketFactoryImpl")).getClass();
            Class.forName(a.bK("com.android.org.conscrypt", ".SSLParametersImpl")).getClass();
            ajmeVar = new ajme(cls, null);
        } catch (Exception e) {
            int i = ajmb.a;
            String name = ajia.class.getName();
            name.getClass();
            ajmb.a(name, 5, "unable to load android socket classes", e);
        }
        ajmgVarArr[0] = ajmeVar;
        ajmgVarArr[1] = new ajmf(ajme.a);
        List listDa = woy.da(ajmgVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listDa) {
            if (((ajmg) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // defpackage.ajly
    public final String a(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ajmg) next).d(sSLSocket)) {
                break;
            }
        }
        ajmg ajmgVar = (ajmg) next;
        if (ajmgVar != null) {
            return ajmgVar.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.ajly
    public final ajmn b(X509TrustManager x509TrustManager) {
        ajma ajmaVarB = ahfb.b(x509TrustManager);
        return ajmaVarB != null ? ajmaVarB : super.b(x509TrustManager);
    }

    @Override // defpackage.ajly
    public final void c(SSLSocket sSLSocket, String str, List list) {
        Object next;
        list.getClass();
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ajmg) next).d(sSLSocket)) {
                    break;
                }
            }
        }
        ajmg ajmgVar = (ajmg) next;
        if (ajmgVar != null) {
            ajmgVar.b(sSLSocket, str, list);
        }
    }

    @Override // defpackage.ajly
    public final void d(String str, int i, Throwable th) {
        if (i == 5) {
            Log.w(a, str, th);
        } else {
            Log.i(a, str, th);
        }
    }

    @Override // defpackage.ajly
    public final boolean f(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.ajly
    public final ajmp h(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            declaredMethod.getClass();
            return new ajlw(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.h(x509TrustManager);
        }
    }

    @Override // defpackage.ajly
    public final void i(Socket socket, InetSocketAddress inetSocketAddress) throws IOException {
        socket.getClass();
        socket.connect(inetSocketAddress, 10000);
    }
}
