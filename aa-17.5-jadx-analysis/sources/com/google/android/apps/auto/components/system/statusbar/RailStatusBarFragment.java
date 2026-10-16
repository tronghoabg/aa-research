package com.google.android.apps.auto.components.system.statusbar;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment;
import com.google.android.apps.auto.components.ui.text.CountIndicatorTextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.projection.gearhead.R;
import defpackage.acxa;
import defpackage.aezr;
import defpackage.afak;
import defpackage.afec;
import defpackage.afeu;
import defpackage.affa;
import defpackage.affn;
import defpackage.afgl;
import defpackage.afia;
import defpackage.drx;
import defpackage.eqy;
import defpackage.esa;
import defpackage.jzr;
import defpackage.ksa;
import defpackage.kwi;
import defpackage.leg;
import defpackage.leh;
import defpackage.mcd;
import defpackage.mzq;
import defpackage.mzr;
import defpackage.nje;
import defpackage.nmp;
import defpackage.nns;
import defpackage.noo;
import defpackage.nqy;
import defpackage.nqz;
import defpackage.nso;
import defpackage.nsr;
import defpackage.nxb;
import defpackage.nxf;
import defpackage.nyn;
import defpackage.nze;
import defpackage.nzf;
import defpackage.nzh;
import defpackage.oal;
import defpackage.tbj;
import defpackage.tby;
import defpackage.tdf;
import defpackage.woy;
import defpackage.wuk;
import defpackage.yph;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \\2\u00020\u0001¨\u0006]"}, d2 = {"Lcom/google/android/apps/auto/components/system/statusbar/RailStatusBarFragment;", "Landroid/support/v4/app/Fragment;", "animateNotificationBadge", "", "beginDelayedTransition", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "viewModel", "Lcom/google/android/apps/auto/components/system/statusbar/StatusElementViewModel;", "getViewModel", "()Lcom/google/android/apps/auto/components/system/statusbar/StatusElementViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "fragParent", "Lcom/google/android/apps/auto/components/system/statusbar/RailStatusBarFragment$Holder;", "getFragParent", "()Lcom/google/android/apps/auto/components/system/statusbar/RailStatusBarFragment$Holder;", "fragParent$delegate", "Lkotlin/properties/ReadOnlyProperty;", "displayLayout", "Lcom/google/android/apps/auto/components/system/layout/DisplayLayout;", "isVerticalRailHero", "clock", "Landroid/widget/TextView;", "iconRow", "Landroid/view/View;", "notificationBadgeCount", "Lcom/google/android/apps/auto/components/ui/text/CountIndicatorTextView;", "ongoingNotificationBadgeAnimation", "Landroid/animation/AnimatorSet;", "widthUpdateListener", "Landroid/animation/ValueAnimator;", "heightUpdateListener", "notificationCountSingleDigitWidthPx", "", "getNotificationCountSingleDigitWidthPx", "()I", "notificationCountSingleDigitWidthPx$delegate", "notificationCountDoubleDigitWidthPx", "getNotificationCountDoubleDigitWidthPx", "notificationCountDoubleDigitWidthPx$delegate", "notificationCountHeightPx", "getNotificationCountHeightPx", "notificationCountHeightPx$delegate", "notificationSmallBadgeSizePx", "getNotificationSmallBadgeSizePx", "notificationSmallBadgeSizePx$delegate", "onGetLayoutInflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "layoutInflater", "viewGroup", "bundle", "onViewCreated", "view", "setDpSize", "size", "Lcom/google/android/libraries/auto/dimens/Dp;", "context", "Landroid/content/Context;", "setDpSize-UNaqvOs", "(Landroid/view/View;ILandroid/content/Context;)V", "notificationBadgeAnimation", "count", "verticalRail", "notificationBadgeAnimateIn", "additionalAnimateInVerticalRail", "notificationBadgeAnimateOut", "additionalAnimateOutVerticalRail", "maxAdditionalDimensionsPx", "Landroid/graphics/Point;", "getMaxAdditionalDimensionsPx", "()Landroid/graphics/Point;", "statusElementConfig", "Lcom/google/android/apps/auto/components/system/facetbar/config/StatusElementConfig;", "getStatusElementConfig", "()Lcom/google/android/apps/auto/components/system/facetbar/config/StatusElementConfig;", "statusElementConfig$delegate", "verticalStatusBarRowCount", "getVerticalStatusBarRowCount", "verticalStatusBarRowCount$delegate", "setImageDrawableAndLevel", "Landroid/widget/ImageView;", "newDrawable", "Landroid/graphics/drawable/Drawable;", "level", "Holder", "Companion", "java.com.google.android.apps.auto.components.system.statusbar_statusbar"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RailStatusBarFragment extends Fragment {
    public final afec c;
    public final nso d;
    public final boolean e;
    public TextView f;
    public View g;
    public CountIndicatorTextView h;
    public AnimatorSet i;
    public final afec j;
    public final afec k;
    public final boolean l;
    public final aezr m;
    private final aezr o;
    private final afgl p;
    private final aezr q;
    private final aezr r;
    private final aezr s;
    private final aezr t;
    static final /* synthetic */ afia[] a = {new affn(RailStatusBarFragment.class, "fragParent", "getFragParent()Lcom/google/android/apps/auto/components/system/statusbar/RailStatusBarFragment$Holder;", 0)};
    private static final long n = acxa.q();
    public static final yph b = yph.c("GH.RailStatusBarFrag");

    public RailStatusBarFragment(boolean z, afec<? super ViewGroup, afak> afecVar) {
        afecVar.getClass();
        this.c = afecVar;
        this.o = woy.dG(new nxf(esa.a, this, 3));
        getLifecycle().c(new mzq(this, 6));
        this.p = new mzr(this, 6);
        nso nsoVarB = nsr.c().b();
        this.d = nsoVarB;
        boolean z2 = false;
        if (nsoVarB.F() && nsoVarB.D()) {
            z2 = true;
        }
        this.e = z2;
        this.j = new noo(this, 18);
        this.k = new nzf(this, 3);
        this.q = woy.dG(new nxb(this, 8));
        this.r = woy.dG(new nxb(this, 9));
        this.s = woy.dG(new nxb(this, 10));
        this.t = woy.dG(new nxb(this, 11));
        this.l = z;
        this.m = woy.dG(new nqy(3));
        woy.dG(new nxb(this, 12));
    }

    public static final void g(ImageView imageView, int i, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        constantState.getClass();
        imageView.setImageDrawable(constantState.newDrawable(imageView.getContext().getResources()));
        imageView.setImageLevel(i);
    }

    public static final void h(View view, int i, Context context) {
        int iA = tdf.a(i, context);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = iA;
        layoutParams.height = iA;
        view.requestLayout();
    }

    private final oal i() {
        return (oal) this.o.a();
    }

    public final int a() {
        return ((Number) this.r.a()).intValue();
    }

    public final int b() {
        return ((Number) this.s.a()).intValue();
    }

    public final int c() {
        return ((Number) this.q.a()).intValue();
    }

    public final int d() {
        return ((Number) this.t.a()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.AnimatorSet e(int r9, boolean r10) {
        /*
            r8 = this;
            r0 = 10
            if (r9 >= r0) goto L9
            int r9 = r8.c()
            goto Ld
        L9:
            int r9 = r8.a()
        Ld:
            int r0 = r8.d()
            int[] r9 = new int[]{r9, r0}
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofInt(r9)
            afec r0 = r8.j
            nt r1 = new nt
            r2 = 6
            r3 = 0
            r1.<init>(r0, r2, r3)
            r9.addUpdateListener(r1)
            int r0 = r8.b()
            int r1 = r8.d()
            int[] r0 = new int[]{r0, r1}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            afec r1 = r8.k
            nt r2 = new nt
            r4 = 7
            r2.<init>(r1, r4, r3)
            r0.addUpdateListener(r2)
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            android.animation.AnimatorSet$Builder r2 = r1.play(r9)
            r4 = 1
            if (r10 == 0) goto La1
            android.widget.TextView r10 = r8.f
            java.lang.String r5 = "clock"
            if (r10 != 0) goto L56
            defpackage.affa.d(r5)
            r10 = r3
        L56:
            int r10 = r10.getVisibility()
            if (r10 != 0) goto L64
            android.widget.TextView r10 = r8.f
            if (r10 != 0) goto L6e
            defpackage.affa.d(r5)
            goto L6d
        L64:
            android.view.View r10 = r8.g
            if (r10 != 0) goto L6e
            java.lang.String r10 = "iconRow"
            defpackage.affa.d(r10)
        L6d:
            r10 = r3
        L6e:
            float[] r5 = new float[r4]
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = "alpha"
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofFloat(r10, r6, r5)
            com.google.android.apps.auto.components.ui.text.CountIndicatorTextView r5 = r8.h
            if (r5 != 0) goto L85
            java.lang.String r5 = "notificationBadgeCount"
            defpackage.affa.d(r5)
            goto L86
        L85:
            r3 = r5
        L86:
            float[] r5 = new float[r4]
            r6 = 0
            r5[r7] = r6
            java.lang.String r6 = "translationY"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r6, r5)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            android.animation.AnimatorSet$Builder r10 = r5.play(r10)
            r10.with(r3)
            android.animation.AnimatorSet$Builder r2 = r2.with(r5)
        La1:
            android.animation.AnimatorSet$Builder r9 = r2.with(r9)
            r9.with(r0)
            long r9 = com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment.n
            r1.setStartDelay(r9)
            r9 = 200(0xc8, double:9.9E-322)
            r1.setDuration(r9)
            nzi r9 = new nzi
            r9.<init>(r8, r4)
            r1.addListener(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment.e(int, boolean):android.animation.AnimatorSet");
    }

    public final nzh f() {
        return (nzh) this.p.getValue(this, a[0]);
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        nso nsoVarB = nsr.c().b();
        b.l().R("vertical: %b, rhd: %b animateNotificationBadge: %b", Boolean.valueOf(nsoVarB.F()), Boolean.valueOf(nsoVarB.J()), Boolean.valueOf(this.l));
        return layoutInflater.inflate((nsoVarB.F() && nsoVarB.D()) ? R.layout.hero_vertical_rail_statusbar : nsoVarB.F() ? R.layout.vertical_rail_statusbar : nsoVarB.J() ? R.layout.rail_statusbar_rhd : R.layout.rail_statusbar, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        leg legVar = leh.a;
        legVar.a();
        if (acxa.aJ()) {
            LayoutInflater layoutInflaterCloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(new ContextThemeWrapper(requireContext(), true != legVar.a().b() ? R.style.ThemeOverlay_Gearhead_Coolwalk_Dark : R.style.ThemeOverlay_Gearhead_Coolwalk_DayNight));
            layoutInflaterCloneInContext.getClass();
            return layoutInflaterCloneInContext;
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        layoutInflaterOnGetLayoutInflater.getClass();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Resources.NotFoundException {
        view.getClass();
        View viewFindViewById = view.findViewById(R.id.clock);
        viewFindViewById.getClass();
        this.f = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.icon_row);
        viewFindViewById2.getClass();
        this.g = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.notification_count);
        viewFindViewById3.getClass();
        this.h = (CountIndicatorTextView) viewFindViewById3;
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.notification_count_wrapper);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.status_bar_container);
        ImageView imageView = (ImageView) view.findViewById(R.id.battery_level);
        final View viewFindViewById4 = view.findViewById(R.id.signal_icon);
        final ImageView imageView2 = (ImageView) viewFindViewById4.findViewById(R.id.cell_signal);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.dnd_icon);
        boolean z = this.l;
        if (z) {
            nso nsoVar = this.d;
            if (nsoVar.F() && !nsoVar.D()) {
                drx drxVar = new drx();
                drxVar.e(constraintLayout2);
                TextView textView = this.f;
                if (textView == null) {
                    affa.d("clock");
                    textView = null;
                }
                drxVar.d(textView.getId(), 4);
                drxVar.d(constraintLayout.getId(), 4);
                drxVar.c(constraintLayout2);
                constraintLayout.getLayoutParams().height = requireContext().getResources().getDimensionPixelSize(R.dimen.status_bar_notification_animation_height);
                CountIndicatorTextView countIndicatorTextView = this.h;
                if (countIndicatorTextView == null) {
                    affa.d("notificationBadgeCount");
                    countIndicatorTextView = null;
                }
                ViewGroup.LayoutParams layoutParams = countIndicatorTextView.getLayoutParams();
                layoutParams.getClass();
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = requireContext().getResources().getDimensionPixelSize(R.dimen.status_bar_icons_item_margin);
            }
        }
        i().g.fE(getViewLifecycleOwner(), new nns(new nze(this, constraintLayout2, imageView, imageView2, constraintLayout, 0), 4));
        if (oal.a.contains("release")) {
            i().e.fE(getViewLifecycleOwner(), new nns(new noo(this, 19), 4));
        }
        i().k.fE(getViewLifecycleOwner(), new nns(new noo(imageView, 20), 4));
        Context context = imageView.getContext();
        context.getClass();
        nyn nynVar = new nyn(context, mcd.E(), null);
        i().b.fE(getViewLifecycleOwner(), new nns(new nzf(nynVar, 1), 4));
        i().f.fE(getViewLifecycleOwner(), new nns(new nzf(nynVar, 0), 4));
        imageView.setImageDrawable(nynVar);
        i().j.fE(getViewLifecycleOwner(), new nns(new nzf(viewFindViewById4, 2), 4));
        final ImageView imageView4 = (ImageView) viewFindViewById4.findViewById(R.id.cell_info_overlay);
        tby.z(tby.z(i().n, i().l), i().m).fE(getViewLifecycleOwner(), new nns(new afec() { // from class: nzg
            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                dzi dziVar = (dzi) obj;
                yph yphVar = RailStatusBarFragment.b;
                dziVar.getClass();
                Object obj2 = dziVar.b;
                dzi dziVar2 = (dzi) dziVar.a;
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                ntq ntqVar = (ntq) dziVar2.a;
                Boolean bool2 = (Boolean) dziVar2.b;
                boolean zBooleanValue2 = bool2.booleanValue();
                RailStatusBarFragment.b.l().R("Update Network Info: CellSignal[%s] IsAirplaneMode[%s] IsSatelliteMode[%s]", ntqVar, bool2, bool);
                boolean z2 = ntqVar.c;
                float f = 1.0f;
                if (!z2 && mcd.E()) {
                    f = 0.35f;
                }
                ImageView imageView5 = imageView4;
                imageView5.setAlpha(f);
                int i = ntqVar.b;
                Integer numValueOf = null;
                if (i >= 0 && !zBooleanValue2 && !zBooleanValue) {
                    if (mcd.E()) {
                        switch (ntqVar.a.ordinal()) {
                            case 0:
                                numValueOf = Integer.valueOf(R.drawable.ic_samsung_mobiledata_1x);
                                break;
                            case 1:
                                numValueOf = Integer.valueOf(R.drawable.ic_samsung_mobiledata_3g);
                                break;
                            case 2:
                                numValueOf = Integer.valueOf(R.drawable.ic_samsung_mobiledata_h);
                                break;
                            case 3:
                                numValueOf = Integer.valueOf(R.drawable.ic_samsung_mobiledata_e);
                                break;
                            case 4:
                                numValueOf = Integer.valueOf(R.drawable.ic_samsung_mobiledata_r);
                                break;
                            case 5:
                                numValueOf = Integer.valueOf(R.drawable.ic_samsung_mobiledata_4g);
                                break;
                            case 6:
                                numValueOf = Integer.valueOf(R.drawable.ic_samsung_mobiledata_4g_plus);
                                break;
                            case 7:
                                numValueOf = Integer.valueOf(R.drawable.ic_samsung_mobiledata_lte);
                                break;
                            case 8:
                                numValueOf = Integer.valueOf(R.drawable.ic_samsung_mobiledata_lte_plus);
                                break;
                            case 9:
                                numValueOf = Integer.valueOf(R.drawable.ic_samsung_mobiledata_5g);
                                break;
                            case 10:
                                numValueOf = Integer.valueOf(R.drawable.ic_samsung_mobiledata_5g_plus);
                                break;
                            case 11:
                                numValueOf = Integer.valueOf(R.drawable.ic_samsung_mobiledata_5g_plus);
                                break;
                            case 12:
                            case 13:
                                break;
                            default:
                                throw new aezs();
                        }
                    } else {
                        switch (ntqVar.a.ordinal()) {
                            case 0:
                                numValueOf = Integer.valueOf(R.drawable.ic_mobiledata_1x);
                                break;
                            case 1:
                                numValueOf = Integer.valueOf(R.drawable.ic_mobiledata_3g);
                                break;
                            case 2:
                                numValueOf = Integer.valueOf(R.drawable.ic_mobiledata_h);
                                break;
                            case 3:
                                numValueOf = Integer.valueOf(R.drawable.ic_mobiledata_e);
                                break;
                            case 4:
                                numValueOf = Integer.valueOf(R.drawable.ic_mobiledata_r);
                                break;
                            case 5:
                                numValueOf = Integer.valueOf(R.drawable.ic_mobiledata_4g);
                                break;
                            case 6:
                                numValueOf = Integer.valueOf(R.drawable.ic_mobiledata_4g_plus);
                                break;
                            case 7:
                                numValueOf = Integer.valueOf(R.drawable.ic_mobiledata_lte);
                                break;
                            case 8:
                                numValueOf = Integer.valueOf(R.drawable.ic_mobiledata_lte_plus);
                                break;
                            case 9:
                                numValueOf = Integer.valueOf(R.drawable.ic_mobiledata_5g);
                                break;
                            case 10:
                                numValueOf = Integer.valueOf(R.drawable.ic_mobiledata_5g_e);
                                break;
                            case 11:
                                numValueOf = Integer.valueOf(R.drawable.ic_mobiledata_5g_plus);
                                break;
                            case 12:
                            case 13:
                                break;
                            default:
                                throw new aezs();
                        }
                    }
                }
                if (numValueOf == null) {
                    imageView5.getClass();
                    imageView5.setVisibility(8);
                } else {
                    imageView5.setImageResource(numValueOf.intValue());
                    imageView5.getClass();
                    imageView5.setVisibility(0);
                }
                View view2 = viewFindViewById4;
                Drawable drawable = (zBooleanValue2 && mcd.E()) ? view2.getContext().getDrawable(R.drawable.ic_samsung_airplane_active) : zBooleanValue2 ? view2.getContext().getDrawable(R.drawable.ic_airplane_active) : zBooleanValue ? view2.getContext().getDrawable(R.drawable.gs_android_satellite_vd_theme_24) : mcd.E() ? view2.getContext().getDrawable(R.drawable.samsung_cell_signal) : i < 0 ? view2.getContext().getDrawable(R.drawable.ic_signal_cellular_nodata) : z2 ? view2.getContext().getDrawable(R.drawable.cell_signal) : view2.getContext().getDrawable(R.drawable.cell_signal_no_internet);
                ImageView imageView6 = imageView2;
                drawable.getClass();
                imageView6.getClass();
                int iE = afpt.e(i, 0);
                if (imageView6.getDrawable() != drawable) {
                    RailStatusBarFragment.g(imageView6, iE, drawable);
                } else if (imageView6.getDrawable().getLevel() != iE) {
                    Drawable drawable2 = imageView6.getDrawable();
                    drawable2.getClass();
                    RailStatusBarFragment.g(imageView6, iE, drawable2);
                }
                return afak.a;
            }
        }, 4));
        nso nsoVar2 = this.d;
        boolean z2 = nsoVar2.D() && nsoVar2.F();
        MaterialCardView materialCardView = (MaterialCardView) view.findViewById(R.id.status_bar_card_view);
        if (z2) {
            materialCardView.setFocusable(false);
            materialCardView.setClickable(false);
        } else {
            materialCardView.setFocusable(true);
            materialCardView.setClickable(true);
            materialCardView.setOnClickListener(new nmp(this, 11));
            materialCardView.setOnLongClickListener(new jzr(this, 5));
        }
        leg legVar = leh.a;
        legVar.a();
        materialCardView.fB(0);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.status_bar_card_wrapper);
        if (z2) {
            frameLayout.setFocusable(false);
            frameLayout.setClickable(false);
        } else {
            frameLayout.setFocusable(true);
            frameLayout.setClickable(true);
            frameLayout.setOnLongClickListener(new jzr(materialCardView, 6));
            frameLayout.setOnClickListener(new nmp(materialCardView, 10));
            int dimensionPixelSize = frameLayout.getContext().getResources().getDimensionPixelSize(R.dimen.rail_coolwalk_status_bar_focus_drawable_inset);
            Context context2 = frameLayout.getContext();
            context2.getClass();
            wuk wukVarFD = materialCardView.fD();
            wukVarFD.getClass();
            frameLayout.setForeground(new kwi(context2, wukVarFD, new Rect(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize), null, null, null));
        }
        View view2 = this.g;
        if (view2 == null) {
            affa.d("iconRow");
            view2 = null;
        }
        tby.z(i().k, i().j).fE(getViewLifecycleOwner(), new nns(new nje(this, view2, 8, null), 4));
        if (z) {
            eqy.a(tby.E(tby.t(tby.D(new tbj(tby.v(i().p, new nqz(15))), tby.x(i().c))))).fE(getViewLifecycleOwner(), new nns(new noo(this, 16), 4));
        }
        tby.E(tby.z(i().p, i().c)).fE(getViewLifecycleOwner(), new nns(new nze(this, imageView3, materialCardView, frameLayout, constraintLayout, 2), 4));
        legVar.a();
        ksa.a.a().e.fE(getViewLifecycleOwner(), new nns(new noo(this, 17), 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RailStatusBarFragment(boolean z) {
        this(z, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RailStatusBarFragment() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ RailStatusBarFragment(boolean z, afec afecVar, int i, afeu afeuVar) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), (i & 2) != 0 ? new nqz(14) : afecVar);
    }
}
