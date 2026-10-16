package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionStripView;
import com.google.android.apps.auto.components.apphost.view.widgets.navigation.ResponsiveTravelEstimateView;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class kct implements kcr {
    public final View a;
    private final View b;
    private final geu c;
    private final List d;
    private final kcx e;

    public kct(View view, geu geuVar, List list) throws kdb {
        Object next;
        view.getClass();
        this.b = view;
        this.c = geuVar;
        this.d = list;
        this.a = view.findViewById(R.id.minimized_bottom_bar);
        jxa jxaVar = new jxa(11);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Boolean) jxaVar.invoke(next)).booleanValue()) {
                    break;
                }
            }
        }
        Action action = (Action) next;
        if (action != null) {
            sx sxVar = new sx();
            sxVar.b(action);
            ActionStrip actionStripA = sxVar.a();
            View viewFindViewById = this.b.findViewById(R.id.minimized_primary_action);
            viewFindViewById.getClass();
            ActionStripView actionStripView = (ActionStripView) viewFindViewById;
            actionStripView.setVisibility(0);
            actionStripView.b(this.c, actionStripA, ghu.b, false, false);
        }
        ResponsiveTravelEstimateView responsiveTravelEstimateView = (ResponsiveTravelEstimateView) this.b.findViewById(R.id.responsive_travel_estimate_view_for_primary_actions_experiment_launch);
        responsiveTravelEstimateView.setVisibility(0);
        responsiveTravelEstimateView.getClass();
        this.e = new kcx(responsiveTravelEstimateView, this.c);
    }

    private final void e(int i, Runnable runnable) throws Resources.NotFoundException {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.c, i);
        animationLoadAnimation.setAnimationListener(new kcs(this, runnable));
        this.a.setAnimation(animationLoadAnimation);
    }

    @Override // defpackage.kcr
    public final View a() {
        View view = this.a;
        view.getClass();
        return view;
    }

    @Override // defpackage.kcr
    public final ResponsiveTravelEstimateView b() {
        return this.e.a;
    }

    @Override // defpackage.kcr
    public final void c(Runnable runnable) throws Resources.NotFoundException {
        if (this.a.getVisibility() == 8) {
            return;
        }
        e(R.anim.bottom_bar_hide_animation, new jlh(this, runnable, 17, (byte[]) null));
    }

    @Override // defpackage.kcr
    public final void d(Runnable runnable) throws Resources.NotFoundException {
        if (this.a.getVisibility() == 0) {
            return;
        }
        e(R.anim.bottom_bar_show_animation, runnable);
    }
}
