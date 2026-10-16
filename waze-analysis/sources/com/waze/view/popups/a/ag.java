package com.waze.view.popups.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.waze.R;
import com.waze.car_lib.be;
import com.waze.lm;
import com.waze.navigate.AddressItem;
import com.waze.navigate.cs;
import com.waze.sharedui.views.OvalButton;
import com.waze.strings.DisplayStrings;
import com.waze.ui.z.as;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final View f45170a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f45171b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f45172c;

    /* renamed from: d, reason: collision with root package name */
    private final OvalButton f45173d;

    /* renamed from: e, reason: collision with root package name */
    private final OvalButton f45174e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f45175f;

    /* renamed from: g, reason: collision with root package name */
    private AddressItem f45176g;

    /* renamed from: h, reason: collision with root package name */
    private int f45177h;

    /* renamed from: i, reason: collision with root package name */
    private int f45178i;

    /* renamed from: j, reason: collision with root package name */
    private int f45179j;

    /* renamed from: k, reason: collision with root package name */
    private int f45180k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f45181l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private final Runnable q;

    public ag(Context context) {
        super(context, null, 0);
        this.q = new be(this, 13);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.you_are_here_bubble, (ViewGroup) null);
        MaterialCardView materialCardView = (MaterialCardView) viewInflate.findViewById(R.id.YouAreHereBubble);
        com.google.android.material.k.p pVar = new com.google.android.material.k.p(materialCardView.b());
        pVar.j(new com.google.android.material.k.af(as.f(12)));
        materialCardView.e(pVar.i());
        this.f45170a = viewInflate.findViewById(R.id.carTypeOptionsSeparator);
        this.f45171b = (TextView) viewInflate.findViewById(R.id.lblYouAreHere);
        this.f45172c = (TextView) viewInflate.findViewById(R.id.lblUserLocation);
        OvalButton ovalButton = (OvalButton) viewInflate.findViewById(R.id.imgInfoButton);
        this.f45173d = ovalButton;
        OvalButton ovalButton2 = (OvalButton) viewInflate.findViewById(R.id.btnSendLocation);
        this.f45174e = ovalButton2;
        this.f45175f = (TextView) viewInflate.findViewById(R.id.lblSendLocation);
        viewInflate.findViewById(R.id.detailsContainer).setOnClickListener(new com.waze.uid.e(2));
        com.waze.sharedui.a.e eVarE = lm.d().e();
        ovalButton2.setOnClickListener(new com.waze.profile.n(this, eVarE, 3));
        viewInflate.findViewById(R.id.btnHeaderMoreOptions).setOnClickListener(new com.waze.uid.activities.c(this, 11));
        ovalButton.setOnClickListener(new com.waze.profile.n(this, eVarE, 4));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = (int) getResources().getDimension(R.dimen.map_popup_bottom_margin_for_floating_effect);
        layoutParams.gravity = 17;
        addView(viewInflate, layoutParams);
    }

    public static /* synthetic */ void a(ag agVar) {
        agVar.f45181l = true;
        agVar.g(agVar.f45179j, agVar.f45180k);
    }

    public static /* synthetic */ void c(ag agVar) {
        agVar.m = false;
        agVar.o = false;
        agVar.p = true;
        agVar.m();
        agVar.postDelayed(agVar.q, 8000L);
    }

    public static /* synthetic */ void j(ag agVar, com.waze.sharedui.a.e eVar) {
        com.waze.share.aa.e(eVar, com.waze.share.z.f37756c, agVar.f45176g);
        agVar.f(true);
    }

    public static /* synthetic */ void k(ag agVar, com.waze.sharedui.a.e eVar) {
        AddressItem addressItem = agVar.f45176g;
        cs csVar = new cs(addressItem);
        if (!TextUtils.isEmpty(addressItem.getVenueId())) {
            csVar.e(true);
        }
        if (eVar != null) {
            csVar.b(eVar, 1);
        }
        agVar.f(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        if (this.m) {
            return;
        }
        if (getMeasuredWidth() == 0 || getMeasuredHeight() == 0) {
            post(new be(this, 11));
            return;
        }
        int measuredWidth = this.f45177h - (getMeasuredWidth() / 2);
        int measuredHeight = this.f45178i - getMeasuredHeight();
        setTranslationX(measuredWidth);
        setTranslationY(measuredHeight);
        if (this.m || getScaleX() != 0.0f || getScaleY() != 0.0f || this.m) {
            return;
        }
        this.m = true;
        setPivotX(getMeasuredWidth() / 2);
        setPivotY(getMeasuredHeight());
        com.waze.view.anim.g.f(this, 300L, com.waze.view.anim.d.f44975c).scaleX(1.0f).scaleY(1.0f).setListener(com.waze.view.anim.g.a(new be(this, 10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        setVisibility(8);
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public final void f(boolean z) {
        this.n = false;
        if (!this.p) {
            com.waze.shared_infra.i.h.a("YouAreHerePopup: hide was called when view not fully visible. Forcing to hide now");
            z = false;
        }
        removeCallbacks(this.q);
        this.p = false;
        if (z) {
            setPivotX(getMeasuredWidth() / 2);
            setPivotY(getMeasuredHeight());
            com.waze.view.anim.g.f(this, 300L, com.waze.view.anim.d.f44974b).scaleX(0.0f).scaleY(0.0f).setListener(com.waze.view.anim.g.a(new be(this, 9)));
        } else {
            n();
        }
        this.m = false;
    }

    public final synchronized void g(int i2, int i3) {
        if (!(i2 == this.f45177h && i3 == this.f45178i) && this.f45181l) {
            this.f45177h = i2;
            this.f45178i = i3;
            m();
        }
    }

    public final boolean h() {
        return this.o;
    }

    public final boolean i() {
        return this.n;
    }

    public final void l(int i2, int i3, AddressItem addressItem, ViewGroup viewGroup) {
        if (this.n && this.p && com.waze.utils.d.a().c()) {
            return;
        }
        this.f45181l = false;
        this.f45177h = -1;
        this.f45178i = -1;
        this.n = true;
        this.o = true;
        this.f45176g = addressItem;
        com.waze.shared_infra.o.a aVarD = com.waze.design_components.g.b.d(this);
        this.f45171b.setText(String.format(Locale.US, "%s:", aVarD.c(R.string.MAP_POPUP_MY_LOCATION_TITLE, new Object[0])));
        this.f45175f.setText(aVarD.c(R.string.SEND_LOCATION, new Object[0]));
        setScaleX(0.0f);
        setScaleY(0.0f);
        this.f45179j = i2;
        this.f45180k = i3;
        if (lm.d().e() != null) {
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            if (viewGroup2 != null && !viewGroup2.equals(viewGroup)) {
                viewGroup2.removeView(this);
            }
            if (viewGroup2 == null) {
                viewGroup.addView(this, as.f(DisplayStrings.DS_TRIP_OVERVIEW_PREFERRED_ROUTE_IS_SLOWER_POPUP_BUTTON_TEXT), -2);
            }
            setElevation(getResources().getDimension(R.dimen.card_elevation_3));
            setVisibility(0);
            if (!this.o) {
                removeCallbacks(this.q);
                this.f45170a.setVisibility(0);
                this.f45174e.setVisibility(0);
                this.f45173d.setVisibility(0);
                post(new be(this, 12));
            }
            this.f45172c.setText(!TextUtils.isEmpty(this.f45176g.getAddress()) ? this.f45176g.getAddress() : com.waze.design_components.g.b.d(this).c(R.string.CAR_TYPE_NO_ADDRESS, new Object[0]));
            postDelayed(new be(this, 8), 10L);
        }
    }
}
