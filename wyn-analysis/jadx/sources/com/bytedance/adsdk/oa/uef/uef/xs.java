package com.bytedance.adsdk.oa.uef.uef;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.oa.uef.oa.uef;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class xs implements uef.InterfaceC0035uef, dj, lw {
    private final com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> bcc;
    private com.bytedance.adsdk.oa.uef.oa.yo cq;
    private final com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> cz;
    private final com.bytedance.adsdk.oa.cz dj;
    private final boolean ivm;
    private final String lw;
    private final com.bytedance.adsdk.oa.yo.yo.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private final Path f24596oa;
    float uef;
    private com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> wrv;
    private final List<cq> xs;
    private final Paint yo;
    private com.bytedance.adsdk.oa.uef.oa.uef<ColorFilter, ColorFilter> zjm;

    public xs(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar, com.bytedance.adsdk.oa.yo.oa.wk wkVar) {
        Path path = new Path();
        this.f24596oa = path;
        this.yo = new com.bytedance.adsdk.oa.uef.uef(1);
        this.xs = new ArrayList();
        this.moa = uefVar;
        this.lw = wkVar.uef();
        this.ivm = wkVar.lw();
        this.dj = czVar;
        if (uefVar.zjm() != null) {
            com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef = uefVar.zjm().uef().uef();
            this.wrv = uefVarUef;
            uefVarUef.uef(this);
            uefVar.uef(this.wrv);
        }
        if (uefVar.dj() != null) {
            this.cq = new com.bytedance.adsdk.oa.uef.oa.yo(this, uefVar, uefVar.dj());
        }
        if (wkVar.oa() == null || wkVar.yo() == null) {
            this.bcc = null;
            this.cz = null;
            return;
        }
        path.setFillType(wkVar.moa());
        com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVarUef2 = wkVar.oa().uef();
        this.bcc = uefVarUef2;
        uefVarUef2.uef(this);
        uefVar.uef(uefVarUef2);
        com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVarUef3 = wkVar.yo().uef();
        this.cz = uefVarUef3;
        uefVarUef3.uef(this);
        uefVar.uef(uefVarUef3);
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef.InterfaceC0035uef
    public void uef() {
        this.dj.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.yo
    public void uef(List<yo> list, List<yo> list2) {
        for (int i5 = 0; i5 < list2.size(); i5++) {
            yo yoVar = list2.get(i5);
            if (yoVar instanceof cq) {
                this.xs.add((cq) yoVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(Canvas canvas, Matrix matrix, int i5) {
        if (this.ivm) {
            return;
        }
        com.bytedance.adsdk.oa.lw.uef("FillContent#draw");
        this.yo.setColor((com.bytedance.adsdk.oa.ivm.lw.uef((int) ((((i5 / 255.0f) * this.cz.xs().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.bytedance.adsdk.oa.uef.oa.oa) this.bcc).cz() & 16777215));
        com.bytedance.adsdk.oa.uef.oa.uef<ColorFilter, ColorFilter> uefVar = this.zjm;
        if (uefVar != null) {
            this.yo.setColorFilter(uefVar.xs());
        }
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVar2 = this.wrv;
        if (uefVar2 != null) {
            float fFloatValue = uefVar2.xs().floatValue();
            if (fFloatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.yo.setMaskFilter(null);
            } else if (fFloatValue != this.uef) {
                this.yo.setMaskFilter(this.moa.oa(fFloatValue));
            }
            this.uef = fFloatValue;
        }
        com.bytedance.adsdk.oa.uef.oa.yo yoVar = this.cq;
        if (yoVar != null) {
            yoVar.uef(this.yo);
        }
        this.f24596oa.reset();
        for (int i10 = 0; i10 < this.xs.size(); i10++) {
            this.f24596oa.addPath(this.xs.get(i10).moa(), matrix);
        }
        canvas.drawPath(this.f24596oa, this.yo);
        com.bytedance.adsdk.oa.lw.oa("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(RectF rectF, Matrix matrix, boolean z2) {
        this.f24596oa.reset();
        for (int i5 = 0; i5 < this.xs.size(); i5++) {
            this.f24596oa.addPath(this.xs.get(i5).moa(), matrix);
        }
        this.f24596oa.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
