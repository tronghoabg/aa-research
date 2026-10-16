package k1;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class K {
    public static v0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        v0 v0VarG = v0.g(null, rootWindowInsets);
        s0 s0Var = v0VarG.f38877a;
        s0Var.r(v0VarG);
        s0Var.d(view.getRootView());
        return v0VarG;
    }

    public static void b(View view, int i5, int i10) {
        view.setScrollIndicators(i5, i10);
    }
}
