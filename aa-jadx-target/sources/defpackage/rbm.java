package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rbm extends android.widget.LinearLayout {
    final /* synthetic */ defpackage.rbr a;
    private final android.view.View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbm(defpackage.rbr rbrVar, android.content.Context context, android.view.View view) {
        super(context);
        this.a = rbrVar;
        setOrientation(1);
        android.view.View view2 = new android.view.View(context);
        this.b = view2;
        view2.setBackgroundColor(-16777216);
        addView(view2, new android.widget.LinearLayout.LayoutParams(-1, 0));
        addView(view, new android.widget.LinearLayout.LayoutParams(-1, -1));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final boolean a() {
        defpackage.rbr rbrVar = this.a;
        if (!rbrVar.I) {
            return false;
        }
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        boolean z = (windowSystemUiVisibility & 4) == 0 && (windowSystemUiVisibility & 1024) == 0;
        android.view.View view = this.b;
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, z ? rbrVar.G.top : 0));
        view.setBackgroundColor((windowSystemUiVisibility & 8192) == 0 ? -16777216 : -1);
        return z;
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        android.view.WindowInsets windowInsetsM = hh$.ExternalSyntheticApiModelOutline0.m(super.onApplyWindowInsets(windowInsets).consumeStableInsets());
        defpackage.rbr rbrVar = this.a;
        android.graphics.Rect rect = rbrVar.G;
        android.view.WindowInsets windowInsetsReplaceSystemWindowInsets = windowInsetsM.replaceSystemWindowInsets(rect.left, a() ? 0 : rect.top, rect.right, rect.bottom);
        android.graphics.Rect rect2 = rbrVar.H;
        if (!rect2.equals(defpackage.rbr.a) && android.os.Build.VERSION.SDK_INT >= 29) {
            android.graphics.Insets insetsM = ep$.ExternalSyntheticApiModelOutline0.m(rect2);
            android.view.WindowInsets.Builder builder = new android.view.WindowInsets.Builder(windowInsetsReplaceSystemWindowInsets);
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                bgp$.ExternalSyntheticApiModelOutline0.m(builder, axd$.ExternalSyntheticApiModelOutline0.m(), insetsM);
            } else {
                ped$.ExternalSyntheticApiModelOutline8.m(builder, new android.view.DisplayCutout(insetsM, null, null, null, null));
            }
            windowInsetsReplaceSystemWindowInsets = ep$.ExternalSyntheticApiModelOutline0.m(builder);
        }
        if (defpackage.rrx.e("CAR.PROJECTION.PRES", 3)) {
            defpackage.rrx.d(3, "CAR.PROJECTION.PRES", null, "Sending insets to %s: %s", rbrVar.m, windowInsetsReplaceSystemWindowInsets);
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
            for (android.view.ViewParent parent = getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                ((android.view.View) parent).setPadding(0, 0, 0, 0);
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
