package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class BrowserActionsFallbackMenuView extends android.widget.LinearLayout {
    private final int a;
    private final int b;

    public BrowserActionsFallbackMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = getResources().getDimensionPixelOffset(com.google.android.projection.gearhead.R.dimen.browser_actions_context_menu_min_padding);
        this.b = getResources().getDimensionPixelOffset(com.google.android.projection.gearhead.R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3 = getResources().getDisplayMetrics().widthPixels;
        int i4 = this.a;
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(i3 - (i4 + i4), this.b), 1073741824), i2);
    }
}
