package com.bytedance.adsdk.oa.yo.yo;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.oa.yo.oa.ab;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class xs extends uef {
    private final oa bcc;
    private final com.bytedance.adsdk.oa.uef.uef.moa xs;

    public xs(com.bytedance.adsdk.oa.cz czVar, lw lwVar, oa oaVar, com.bytedance.adsdk.oa.xs xsVar) {
        super(czVar, lwVar);
        this.bcc = oaVar;
        com.bytedance.adsdk.oa.uef.uef.moa moaVar = new com.bytedance.adsdk.oa.uef.uef.moa(czVar, this, new ab("__container", lwVar.dz(), false), xsVar);
        this.xs = moaVar;
        List<com.bytedance.adsdk.oa.uef.uef.yo> list = Collections.EMPTY_LIST;
        moaVar.uef(list, list);
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef
    public com.bytedance.adsdk.oa.lw.zjm dj() {
        com.bytedance.adsdk.oa.lw.zjm zjmVarDj = super.dj();
        return zjmVarDj != null ? zjmVarDj : this.bcc.dj();
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef
    public void oa(Canvas canvas, Matrix matrix, int i5) {
        super.oa(canvas, matrix, i5);
        this.xs.uef(canvas, matrix, i5);
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef, com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(RectF rectF, Matrix matrix, boolean z2) {
        super.uef(rectF, matrix, z2);
        this.xs.uef(rectF, this.uef, z2);
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef
    public com.bytedance.adsdk.oa.yo.oa.uef zjm() {
        com.bytedance.adsdk.oa.yo.oa.uef uefVarZjm = super.zjm();
        return uefVarZjm != null ? uefVarZjm : this.bcc.zjm();
    }
}
