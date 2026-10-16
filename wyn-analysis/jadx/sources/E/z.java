package E;

import Yf.AbstractC1300f;
import android.os.Build;
import android.view.View;
import ba.C1521a;
import java.util.List;
import k1.f0;
import k1.g0;
import k1.v0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class z extends AbstractC1300f implements Runnable, k1.r, View.OnAttachStateChangeListener {

    /* renamed from: c, reason: collision with root package name */
    public final S f2779c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2780d;

    /* renamed from: e, reason: collision with root package name */
    public v0 f2781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(S composeInsets) {
        super(!composeInsets.f2728p ? 1 : 0);
        AbstractC3340k.e(composeInsets, "composeInsets");
        this.f2779c = composeInsets;
    }

    @Override // Yf.AbstractC1300f
    public final void a(g0 g0Var) {
        this.f2780d = false;
        v0 v0Var = this.f2781e;
        f0 f0Var = g0Var.f38830a;
        if (f0Var.a() != 0 && v0Var != null) {
            this.f2779c.a(v0Var, f0Var.c());
        }
        this.f2781e = null;
    }

    @Override // Yf.AbstractC1300f
    public final void b(g0 g0Var) {
        this.f2780d = true;
    }

    @Override // Yf.AbstractC1300f
    public final v0 c(v0 insets, List runningAnimations) {
        AbstractC3340k.e(insets, "insets");
        AbstractC3340k.e(runningAnimations, "runningAnimations");
        S s10 = this.f2779c;
        s10.a(insets, 0);
        if (!s10.f2728p) {
            return insets;
        }
        v0 CONSUMED = v0.f38876b;
        AbstractC3340k.d(CONSUMED, "CONSUMED");
        return CONSUMED;
    }

    @Override // Yf.AbstractC1300f
    public final C1521a d(g0 g0Var, C1521a c1521a) {
        this.f2780d = false;
        return c1521a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractC3340k.e(view, "view");
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v2) {
        AbstractC3340k.e(v2, "v");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2780d) {
            this.f2780d = false;
            v0 v0Var = this.f2781e;
            if (v0Var != null) {
                this.f2779c.a(v0Var, 0);
                this.f2781e = null;
            }
        }
    }

    @Override // k1.r
    public final v0 v(View view, v0 v0Var) {
        AbstractC3340k.e(view, "view");
        if (this.f2780d) {
            this.f2781e = v0Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return v0Var;
            }
        } else {
            S s10 = this.f2779c;
            s10.a(v0Var, 0);
            if (s10.f2728p) {
                v0 CONSUMED = v0.f38876b;
                AbstractC3340k.d(CONSUMED, "CONSUMED");
                return CONSUMED;
            }
        }
        return v0Var;
    }
}
