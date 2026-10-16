package com.google.android.apps.auto.components.nocontentview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import defpackage.yph;

/* loaded from: classes2.dex */
public final class NoContentView extends FrameLayout {
    public final ProgressBar a;

    static {
        yph.c("GH.NoContentView");
    }

    public NoContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.no_content_view, (ViewGroup) this, true);
        ((ImageView) findViewById(R.id.message_icon)).getClass();
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.loading_spinner);
        progressBar.getClass();
        this.a = progressBar;
        ((TextView) findViewById(R.id.message_text)).getClass();
        ((Space) findViewById(R.id.app_bar_space)).getClass();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        setPadding(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    public NoContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NoContentView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NoContentView(Context context) {
        this(context, null);
    }
}
