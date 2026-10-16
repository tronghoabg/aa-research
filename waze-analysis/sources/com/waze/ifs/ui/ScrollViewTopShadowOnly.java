package com.waze.ifs.ui;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ScrollViewTopShadowOnly extends com.waze.sharedui.views.r {
    public ScrollViewTopShadowOnly(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ScrollView, android.view.View
    protected final float getBottomFadingEdgeStrength() {
        return 0.0f;
    }
}
