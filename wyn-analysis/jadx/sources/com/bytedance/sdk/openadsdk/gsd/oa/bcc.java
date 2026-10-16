package com.bytedance.sdk.openadsdk.gsd.oa;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.gsd.oa.lw;

/* loaded from: classes3.dex */
public class bcc extends oa {
    private int moa;

    public bcc(Integer num, View view, gzw gzwVar, lw.uef uefVar) {
        super(num, view, gzwVar, 2000, uefVar);
        this.moa = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.gsd.oa.oa
    public int ivm() {
        return 200;
    }

    @Override // com.bytedance.sdk.openadsdk.gsd.oa.oa
    public void moa() {
        super.moa();
    }

    @Override // com.bytedance.sdk.openadsdk.gsd.oa.oa
    public void oa(int i5) {
        if (cz()) {
            return;
        }
        if (i5 == 6 || i5 == 5) {
            this.moa = 0;
            bcc();
        }
        if (i5 == 3 || i5 == 2) {
            this.moa = 2;
            bcc();
        }
        if (this.moa == 1 || i5 != 0) {
            return;
        }
        this.moa = 1;
        uef();
    }

    @Override // com.bytedance.sdk.openadsdk.gsd.oa.oa
    public void uef() {
        if (this.moa != 1) {
            return;
        }
        super.uef();
    }

    @Override // com.bytedance.sdk.openadsdk.gsd.oa.oa
    public boolean wrv() {
        int i5 = this.moa;
        boolean z2 = i5 == 2 || i5 == 0;
        if (z2) {
            this.yo.set(false);
        }
        return !z2 || super.wrv();
    }

    @Override // com.bytedance.sdk.openadsdk.gsd.oa.oa
    public boolean yo() {
        return ivm.uef(this.uef.get(), this.f25912oa.epe()) && this.moa == 1;
    }
}
