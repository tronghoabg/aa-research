package com.google.android.apps.auto.components.turncard;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.auto.components.ui.widget.navigation.DetailedNavigationStepView;
import com.google.android.apps.auto.components.ui.widget.navigation.NavigationTravelEstimateView;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.projection.gearhead.R;
import defpackage.jty;
import defpackage.jue;
import defpackage.kfn;
import defpackage.mki;
import defpackage.nmp;
import defpackage.noh;
import defpackage.nok;
import defpackage.nsr;
import defpackage.ntw;
import defpackage.ole;
import defpackage.qqh;
import defpackage.rji;
import defpackage.yph;

/* loaded from: classes2.dex */
public class TurnCardFragment extends Fragment {
    public static final yph a = yph.c("GH.TurnCardFragment");
    public ImageView b;
    public DetailedNavigationStepView c;
    public NavigationTravelEstimateView d;
    public int e;
    private ViewGroup f;
    private LinearLayout g;
    private FrameLayout h;
    private LinearLayout i;

    public TurnCardFragment() {
        super(R.layout.coolwalk_turn_card_fragment);
        this.e = 0;
    }

    public final void a() {
        this.d.b(null);
        this.d.a(null);
        this.c.b(null);
        this.c.a(null);
        DetailedNavigationStepView detailedNavigationStepView = this.c;
        detailedNavigationStepView.d.setVisibility(8);
        detailedNavigationStepView.f.setVisibility(8);
        int dimensionPixelSize = detailedNavigationStepView.getResources().getDimensionPixelSize(R.dimen.gearhead_padding_2);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) detailedNavigationStepView.e.getLayoutParams();
        layoutParams.bottomMargin = dimensionPixelSize;
        detailedNavigationStepView.e.setLayoutParams(layoutParams);
        this.c.c(null);
        b();
    }

    public final void b() {
        int i = this.e;
        int i2 = 0;
        boolean z = i == 1 || i == 3;
        NavigationTravelEstimateView navigationTravelEstimateView = this.d;
        boolean z2 = (TextUtils.isEmpty(navigationTravelEstimateView.a.getText()) && TextUtils.isEmpty(navigationTravelEstimateView.b.getText())) ? false : true;
        DetailedNavigationStepView detailedNavigationStepView = this.c;
        boolean z3 = !TextUtils.isEmpty(detailedNavigationStepView.b.getText()) || !TextUtils.isEmpty(detailedNavigationStepView.c.getText()) || detailedNavigationStepView.a.getVisibility() == 0 || detailedNavigationStepView.d.getVisibility() == 0;
        LinearLayout linearLayout = this.i;
        if (z2) {
            linearLayout.setBackgroundResource(R.drawable.turn_card_widget_background_top_rounded);
        } else {
            linearLayout.setBackgroundResource(R.drawable.turn_card_widget_background);
        }
        int i3 = true != z ? 8 : 0;
        int i4 = this.e == 5 ? 0 : 8;
        int i5 = true != z2 ? 8 : 0;
        int i6 = true != z3 ? 8 : 0;
        if (z && (z2 || z3)) {
            i2 = 8;
        }
        this.f.setVisibility((i3 == 0 && i2 == 0) ? 8 : i3);
        this.c.setVisibility(i6);
        this.h.setVisibility(i2);
        this.d.setVisibility(i5);
        this.g.setVisibility(i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.support.v4.app.Fragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r9v32, types: [java.lang.Object, pr] */
    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Resources.NotFoundException {
        this.b = (ImageView) view.findViewById(R.id.turn_card_app_icon);
        this.f = (ViewGroup) view.findViewById(R.id.turn_card_content_container);
        this.c = (DetailedNavigationStepView) view.findViewById(R.id.detailed_navigation_step_view);
        this.d = (NavigationTravelEstimateView) view.findViewById(R.id.navigation_travel_estimate_view);
        this.g = (LinearLayout) view.findViewById(R.id.progress_indicator);
        this.h = (FrameLayout) view.findViewById(R.id.turn_card_app_icon_container);
        this.i = (LinearLayout) view.findViewById(R.id.step_view_container);
        boolean z = getContext().getResources().getBoolean(R.bool.turn_card_show_travel_estimate);
        a();
        jty.b();
        ole oleVar = (ole) kfn.h(this, null, 6).a(ole.class);
        oleVar.a.fE(getViewLifecycleOwner(), new ntw(this, 3));
        oleVar.b.fE(getViewLifecycleOwner(), new ntw(this, 4));
        oleVar.f.fE(getViewLifecycleOwner(), new ntw(this, 5));
        if (z) {
            oleVar.c.fE(getViewLifecycleOwner(), new ntw(this, 6));
            oleVar.d.fE(getViewLifecycleOwner(), new ntw(this, 7));
        } else {
            this.d.setVisibility(8);
        }
        oleVar.e.fE(getViewLifecycleOwner(), new ntw(this, 8));
        oleVar.g.fE(getViewLifecycleOwner(), new jue(this, view, 14));
        View viewFindViewById = view.findViewById(R.id.click_target);
        nok nokVar = (nok) mki.a.i(nok.class);
        ?? parentFragment = this;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        Object objA = nokVar.a.a(parentFragment);
        CarDisplayId carDisplayIdO = objA instanceof noh ? ((noh) objA).o() : objA instanceof qqh ? new CarDisplayId(((qqh) objA).y()) : null;
        if ((carDisplayIdO != null ? nsr.c().a(carDisplayIdO).q : null) == rji.b) {
            return;
        }
        viewFindViewById.setOnClickListener(new nmp(oleVar, 14));
        viewFindViewById.setFocusable(true);
    }
}
