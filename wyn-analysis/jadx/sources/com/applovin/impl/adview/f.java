package com.applovin.impl.adview;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.e;
import com.applovin.impl.n1;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
class f extends Dialog implements n1 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f21075a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21076b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f21077c;

    /* renamed from: d, reason: collision with root package name */
    private final b f21078d;

    /* renamed from: e, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f21079e;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f21080f;

    /* renamed from: g, reason: collision with root package name */
    private e f21081g;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            f.this.f21081g.setClickable(true);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public f(com.applovin.impl.sdk.ad.a aVar, b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f21076b = kVar;
        this.f21077c = kVar.O();
        this.f21075a = activity;
        this.f21078d = bVar;
        this.f21079e = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private void g() {
        this.f21075a.runOnUiThread(new s(this, 1));
    }

    @Override // com.applovin.impl.n1
    public void dismiss(String str) {
        this.f21075a.runOnUiThread(new s(this, 0));
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f21078d.a("javascript:al_onBackPressed();");
        dismiss("expanded_ad_dialog_back_button");
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f21075a.getWindow().getAttributes().flags, this.f21075a.getWindow().getAttributes().flags);
                window.addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f21077c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21077c.a("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }

    private void a() {
        this.f21078d.a("javascript:al_onCloseTapped();");
        dismiss("expanded_ad_dialog_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        if (this.f21081g.isClickable()) {
            this.f21081g.performClick();
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f21078d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f21075a);
        this.f21080f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f21080f.setBackgroundColor(-1157627904);
        this.f21080f.addView(this.f21078d);
        if (!this.f21079e.l1()) {
            a(this.f21079e.f1());
            g();
        }
        setContentView(this.f21080f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f21080f.removeView(this.f21078d);
        super.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        try {
            if (this.f21081g == null) {
                a();
            }
            this.f21081g.setVisibility(0);
            this.f21081g.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.f21081g.startAnimation(alphaAnimation);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21077c.a("ExpandedAdDialog", "Unable to fade in close button", th);
            }
            a();
        }
    }

    public b c() {
        return this.f21078d;
    }

    private void a(e.a aVar) {
        if (this.f21081g != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21077c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e eVarA = e.a(aVar, this.f21075a);
        this.f21081g = eVarA;
        eVarA.setVisibility(8);
        final int i5 = 0;
        this.f21081g.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f21103b;

            {
                this.f21103b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f21103b.a(view);
                        break;
                    default:
                        this.f21103b.b(view);
                        break;
                }
            }
        });
        this.f21081g.setClickable(false);
        int iA = a(((Integer) this.f21076b.a(y4.f23582E1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.k kVar = this.f21076b;
        y4 y4Var = y4.f23606H1;
        layoutParams.addRule(((Boolean) kVar.a(y4Var)).booleanValue() ? 9 : 11);
        this.f21081g.a(iA);
        int iA2 = a(((Integer) this.f21076b.a(y4.f23598G1)).intValue());
        int iA3 = a(((Integer) this.f21076b.a(y4.f23590F1)).intValue());
        layoutParams.setMargins(iA3, iA2, iA3, 0);
        this.f21080f.addView(this.f21081g, layoutParams);
        this.f21081g.bringToFront();
        int iA4 = a(((Integer) this.f21076b.a(y4.f23614I1)).intValue());
        View view = new View(this.f21075a);
        view.setBackgroundColor(0);
        int i10 = iA + iA4;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f21076b.a(y4Var)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(iA3 - a(5), iA2 - a(5), iA3 - a(5), 0);
        final int i11 = 1;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.adview.r

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f21103b;

            {
                this.f21103b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        this.f21103b.a(view2);
                        break;
                    default:
                        this.f21103b.b(view2);
                        break;
                }
            }
        });
        this.f21080f.addView(view, layoutParams2);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.f21079e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i5) {
        return AppLovinSdkUtils.dpToPx(this.f21075a, i5);
    }
}
