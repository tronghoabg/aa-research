package com.waze.view.navbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.waze.R;
import com.waze.rtalerts.RtAlertsNativeManager;
import com.waze.share.ShareNativeManager;
import com.waze.ui.z.as;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final MaterialCardView f45081a;

    /* renamed from: b, reason: collision with root package name */
    private final TrafficBarColoredJamView f45082b;

    /* renamed from: c, reason: collision with root package name */
    private final View f45083c;

    /* renamed from: d, reason: collision with root package name */
    private final View f45084d;

    /* renamed from: e, reason: collision with root package name */
    private final View f45085e;

    /* renamed from: f, reason: collision with root package name */
    private final View f45086f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f45087g;

    /* renamed from: h, reason: collision with root package name */
    private final TextView f45088h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f45089i;

    /* renamed from: j, reason: collision with root package name */
    private final TextView f45090j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f45091k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f45092l;
    private int m;
    private int n;
    private boolean o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private final com.waze.shared_infra.o.a t;

    public i(Context context) {
        super(context);
        this.f45091k = true;
        this.f45092l = false;
        this.m = 0;
        this.n = 0;
        this.o = true;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = com.waze.shared_infra.o.b.a();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.traffic_bar, this);
        MaterialCardView materialCardView = (MaterialCardView) findViewById(R.id.trafficBarBg);
        this.f45081a = materialCardView;
        this.f45082b = (TrafficBarColoredJamView) findViewById(R.id.trafficBarJam);
        View viewFindViewById = findViewById(R.id.trafficBarDriver);
        this.f45083c = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.trafficBarTipFrame);
        this.f45086f = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.trafficBarTip);
        this.f45084d = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.trafficBarTipEnforcement);
        this.f45085e = viewFindViewById4;
        this.f45089i = (TextView) findViewById(R.id.trafficBarEnforcementLabel);
        this.f45090j = (TextView) findViewById(R.id.trafficBarEnforcementLabelDistance);
        this.f45087g = (TextView) findViewById(R.id.trafficBarTipTitle);
        this.f45088h = (TextView) findViewById(R.id.trafficBarTipTime);
        materialCardView.setOnClickListener(this);
        viewFindViewById3.setOnClickListener(this);
        viewFindViewById4.setOnClickListener(this);
        viewFindViewById2.measure(-2, -2);
        viewFindViewById.measure(-2, -2);
        viewFindViewById4.measure(-2, -2);
        int measuredHeight = viewFindViewById2.getMeasuredHeight();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewFindViewById2.getLayoutParams();
        layoutParams.bottomMargin = (viewFindViewById.getMeasuredHeight() / 2) - (measuredHeight / 2);
        viewFindViewById2.setLayoutParams(layoutParams);
        viewFindViewById2.setVisibility(0);
        viewFindViewById3.setVisibility(0);
        viewFindViewById4.setVisibility(0);
    }

    private final void j() {
        if (this.f45091k) {
            return;
        }
        if (this.f45090j.getVisibility() == 0) {
            this.f45089i.setText(this.t.c(R.string.AVERAGE_SPEED_ENFORCEMENT_ZONE_BAR_POPUP, new Object[0]));
        }
        this.f45092l = true;
        View view = this.f45086f;
        view.setVisibility(0);
        if (view.isLaidOut()) {
            l();
        } else {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new g(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        this.f45092l = true;
        this.f45091k = false;
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(200L);
        animationSet.setFillBefore(true);
        animationSet.setInterpolator(new AccelerateInterpolator());
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet.addAnimation(new TranslateAnimation(0, 0.0f, 0, -m(), 0, 0.0f, 0, 0.0f));
        animationSet.setAnimationListener(new h(this, 0));
        this.f45086f.startAnimation(animationSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(200L);
        animationSet.setFillBefore(true);
        animationSet.setInterpolator(new DecelerateInterpolator());
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.addAnimation(new TranslateAnimation(0, -m(), 0, 0.0f, 0, 0.0f, 0, 0.0f));
        animationSet.setAnimationListener(new h(this, 1, (byte[]) null));
        this.f45086f.startAnimation(animationSet);
    }

    private final int m() {
        return as.h(getResources(), 10);
    }

    public final void f(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        this.m = i2;
        this.n = i3;
        if (i2 <= -100 || i2 >= 100 || i3 <= 0) {
            return;
        }
        View view = this.f45083c;
        int height = view.getHeight();
        int i5 = this.m;
        TrafficBarColoredJamView trafficBarColoredJamView = this.f45082b;
        int measuredHeight = (i5 >= 0 ? ((trafficBarColoredJamView.getMeasuredHeight() * this.m) / 100) - (height / 2) : ((trafficBarColoredJamView.getMeasuredHeight() * this.m) / 1000) - (height / 2)) + getResources().getDimensionPixelSize(R.dimen.traffic_bar_jam_vertical_margin);
        if (this.r) {
            this.r = false;
        } else {
            view.setVisibility(0);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.bottomMargin = measuredHeight;
        view.setLayoutParams(layoutParams);
        if (iArr.length != 0 && iArr2.length != 0) {
            this.s = false;
            this.f45085e.setVisibility(8);
            this.f45084d.setVisibility(0);
            this.o = true;
            if (!isInEditMode()) {
                TextView textView = this.f45087g;
                com.waze.shared_infra.o.a aVar = this.t;
                textView.setText(aVar.c(R.string.TRAFFIC_BAR_TITLE, new Object[0]));
                this.f45088h.setText(aVar.c(R.string.TRAFFIC_BAR_TIME, Integer.valueOf((i3 / 60) + 1)));
            }
            this.f45082b.a(iArr, iArr2, i2);
            return;
        }
        this.f45084d.setVisibility(8);
        if (i4 == -1 && !isInEditMode()) {
            this.f45089i.setText(this.t.c(R.string.ENFORCEMENT_ZONE_ANDROID, new Object[0]));
            this.f45090j.setVisibility(8);
        }
        this.f45082b.b();
        if (this.o) {
            this.o = false;
            View view2 = this.f45085e;
            view2.setVisibility(0);
            view2.postDelayed(new com.waze.beacons.p(this, 20), 10000L);
            this.f45089i.setText(this.t.c(R.string.AVERAGE_SPEED_ENFORCEMENT_ZONE_BAR_START_POPUP, new Object[0]));
        }
        if (i4 == -1) {
            this.s = false;
            return;
        }
        String distanceNTV = RtAlertsNativeManager.getInstance().formatDistanceNTV(i4);
        TextView textView2 = this.f45090j;
        textView2.setText(distanceNTV);
        textView2.setVisibility(0);
        this.s = true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.s) {
            e.f45076a.a().a(100 - this.m);
        } else {
            e.f45076a.a().c(this.n, ((ShareNativeManager) r.h(ShareNativeManager.class)).getEtaInEpochTime());
        }
        if (this.f45092l) {
            return;
        }
        if (this.f45091k) {
            k();
        } else {
            j();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = this.f45081a.getMeasuredWidth() / 2;
        View view = this.f45083c;
        int measuredWidth2 = view.getMeasuredWidth() / 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = measuredWidth - measuredWidth2;
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        this.p = i2;
        if (this.q || getVisibility() == i2) {
            return;
        }
        this.q = true;
        h hVar = new h(this, 2, (char[]) null);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(200L);
        animationSet.setFillBefore(true);
        if (i2 == 0) {
            animationSet.setInterpolator(new DecelerateInterpolator());
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            animationSet.addAnimation(new TranslateAnimation(0, -m(), 0, 0.0f, 0, 0.0f, 0, 0.0f));
            animationSet.setAnimationListener(hVar);
            this.f45083c.setVisibility(8);
            this.r = true;
            if (!this.s) {
                j();
            }
        } else {
            if (this.f45086f.getVisibility() != 8) {
                k();
            }
            animationSet.setInterpolator(new AccelerateInterpolator());
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.addAnimation(new TranslateAnimation(0, 0.0f, 0, -m(), 0, 0.0f, 0, 0.0f));
            animationSet.setAnimationListener(hVar);
        }
        startAnimation(animationSet);
    }
}
