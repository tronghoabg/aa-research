package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kcj implements defpackage.eqe {
    public final defpackage.gfa a;
    public final android.view.ViewGroup b;
    public final com.google.android.apps.auto.components.apphost.view.widgets.common.AlertView c;
    public final defpackage.gdr d;
    public final defpackage.hlx e;
    public final defpackage.gvl f;
    public defpackage.ajnd g;
    private final defpackage.eqt h = new defpackage.eqt() { // from class: kch
        @Override // defpackage.eqt
        public final void ea(java.lang.Object obj) {
            defpackage.kcj kcjVar = this.a;
            androidx.car.app.model.Alert alert = (androidx.car.app.model.Alert) obj;
            if (alert == null) {
                android.view.ViewGroup viewGroup = kcjVar.b;
                if (viewGroup.getVisibility() != 8) {
                    android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(kcjVar.a, com.google.android.projection.gearhead.R.anim.alert_card_hide_animation);
                    animationLoadAnimation.setAnimationListener(new defpackage.kci(kcjVar));
                    viewGroup.startAnimation(animationLoadAnimation);
                    defpackage.ajnd ajndVar = kcjVar.g;
                    if (ajndVar != null) {
                        ajndVar.E(8);
                    }
                }
                kcjVar.f.g();
                return;
            }
            kcjVar.f.h(alert, new defpackage.kcx(kcjVar, 1));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = -1;
            for (int i2 = 0; i2 < alert.getActions().size(); i2++) {
                androidx.car.app.model.Action action = alert.getActions().get(i2);
                defpackage.tb tbVar = new defpackage.tb(action);
                tbVar.d(new defpackage.jyc(kcjVar, action, alert, 5));
                arrayList.add(tbVar.a());
                if ((action.getFlags() & 4) != 0 && i == -1) {
                    i = i2;
                }
            }
            com.google.android.apps.auto.components.apphost.view.widgets.common.AlertView alertView = kcjVar.c;
            defpackage.gfa gfaVar = kcjVar.a;
            defpackage.hlx hlxVar = kcjVar.e;
            j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(alert.getDurationMillis());
            defpackage.gdr gdrVar = kcjVar.d;
            float fA = gdrVar.a();
            alertView.c.setVisibility(0);
            alertView.c.a = com.google.android.apps.auto.components.apphost.view.widgets.common.AlertView.b(durationOfMillis.toMillis()) ? new defpackage.geg(fA, durationOfMillis) : null;
            alertView.c.a(gfaVar, arrayList, hlxVar.a);
            if (i != -1) {
                int childCount = alertView.c.getChildCount() - 1;
                if (i > childCount || i < 0) {
                    throw new java.lang.IndexOutOfBoundsException(defpackage.a.bm(childCount, "Action index is not within bounds of [0, ", "]"));
                }
                com.google.android.apps.auto.components.apphost.view.widgets.common.ActionButtonListView actionButtonListView = alertView.c;
                int childCount2 = actionButtonListView.getChildCount() - 1;
                if (i > childCount2) {
                    throw new java.lang.IndexOutOfBoundsException(defpackage.a.bm(childCount2, "Action index is not within bounds of [0, ", "]"));
                }
                android.view.View childAt = actionButtonListView.getChildAt(i);
                if (!(childAt instanceof com.google.android.apps.auto.components.apphost.view.widgets.common.ActionButtonView)) {
                    throw new java.lang.IllegalStateException("Found unexpected type of view in action list: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(childAt.getClass()))));
                }
                alertView.d = (com.google.android.apps.auto.components.apphost.view.widgets.common.ActionButtonView) childAt;
            }
            androidx.car.app.model.CarIcon icon = alert.getIcon();
            if (icon == null) {
                alertView.a(null);
            } else {
                defpackage.hmh hmhVar = defpackage.hmh.a;
                defpackage.hmh hmhVar2 = new defpackage.hmh(0, icon.getType() == 4, false, defpackage.gic.b, null, false, 0);
                int dimensionPixelSize = gfaVar.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.template_alert_image_size);
                alertView.getClass();
                defpackage.hdm.m(gfaVar, icon, new defpackage.ikd(alertView, 20), hmhVar2, dimensionPixelSize, dimensionPixelSize);
            }
            alertView.a.a(gfaVar, alert.getTitle());
            androidx.car.app.model.CarText subtitle = alert.getSubtitle();
            if (subtitle == null) {
                alertView.b.setVisibility(8);
            } else {
                alertView.b.setVisibility(0);
                alertView.b.a(gfaVar, subtitle);
            }
            float fA2 = gdrVar.a();
            long durationMillis = alert.getDurationMillis();
            float f = durationMillis;
            float f2 = 1.0f - fA2;
            float max = fA2 * alertView.e.getMax();
            int max2 = alertView.e.getMax();
            android.animation.ObjectAnimator objectAnimator = alertView.f;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (alertView.d == null && com.google.android.apps.auto.components.apphost.view.widgets.common.AlertView.b(durationMillis)) {
                alertView.e.setVisibility(0);
                alertView.f = android.animation.ObjectAnimator.ofInt(alertView.e, "progress", (int) max, max2).setDuration((long) (f * f2));
                alertView.f.start();
            } else {
                alertView.e.setVisibility(8);
            }
            android.view.ViewGroup viewGroup2 = kcjVar.b;
            if (viewGroup2.getVisibility() == 0) {
                return;
            }
            viewGroup2.setVisibility(0);
            defpackage.ajnd ajndVar2 = kcjVar.g;
            if (ajndVar2 != null) {
                ajndVar2.E(0);
            }
            viewGroup2.startAnimation(android.view.animation.AnimationUtils.loadAnimation(gfaVar, com.google.android.projection.gearhead.R.anim.alert_card_show_animation));
        }
    };

    public kcj(defpackage.gfa gfaVar, android.view.ViewGroup viewGroup) {
        this.a = gfaVar;
        this.b = viewGroup;
        this.c = (com.google.android.apps.auto.components.apphost.view.widgets.common.AlertView) viewGroup.findViewById(com.google.android.projection.gearhead.R.id.alert_view);
        defpackage.gdr gdrVar = (defpackage.gdr) gfaVar.l(defpackage.gdr.class);
        gdrVar.getClass();
        this.d = gdrVar;
        this.f = (defpackage.gvl) gfaVar.F(defpackage.gvl.class);
        defpackage.ajie ajieVar = new defpackage.ajie(null);
        ajieVar.c = 2;
        this.e = ajieVar.c();
    }

    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        int iOrdinal = epwVar.ordinal();
        if (iOrdinal == 1) {
            defpackage.gdr gdrVar = this.d;
            gdrVar.b.eM(eqgVar, this.h);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            defpackage.gdr gdrVar2 = this.d;
            gdrVar2.b.k(this.h);
        }
    }
}
