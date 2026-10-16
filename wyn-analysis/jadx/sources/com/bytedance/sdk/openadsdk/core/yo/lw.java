package com.bytedance.sdk.openadsdk.core.yo;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.yo.yo;

/* loaded from: classes3.dex */
public abstract class lw extends uef {
    public lw(Context context, gzw gzwVar, String str, int i5) {
        super(context, gzwVar, str, i5);
    }

    public abstract void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, int i5, int i10, int i11, boolean z2);

    @Override // com.bytedance.sdk.openadsdk.core.yo.uef, com.bytedance.sdk.openadsdk.core.yo.oa, com.bytedance.sdk.openadsdk.core.yo.yo
    public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
        if (uef(view, z2)) {
            uef(view, f10, f11, f12, f13, sparseArray, this.pz, this.gr, this.f25836ue, z2);
        }
        super.uef(view, f10, f11, f12, f13, sparseArray, z2);
    }
}
