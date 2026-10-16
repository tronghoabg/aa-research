package com.google.android.apps.auto.components.nocontentview;

/* JADX INFO: loaded from: classes2.dex */
public final class NoContentView extends android.widget.FrameLayout {
    public final android.widget.ProgressBar a;

    static {
        defpackage.yqm.c("GH.NoContentView");
    }

    public NoContentView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        android.view.LayoutInflater.from(context).inflate(com.google.android.projection.gearhead.R.layout.no_content_view, (android.view.ViewGroup) this, true);
        ((android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.message_icon)).getClass();
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById(com.google.android.projection.gearhead.R.id.loading_spinner);
        progressBar.getClass();
        this.a = progressBar;
        ((android.widget.TextView) findViewById(com.google.android.projection.gearhead.R.id.message_text)).getClass();
        ((android.widget.Space) findViewById(com.google.android.projection.gearhead.R.id.app_bar_space)).getClass();
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    public NoContentView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NoContentView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NoContentView(android.content.Context context) {
        this(context, null);
    }
}
