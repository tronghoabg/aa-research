package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* loaded from: classes2.dex */
final class z extends cn {
    public final aa a;

    public z(aa aaVar) {
        aaVar.getClass();
        this.a = aaVar;
    }

    @Override // defpackage.cn
    public final void a(ViewGroup viewGroup) {
        cp cpVar = this.a.a;
        View view = cpVar.a.mView;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        cpVar.f(this);
        if (bt.ac(2)) {
            Log.v("FragmentManager", a.bm(cpVar, "Animation from operation ", " has been cancelled."));
        }
    }

    @Override // defpackage.cn
    public final void b(ViewGroup viewGroup) throws Resources.NotFoundException {
        Object obj;
        aa aaVar = this.a;
        if (aaVar.b()) {
            aaVar.a.f(this);
            return;
        }
        Context context = viewGroup.getContext();
        cp cpVar = aaVar.a;
        View view = cpVar.a.mView;
        context.getClass();
        rz rzVarA = aaVar.a(context);
        if (rzVarA == null || (obj = rzVarA.b) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (cpVar.h != 1) {
            view.startAnimation((Animation) obj);
            cpVar.f(this);
            return;
        }
        viewGroup.startViewTransition(view);
        bd bdVar = new bd((Animation) obj, viewGroup, view);
        bdVar.setAnimationListener(new y(cpVar, viewGroup, view, this));
        view.startAnimation(bdVar);
        if (bt.ac(2)) {
            Log.v("FragmentManager", a.bm(cpVar, "Animation from operation ", " has started."));
        }
    }
}
