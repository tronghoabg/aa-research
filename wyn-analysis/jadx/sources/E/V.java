package E;

import A.W;
import N.C0718d;
import N.C0732k;
import N.C0740o;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class V extends AbstractC3343n implements tf.q {
    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        S s10;
        Z.k composed = (Z.k) obj;
        C0740o c0740o = (C0740o) obj2;
        ((Number) obj3).intValue();
        AbstractC3340k.e(composed, "$this$composed");
        c0740o.M(359872873);
        WeakHashMap weakHashMap = S.f2713s;
        c0740o.M(-1366542614);
        View view = (View) c0740o.j(AndroidCompositionLocals_androidKt.f18016f);
        WeakHashMap weakHashMap2 = S.f2713s;
        synchronized (weakHashMap2) {
            try {
                Object s11 = weakHashMap2.get(view);
                if (s11 == null) {
                    s11 = new S(view);
                    weakHashMap2.put(view, s11);
                }
                s10 = (S) s11;
            } catch (Throwable th) {
                throw th;
            }
        }
        C0718d.c(s10, new W(5, s10, view), c0740o);
        c0740o.p(false);
        c0740o.M(1157296644);
        boolean zE = c0740o.e(s10);
        Object objF = c0740o.F();
        if (zE || objF == C0732k.f7800a) {
            objF = new B(s10.f2715b);
            c0740o.U(objF);
        }
        c0740o.p(false);
        B b5 = (B) objF;
        c0740o.p(false);
        return b5;
    }
}
