package com.bytedance.adsdk.oa.uef.uef;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public class dhk extends uef {
    private com.bytedance.adsdk.oa.uef.oa.uef<ColorFilter, ColorFilter> bcc;
    private final boolean ivm;
    private final String lw;
    private final com.bytedance.adsdk.oa.yo.yo.uef moa;
    private final com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> xs;

    public dhk(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar, com.bytedance.adsdk.oa.yo.oa.sy syVar) {
        super(czVar, uefVar, syVar.xs().uef(), syVar.bcc().uef(), syVar.cz(), syVar.yo(), syVar.moa(), syVar.lw(), syVar.ivm());
        this.moa = uefVar;
        this.lw = syVar.uef();
        this.ivm = syVar.zjm();
        com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVarUef = syVar.oa().uef();
        this.xs = uefVarUef;
        uefVarUef.uef(this);
        uefVar.uef(uefVarUef);
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.uef, com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(Canvas canvas, Matrix matrix, int i5) {
        if (this.ivm) {
            return;
        }
        this.f24592oa.setColor(((com.bytedance.adsdk.oa.uef.oa.oa) this.xs).cz());
        com.bytedance.adsdk.oa.uef.oa.uef<ColorFilter, ColorFilter> uefVar = this.bcc;
        if (uefVar != null) {
            this.f24592oa.setColorFilter(uefVar.xs());
        }
        super.uef(canvas, matrix, i5);
    }
}
