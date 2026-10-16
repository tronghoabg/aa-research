package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class PAGMediaView extends FrameLayout {
    protected Integer uef;

    public PAGMediaView(Context context) {
        super(context);
    }

    public void close() {
    }

    public void setMrcTrackerKey(Integer num) {
        this.uef = num;
    }

    public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
    }

    public PAGMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PAGMediaView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
    }

    public PAGMediaView(Context context, AttributeSet attributeSet, int i5, int i10) {
        super(context, attributeSet, i5, i10);
    }
}
