package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* loaded from: classes2.dex */
final class ac extends cn {
    public final aa a;
    private AnimatorSet b;

    public ac(aa aaVar) {
        aaVar.getClass();
        this.a = aaVar;
    }

    @Override // defpackage.cn
    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.b;
        aa aaVar = this.a;
        if (animatorSet == null) {
            aaVar.a.f(this);
            return;
        }
        cp cpVar = aaVar.a;
        if (cpVar.d) {
            animatorSet.reverse();
        } else {
            animatorSet.end();
        }
        if (bt.ac(2)) {
            Log.v("FragmentManager", "Animator from operation " + cpVar + " has been canceled" + (true != cpVar.d ? "." : " with seeking.") + " ");
        }
    }

    @Override // defpackage.cn
    public final void b(ViewGroup viewGroup) {
        cp cpVar = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            cpVar.f(this);
            return;
        }
        animatorSet.start();
        if (bt.ac(2)) {
            Log.v("FragmentManager", a.bm(cpVar, "Animator from operation ", " has started."));
        }
    }

    @Override // defpackage.cn
    public final void c(ViewGroup viewGroup) throws Resources.NotFoundException {
        ac acVar;
        aa aaVar = this.a;
        if (aaVar.b()) {
            return;
        }
        Context context = viewGroup.getContext();
        context.getClass();
        rz rzVarA = aaVar.a(context);
        this.b = (AnimatorSet) (rzVarA != null ? rzVarA.a : null);
        cp cpVar = aaVar.a;
        boolean z = cpVar.h == 3;
        View view = cpVar.a.mView;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            acVar = this;
            animatorSet.addListener(new ab(viewGroup, view, z, cpVar, acVar));
        } else {
            acVar = this;
        }
        AnimatorSet animatorSet2 = acVar.b;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }

    @Override // defpackage.cn
    public final boolean d() {
        return true;
    }

    @Override // defpackage.cn
    public final void e(nw nwVar) {
        cp cpVar = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            cpVar.f(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !cpVar.a.mTransitioning) {
            return;
        }
        if (bt.ac(2)) {
            Objects.toString(cpVar);
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation ".concat(cpVar.toString()));
        }
        long totalDuration = animatorSet.getTotalDuration();
        long j = (long) (nwVar.b * totalDuration);
        if (j == 0) {
            j = 1;
        }
        if (j == totalDuration) {
            j = (-1) + totalDuration;
        }
        if (bt.ac(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + cpVar);
        }
        animatorSet.setCurrentPlayTime(j);
    }
}
