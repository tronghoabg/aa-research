package q;

import android.view.View;

/* renamed from: q.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3812g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C3808e f43782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3816i f43783b;

    public RunnableC3812g(C3816i c3816i, C3808e c3808e) {
        this.f43783b = c3816i;
        this.f43782a = c3808e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.i iVar;
        C3816i c3816i = this.f43783b;
        p.k kVar = c3816i.f43792c;
        if (kVar != null && (iVar = kVar.f43043e) != null) {
            iVar.z(kVar);
        }
        View view = (View) c3816i.f43797h;
        if (view != null && view.getWindowToken() != null) {
            C3808e c3808e = this.f43782a;
            if (c3808e.b()) {
                c3816i.f43807s = c3808e;
            } else if (c3808e.f43110e != null) {
                c3808e.d(0, 0, false, false);
                c3816i.f43807s = c3808e;
            }
        }
        c3816i.f43809u = null;
    }
}
