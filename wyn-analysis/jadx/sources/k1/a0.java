package k1;

import A7.W0;
import Yf.AbstractC1300f;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import b1.C1494c;
import ba.C1521a;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1300f f38797a;

    /* renamed from: b, reason: collision with root package name */
    public v0 f38798b;

    public a0(View view, AbstractC1300f abstractC1300f) {
        v0 v0VarB;
        this.f38797a = abstractC1300f;
        WeakHashMap weakHashMap = S.f38779a;
        v0 v0VarA = K.a(view);
        if (v0VarA != null) {
            int i5 = Build.VERSION.SDK_INT;
            v0VarB = (i5 >= 34 ? new k0(v0VarA) : i5 >= 30 ? new j0(v0VarA) : i5 >= 29 ? new i0(v0VarA) : new h0(v0VarA)).b();
        } else {
            v0VarB = null;
        }
        this.f38798b = v0VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        s0 s0Var;
        boolean z2 = true;
        if (!view.isLaidOut()) {
            this.f38798b = v0.g(view, windowInsets);
            return b0.i(view, windowInsets);
        }
        v0 v0VarG = v0.g(view, windowInsets);
        if (this.f38798b == null) {
            WeakHashMap weakHashMap = S.f38779a;
            this.f38798b = K.a(view);
        }
        if (this.f38798b == null) {
            this.f38798b = v0VarG;
            return b0.i(view, windowInsets);
        }
        AbstractC1300f abstractC1300fJ = b0.j(view);
        if (abstractC1300fJ != null && Objects.equals((v0) abstractC1300fJ.f16855a, v0VarG)) {
            return b0.i(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        v0 v0Var = this.f38798b;
        int i5 = 1;
        while (true) {
            s0Var = v0VarG.f38877a;
            if (i5 > 512) {
                break;
            }
            C1494c c1494cF = s0Var.f(i5);
            C1494c c1494cF2 = v0Var.f38877a.f(i5);
            int i10 = c1494cF.f19121a;
            int i11 = c1494cF2.f19121a;
            int i12 = c1494cF.f19124d;
            int i13 = c1494cF.f19123c;
            int i14 = c1494cF.f19122b;
            boolean z10 = z2;
            int i15 = c1494cF2.f19124d;
            int i16 = c1494cF2.f19123c;
            int i17 = c1494cF2.f19122b;
            boolean z11 = (i10 > i11 || i14 > i17 || i13 > i16 || i12 > i15) ? z10 : false;
            if (z11 != ((i10 < i11 || i14 < i17 || i13 < i16 || i12 < i15) ? z10 : false)) {
                if (z11) {
                    iArr[0] = iArr[0] | i5;
                } else {
                    iArr2[0] = iArr2[0] | i5;
                }
            }
            i5 <<= 1;
            z2 = z10;
        }
        boolean z12 = false;
        int i18 = iArr[0];
        int i19 = iArr2[0];
        int i20 = i18 | i19;
        if (i20 == 0) {
            this.f38798b = v0VarG;
            return b0.i(view, windowInsets);
        }
        v0 v0Var2 = this.f38798b;
        g0 g0Var = new g0(i20, (i18 & 8) != 0 ? b0.f38802e : (i19 & 8) != 0 ? b0.f38803f : (i18 & 519) != 0 ? b0.f38804g : (i19 & 519) != 0 ? b0.f38805h : null, (i20 & 8) != 0 ? 160L : 250L);
        g0Var.f38830a.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ValueAnimator duration = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f).setDuration(g0Var.f38830a.a());
        C1494c c1494cF3 = s0Var.f(i20);
        C1494c c1494cF4 = v0Var2.f38877a.f(i20);
        int iMin = Math.min(c1494cF3.f19121a, c1494cF4.f19121a);
        int i21 = c1494cF3.f19122b;
        int i22 = c1494cF4.f19122b;
        int iMin2 = Math.min(i21, i22);
        int i23 = c1494cF3.f19123c;
        int i24 = c1494cF4.f19123c;
        int iMin3 = Math.min(i23, i24);
        int i25 = c1494cF3.f19124d;
        int i26 = c1494cF4.f19124d;
        C1521a c1521a = new C1521a(C1494c.b(iMin, iMin2, iMin3, Math.min(i25, i26)), z12, C1494c.b(Math.max(c1494cF3.f19121a, c1494cF4.f19121a), Math.max(i21, i22), Math.max(i23, i24), Math.max(i25, i26)), 12);
        b0.f(view, g0Var, v0VarG, false);
        duration.addUpdateListener(new Z(g0Var, v0VarG, v0Var2, i20, view));
        duration.addListener(new D9.c(2, g0Var, view));
        ViewTreeObserverOnPreDrawListenerC3132t.a(view, new W0(view, g0Var, c1521a, duration, 18, false));
        this.f38798b = v0VarG;
        return b0.i(view, windowInsets);
    }
}
