package com.google.android.apps.auto.components.apphost.telecom.dialpad;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import defpackage.jzu;

/* loaded from: classes2.dex */
public class MaterialDialpadKey extends FrameLayout {
    private final String a;
    private final String b;
    private final Drawable c;

    public MaterialDialpadKey(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.material_dialpad_key, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jzu.a, i, i2);
        String string = typedArrayObtainStyledAttributes.getString(0);
        string.getClass();
        this.a = string;
        String string2 = typedArrayObtainStyledAttributes.getString(2);
        this.b = string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.c = drawable;
        typedArrayObtainStyledAttributes.recycle();
        if (string2 != null && drawable != null) {
            throw new IllegalStateException("Must have either secondary text or secondary drawable but not both.");
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.primary_text_view);
        TextView textView2 = (TextView) findViewById(R.id.secondary_text_view);
        ImageView imageView = (ImageView) findViewById(R.id.secondary_image_view);
        textView.setText(this.a);
        String str = this.b;
        if (str != null) {
            textView2.setText(str);
            textView2.setVisibility(0);
            return;
        }
        Drawable drawable = this.c;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        } else if (textView.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(layoutParams2.leftMargin, getContext().getResources().getDimensionPixelSize(R.dimen.material_dialpad_key_primary_only_text_top_margin), layoutParams2.rightMargin, layoutParams2.bottomMargin);
        }
    }

    public MaterialDialpadKey(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialDialpadKey(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
