package com.bytedance.adsdk.oa.uef.uef;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.oa.uef.oa.uef;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class moa implements uef.InterfaceC0035uef, cq, lw {
    private final List<yo> bcc;
    private final com.bytedance.adsdk.oa.cz cz;
    private com.bytedance.adsdk.oa.uef.oa.ab dj;
    private final String ivm;
    private final RectF lw;
    private final Path moa;

    /* renamed from: oa, reason: collision with root package name */
    private final RectF f24588oa;
    private final Paint uef;
    private final boolean xs;
    private final Matrix yo;
    private List<cq> zjm;

    public moa(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar, com.bytedance.adsdk.oa.yo.oa.ab abVar, com.bytedance.adsdk.oa.xs xsVar) {
        this(czVar, uefVar, abVar.uef(), abVar.yo(), uef(czVar, xsVar, uefVar, abVar.oa()), uef(abVar.oa()));
    }

    private boolean lw() {
        int i5 = 0;
        for (int i10 = 0; i10 < this.bcc.size(); i10++) {
            if ((this.bcc.get(i10) instanceof lw) && (i5 = i5 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    private static List<yo> uef(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar, List<com.bytedance.adsdk.oa.yo.oa.yo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i5 = 0; i5 < list.size(); i5++) {
            yo yoVarUef = list.get(i5).uef(czVar, xsVar, uefVar);
            if (yoVarUef != null) {
                arrayList.add(yoVarUef);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.cq
    public Path moa() {
        this.yo.reset();
        com.bytedance.adsdk.oa.uef.oa.ab abVar = this.dj;
        if (abVar != null) {
            this.yo.set(abVar.moa());
        }
        this.moa.reset();
        if (this.xs) {
            return this.moa;
        }
        for (int size = this.bcc.size() - 1; size >= 0; size--) {
            yo yoVar = this.bcc.get(size);
            if (yoVar instanceof cq) {
                this.moa.addPath(((cq) yoVar).moa(), this.yo);
            }
        }
        return this.moa;
    }

    public List<cq> oa() {
        if (this.zjm == null) {
            this.zjm = new ArrayList();
            for (int i5 = 0; i5 < this.bcc.size(); i5++) {
                yo yoVar = this.bcc.get(i5);
                if (yoVar instanceof cq) {
                    this.zjm.add((cq) yoVar);
                }
            }
        }
        return this.zjm;
    }

    public Matrix yo() {
        com.bytedance.adsdk.oa.uef.oa.ab abVar = this.dj;
        if (abVar != null) {
            return abVar.moa();
        }
        this.yo.reset();
        return this.yo;
    }

    public moa(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar, String str, boolean z2, List<yo> list, com.bytedance.adsdk.oa.yo.uef.wrv wrvVar) {
        this.uef = new com.bytedance.adsdk.oa.uef.uef();
        this.f24588oa = new RectF();
        this.yo = new Matrix();
        this.moa = new Path();
        this.lw = new RectF();
        this.ivm = str;
        this.cz = czVar;
        this.xs = z2;
        this.bcc = list;
        if (wrvVar != null) {
            com.bytedance.adsdk.oa.uef.oa.ab abVarZjm = wrvVar.zjm();
            this.dj = abVarZjm;
            abVarZjm.uef(uefVar);
            this.dj.uef(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            yo yoVar = list.get(size);
            if (yoVar instanceof zjm) {
                arrayList.add((zjm) yoVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((zjm) arrayList.get(size2)).uef(list.listIterator(list.size()));
        }
    }

    public static com.bytedance.adsdk.oa.yo.uef.wrv uef(List<com.bytedance.adsdk.oa.yo.oa.yo> list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            com.bytedance.adsdk.oa.yo.oa.yo yoVar = list.get(i5);
            if (yoVar instanceof com.bytedance.adsdk.oa.yo.uef.wrv) {
                return (com.bytedance.adsdk.oa.yo.uef.wrv) yoVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef.InterfaceC0035uef
    public void uef() {
        this.cz.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.yo
    public void uef(List<yo> list, List<yo> list2) {
        ArrayList arrayList = new ArrayList(this.bcc.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.bcc.size() - 1; size >= 0; size--) {
            yo yoVar = this.bcc.get(size);
            yoVar.uef(arrayList, this.bcc.subList(0, size));
            arrayList.add(yoVar);
        }
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(Canvas canvas, Matrix matrix, int i5) {
        if (this.xs) {
            return;
        }
        this.yo.set(matrix);
        com.bytedance.adsdk.oa.uef.oa.ab abVar = this.dj;
        if (abVar != null) {
            this.yo.preConcat(abVar.moa());
            i5 = (int) (((((this.dj.uef() == null ? 100 : this.dj.uef().xs().intValue()) / 100.0f) * i5) / 255.0f) * 255.0f);
        }
        boolean z2 = this.cz.cz() && lw() && i5 != 255;
        if (z2) {
            this.f24588oa.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            uef(this.f24588oa, this.yo, true);
            this.uef.setAlpha(i5);
            com.bytedance.adsdk.oa.ivm.ivm.uef(canvas, this.f24588oa, this.uef);
        }
        if (z2) {
            i5 = 255;
        }
        for (int size = this.bcc.size() - 1; size >= 0; size--) {
            yo yoVar = this.bcc.get(size);
            if (yoVar instanceof lw) {
                ((lw) yoVar).uef(canvas, this.yo, i5);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(RectF rectF, Matrix matrix, boolean z2) {
        this.yo.set(matrix);
        com.bytedance.adsdk.oa.uef.oa.ab abVar = this.dj;
        if (abVar != null) {
            this.yo.preConcat(abVar.moa());
        }
        this.lw.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        for (int size = this.bcc.size() - 1; size >= 0; size--) {
            yo yoVar = this.bcc.get(size);
            if (yoVar instanceof lw) {
                ((lw) yoVar).uef(this.lw, this.yo, z2);
                rectF.union(this.lw);
            }
        }
    }
}
