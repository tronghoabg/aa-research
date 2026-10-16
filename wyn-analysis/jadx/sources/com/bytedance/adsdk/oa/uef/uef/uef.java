package com.bytedance.adsdk.oa.uef.uef;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.adsdk.oa.uef.oa.uef;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class uef implements uef.InterfaceC0035uef, dj, lw {

    /* renamed from: ab, reason: collision with root package name */
    private com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> f24591ab;
    private final com.bytedance.adsdk.oa.cz bcc;
    private com.bytedance.adsdk.oa.uef.oa.yo bs;
    private final List<com.bytedance.adsdk.oa.uef.oa.uef<?, Float>> cq;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, Float> dj;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, Float> dz;

    /* renamed from: oa, reason: collision with root package name */
    final Paint f24592oa;
    protected final com.bytedance.adsdk.oa.yo.yo.uef uef;
    private com.bytedance.adsdk.oa.uef.oa.uef<ColorFilter, ColorFilter> wk;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, Integer> wrv;
    float yo;
    private final float[] zjm;
    private final PathMeasure moa = new PathMeasure();
    private final Path lw = new Path();
    private final Path ivm = new Path();
    private final RectF xs = new RectF();
    private final List<C0036uef> cz = new ArrayList();

    /* renamed from: com.bytedance.adsdk.oa.uef.uef.uef$uef, reason: collision with other inner class name */
    public static final class C0036uef {

        /* renamed from: oa, reason: collision with root package name */
        private final tpx f24593oa;
        private final List<cq> uef;

        private C0036uef(tpx tpxVar) {
            this.uef = new ArrayList();
            this.f24593oa = tpxVar;
        }
    }

    public uef(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar, Paint.Cap cap, Paint.Join join, float f10, com.bytedance.adsdk.oa.yo.uef.moa moaVar, com.bytedance.adsdk.oa.yo.uef.oa oaVar, List<com.bytedance.adsdk.oa.yo.uef.oa> list, com.bytedance.adsdk.oa.yo.uef.oa oaVar2) {
        com.bytedance.adsdk.oa.uef.uef uefVar2 = new com.bytedance.adsdk.oa.uef.uef(1);
        this.f24592oa = uefVar2;
        this.yo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.bcc = czVar;
        this.uef = uefVar;
        uefVar2.setStyle(Paint.Style.STROKE);
        uefVar2.setStrokeCap(cap);
        uefVar2.setStrokeJoin(join);
        uefVar2.setStrokeMiter(f10);
        this.wrv = moaVar.uef();
        this.dj = oaVar.uef();
        if (oaVar2 == null) {
            this.dz = null;
        } else {
            this.dz = oaVar2.uef();
        }
        this.cq = new ArrayList(list.size());
        this.zjm = new float[list.size()];
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.cq.add(list.get(i5).uef());
        }
        uefVar.uef(this.wrv);
        uefVar.uef(this.dj);
        for (int i10 = 0; i10 < this.cq.size(); i10++) {
            uefVar.uef(this.cq.get(i10));
        }
        com.bytedance.adsdk.oa.uef.oa.uef<?, Float> uefVar3 = this.dz;
        if (uefVar3 != null) {
            uefVar.uef(uefVar3);
        }
        this.wrv.uef(this);
        this.dj.uef(this);
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.cq.get(i11).uef(this);
        }
        com.bytedance.adsdk.oa.uef.oa.uef<?, Float> uefVar4 = this.dz;
        if (uefVar4 != null) {
            uefVar4.uef(this);
        }
        if (uefVar.zjm() != null) {
            com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef = uefVar.zjm().uef().uef();
            this.f24591ab = uefVarUef;
            uefVarUef.uef(this);
            uefVar.uef(this.f24591ab);
        }
        if (uefVar.dj() != null) {
            this.bs = new com.bytedance.adsdk.oa.uef.oa.yo(this, uefVar, uefVar.dj());
        }
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef.InterfaceC0035uef
    public void uef() {
        this.bcc.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.bytedance.adsdk.oa.uef.uef.yo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(java.util.List<com.bytedance.adsdk.oa.uef.uef.yo> r8, java.util.List<com.bytedance.adsdk.oa.uef.uef.yo> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            com.bytedance.adsdk.oa.uef.uef.yo r3 = (com.bytedance.adsdk.oa.uef.uef.yo) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.oa.uef.uef.tpx
            if (r4 == 0) goto L1f
            com.bytedance.adsdk.oa.uef.uef.tpx r3 = (com.bytedance.adsdk.oa.uef.uef.tpx) r3
            com.bytedance.adsdk.oa.yo.oa.oib$uef r4 = r3.oa()
            com.bytedance.adsdk.oa.yo.oa.oib$uef r5 = com.bytedance.adsdk.oa.yo.oa.oib.uef.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.uef(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
            r0 = r1
        L2e:
            if (r8 < 0) goto L6c
            java.lang.Object r3 = r9.get(r8)
            com.bytedance.adsdk.oa.uef.uef.yo r3 = (com.bytedance.adsdk.oa.uef.uef.yo) r3
            boolean r4 = r3 instanceof com.bytedance.adsdk.oa.uef.uef.tpx
            if (r4 == 0) goto L55
            r4 = r3
            com.bytedance.adsdk.oa.uef.uef.tpx r4 = (com.bytedance.adsdk.oa.uef.uef.tpx) r4
            com.bytedance.adsdk.oa.yo.oa.oib$uef r5 = r4.oa()
            com.bytedance.adsdk.oa.yo.oa.oib$uef r6 = com.bytedance.adsdk.oa.yo.oa.oib.uef.INDIVIDUALLY
            if (r5 != r6) goto L55
            if (r0 == 0) goto L4c
            java.util.List<com.bytedance.adsdk.oa.uef.uef.uef$uef> r3 = r7.cz
            r3.add(r0)
        L4c:
            com.bytedance.adsdk.oa.uef.uef.uef$uef r0 = new com.bytedance.adsdk.oa.uef.uef.uef$uef
            r0.<init>(r4)
            r4.uef(r7)
            goto L69
        L55:
            boolean r4 = r3 instanceof com.bytedance.adsdk.oa.uef.uef.cq
            if (r4 == 0) goto L69
            if (r0 != 0) goto L60
            com.bytedance.adsdk.oa.uef.uef.uef$uef r0 = new com.bytedance.adsdk.oa.uef.uef.uef$uef
            r0.<init>(r2)
        L60:
            java.util.List r4 = com.bytedance.adsdk.oa.uef.uef.uef.C0036uef.uef(r0)
            com.bytedance.adsdk.oa.uef.uef.cq r3 = (com.bytedance.adsdk.oa.uef.uef.cq) r3
            r4.add(r3)
        L69:
            int r8 = r8 + (-1)
            goto L2e
        L6c:
            if (r0 == 0) goto L73
            java.util.List<com.bytedance.adsdk.oa.uef.uef.uef$uef> r8 = r7.cz
            r8.add(r0)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.uef.uef.uef.uef(java.util.List, java.util.List):void");
    }

    public void uef(Canvas canvas, Matrix matrix, int i5) {
        com.bytedance.adsdk.oa.lw.uef("StrokeContent#draw");
        if (com.bytedance.adsdk.oa.ivm.ivm.oa(matrix)) {
            com.bytedance.adsdk.oa.lw.oa("StrokeContent#draw");
            return;
        }
        this.f24592oa.setAlpha(com.bytedance.adsdk.oa.ivm.lw.uef((int) ((((i5 / 255.0f) * ((com.bytedance.adsdk.oa.uef.oa.ivm) this.wrv).cz()) / 100.0f) * 255.0f), 0, 255));
        this.f24592oa.setStrokeWidth(com.bytedance.adsdk.oa.ivm.ivm.uef(matrix) * ((com.bytedance.adsdk.oa.uef.oa.moa) this.dj).cz());
        if (this.f24592oa.getStrokeWidth() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            com.bytedance.adsdk.oa.lw.oa("StrokeContent#draw");
            return;
        }
        uef(matrix);
        com.bytedance.adsdk.oa.uef.oa.uef<ColorFilter, ColorFilter> uefVar = this.wk;
        if (uefVar != null) {
            this.f24592oa.setColorFilter(uefVar.xs());
        }
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVar2 = this.f24591ab;
        if (uefVar2 != null) {
            float fFloatValue = uefVar2.xs().floatValue();
            if (fFloatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f24592oa.setMaskFilter(null);
            } else if (fFloatValue != this.yo) {
                this.f24592oa.setMaskFilter(this.uef.oa(fFloatValue));
            }
            this.yo = fFloatValue;
        }
        com.bytedance.adsdk.oa.uef.oa.yo yoVar = this.bs;
        if (yoVar != null) {
            yoVar.uef(this.f24592oa);
        }
        for (int i10 = 0; i10 < this.cz.size(); i10++) {
            C0036uef c0036uef = this.cz.get(i10);
            if (c0036uef.f24593oa != null) {
                uef(canvas, c0036uef, matrix);
            } else {
                com.bytedance.adsdk.oa.lw.uef("StrokeContent#buildPath");
                this.lw.reset();
                for (int size = c0036uef.uef.size() - 1; size >= 0; size--) {
                    this.lw.addPath(((cq) c0036uef.uef.get(size)).moa(), matrix);
                }
                com.bytedance.adsdk.oa.lw.oa("StrokeContent#buildPath");
                com.bytedance.adsdk.oa.lw.uef("StrokeContent#drawPath");
                canvas.drawPath(this.lw, this.f24592oa);
                com.bytedance.adsdk.oa.lw.oa("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.oa.lw.oa("StrokeContent#draw");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void uef(android.graphics.Canvas r17, com.bytedance.adsdk.oa.uef.uef.uef.C0036uef r18, android.graphics.Matrix r19) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.uef.uef.uef.uef(android.graphics.Canvas, com.bytedance.adsdk.oa.uef.uef.uef$uef, android.graphics.Matrix):void");
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(RectF rectF, Matrix matrix, boolean z2) {
        com.bytedance.adsdk.oa.lw.uef("StrokeContent#getBounds");
        this.lw.reset();
        for (int i5 = 0; i5 < this.cz.size(); i5++) {
            C0036uef c0036uef = this.cz.get(i5);
            for (int i10 = 0; i10 < c0036uef.uef.size(); i10++) {
                this.lw.addPath(((cq) c0036uef.uef.get(i10)).moa(), matrix);
            }
        }
        this.lw.computeBounds(this.xs, false);
        float fCz = ((com.bytedance.adsdk.oa.uef.oa.moa) this.dj).cz();
        RectF rectF2 = this.xs;
        float f10 = fCz / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.xs);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.oa.lw.oa("StrokeContent#getBounds");
    }

    private void uef(Matrix matrix) {
        com.bytedance.adsdk.oa.lw.uef("StrokeContent#applyDashPattern");
        if (this.cq.isEmpty()) {
            com.bytedance.adsdk.oa.lw.oa("StrokeContent#applyDashPattern");
            return;
        }
        float fUef = com.bytedance.adsdk.oa.ivm.ivm.uef(matrix);
        for (int i5 = 0; i5 < this.cq.size(); i5++) {
            this.zjm[i5] = this.cq.get(i5).xs().floatValue();
            if (i5 % 2 == 0) {
                float[] fArr = this.zjm;
                if (fArr[i5] < 1.0f) {
                    fArr[i5] = 1.0f;
                }
            } else {
                float[] fArr2 = this.zjm;
                if (fArr2[i5] < 0.1f) {
                    fArr2[i5] = 0.1f;
                }
            }
            float[] fArr3 = this.zjm;
            fArr3[i5] = fArr3[i5] * fUef;
        }
        com.bytedance.adsdk.oa.uef.oa.uef<?, Float> uefVar = this.dz;
        this.f24592oa.setPathEffect(new DashPathEffect(this.zjm, uefVar == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : fUef * uefVar.xs().floatValue()));
        com.bytedance.adsdk.oa.lw.oa("StrokeContent#applyDashPattern");
    }
}
