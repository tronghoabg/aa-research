package com.google.android.apps.auto.components.apphost.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.car.app.navigation.model.NavigationTemplate;
import com.android.car.libraries.apphost.view.MicrophoneRecordingView;
import com.android.car.libraries.apphost.view.SurfaceViewContainer;
import com.android.car.libraries.apphost.view.TextureViewContainer;
import com.google.android.apps.auto.components.apphost.view.TemplateView;
import com.google.android.apps.auto.components.ui.speedbump.SpeedbumpView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.acob;
import defpackage.ebf;
import defpackage.epf;
import defpackage.ept;
import defpackage.eqa;
import defpackage.eqm;
import defpackage.eqn;
import defpackage.geu;
import defpackage.ggu;
import defpackage.ghl;
import defpackage.gio;
import defpackage.gsf;
import defpackage.hle;
import defpackage.hlg;
import defpackage.hli;
import defpackage.hln;
import defpackage.joo;
import defpackage.kbn;
import defpackage.leh;
import defpackage.lza;
import defpackage.lze;
import defpackage.nfs;
import defpackage.uk;
import defpackage.wb;
import defpackage.ype;
import defpackage.yph;
import j$.util.Objects;

/* loaded from: classes.dex */
public class TemplateView extends hli implements epf {
    public static final yph h = yph.c("CarApp.H");
    public static boolean i;
    private WindowInsets A;
    private Boolean B;
    private final uk C;
    public boolean j;
    public SpeedbumpView k;
    public final kbn l;
    public final lze m;
    public ggu n;
    public boolean o;
    public final Handler p;
    public final eqm q;
    private SurfaceViewContainer r;
    private TextureViewContainer s;
    private FrameLayout t;
    private final int u;
    private MicrophoneRecordingView v;
    private wb w;
    private final eqn x;
    private boolean y;
    private WindowInsets z;

