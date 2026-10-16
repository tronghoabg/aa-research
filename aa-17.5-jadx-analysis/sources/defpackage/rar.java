package defpackage;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
final class rar extends LinearLayout {
    final /* synthetic */ raw a;
    private final View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rar(raw rawVar, Context context, View view) {
        super(context);
        this.a = rawVar;
        setOrientation(1);
        View view2 = new View(context);
        this.b = view2;
        view2.setBackgroundColor(-16777216);
        addView(view2, new LinearLayout.LayoutParams(-1, 0));
        addView(view, new LinearLayout.LayoutParams(-1, -1));
    }

    @ResultIgnorabilityUnspecified
    private final boolean a() {
        raw rawVar = this.a;
        if (!rawVar.I) {
            return false;
        }
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = (windowSystemUiVisibility & 4) == 0 && (windowSystemUiVisibility & 1024) == 0;
        View view = this.b;
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, z ? rawVar.G.top : 0));
        view.setBackgroundColor((windowSystemUiVisibility & 8192) == 0 ? -16777216 : -1);
        return z;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsetsConsumeDisplayCutout = super.onApplyWindowInsets(windowInsets).consumeStableInsets().consumeDisplayCutout();
        raw rawVar = this.a;
        Rect rect = rawVar.G;
        WindowInsets windowInsetsReplaceSystemWindowInsets = windowInsetsConsumeDisplayCutout.replaceSystemWindowInsets(rect.left, a() ? 0 : rect.top, rect.right, rect.bottom);
        Rect rect2 = rawVar.H;
        if (!rect2.equals(raw.a) && Build.VERSION.SDK_INT >= 29) {
            Insets insetsOf = Insets.of(rect2);
            WindowInsets.Builder builder = new WindowInsets.Builder(windowInsetsReplaceSystemWindowInsets);
            if (Build.VERSION.SDK_INT >= 34) {
                builder.setInsets(WindowInsets.Type.systemOverlays(), insetsOf);
            } else {
                builder.setDisplayCutout(new DisplayCutout(insetsOf, null, null, null, null));
            }
            windowInsetsReplaceSystemWindowInsets = builder.build();
        }
        if (rrd.e("CAR.PROJECTION.PRES", 3)) {
            rrd.d(3, "CAR.PROJECTION.PRES", null, "Sending insets to %s: %s", rawVar.m, windowInsetsReplaceSystemWindowInsets);
        }
        return windowInsetsReplaceSystemWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a.c) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                ((View) parent).setPadding(0, 0, 0, 0);
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        a();
    }
}
