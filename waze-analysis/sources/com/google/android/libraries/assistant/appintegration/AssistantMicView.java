package com.google.android.libraries.assistant.appintegration;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class AssistantMicView extends FrameLayout {
    private ImageView imageView;

    /* compiled from: WazeSource */
    public @interface IconType {
        public static final int LOGO = 1;
        public static final int MIC = 0;
    }

    public AssistantMicView(Context context) {
        super(context);
        initialize(context, null);
    }

    private int getIconResource(int i2) {
        return i2 != 1 ? com.waze.R.drawable.ic_mic : com.waze.R.drawable.product_logo_assistant_color_48;
    }

    private void initialize(Context context, AttributeSet attributeSet) {
        int dimensionPixelSize = -1;
        int integer = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AssistantMicView, 0, 0);
            integer = typedArrayObtainStyledAttributes.getInteger(1, 0);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AssistantMicView_iconSize, -1);
        }
        this.imageView = new ImageView(getContext());
        setIconType(integer);
        setIconSize(dimensionPixelSize);
        addView(this.imageView);
    }

    public void setIconSize(int i2) {
        this.imageView.setLayoutParams(new FrameLayout.LayoutParams(i2, i2, 17));
    }

    public void setIconType(int i2) {
        this.imageView.setImageResource(getIconResource(i2));
    }

    public AssistantMicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context, attributeSet);
    }

    public AssistantMicView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        initialize(context, attributeSet);
    }

    public AssistantMicView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        initialize(context, attributeSet);
    }
}
