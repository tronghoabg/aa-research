package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes2.dex */
public final class fcs implements Animation.AnimationListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fcs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        fcv fcvVar;
        int i = this.b;
        if (i == 0) {
            ((SwipeRefreshLayout) this.a).k(null);
            return;
        }
        if (i == 1) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.a;
            if (!swipeRefreshLayout.b) {
                swipeRefreshLayout.b();
                return;
            }
            swipeRefreshLayout.h.setAlpha(255);
            swipeRefreshLayout.h.start();
            if (swipeRefreshLayout.i && (fcvVar = swipeRefreshLayout.a) != null) {
                fcvVar.d();
            }
            swipeRefreshLayout.c = swipeRefreshLayout.d.getTop();
            return;
        }
        if (i != 2) {
            Object obj = this.a;
            if (i != 3) {
                ((zvs) obj).setVisibility(8);
                return;
            } else {
                ((zvs) obj).b();
                return;
            }
        }
        ((ype) oll.a.l().ai((char) 6003)).u("onAnimationEnd");
        oll ollVar = (oll) this.a;
        if (ollVar.d != null) {
            throw null;
        }
        urf urfVar = (urf) ollVar.c.poll();
        ollVar.d = urfVar;
        if (urfVar != null) {
            ollVar.b.a();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.b;
        if (i == 0 || i == 1) {
            return;
        }
        if (i == 2) {
            ((ype) oll.a.l().ai((char) 6004)).u("onAnimationStart");
        } else if (i != 3) {
            ((zvs) this.a).setVisibility(0);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
