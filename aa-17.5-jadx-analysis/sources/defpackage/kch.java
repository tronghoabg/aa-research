package defpackage;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.car.app.model.Action;
import androidx.car.app.model.Alert;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionButtonListView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ActionButtonView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.AlertView;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class kch implements epy {
    public final geu a;
    public final ViewGroup b;
    public final AlertView c;
    public final gdl d;
    public final hlr e;
    public final gvb f;
    public ajmd g;
    private final eqn h = new eqn() { // from class: kcf
        @Override // defpackage.eqn
        public final void eS(Object obj) throws Resources.NotFoundException {
            gdl gdlVar;
            kch kchVar = this.a;
            Alert alert = (Alert) obj;
            if (alert == null) {
                ViewGroup viewGroup = kchVar.b;
                if (viewGroup.getVisibility() != 8) {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(kchVar.a, R.anim.alert_card_hide_animation);
                    animationLoadAnimation.setAnimationListener(new kcg(kchVar));
                    viewGroup.startAnimation(animationLoadAnimation);
                    ajmd ajmdVar = kchVar.g;
                    if (ajmdVar != null) {
                        ajmdVar.C(8);
                    }
                }
                kchVar.f.g();
                return;
            }
            kchVar.f.h(alert, new iju(kchVar, 20));
            ArrayList arrayList = new ArrayList();
            int i = -1;
            for (int i2 = 0; i2 < alert.getActions().size(); i2++) {
                Action action = alert.getActions().get(i2);
                sw swVar = new sw(action);
                swVar.d(new jxx(kchVar, action, alert, 5));
                arrayList.add(swVar.a());
                if ((action.getFlags() & 4) != 0 && i == -1) {
                    i = i2;
                }
            }
            AlertView alertView = kchVar.c;
            geu geuVar = kchVar.a;
            hlr hlrVar = kchVar.e;
            Duration durationOfMillis = Duration.ofMillis(alert.getDurationMillis());
            gdl gdlVar2 = kchVar.d;
            float fA = gdlVar2.a();
            alertView.c.setVisibility(0);
            alertView.c.a = AlertView.b(durationOfMillis.toMillis()) ? new gea(fA, durationOfMillis) : null;
            alertView.c.a(geuVar, arrayList, hlrVar.a);
            if (i != -1) {
                int childCount = alertView.c.getChildCount() - 1;
                if (i > childCount || i < 0) {
                    throw new IndexOutOfBoundsException(a.bn(childCount, "Action index is not within bounds of [0, ", "]"));
                }
                ActionButtonListView actionButtonListView = alertView.c;
                int childCount2 = actionButtonListView.getChildCount() - 1;
                if (i > childCount2) {
                    throw new IndexOutOfBoundsException(a.bn(childCount2, "Action index is not within bounds of [0, ", "]"));
                }
                View childAt = actionButtonListView.getChildAt(i);
                if (!(childAt instanceof ActionButtonView)) {
                    throw new IllegalStateException("Found unexpected type of view in action list: ".concat(String.valueOf(String.valueOf(childAt.getClass()))));
                }
                alertView.d = (ActionButtonView) childAt;
            }
            CarIcon icon = alert.getIcon();
            if (icon == null) {
                alertView.a(null);
                gdlVar = gdlVar2;
            } else {
                hmb hmbVar = hmb.a;
                hmb hmbVar2 = new hmb(0, icon.getType() == 4, false, ghw.b, null, false, 0);
                int dimensionPixelSize = geuVar.getResources().getDimensionPixelSize(R.dimen.template_alert_image_size);
                alertView.getClass();
                gdlVar = gdlVar2;
                hbz.k(geuVar, icon, new iju(alertView, 19), hmbVar2, dimensionPixelSize, dimensionPixelSize);
            }
            alertView.a.a(geuVar, alert.getTitle());
            CarText subtitle = alert.getSubtitle();
            if (subtitle == null) {
                alertView.b.setVisibility(8);
            } else {
                alertView.b.setVisibility(0);
                alertView.b.a(geuVar, subtitle);
            }
            float fA2 = gdlVar.a();
            long durationMillis = alert.getDurationMillis();
            float f = durationMillis;
            float f2 = 1.0f - fA2;
            float max = fA2 * alertView.e.getMax();
            int max2 = alertView.e.getMax();
            ObjectAnimator objectAnimator = alertView.f;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (alertView.d == null && AlertView.b(durationMillis)) {
                alertView.e.setVisibility(0);
                alertView.f = ObjectAnimator.ofInt(alertView.e, "progress", (int) max, max2).setDuration((long) (f * f2));
                alertView.f.start();
            } else {
                alertView.e.setVisibility(8);
            }
            ViewGroup viewGroup2 = kchVar.b;
            if (viewGroup2.getVisibility() == 0) {
                return;
            }
            viewGroup2.setVisibility(0);
            ajmd ajmdVar2 = kchVar.g;
            if (ajmdVar2 != null) {
                ajmdVar2.C(0);
            }
            viewGroup2.startAnimation(AnimationUtils.loadAnimation(geuVar, R.anim.alert_card_show_animation));
        }
    };

    public kch(geu geuVar, ViewGroup viewGroup) {
        this.a = geuVar;
        this.b = viewGroup;
        this.c = (AlertView) viewGroup.findViewById(R.id.alert_view);
        gdl gdlVar = (gdl) geuVar.l(gdl.class);
        gdlVar.getClass();
        this.d = gdlVar;
        this.f = (gvb) geuVar.F(gvb.class);
        ajhf ajhfVar = new ajhf(null);
        ajhfVar.c = 2;
        this.e = ajhfVar.c();
    }

    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) {
        int iOrdinal = eprVar.ordinal();
        if (iOrdinal == 1) {
            gdl gdlVar = this.d;
            gdlVar.b.fE(eqaVar, this.h);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            gdl gdlVar2 = this.d;
            gdlVar2.b.k(this.h);
        }
    }
}
