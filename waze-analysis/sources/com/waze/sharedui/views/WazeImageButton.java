package com.waze.sharedui.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class WazeImageButton extends android.support.v7.widget.ak {
    public WazeImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (isInEditMode()) {
            return;
        }
        int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "contentDescription", 0);
        if (attributeResourceValue != 0) {
            setContentDescription(com.waze.shared_infra.o.b.a().c(attributeResourceValue, new Object[0]));
        }
        if (getDrawable() != null) {
            setForeground(new RippleDrawable(ColorStateList.valueOf(ResourcesCompat.getColor(getContext().getResources(), R.color.background_variant, null)), null, ContextCompat.getDrawable(getContext(), R.drawable.background_circle)));
        }
    }

    public WazeImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WazeImageButton(Context context) {
        this(context, null);
    }
}
