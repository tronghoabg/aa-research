package com.waze.reports_v2.presentation;

import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.airbnb.lottie.LottieAnimationView;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.strings.DisplayStrings;
import com.waze.view.button.ReportMenuButton;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ap extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f34805a = {180, 225, DisplayStrings.DS_TRIP_OVERVIEW_NO_NAME_ORIGIN};
    private TextView A;
    private View B;
    private View C;
    private boolean D;
    private ConversationalReportingFteTooltipCompat E;
    private LottieAnimationView F;
    private boolean G;
    private ao H;
    private aq I;
    private Boolean J;

    /* renamed from: b, reason: collision with root package name */
    private bg f34806b;

    /* renamed from: c, reason: collision with root package name */
    private av f34807c;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f34808d;

    /* renamed from: e, reason: collision with root package name */
    private int f34809e;

    /* renamed from: f, reason: collision with root package name */
    private int f34810f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34811g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f34812h;

    /* renamed from: i, reason: collision with root package name */
    private float f34813i;

    /* renamed from: j, reason: collision with root package name */
    private float f34814j;

    /* renamed from: k, reason: collision with root package name */
    private final View[] f34815k;

    /* renamed from: l, reason: collision with root package name */
    private final PointF[] f34816l;
    private int m;
    private final Interpolator n;
    private float o;
    private ImageView p;
    private LottieAnimationView q;
    private LottieAnimationView r;
    private ImageView s;
    private View t;
    private FrameLayout u;
    private ImageView v;
    private ImageView w;
    private LottieAnimationView x;
    private LottieAnimationView y;
    private ImageView z;

    public ap(Context context) {
        super(context, null, 0);
        this.f34806b = new bg(null, false, false);
        this.f34807c = null;
        View[] viewArr = {findViewById(R.id.swipeTrafficJamButton), findViewById(R.id.swipePoliceButton), findViewById(R.id.swipeHazardButton)};
        this.f34815k = viewArr;
        this.f34816l = new PointF[3];
        this.m = -1;
        this.n = new DecelerateInterpolator();
        this.D = false;
        this.G = false;
        this.H = new an();
        this.J = ConfigValues.CONFIG_VALUE_REPORTING_YELLOW_REPORT_BUTTON_ENABLED.b();
        LayoutInflater.from(getContext()).inflate(R.layout.map_report_button_view, (ViewGroup) this, true);
        this.p = (ImageView) findViewById(R.id.mainReportButton);
        this.q = (LottieAnimationView) findViewById(R.id.reportButtonLottie);
        this.r = (LottieAnimationView) findViewById(R.id.reportButtonConversationalTintedLottie);
        this.F = (LottieAnimationView) findViewById(R.id.reportButtonBlueDotLottie);
        this.s = (ImageView) findViewById(R.id.reportButtonBackground);
        this.t = findViewById(R.id.reportButtonShadow);
        this.u = (FrameLayout) findViewById(R.id.mainReportButtonContainer);
        this.v = (ImageView) findViewById(R.id.animReportButton);
        this.w = (ImageView) findViewById(R.id.animReportButtonRight);
        this.x = (LottieAnimationView) findViewById(R.id.animReportButtonLottie);
        this.y = (LottieAnimationView) findViewById(R.id.animReportButtonConversationalLottie);
        this.z = (ImageView) findViewById(R.id.animReportButtonBackground);
        this.A = (TextView) findViewById(R.id.animReportText);
        this.B = findViewById(R.id.animReportTextContainer);
        this.C = findViewById(R.id.animReportButtonContainer);
        this.f34808d = new com.waze.g.f(this, 11);
        this.E = (ConversationalReportingFteTooltipCompat) findViewById(R.id.conversationalReportingFteTooltipCompat);
        this.o = getResources().getDisplayMetrics().density;
        for (int i2 = 0; i2 < 3; i2++) {
            ((ReportMenuButton) viewArr[i2]).h();
        }
        if (this.J.booleanValue() && ConfigValues.CONFIG_VALUE_BUTTON_PACK_BUTTON_SIZE_FIX_OFFSET.b().booleanValue()) {
            float f2 = this.o * 3.0f;
            this.p.setTranslationY(f2);
            this.q.setTranslationY(f2);
            this.r.setTranslationY(f2);
            this.F.setTranslationY(f2);
            this.v.setTranslationY(f2);
            this.x.setTranslationY(f2);
            this.y.setTranslationY(f2);
        }
        float f3 = this.o * 120.0f;
        int[] iArr = f34805a;
        double radians = Math.toRadians(iArr[0]);
        this.f34816l[0] = new PointF(((float) Math.cos(radians)) * f3, ((float) Math.sin(radians)) * f3);
        double radians2 = Math.toRadians(iArr[1]);
        this.f34816l[1] = new PointF(((float) Math.cos(radians2)) * f3, ((float) Math.sin(radians2)) * f3);
        double radians3 = Math.toRadians(iArr[2]);
        this.f34816l[2] = new PointF(((float) Math.cos(radians3)) * f3, ((float) Math.sin(radians3)) * f3);
        this.I = new aq(getContext(), this.p, this.q, this.r, this.F, this.v, this.x, this.y, this.A, this.E, new com.waze.car_lib.o.ab(this, 4));
        A();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.presentation.ap.A():void");
    }

    private final void B() {
        if (this.f34811g) {
            this.f34811g = false;
            this.f34812h = true;
            this.u.postDelayed(new com.waze.g.f(this, 14), 150L);
            u(0);
            u(2);
            u(1);
        }
    }

    private final void C() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, 0, this.f34809e, 0, this.f34810f);
        scaleAnimation.setDuration(100L);
        scaleAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        startAnimation(scaleAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        if (this.f34811g || this.C.getVisibility() == 0) {
            return;
        }
        this.f34811g = true;
        this.f34812h = true;
        this.u.postDelayed(new com.waze.g.f(this, 12), 150L);
        C();
        v(0);
        v(1);
        v(2);
    }

    public static /* synthetic */ void e(ap apVar, Runnable runnable) {
        apVar.u.setVisibility(4);
        apVar.u.post(new com.google.firebase.appcheck.debug.a.a(apVar, runnable, 17, null));
    }

    public static /* synthetic */ void f(ap apVar, ba baVar) {
        if (apVar.C.getWidth() <= 0) {
            com.waze.shared_infra.i.h.j("MapReportButtonView: playExpansionAnimation: Could not start animation, container ready but with zero width");
        } else if (apVar.f34811g) {
            com.waze.shared_infra.i.h.j("MapReportButtonView: playExpansionAnimation: Could not start animation, button is in the middle of a long press");
        } else {
            if (!apVar.H.g()) {
                if (apVar.D) {
                    apVar.z(baVar);
                    return;
                }
                apVar.t();
                float width = apVar.B.getWidth();
                apVar.v.setTranslationX(width);
                apVar.x.setTranslationX(width);
                apVar.y.setTranslationX(width);
                apVar.z.setTranslationX(width);
                apVar.B.setScaleX(0.0f);
                apVar.B.setTranslationX(width / 2.0f);
                byte[] bArr = null;
                com.google.firebase.appcheck.debug.a.a aVar = new com.google.firebase.appcheck.debug.a.a(apVar, baVar, 12, bArr);
                int width2 = apVar.t.getWidth();
                apVar.C.setVisibility(0);
                apVar.u.setVisibility(8);
                apVar.v.animate().translationX(0.0f);
                apVar.x.animate().translationX(0.0f);
                apVar.y.animate().translationX(0.0f);
                apVar.z.animate().translationX(0.0f);
                apVar.t.animate().scaleX((r0 + width2) / width2).translationX((-width) / 2.0f);
                apVar.B.animate().scaleX(1.0f).translationX(0.0f).withEndAction(new com.google.firebase.appcheck.debug.a.a(apVar, aVar, 14, bArr));
                return;
            }
            com.waze.shared_infra.i.h.j("MapReportButtonView: playExpansionAnimation: Could not start animation, report button is covered");
        }
        apVar.x(baVar);
    }

    public static /* synthetic */ void i(ap apVar) {
        if (apVar.G) {
            apVar.I.f();
            apVar.G = false;
        }
    }

    public static /* synthetic */ void j(ap apVar, int i2, Runnable runnable) {
        float f2 = i2;
        apVar.B.animate().scaleX(0.0f).translationX(f2 / 2.0f);
        apVar.t.animate().scaleX(1.0f).translationX(0.0f);
        apVar.x.animate().translationX(f2);
        apVar.y.animate().translationX(f2);
        apVar.z.animate().translationX(f2);
        apVar.v.animate().translationX(f2).withEndAction(new com.google.firebase.appcheck.debug.a.a(apVar, runnable, 18, null));
    }

    public static /* synthetic */ void k(ap apVar, Runnable runnable) {
        apVar.t();
        apVar.C.setVisibility(8);
        apVar.u.setVisibility(0);
        apVar.D = false;
        runnable.run();
    }

    public static /* synthetic */ void l(ap apVar, Runnable runnable) {
        apVar.A.animate().alpha(1.0f);
        runnable.run();
    }

    public static /* synthetic */ void r(ap apVar, aw awVar) {
        aq aqVar = apVar.I;
        h.g.b.x.f(awVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        aqVar.d(awVar, null);
        throw null;
    }

    public static /* synthetic */ void s(ap apVar, Runnable runnable) {
        if (!apVar.D) {
            runnable.run();
        } else {
            apVar.A.animate().alpha(0.0f).withEndAction(new com.google.android.gms.common.api.internal.z(apVar, apVar.B.getWidth(), runnable, 3));
        }
    }

    private final void t() {
        int[] iArr = new int[2];
        this.p.getLocationOnScreen(iArr);
        int width = iArr[0] + this.p.getWidth();
        this.C.getLocationOnScreen(iArr);
        this.C.setTranslationX(width - (iArr[0] + this.C.getWidth()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void u(int i2) {
        View view = this.f34815k[i2];
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(new ScaleAnimation(0.6f, 0.6f, 0.6f, 0.6f, 1, 0.5f, 1, 0.5f));
        PointF pointF = this.f34816l[i2];
        TranslateAnimation translateAnimation = new TranslateAnimation(pointF.x, 0.0f, pointF.y, 0.0f);
        translateAnimation.setDuration(150L);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(new AlphaAnimation(0.6f, 0.6f));
        view.startAnimation(animationSet);
        animationSet.setAnimationListener(new am(this, view));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void v(int i2) {
        View view = this.f34815k[i2];
        view.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.6f, 0.6f, 0.6f, 0.6f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(150L);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        animationSet.addAnimation(scaleAnimation);
        PointF pointF = this.f34816l[i2];
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, pointF.x, 0.0f, pointF.y);
        translateAnimation.setDuration(150L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        animationSet.addAnimation(translateAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.6f, 0.6f);
        alphaAnimation.setDuration(150L);
        alphaAnimation.setFillAfter(true);
        animationSet.addAnimation(alphaAnimation);
        RotateAnimation rotateAnimation = new RotateAnimation(-30.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(150L);
        rotateAnimation.setInterpolator(new DecelerateInterpolator());
        rotateAnimation.setFillAfter(true);
        animationSet.addAnimation(rotateAnimation);
        animationSet.setFillAfter(true);
        view.startAnimation(animationSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void w(float f2, float f3, int i2, float f4) {
        PointF[] pointFArr = this.f34816l;
        float f5 = pointFArr[i2].x - f2;
        double d2 = pointFArr[i2].y - f3;
        double d3 = f5;
        float fSqrt = (float) Math.sqrt((d3 * d3) + (d2 * d2));
        float fAbs = (float) Math.abs((Math.toDegrees(Math.atan(f3 / f2)) + (f2 < 0.0f ? 180.0d : 360.0d)) - f34805a[i2]);
        View view = this.f34815k[i2];
        float f6 = (fAbs >= 20.0f ? 1.0f : f4) * this.o;
        float f7 = ((-15.0f) + fAbs) / 5.0f;
        float f8 = f7 >= 0.0f ? f7 : 0.0f;
        if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        float f9 = 5.0f * f6;
        float f10 = 70.0f * f6;
        float f11 = f6 * 25.0f;
        if (fSqrt < f11 && fAbs < 20.0f) {
            if (fSqrt >= f9) {
                f8 = 1.0f - ((1.0f - ((fSqrt - f9) / (f10 - f9))) * (1.0f - f8));
            }
            float interpolation = this.n.getInterpolation(f8);
            PointF pointF = pointFArr[i2];
            PointF pointF2 = new PointF(f2 + ((pointF.x - f2) * interpolation), f3 + ((pointF.y - f3) * interpolation));
            TranslateAnimation translateAnimation = new TranslateAnimation(pointF2.x, pointF2.x, pointF2.y, pointF2.y);
            translateAnimation.setFillAfter(true);
            view.startAnimation(translateAnimation);
            this.m = i2;
            return;
        }
        if (fSqrt >= f10) {
            if (this.f34812h) {
                return;
            }
            AnimationSet animationSet = new AnimationSet(true);
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.6f, 0.6f, 0.6f, 0.6f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setFillAfter(true);
            animationSet.addAnimation(scaleAnimation);
            PointF pointF3 = pointFArr[i2];
            TranslateAnimation translateAnimation2 = new TranslateAnimation(pointF3.x, pointF3.x, pointF3.y, pointF3.y);
            translateAnimation2.setFillAfter(true);
            animationSet.addAnimation(translateAnimation2);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.6f, 0.6f);
            alphaAnimation.setFillAfter(true);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setFillAfter(true);
            view.startAnimation(animationSet);
            if (this.m == i2) {
                this.m = -1;
                return;
            }
            return;
        }
        float f12 = 1.0f - (((fSqrt - f11) / (f10 - f11)) * 0.39999998f);
        float interpolation2 = this.n.getInterpolation(1.0f - ((1.0f - ((fSqrt - f9) / (f10 - f9))) * (1.0f - f8)));
        PointF pointF4 = pointFArr[i2];
        PointF pointF5 = new PointF(f2 + ((pointF4.x - f2) * interpolation2), f3 + ((pointF4.y - f3) * interpolation2));
        AnimationSet animationSet2 = new AnimationSet(true);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(f12, f12, f12, f12, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setFillAfter(true);
        animationSet2.addAnimation(scaleAnimation2);
        TranslateAnimation translateAnimation3 = new TranslateAnimation(pointF5.x, pointF5.x, pointF5.y, pointF5.y);
        translateAnimation3.setFillAfter(true);
        animationSet2.addAnimation(translateAnimation3);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(f12, f12);
        alphaAnimation2.setFillAfter(true);
        animationSet2.addAnimation(alphaAnimation2);
        animationSet2.setFillAfter(true);
        view.startAnimation(animationSet2);
        if (this.m == i2) {
            this.m = -1;
        }
    }

    private final void x(ba baVar) {
        this.f34807c = null;
        this.G = false;
        this.H.a(baVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(ba baVar) {
        this.f34807c = null;
        this.H.b(baVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(ba baVar) {
        this.D = true;
        baVar.b().invoke();
    }

    public final void m() {
        A();
    }

    public final void n() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.u.getLayoutParams();
        marginLayoutParams.setMargins(0, 0, 0, 0);
        this.u.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.C.getLayoutParams();
        marginLayoutParams2.setMargins(0, 0, 0, 0);
        this.C.setLayoutParams(marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.t.getLayoutParams();
        marginLayoutParams3.setMargins(0, -com.waze.ui.z.as.g(getContext(), 6), -com.waze.ui.z.as.g(getContext(), 20), 0);
        this.t.setLayoutParams(marginLayoutParams3);
    }

    public final void o(ao aoVar) {
        this.H = aoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.presentation.ap.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(bg bgVar) {
        this.f34806b = bgVar;
        A();
    }
}
