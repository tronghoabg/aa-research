package okhttp3.internal.g;

import android.security.NetworkSecurityPolicy;
import com.waze.ce.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.g.a.h;
import okhttp3.internal.g.a.i;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f56251a = x.g();

    /* renamed from: c, reason: collision with root package name */
    private final List f56252c;

    public a() {
        i[] iVarArr = new i[2];
        iVarArr[0] = x.e() ? new okhttp3.internal.g.a.a() : null;
        iVarArr[1] = new h(okhttp3.internal.g.a.f.f56261g);
        List listK = h.a.i.k(iVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (((i) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.f56252c = arrayList;
    }

    @Override // okhttp3.internal.g.g
    public final String a(SSLSocket sSLSocket) {
        Object next;
        h.g.b.x.f(sSLSocket, "sslSocket");
        Iterator it = this.f56252c.iterator();
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
        Iterator it = this.f56252c.iterator();
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
}
