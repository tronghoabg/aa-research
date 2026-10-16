package M;

import a.AbstractC1304a;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import d0.C2384c;
import e0.C2465q;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class r extends View {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f7206f = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f7207g = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public A f7208a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f7209b;

    /* renamed from: c, reason: collision with root package name */
    public Long f7210c;

    /* renamed from: d, reason: collision with root package name */
    public C8.g f7211d;

    /* renamed from: e, reason: collision with root package name */
    public A0.p f7212e;

    private final void setRippleState(boolean z2) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f7211d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f7210c;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z2 || jLongValue >= 5) {
            int[] iArr = z2 ? f7206f : f7207g;
            A a5 = this.f7208a;
            if (a5 != null) {
                a5.setState(iArr);
            }
        } else {
            C8.g gVar = new C8.g(this, 10);
            this.f7211d = gVar;
            postDelayed(gVar, 50L);
        }
        this.f7210c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setRippleState$lambda-2, reason: not valid java name */
    public static final void m4setRippleState$lambda2(r this$0) {
        AbstractC3340k.e(this$0, "this$0");
        A a5 = this$0.f7208a;
        if (a5 != null) {
            a5.setState(f7207g);
        }
        this$0.f7211d = null;
    }

    public final void b(D.k interaction, boolean z2, long j8, int i5, long j10, float f10, A0.p onInvalidateRipple) {
        AbstractC3340k.e(interaction, "interaction");
        AbstractC3340k.e(onInvalidateRipple, "onInvalidateRipple");
        if (this.f7208a == null || !Boolean.valueOf(z2).equals(this.f7209b)) {
            A a5 = new A(z2);
            setBackground(a5);
            this.f7208a = a5;
            this.f7209b = Boolean.valueOf(z2);
        }
        A a10 = this.f7208a;
        AbstractC3340k.b(a10);
        this.f7212e = onInvalidateRipple;
        e(f10, i5, j8, j10);
        if (z2) {
            long j11 = interaction.f2250a;
            a10.setHotspot(C2384c.b(j11), C2384c.c(j11));
        } else {
            a10.setHotspot(a10.getBounds().centerX(), a10.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f7212e = null;
        C8.g gVar = this.f7211d;
        if (gVar != null) {
            removeCallbacks(gVar);
            C8.g gVar2 = this.f7211d;
            AbstractC3340k.b(gVar2);
            gVar2.run();
        } else {
            A a5 = this.f7208a;
            if (a5 != null) {
                a5.setState(f7207g);
            }
        }
        A a10 = this.f7208a;
        if (a10 == null) {
            return;
        }
        a10.setVisible(false, false);
        unscheduleDrawable(a10);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(float f10, int i5, long j8, long j10) {
        A a5 = this.f7208a;
        if (a5 == null) {
            return;
        }
        Integer num = a5.f7142c;
        if (num == null || num.intValue() != i5) {
            a5.f7142c = Integer.valueOf(i5);
            z.f7231a.a(a5, i5);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        long jA = C2465q.a(j10, f10);
        C2465q c2465q = a5.f7141b;
        if (!(c2465q == null ? false : C2465q.b(c2465q.f34382a, jA))) {
            a5.f7141b = new C2465q(jA);
            a5.setColor(ColorStateList.valueOf(e0.z.s(jA)));
        }
        Rect rectR = e0.z.r(AbstractC1304a.f(C2384c.f33931b, j8));
        setLeft(rectR.left);
        setTop(rectR.top);
        setRight(rectR.right);
        setBottom(rectR.bottom);
        a5.setBounds(rectR);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable who) throws Exception {
        AbstractC3340k.e(who, "who");
        A0.p pVar = this.f7212e;
        if (pVar != null) {
            pVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
    }
}
