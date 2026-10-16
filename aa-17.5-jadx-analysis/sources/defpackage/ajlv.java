package defpackage;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class ajlv extends ajly {
    public static final boolean a;
    private final List b;

    static {
        a = Build.VERSION.SDK_INT >= 29;
    }

    public ajlv() {
        ajmg[] ajmgVarArr = new ajmg[2];
        ajmgVarArr[0] = ahet.a() ? new ajlz() : null;
        ajmgVarArr[1] = new ajmf(ajme.a);
        List listDa = woy.da(ajmgVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listDa) {
            if (((ajmg) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.b = arrayList;
    }

    @Override // defpackage.ajly
    public final String a(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.b.iterator();
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
        Iterator it = this.b.iterator();
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
            Log.w(ajlx.a, str, th);
        } else {
            Log.i(ajlx.a, str, th);
        }
    }

    @Override // defpackage.ajly
    public final void e(String str, Object obj) {
        if (Build.VERSION.SDK_INT < 30) {
            super.e(str, obj);
        } else {
            obj.getClass();
            bgl$$ExternalSyntheticApiModelOutline0.m209m(obj).warnIfOpen();
        }
    }

    @Override // defpackage.ajly
    public final boolean f(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.ajly
    public final Object g() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.g();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }
}
