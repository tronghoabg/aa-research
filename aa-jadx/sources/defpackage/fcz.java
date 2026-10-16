package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fcz implements android.view.animation.Animation.AnimationListener {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public fcz(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        defpackage.fdc fdcVar;
        int i = this.b;
        if (i == 0) {
            ((androidx.swiperefreshlayout.widget.SwipeRefreshLayout) this.a).k(null);
            return;
        }
        if (i == 1) {
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) this.a;
            if (!swipeRefreshLayout.b) {
                swipeRefreshLayout.b();
                return;
            }
            swipeRefreshLayout.h.setAlpha(255);
            swipeRefreshLayout.h.start();
            if (swipeRefreshLayout.i && (fdcVar = swipeRefreshLayout.a) != null) {
                fdcVar.d();
            }
            swipeRefreshLayout.c = swipeRefreshLayout.d.getTop();
            return;
        }
        if (i != 2) {
            java.lang.Object obj = this.a;
            if (i != 3) {
                ((defpackage.zww) obj).setVisibility(8);
                return;
            } else {
                ((defpackage.zww) obj).b();
                return;
            }
        }
        ((defpackage.yqj) defpackage.ome.a.l().ai((char) 6029)).u("onAnimationEnd");
        defpackage.ome omeVar = (defpackage.ome) this.a;
        if (omeVar.d != null) {
            throw null;
        }
        defpackage.usc uscVar = (defpackage.usc) omeVar.c.poll();
        omeVar.d = uscVar;
        if (uscVar != null) {
            omeVar.b.a();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
        int i = this.b;
        if (i == 0 || i == 1) {
            return;
        }
        if (i == 2) {
            ((defpackage.yqj) defpackage.ome.a.l().ai((char) 6030)).u("onAnimationStart");
        } else if (i != 3) {
            ((defpackage.zww) this.a).setVisibility(0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }
}
