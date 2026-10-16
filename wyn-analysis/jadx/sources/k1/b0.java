package k1;

import Yf.AbstractC1300f;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import ba.C1521a;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import java.util.List;

/* loaded from: classes.dex */
public final class b0 extends f0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f38802e = new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.1f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final E1.a f38803f = new E1.a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f38804g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f38805h = new AccelerateInterpolator(1.5f);

    public static void e(View view, g0 g0Var) {
        AbstractC1300f abstractC1300fJ = j(view);
        if (abstractC1300fJ != null) {
            abstractC1300fJ.a(g0Var);
            if (abstractC1300fJ.f16856b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                e(viewGroup.getChildAt(i5), g0Var);
            }
        }
    }

    public static void f(View view, g0 g0Var, v0 v0Var, boolean z2) {
        AbstractC1300f abstractC1300fJ = j(view);
        if (abstractC1300fJ != null) {
            abstractC1300fJ.f16855a = v0Var;
            if (!z2) {
                abstractC1300fJ.b(g0Var);
                z2 = abstractC1300fJ.f16856b == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                f(viewGroup.getChildAt(i5), g0Var, v0Var, z2);
            }
        }
    }

    public static void g(View view, v0 v0Var, List list) {
        AbstractC1300f abstractC1300fJ = j(view);
        if (abstractC1300fJ != null) {
            v0Var = abstractC1300fJ.c(v0Var, list);
            if (abstractC1300fJ.f16856b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                g(viewGroup.getChildAt(i5), v0Var, list);
            }
        }
    }

    public static void h(View view, g0 g0Var, C1521a c1521a) {
        AbstractC1300f abstractC1300fJ = j(view);
        if (abstractC1300fJ != null) {
            abstractC1300fJ.d(g0Var, c1521a);
            if (abstractC1300fJ.f16856b == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                h(viewGroup.getChildAt(i5), g0Var, c1521a);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static AbstractC1300f j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof a0) {
            return ((a0) tag).f38797a;
        }
        return null;
    }
}
