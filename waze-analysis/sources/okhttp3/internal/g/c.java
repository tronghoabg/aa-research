package okhttp3.internal.g;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.ce.x;
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
import okhttp3.internal.g.a.h;
import okhttp3.internal.g.a.i;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class c extends g {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f56274a;

    /* renamed from: c, reason: collision with root package name */
    private final List f56275c;

    /* renamed from: d, reason: collision with root package name */
    private final okhttp3.internal.g.a.g f56276d;

    static {
        boolean z = false;
        if (x.g() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f56274a = z;
    }

    public c() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        okhttp3.internal.g.a.f fVar;
        Method method;
        Method method2;
        i[] iVarArr = new i[2];
        int i2 = okhttp3.internal.g.a.f.f56260a;
        h.g.b.x.f("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            h.g.b.x.d(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            h.g.b.x.d(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
            Class<?> cls3 = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            h.g.b.x.c(cls3);
            fVar = new okhttp3.internal.g.a.f(cls, cls2, cls3);
        } catch (Exception e2) {
            g.f56287a.m("unable to load android socket classes", 5, e2);
            fVar = null;
        }
        iVarArr[0] = fVar;
        iVarArr[1] = new h(okhttp3.internal.g.a.f.f56261g);
        List listK = h.a.i.k(iVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (((i) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f56275c = arrayList;
        try {
            Class<?> cls4 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls4.getMethod("get", null);
            method2 = cls4.getMethod(TtmlNode.TEXT_EMPHASIS_MARK_OPEN, String.class);
            method = cls4.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f56276d = new okhttp3.internal.g.a.g(method3, method2, method);
    }

    @Override // okhttp3.internal.g.g
    public final String a(SSLSocket sSLSocket) {
        Object next;
        h.g.b.x.f(sSLSocket, "sslSocket");
        Iterator it = this.f56275c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((i) next).d(sSLSocket)) {
                break;
            }
        }
        i iVar = (i) next;
        if (iVar != null) {
            return iVar.a(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.g.g
    public final okhttp3.internal.i.c b(X509TrustManager x509TrustManager) {
        h.g.b.x.f(x509TrustManager, "trustManager");
        okhttp3.internal.g.a.b bVarB = okhttp3.internal.publicsuffix.a.b(x509TrustManager);
        return bVarB != null ? bVarB : super.b(x509TrustManager);
    }

    @Override // okhttp3.internal.g.g
    public final void c(SSLSocket sSLSocket, String str, List list) {
        Object next;
        h.g.b.x.f(sSLSocket, "sslSocket");
        h.g.b.x.f(list, "protocols");
        Iterator it = this.f56275c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((i) next).d(sSLSocket)) {
                    break;
                }
            }
        }
        i iVar = (i) next;
        if (iVar != null) {
            iVar.b(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.g.g
    public final boolean e(String str) {
        h.g.b.x.f(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // okhttp3.internal.g.g
    public final void f(String str, Object obj) {
        h.g.b.x.f(str, "message");
        if (this.f56276d.a(obj)) {
            return;
        }
        g.n(this, str, 5, 4);
    }

    @Override // okhttp3.internal.g.g
    public final Object h() {
        h.g.b.x.f("response.body().close()", "closer");
        return this.f56276d.b();
    }

    @Override // okhttp3.internal.g.g
    public final void i(Socket socket, InetSocketAddress inetSocketAddress) throws IOException {
        h.g.b.x.f(socket, "socket");
        h.g.b.x.f(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, 10000);
    }

    @Override // okhttp3.internal.g.g
    public final okhttp3.internal.i.e o(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        h.g.b.x.f(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            h.g.b.x.c(declaredMethod);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.o(x509TrustManager);
        }
    }
}
