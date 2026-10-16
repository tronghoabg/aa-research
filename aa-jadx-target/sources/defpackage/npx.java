package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class npx implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ npx(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) throws afbj {
        java.lang.Object obj2;
        com.google.android.gms.car.navigation.Distance distance;
        com.google.android.gms.car.navigation.Distance distance2;
        java.lang.String string;
        java.lang.String str = "clock";
        com.google.android.apps.auto.components.ui.text.CountIndicatorTextView countIndicatorTextView = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                kki kkiVar = (kkl) obj;
                kkiVar.getClass();
                if (kkiVar instanceof kki) {
                    return ((nqb) this.a).b.b(((java.lang.Number) kkiVar.a).floatValue());
                }
                return null;
            case 1:
                kki kkiVar2 = (kkl) obj;
                kkiVar2.getClass();
                if (kkiVar2 instanceof kki) {
                    return ((nqb) this.a).b.c(((java.lang.Number) kkiVar2.a).floatValue());
                }
                return null;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                java.lang.Object obj3 = ((uhj) this.a).k;
                if (obj3 != null) {
                    return ((nqp) obj3).a(fFloatValue);
                }
                return null;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.nqt nqtVar = (defpackage.nqt) obj;
                nqtVar.getClass();
                ((defpackage.nqw) this.a).e = nqtVar;
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.nti ntiVar = (defpackage.nti) obj;
                defpackage.ntb ntbVar = (defpackage.ntb) this.a;
                if (ntbVar.q != defpackage.rke.a) {
                    return java.lang.Boolean.FALSE;
                }
                if (ntbVar.B) {
                    defpackage.nta ntaVar = defpackage.nta.s;
                    android.graphics.Rect rectH = ntbVar.h(ntaVar);
                    rectH.getClass();
                    android.graphics.Rect rectI = ntbVar.i(ntaVar);
                    int iWidth = (rectH.width() - rectI.left) - rectI.right;
                    com.google.android.gms.car.display.CarDisplay carDisplay = ntbVar.t;
                    carDisplay.getClass();
                    if (defpackage.ntb.a(iWidth, carDisplay.c) > defpackage.acyc.f()) {
                        return java.lang.Boolean.TRUE;
                    }
                }
                return (ntiVar == defpackage.nti.e || ntiVar == defpackage.nti.g || ntiVar == defpackage.nti.h || ntiVar == defpackage.nti.f) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                nwt nwtVar = ((nwl) this.a).g;
                int i = nwtVar.d;
                long j = ((defpackage.dly) obj).a;
                return new defpackage.dlw((((long) (i * ((int) (j >> 32)))) << 32) | (4294967295L & ((long) (nwtVar.e * ((int) (j & 4294967295L))))));
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.cja cjaVar = (defpackage.cja) obj;
                cjaVar.getClass();
                if (cjaVar.b()) {
                    ((defpackage.nxh) this.a).v = 4;
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.cja cjaVar2 = (defpackage.cja) obj;
                cjaVar2.getClass();
                if (cjaVar2.b()) {
                    ((defpackage.nxh) this.a).v = 5;
                }
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.cja cjaVar3 = (defpackage.cja) obj;
                cjaVar3.getClass();
                if (cjaVar3.b()) {
                    ((defpackage.nxh) this.a).v = 6;
                }
                return defpackage.afbk.a;
            case 9:
                defpackage.ygw ygwVar = (defpackage.ygw) obj;
                ygwVar.getClass();
                ((nxp) this.a).b.b(ygwVar);
                return defpackage.afbk.a;
            case 10:
                java.lang.Integer num = (java.lang.Integer) obj;
                if (num.intValue() > 0) {
                    java.lang.Object obj4 = this.a;
                    num.getClass();
                    com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment railStatusBarFragment = (com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment) obj4;
                    defpackage.ntb ntbVar2 = railStatusBarFragment.d;
                    int iIntValue = num.intValue();
                    boolean zF = ntbVar2.F();
                    com.google.android.apps.auto.components.ui.text.CountIndicatorTextView countIndicatorTextView2 = railStatusBarFragment.h;
                    if (countIndicatorTextView2 == null) {
                        defpackage.afga.d("notificationBadgeCount");
                        countIndicatorTextView2 = null;
                    }
                    countIndicatorTextView2.a(iIntValue);
                    if (railStatusBarFragment.i == null) {
                        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                        com.google.android.apps.auto.components.ui.text.CountIndicatorTextView countIndicatorTextView3 = railStatusBarFragment.h;
                        if (countIndicatorTextView3 == null) {
                            defpackage.afga.d("notificationBadgeCount");
                            countIndicatorTextView3 = null;
                        }
                        countIndicatorTextView3.setAlpha(0.0f);
                        com.google.android.apps.auto.components.ui.text.CountIndicatorTextView countIndicatorTextView4 = railStatusBarFragment.h;
                        if (countIndicatorTextView4 == null) {
                            defpackage.afga.d("notificationBadgeCount");
                            countIndicatorTextView4 = null;
                        }
                        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(countIndicatorTextView4, "alpha", 1.0f);
                        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(railStatusBarFragment.d(), iIntValue < 10 ? railStatusBarFragment.c() : railStatusBarFragment.a());
                        valueAnimatorOfInt.addUpdateListener(new nv(railStatusBarFragment.j, 8, (byte[]) null));
                        android.animation.ValueAnimator valueAnimatorOfInt2 = android.animation.ValueAnimator.ofInt(railStatusBarFragment.d(), railStatusBarFragment.b());
                        valueAnimatorOfInt2.addUpdateListener(new nv(railStatusBarFragment.k, 5, (byte[]) null));
                        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                        android.animation.AnimatorSet.Builder builderPlay = animatorSet2.play(objectAnimatorOfFloat);
                        if (zF) {
                            android.widget.TextView textView = railStatusBarFragment.f;
                            if (textView == null) {
                                defpackage.afga.d("clock");
                                textView = null;
                            }
                            if (textView.getVisibility() == 0) {
                                obj2 = railStatusBarFragment.f;
                                if (obj2 == null) {
                                    defpackage.afga.d(str);
                                    obj2 = null;
                                }
                            } else {
                                obj2 = railStatusBarFragment.g;
                                if (obj2 == null) {
                                    str = "iconRow";
                                    defpackage.afga.d(str);
                                    obj2 = null;
                                }
                            }
                            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(obj2, "alpha", 0.0f);
                            com.google.android.apps.auto.components.ui.text.CountIndicatorTextView countIndicatorTextView5 = railStatusBarFragment.h;
                            if (countIndicatorTextView5 == null) {
                                defpackage.afga.d("notificationBadgeCount");
                            } else {
                                countIndicatorTextView = countIndicatorTextView5;
                            }
                            android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(countIndicatorTextView, "translationY", -6.0f);
                            android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
                            animatorSet3.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
                            builderPlay = builderPlay.with(animatorSet3);
                        }
                        builderPlay.with(valueAnimatorOfInt).with(valueAnimatorOfInt2);
                        animatorSet2.setStartDelay(100L);
                        animatorSet2.setDuration(200L);
                        animatorSet.play(animatorSet2).before(railStatusBarFragment.e(iIntValue, zF));
                        animatorSet.addListener(new oac(railStatusBarFragment, 0));
                        animatorSet.start();
                        railStatusBarFragment.i = animatorSet;
                    }
                }
                return defpackage.afbk.a;
            case 11:
                defpackage.ksh kshVar = (defpackage.ksh) obj;
                com.google.android.apps.auto.components.ui.text.CountIndicatorTextView countIndicatorTextView6 = ((com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment) this.a).h;
                if (countIndicatorTextView6 == null) {
                    defpackage.afga.d("notificationBadgeCount");
                } else {
                    countIndicatorTextView = countIndicatorTextView6;
                }
                android.graphics.drawable.Drawable background = countIndicatorTextView.getBackground();
                defpackage.kry kryVar = defpackage.kry.a;
                android.content.Context context = countIndicatorTextView.getContext();
                context.getClass();
                kshVar.getClass();
                background.setTint(kryVar.b(context, kshVar));
                countIndicatorTextView.setTextAppearance(2132149491);
                defpackage.kry kryVar2 = defpackage.kry.b;
                android.content.Context context2 = countIndicatorTextView.getContext();
                context2.getClass();
                countIndicatorTextView.setTextColor(kryVar2.b(context2, kshVar));
                return defpackage.afbk.a;
            case 12:
                android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) obj;
                valueAnimator.getClass();
                com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment railStatusBarFragment2 = (com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment) this.a;
                com.google.android.apps.auto.components.ui.text.CountIndicatorTextView countIndicatorTextView7 = railStatusBarFragment2.h;
                if (countIndicatorTextView7 == null) {
                    defpackage.afga.d("notificationBadgeCount");
                    countIndicatorTextView7 = null;
                }
                android.view.ViewGroup.LayoutParams layoutParams = countIndicatorTextView7.getLayoutParams();
                java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                layoutParams.width = ((java.lang.Integer) animatedValue).intValue();
                com.google.android.apps.auto.components.ui.text.CountIndicatorTextView countIndicatorTextView8 = railStatusBarFragment2.h;
                if (countIndicatorTextView8 == null) {
                    defpackage.afga.d("notificationBadgeCount");
                } else {
                    countIndicatorTextView = countIndicatorTextView8;
                }
                countIndicatorTextView.requestLayout();
                return defpackage.afbk.a;
            case 13:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment.b.l().y("Thermal status update: %s", bool);
                com.google.android.apps.auto.components.ui.text.CountIndicatorTextView countIndicatorTextView9 = ((com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment) this.a).f;
                if (countIndicatorTextView9 == null) {
                    defpackage.afga.d("clock");
                } else {
                    countIndicatorTextView = countIndicatorTextView9;
                }
                countIndicatorTextView.setTextAppearance(true != bool.booleanValue() ? 2132149488 : 2132149493);
                return defpackage.afbk.a;
            case 14:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment.b.l().y("Show battery: %s", bool2);
                java.lang.Object obj5 = this.a;
                obj5.getClass();
                bool2.getClass();
                ((android.view.View) obj5).setVisibility(true == bool2.booleanValue() ? 0 : 8);
                return defpackage.afbk.a;
            case 15:
                defpackage.nfh nfhVar = (defpackage.nfh) obj;
                com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment.b.l().y("Battery status update: %s", nfhVar);
                int i2 = nfhVar.a;
                nzi nziVar = (nzi) this.a;
                nziVar.a(i2);
                nziVar.b(nfhVar.a());
                return defpackage.afbk.a;
            case 16:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                defpackage.yqm yqmVar = com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment.b;
                bool3.getClass();
                ((nzi) this.a).c(bool3.booleanValue());
                return defpackage.afbk.a;
            case 17:
                java.lang.Boolean bool4 = (java.lang.Boolean) obj;
                ((defpackage.yqj) com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment.b.f()).y("Show cell signal: %s", bool4);
                java.lang.Object obj6 = this.a;
                obj6.getClass();
                bool4.getClass();
                ((android.view.View) obj6).setVisibility(true == bool4.booleanValue() ? 0 : 8);
                return defpackage.afbk.a;
            case 18:
                android.animation.ValueAnimator valueAnimator2 = (android.animation.ValueAnimator) obj;
                valueAnimator2.getClass();
                com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment railStatusBarFragment3 = (com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment) this.a;
                com.google.android.apps.auto.components.ui.text.CountIndicatorTextView countIndicatorTextView10 = railStatusBarFragment3.h;
                if (countIndicatorTextView10 == null) {
                    defpackage.afga.d("notificationBadgeCount");
                    countIndicatorTextView10 = null;
                }
                android.view.ViewGroup.LayoutParams layoutParams2 = countIndicatorTextView10.getLayoutParams();
                java.lang.Object animatedValue2 = valueAnimator2.getAnimatedValue();
                animatedValue2.getClass();
                layoutParams2.height = ((java.lang.Integer) animatedValue2).intValue();
                com.google.android.apps.auto.components.ui.text.CountIndicatorTextView countIndicatorTextView11 = railStatusBarFragment3.h;
                if (countIndicatorTextView11 == null) {
                    defpackage.afga.d("notificationBadgeCount");
                } else {
                    countIndicatorTextView = countIndicatorTextView11;
                }
                countIndicatorTextView.requestLayout();
                return defpackage.afbk.a;
            case 19:
                com.google.android.gms.car.navigation.StepDistance stepDistance = (com.google.android.gms.car.navigation.StepDistance) obj;
                defpackage.yqm yqmVar2 = olt.a;
                if (stepDistance == null || (distance = stepDistance.a) == null) {
                    return null;
                }
                return olt.a((android.content.Context) this.a, distance);
            default:
                com.google.android.gms.car.navigation.DestinationDistance destinationDistance = (com.google.android.gms.car.navigation.DestinationDistance) obj;
                defpackage.yqm yqmVar3 = olt.a;
                if (destinationDistance != null && (distance2 = destinationDistance.a) != null) {
                    java.lang.Object obj7 = this.a;
                    long jCeil = (long) java.lang.Math.ceil(destinationDistance.c / 60.0d);
                    int i3 = (int) (jCeil % 60);
                    int i4 = (int) (jCeil / 60);
                    if (i4 == 0) {
                        string = ((android.content.Context) obj7).getString(2132084586, java.lang.Integer.toString(i3));
                    } else {
                        string = i3 == 0 ? ((android.content.Context) obj7).getString(2132084586, java.lang.Integer.toString(i4)) : ((android.content.Context) obj7).getString(2132084584, java.lang.Integer.toString(i4), java.lang.Integer.toString(i3));
                    }
                    java.lang.String strA = olt.a((android.content.Context) obj7, distance2);
                    if (strA != null) {
                        return string + " · " + strA;
                    }
                }
                return null;
        }
    }
}