    public TemplateView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.C = new uk((byte[]) null);
        lze lzeVar = new lze();
        this.m = lzeVar;
        this.x = new hlg(this, 9);
        this.q = new eqm();
        this.y = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.templateStatusBarMinimumTopPadding});
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        lzeVar.a = ebf.j();
        lzeVar.g(new lza() { // from class: kbk
            @Override // defpackage.lza
            public final void a(lzb lzbVar) throws Resources.NotFoundException {
                int iOrdinal = lzbVar.ordinal();
                TemplateView templateView = this.a;
                if (iOrdinal != 0) {
                    if (iOrdinal != 2 && iOrdinal != 3) {
                        throw new IllegalStateException("Unexpected moderation state: ".concat(String.valueOf(String.valueOf(lzbVar))));
                    }
                    if (!aczc.t()) {
                        ((ype) TemplateView.h.l().ai((char) 2893)).u("Speedbump not enabled. Hiding speedbump is a no-op.");
                        return;
                    }
                    SpeedbumpView speedbumpView = templateView.k;
                    if (speedbumpView.a.getVisibility() == 8) {
                        return;
                    }
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(speedbumpView.getContext(), R.anim.speedbump_out);
                    animationLoadAnimation.setAnimationListener(new ona(speedbumpView));
                    speedbumpView.b.startAnimation(animationLoadAnimation);
                    speedbumpView.d.end();
                    Integer num = (Integer) lau.c().i().e();
                    if (num == null || num.intValue() == 2) {
                        return;
                    }
                    mar.a().b(omz.a, 0);
                    return;
                }
                if (!aczc.t()) {
                    ((ype) TemplateView.h.l().ai((char) 2898)).u("Speedbump not enabled. Showing speedbump is a no-op.");
                    return;
                }
                geu geuVar = templateView.c;
                geuVar.getClass();
                geuVar.k().d(gnr.b(22, ((gmh) geuVar.d()).a));
                SpeedbumpView speedbumpView2 = templateView.k;
                if (speedbumpView2.a.getVisibility() != 0) {
                    leh.a();
                    if (speedbumpView2.e) {
                        speedbumpView2.removeAllViews();
                        speedbumpView2.a();
                        speedbumpView2.e = false;
                    }
                    speedbumpView2.a.setVisibility(0);
                    if (SpeedbumpView.b()) {
                        ViewGroup viewGroup = speedbumpView2.f;
                        if (viewGroup != null) {
                            speedbumpView2.g = viewGroup.getDescendantFocusability();
                            speedbumpView2.f.setDescendantFocusability(393216);
                        }
                        speedbumpView2.a.setFocusable(true);
                        speedbumpView2.a.requestFocus();
                    }
                    speedbumpView2.b.clearAnimation();
                    speedbumpView2.b.startAnimation(AnimationUtils.loadAnimation(speedbumpView2.getContext(), R.anim.speedbump_in));
                    speedbumpView2.d.start();
                }
            }
        });
        this.l = new kbn(lzeVar);
        this.p = new Handler(Looper.getMainLooper());
    }

    private static final boolean r(geu geuVar) {
        gsf gsfVar;
        return (geuVar == null || (gsfVar = (gsf) geuVar.l(gsf.class)) == null || !gsfVar.c()) ? false : true;
    }

    @Override // defpackage.epf
    public final void fx(eqa eqaVar) {
        nfs.a().k.fE(eqaVar, this.x);
    }

    @Override // defpackage.hli
    protected final int g() {
        return this.u;
    }

    @Override // defpackage.hli
    protected final View h() {
        return this.j ? this.s : this.r;
    }

    @Override // defpackage.hli
    protected final ViewGroup i() {
        return this.t;
    }

    @Override // defpackage.hli
    public final MicrophoneRecordingView j() {
        MicrophoneRecordingView microphoneRecordingView = this.v;
        microphoneRecordingView.getClass();
        return microphoneRecordingView;
    }

    @Override // defpackage.hli
    public final void k(WindowInsets windowInsets) {
        int systemWindowInsetLeft;
        int systemWindowInsetRight;
        boolean zEquals = Objects.equals(this.A, windowInsets);
        boolean zR = r(this.c);
        Boolean bool = this.B;
        boolean z = false;
        if (bool != null && zR != bool.booleanValue()) {
            z = true;
        }
        this.B = Boolean.valueOf(zR);
        if ((zEquals || !z) && this.z == null) {
            this.A = windowInsets;
            super.k(windowInsets);
        } else {
            this.z = windowInsets;
        }
        SpeedbumpView speedbumpView = this.k;
        if (speedbumpView != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.ime());
                systemWindowInsetLeft = insets.left;
                systemWindowInsetRight = insets.right;
            } else {
                systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
            }
            speedbumpView.setPadding(systemWindowInsetLeft, speedbumpView.getPaddingTop(), systemWindowInsetRight, speedbumpView.getPaddingBottom());
        }
    }

    @Override // defpackage.hli
    protected final uk n() {
        return this.C;
    }

    public final hln o() {
        return this.j ? this.s : this.r;
    }

    @Override // defpackage.hli, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ept eptVar = this.b;
        if (eptVar != null) {
            eptVar.c(this.l);
            eptVar.c(this);
        }
        this.y = true;
        if (this.w != null) {
            this.q.j(true);
        }
        this.o = true;
        this.p.post(new joo(this, 20));
        getViewTreeObserver().addOnGlobalFocusChangeListener(new hle(this, 2, null));
    }

    @Override // defpackage.hli, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ept eptVar = this.b;
        if (eptVar != null) {
            eptVar.d(this.l);
            eptVar.d(this);
        }
        this.y = false;
        this.q.j(false);
        nfs.a().k.k(this.x);
        this.o = false;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.r = (SurfaceViewContainer) findViewById(R.id.surface_container);
        this.s = (TextureViewContainer) findViewById(R.id.texture_container);
        if (leh.a().b()) {
            this.r.d();
            this.s.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        this.t = (FrameLayout) findViewById(R.id.template_container);
        SpeedbumpView speedbumpView = (SpeedbumpView) findViewById(R.id.speedbump_view);
        this.k = speedbumpView;
        speedbumpView.f = this.t;
        this.v = (MicrophoneRecordingView) findViewById(R.id.microphone_recording_view);
    }

    @Override // defpackage.hli, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        geu geuVar = this.c;
        if (geuVar != null) {
            ((gio) geuVar.F(gio.class)).a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(androidx.car.app.model.TemplateWrapper r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.apphost.view.TemplateView.p(androidx.car.app.model.TemplateWrapper, boolean):void");
    }

    public final void q() {
        boolean zJ = acob.J();
        wb wbVar = this.w;
        boolean z = !zJ ? wbVar instanceof NavigationTemplate : wbVar != null && ghl.d(wbVar.getClass());
        boolean zBooleanValue = ((Boolean) nfs.a().k.e()).booleanValue();
        if (z || !zBooleanValue) {
            ((ype) h.l().ai(2899)).Q("Moderator OFF. isModerationExempt=%b, canInterrupt=%b", z, zBooleanValue);
            this.m.m();
        } else {
            ((ype) h.l().ai(2900)).Q("Moderator ON. isModerationExempt=%b, canInterrupt=%b", false, true);
            this.m.l();
        }
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fL(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fy(eqa eqaVar) {
    }

    public TemplateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TemplateView(Context context) {
        this(context, null);
    }
}
