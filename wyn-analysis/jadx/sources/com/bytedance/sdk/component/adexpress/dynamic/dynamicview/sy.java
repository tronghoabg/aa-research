package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes.dex */
public class sy extends ivm {
    public oa uef;

    public sy(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar) {
        super(context, dynamicRootView, bccVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ivm, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lz
    public boolean cz() {
        return super.cz();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw
    public GradientDrawable getDrawable() {
        oa oaVar = new oa();
        this.uef = oaVar;
        return oaVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw
    public oa uef(Bitmap bitmap) {
        uef uefVar = new uef(bitmap, this.uef);
        this.uef = uefVar;
        return uefVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lw
    public GradientDrawable uef(GradientDrawable.Orientation orientation, int[] iArr) {
        oa oaVar = new oa(orientation, iArr);
        this.uef = oaVar;
        return oaVar;
    }
}
