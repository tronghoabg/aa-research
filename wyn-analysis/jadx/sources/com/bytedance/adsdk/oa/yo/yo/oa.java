package com.bytedance.adsdk.oa.yo.yo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.oa.yo.yo.lw;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class oa extends uef {
    private final List<uef> bcc;
    private final RectF cz;
    private final Paint dj;
    private boolean wrv;
    private com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> xs;
    private final RectF zjm;

    /* renamed from: com.bytedance.adsdk.oa.yo.yo.oa$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[lw.oa.values().length];
            uef = iArr;
            try {
                iArr[lw.oa.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uef[lw.oa.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public oa(com.bytedance.adsdk.oa.cz czVar, lw lwVar, List<lw> list, com.bytedance.adsdk.oa.xs xsVar, Context context) {
        int i5;
        uef uefVar;
        lw.oa oaVarWrv;
        int i10;
        super(czVar, lwVar);
        this.bcc = new ArrayList();
        this.cz = new RectF();
        this.zjm = new RectF();
        this.dj = new Paint();
        this.wrv = true;
        com.bytedance.adsdk.oa.yo.uef.oa oaVarTpx = lwVar.tpx();
        if (oaVarTpx != null) {
            com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef = oaVarTpx.uef();
            this.xs = uefVarUef;
            uef(uefVarUef);
            this.xs.uef(this);
        } else {
            this.xs = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(xsVar.cq().size());
        int size = list.size() - 1;
        uef uefVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            lw lwVar2 = list.get(size);
            uef uefVarUef2 = uef.uef(this, lwVar2, czVar, xsVar, context);
            if (uefVarUef2 != null) {
                longSparseArray.put(uefVarUef2.oa().lw(), uefVarUef2);
                if (uefVar2 != null) {
                    uefVar2.uef(uefVarUef2);
                    uefVar2 = null;
                } else {
                    this.bcc.add(0, uefVarUef2);
                    if (lwVar2 != null && (oaVarWrv = lwVar2.wrv()) != null && ((i10 = AnonymousClass1.uef[oaVarWrv.ordinal()]) == 1 || i10 == 2)) {
                        uefVar2 = uefVarUef2;
                    }
                }
            }
            size--;
        }
        for (i5 = 0; i5 < longSparseArray.size(); i5++) {
            uef uefVar3 = (uef) longSparseArray.get(longSparseArray.keyAt(i5));
            if (uefVar3 != null && (uefVar = (uef) longSparseArray.get(uefVar3.oa().cq())) != null) {
                uefVar3.oa(uefVar);
            }
        }
    }

    public void oa(boolean z2) {
        this.wrv = z2;
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef
    public void uef(boolean z2) {
        super.uef(z2);
        Iterator<uef> it = this.bcc.iterator();
        while (it.hasNext()) {
            it.next().uef(z2);
        }
    }

    public List<uef> wrv() {
        return this.bcc;
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef
    public void oa(Canvas canvas, Matrix matrix, int i5) {
        super.oa(canvas, matrix, i5);
        com.bytedance.adsdk.oa.lw.uef("CompositionLayer#draw");
        this.zjm.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.yo.bcc(), this.yo.cz());
        matrix.mapRect(this.zjm);
        boolean z2 = this.f24651oa.cz() && this.bcc.size() > 1 && i5 != 255;
        if (z2) {
            this.dj.setAlpha(i5);
            com.bytedance.adsdk.oa.ivm.ivm.uef(canvas, this.zjm, this.dj);
        } else {
            canvas.save();
        }
        if (z2) {
            i5 = 255;
        }
        for (int size = this.bcc.size() - 1; size >= 0; size--) {
            if (((this.wrv || !"__container".equals(this.yo.ivm())) && !this.zjm.isEmpty()) ? canvas.clipRect(this.zjm) : true) {
                this.bcc.get(size).uef(canvas, matrix, i5);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.oa.lw.oa("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef, com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(RectF rectF, Matrix matrix, boolean z2) {
        super.uef(rectF, matrix, z2);
        for (int size = this.bcc.size() - 1; size >= 0; size--) {
            this.cz.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.bcc.get(size).uef(this.cz, this.uef, true);
            rectF.union(this.cz);
        }
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef
    public void uef(float f10) {
        super.uef(f10);
        if (this.xs != null) {
            f10 = ((this.yo.uef().wrv() * this.xs.xs().floatValue()) - this.yo.uef().ivm()) / (this.f24651oa.gr().bs() + 0.01f);
        }
        if (this.xs == null) {
            f10 -= this.yo.yo();
        }
        if (this.yo.oa() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !"__container".equals(this.yo.ivm())) {
            f10 /= this.yo.oa();
        }
        for (int size = this.bcc.size() - 1; size >= 0; size--) {
            this.bcc.get(size).uef(f10);
        }
    }
}
