package com.google.android.apps.auto.components.ui.widget.navigation;

/* JADX INFO: loaded from: classes2.dex */
public class DetailedNavigationStepView extends android.widget.LinearLayout {
    public android.widget.ImageView a;
    public android.widget.TextView b;
    public android.widget.TextView c;
    public android.widget.ImageView d;
    public android.widget.LinearLayout e;
    public android.widget.FrameLayout f;

    public DetailedNavigationStepView(android.content.Context context) {
        this(context, null);
    }

    public final void a(java.lang.CharSequence charSequence) {
        boolean zIsEmpty = android.text.TextUtils.isEmpty(charSequence);
        android.widget.TextView textView = this.c;
        if (zIsEmpty) {
            textView.setText((java.lang.CharSequence) null);
            this.c.setVisibility(8);
        } else {
            textView.setText(charSequence);
            this.c.setVisibility(0);
        }
    }

    public final void b(java.lang.CharSequence charSequence) {
        boolean zIsEmpty = android.text.TextUtils.isEmpty(charSequence);
        android.widget.TextView textView = this.b;
        if (zIsEmpty) {
            textView.setText((java.lang.CharSequence) null);
            this.b.setVisibility(8);
        } else {
            textView.setText(charSequence);
            this.b.setVisibility(0);
        }
    }

    public final void c(android.graphics.drawable.Drawable drawable) {
        android.widget.ImageView imageView = this.a;
        if (drawable == null) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setImageDrawable(drawable);
        this.a.setVisibility(0);
        this.a.setScaleX(1.0f);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.turn_symbol);
        this.b = (android.widget.TextView) findViewById(com.google.android.projection.gearhead.R.id.distance_text);
        this.c = (android.widget.TextView) findViewById(com.google.android.projection.gearhead.R.id.description_text);
        this.d = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.lanes_image);
        this.e = (android.widget.LinearLayout) findViewById(com.google.android.projection.gearhead.R.id.turn_container);
        this.f = (android.widget.FrameLayout) findViewById(com.google.android.projection.gearhead.R.id.lanes_image_container);
    }

    public DetailedNavigationStepView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DetailedNavigationStepView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
