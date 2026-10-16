package com.bytedance.sdk.openadsdk.core.bcc.uef;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.oa.dj;
import com.bytedance.sdk.openadsdk.core.model.ab;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class uef extends yo implements com.bytedance.sdk.component.adexpress.dynamic.ivm.uef {

    /* renamed from: oa, reason: collision with root package name */
    private dj f25494oa;
    protected WeakReference<View> uef;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ivm.uef
    public void uef(dj djVar) {
        this.f25494oa = djVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ivm.uef
    public void uef(View view) {
        this.uef = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.yo.yo
    public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) {
        uef(view, ((Integer) view.getTag()).intValue(), f10, f11, f12, f13, sparseArray);
    }

    private void uef(View view, int i5, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray) {
        if (this.f25494oa != null) {
            String strValueOf = "";
            try {
                int i10 = com.bytedance.sdk.component.adexpress.dynamic.uef.tpx;
                if (view.getTag(i10) != null) {
                    strValueOf = String.valueOf(view.getTag(i10));
                }
            } catch (Exception unused) {
            }
            this.f25494oa.uef(view, i5, new ab.uef().moa(f10).yo(f11).oa(f12).uef(f13).oa(this.gsd).uef(this.rt).uef(sparseArray).uef(this.ku).uef(strValueOf).uef());
        }
    }
}
