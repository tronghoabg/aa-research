package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class ecb extends ece {
    public static final Interpolator a = new PathInterpolator(BitmapDescriptorFactory.HUE_RED, 1.1f, BitmapDescriptorFactory.HUE_RED, 1.0f);
    public static final Interpolator b = new eov();
    public static final Interpolator c = new DecelerateInterpolator(1.5f);
    public static final Interpolator d = new AccelerateInterpolator(1.5f);

    static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    static ebx b(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof eca) {
            return ((eca) tag).a;
        }
        return null;
    }

    static void c(View view, ecy ecyVar, List list) {
        ebx ebxVarB = b(view);
        if (ebxVarB != null) {
            ecyVar = ebxVarB.b(ecyVar, list);
            if (ebxVarB.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                c(viewGroup.getChildAt(i), ecyVar, list);
            }
        }
    }

    static void d(View view, lds ldsVar) {
        ebx ebxVarB = b(view);
        if (ebxVarB != null) {
            ebxVarB.d(ldsVar);
            if (ebxVarB.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                d(viewGroup.getChildAt(i), ldsVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void e(View view, lds ldsVar, ecy ecyVar, boolean z) {
        ebx ebxVarB = b(view);
        boolean z2 = z;
        if (ebxVarB != null) {
            ebxVarB.e = ecyVar;
            z2 = z;
            if (!z) {
                ebxVarB.e(ldsVar);
                z2 = ebxVarB.f ^ 1;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), ldsVar, ecyVar, true == z2);
            }
        }
    }

    public static void f(View view, lds ldsVar, ebw ebwVar) {
        ebx ebxVarB = b(view);
        if (ebxVarB != null) {
            ebxVarB.c(ldsVar, ebwVar);
            if (ebxVarB.f == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), ldsVar, ebwVar);
            }
        }
    }
}
