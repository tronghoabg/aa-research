package android.support.v7.app;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class v implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f633a;

    v(an anVar) {
        this.f633a = anVar;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        an anVar = this.f633a;
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        int iY = anVar.Y(windowInsetsCompat);
        if (systemWindowInsetTop != iY) {
            windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), iY, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
        }
        return ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
    }
}
