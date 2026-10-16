package M3;

import J3.r;
import T3.w;
import T3.x;
import android.os.Handler;
import com.bytedance.sdk.openadsdk.TTAdConstant;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7471a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f7472b;

    public /* synthetic */ f(g gVar, int i5) {
        this.f7471a = i5;
        this.f7472b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7471a) {
            case 0:
                g.a(this.f7472b);
                return;
            default:
                g gVar = this.f7472b;
                if (gVar.f7480g != 0) {
                    r.d().a(g.f7473m, "Already started work for " + gVar.f7476c);
                    return;
                }
                gVar.f7480g = 1;
                r.d().a(g.f7473m, "onAllConstraintsMet for " + gVar.f7476c);
                if (!gVar.f7477d.f7495d.j(gVar.f7484l, null)) {
                    gVar.c();
                    return;
                }
                x xVar = gVar.f7477d.f7494c;
                S3.j jVar = gVar.f7476c;
                synchronized (xVar.f11456d) {
                    r.d().a(x.f11452e, "Starting timer for " + jVar);
                    xVar.a(jVar);
                    w wVar = new w(xVar, jVar);
                    xVar.f11454b.put(jVar, wVar);
                    xVar.f11455c.put(jVar, gVar);
                    ((Handler) xVar.f11453a.f47873b).postDelayed(wVar, TTAdConstant.AD_MAX_EVENT_TIME);
                }
                return;
        }
    }
}
