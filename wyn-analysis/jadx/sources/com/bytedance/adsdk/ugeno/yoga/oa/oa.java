package com.bytedance.adsdk.ugeno.yoga.oa;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.dj;
import com.bytedance.adsdk.ugeno.yoga.oa.yo;
import com.bytedance.adsdk.ugeno.yoga.xs;
import com.bytedance.adsdk.ugeno.yoga.zjm;

/* loaded from: classes.dex */
public class oa extends ViewGroup {
    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof oa) {
            throw null;
        }
        zjm zjmVarUef = dj.uef();
        yo.uef(new yo.uef(layoutParams), zjmVarUef, view);
        zjmVarUef.uef(view);
        zjmVarUef.uef((xs) new yo.oa());
        throw null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof yo.uef;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new yo.uef(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new yo.uef(layoutParams);
    }

    public zjm getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
