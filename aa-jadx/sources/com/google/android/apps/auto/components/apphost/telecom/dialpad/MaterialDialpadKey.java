package com.google.android.apps.auto.components.apphost.telecom.dialpad;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialDialpadKey extends android.widget.FrameLayout {
    private final java.lang.String a;
    private final java.lang.String b;
    private final android.graphics.drawable.Drawable c;

    public MaterialDialpadKey(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        android.view.LayoutInflater.from(context).inflate(com.google.android.projection.gearhead.R.layout.material_dialpad_key, this);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.jzy.a, i, i2);
        java.lang.String string = typedArrayObtainStyledAttributes.getString(0);
        string.getClass();
        this.a = string;
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(2);
        this.b = string2;
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.c = drawable;
        typedArrayObtainStyledAttributes.recycle();
        if (string2 != null && drawable != null) {
            throw new java.lang.IllegalStateException("Must have either secondary text or secondary drawable but not both.");
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.google.android.projection.gearhead.R.id.primary_text_view);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.google.android.projection.gearhead.R.id.secondary_text_view);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.google.android.projection.gearhead.R.id.secondary_image_view);
        textView.setText(this.a);
        java.lang.String str = this.b;
        if (str != null) {
            textView2.setText(str);
            textView2.setVisibility(0);
            return;
        }
        android.graphics.drawable.Drawable drawable = this.c;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        } else if (textView.getLayoutParams() != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.getClass();
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, getContext().getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.material_dialpad_key_primary_only_text_top_margin), layoutParams2.rightMargin, layoutParams2.bottomMargin);
        }
    }

    public MaterialDialpadKey(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialDialpadKey(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
