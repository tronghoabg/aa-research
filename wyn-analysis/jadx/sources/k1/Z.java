package k1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import b1.C1494c;
import java.util.Collections;

/* loaded from: classes.dex */
public final class Z implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f38791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f38792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f38793c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f38794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f38795e;

    public Z(g0 g0Var, v0 v0Var, v0 v0Var2, int i5, View view) {
        this.f38791a = g0Var;
        this.f38792b = v0Var;
        this.f38793c = v0Var2;
        this.f38794d = i5;
        this.f38795e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        int i5;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        g0 g0Var = this.f38791a;
        g0Var.f38830a.d(animatedFraction);
        float fB = g0Var.f38830a.b();
        PathInterpolator pathInterpolator = b0.f38802e;
        int i10 = Build.VERSION.SDK_INT;
        v0 v0Var = this.f38792b;
        l0 k0Var = i10 >= 34 ? new k0(v0Var) : i10 >= 30 ? new j0(v0Var) : i10 >= 29 ? new i0(v0Var) : new h0(v0Var);
        int i11 = 1;
        while (i11 <= 512) {
            int i12 = this.f38794d & i11;
            s0 s0Var = v0Var.f38877a;
            if (i12 == 0) {
                k0Var.c(i11, s0Var.f(i11));
                f10 = fB;
                i5 = 1;
            } else {
                C1494c c1494cF = s0Var.f(i11);
                C1494c c1494cF2 = this.f38793c.f38877a.f(i11);
                float f11 = 1.0f - fB;
                f10 = fB;
                i5 = 1;
                k0Var.c(i11, v0.e(c1494cF, (int) (((c1494cF.f19121a - c1494cF2.f19121a) * f11) + 0.5d), (int) (((c1494cF.f19122b - c1494cF2.f19122b) * f11) + 0.5d), (int) (((c1494cF.f19123c - c1494cF2.f19123c) * f11) + 0.5d), (int) (((c1494cF.f19124d - c1494cF2.f19124d) * f11) + 0.5d)));
            }
            i11 <<= i5;
            fB = f10;
        }
        b0.g(this.f38795e, k0Var.b(), Collections.singletonList(g0Var));
    }
}
