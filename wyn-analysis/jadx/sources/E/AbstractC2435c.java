package e;

import Af.n;
import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.V;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import u0.L;

/* renamed from: e.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2435c {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f34322a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(ComponentActivity componentActivity, V.d dVar) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        L l10 = childAt instanceof L ? (L) childAt : null;
        if (l10 != null) {
            l10.setParentCompositionContext(null);
            l10.setContent(dVar);
            return;
        }
        L l11 = new L(componentActivity);
        l11.setParentCompositionContext(null);
        l11.setContent(dVar);
        View decorView = componentActivity.getWindow().getDecorView();
        if (V.e(decorView) == null) {
            V.h(decorView, componentActivity);
        }
        if (((f0) n.X(n.d0(n.a0(decorView, g0.f18672l), g0.f18673m))) == null) {
            V.i(decorView, componentActivity);
        }
        if (tg.b.y(decorView) == null) {
            tg.b.O(decorView, componentActivity);
        }
        componentActivity.setContentView(l11, f34322a);
    }
}
