package com.bytedance.sdk.openadsdk.gsd.oa;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.gsd.oa.lw;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class yo extends oa {
    private int moa;

    public yo(Integer num, View view, gzw gzwVar, lw.uef uefVar) {
        super(num, view, gzwVar, 1000, uefVar);
        this.moa = -1;
        oa(view);
    }

    @Override // com.bytedance.sdk.openadsdk.gsd.oa.oa
    public int ivm() {
        gzw gzwVar = this.f25912oa;
        return (gzwVar != null && gzwVar.gem() && this.f25912oa.dqw() == 1) ? 1000 : 100;
    }

    @Override // com.bytedance.sdk.openadsdk.gsd.oa.oa
    public void moa() {
        super.moa();
    }

    @Override // com.bytedance.sdk.openadsdk.gsd.oa.oa
    public void oa(int i5) {
    }

    @Override // com.bytedance.sdk.openadsdk.gsd.oa.oa
    public boolean yo() {
        WeakReference<View> weakReference = this.uef;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.uef.get();
        if (this.moa == -1) {
            oa(view);
        }
        return ivm.uef(view, this.moa == 1, this.f25912oa.epe());
    }

    private void oa(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.moa = width * height >= 242500 ? 1 : 0;
        }
    }
}
