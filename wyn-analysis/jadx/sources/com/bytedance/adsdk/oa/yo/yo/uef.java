package com.bytedance.adsdk.oa.yo.yo;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.bytedance.adsdk.oa.uef.oa.ab;
import com.bytedance.adsdk.oa.uef.oa.uef;
import com.bytedance.adsdk.oa.yo.oa.bcc;
import com.bytedance.adsdk.oa.yo.oa.dz;
import com.bytedance.adsdk.oa.yo.yo.lw;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class uef implements uef.InterfaceC0035uef, com.bytedance.adsdk.oa.uef.uef.lw {

    /* renamed from: ab, reason: collision with root package name */
    private final RectF f24650ab;
    private final RectF bs;
    private Paint cp;
    private final Paint cq;
    private final String dhk;
    private final Paint dj;
    private final Paint dz;
    private float fz;
    private final List<com.bytedance.adsdk.oa.uef.oa.uef<?, ?>> gr;
    private uef gsd;
    private uef gzw;
    BlurMaskFilter ivm;
    private final Matrix ku;
    float lw;
    final ab moa;

    /* renamed from: oa, reason: collision with root package name */
    final com.bytedance.adsdk.oa.cz f24651oa;
    private final RectF oib;
    private com.bytedance.adsdk.oa.uef.oa.moa orq;
    private boolean pz;
    private List<uef> rt;
    private final RectF sy;
    private com.bytedance.adsdk.oa.uef.oa.bcc tpx;

    /* renamed from: ue, reason: collision with root package name */
    private boolean f24652ue;
    final Matrix uef;
    private final RectF wk;
    private final Paint wrv;
    final lw yo;
    private final Path xs = new Path();
    private final Matrix bcc = new Matrix();
    private final Matrix cz = new Matrix();
    private final Paint zjm = new com.bytedance.adsdk.oa.uef.uef(1);

    /* renamed from: com.bytedance.adsdk.oa.yo.yo.uef$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: oa, reason: collision with root package name */
        static final /* synthetic */ int[] f24653oa;
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[bcc.uef.values().length];
            f24653oa = iArr;
            try {
                iArr[bcc.uef.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24653oa[bcc.uef.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24653oa[bcc.uef.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24653oa[bcc.uef.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[lw.uef.values().length];
            uef = iArr2;
            try {
                iArr2[lw.uef.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                uef[lw.uef.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                uef[lw.uef.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                uef[lw.uef.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                uef[lw.uef.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                uef[lw.uef.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                uef[lw.uef.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public uef(com.bytedance.adsdk.oa.cz czVar, lw lwVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.dj = new com.bytedance.adsdk.oa.uef.uef(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.wrv = new com.bytedance.adsdk.oa.uef.uef(1, mode2);
        com.bytedance.adsdk.oa.uef.uef uefVar = new com.bytedance.adsdk.oa.uef.uef(1);
        this.cq = uefVar;
        this.dz = new com.bytedance.adsdk.oa.uef.uef(PorterDuff.Mode.CLEAR);
        this.wk = new RectF();
        this.f24650ab = new RectF();
        this.bs = new RectF();
        this.sy = new RectF();
        this.oib = new RectF();
        this.uef = new Matrix();
        this.gr = new ArrayList();
        this.f24652ue = true;
        this.lw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ku = new Matrix();
        this.fz = 1.0f;
        this.f24651oa = czVar;
        this.yo = lwVar;
        this.dhk = lwVar.ivm() + "#draw";
        if (lwVar.wrv() == lw.oa.INVERT) {
            uefVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            uefVar.setXfermode(new PorterDuffXfermode(mode));
        }
        ab abVarZjm = lwVar.wk().zjm();
        this.moa = abVarZjm;
        abVarZjm.uef((uef.InterfaceC0035uef) this);
        if (lwVar.zjm() != null && !lwVar.zjm().isEmpty()) {
            com.bytedance.adsdk.oa.uef.oa.bcc bccVar = new com.bytedance.adsdk.oa.uef.oa.bcc(lwVar.zjm());
            this.tpx = bccVar;
            Iterator<com.bytedance.adsdk.oa.uef.oa.uef<dz, Path>> it = bccVar.oa().iterator();
            while (it.hasNext()) {
                it.next().uef(this);
            }
            for (com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVar2 : this.tpx.yo()) {
                uef(uefVar2);
                uefVar2.uef(this);
            }
        }
        wrv();
    }

    private void cq() {
        this.f24651oa.invalidateSelf();
    }

    private boolean dz() {
        if (this.tpx.oa().isEmpty()) {
            return false;
        }
        for (int i5 = 0; i5 < this.tpx.uef().size(); i5++) {
            if (this.tpx.uef().get(i5).uef() != bcc.uef.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void wk() {
        if (this.rt != null) {
            return;
        }
        if (this.gsd == null) {
            this.rt = Collections.EMPTY_LIST;
            return;
        }
        this.rt = new ArrayList();
        for (uef uefVar = this.gsd; uefVar != null; uefVar = uefVar.gsd) {
            this.rt.add(uefVar);
        }
    }

    private void wrv() {
        if (this.yo.moa().isEmpty()) {
            oa(true);
            return;
        }
        com.bytedance.adsdk.oa.uef.oa.moa moaVar = new com.bytedance.adsdk.oa.uef.oa.moa(this.yo.moa());
        this.orq = moaVar;
        moaVar.uef();
        this.orq.uef(new uef.InterfaceC0035uef() { // from class: com.bytedance.adsdk.oa.yo.yo.uef.1
            @Override // com.bytedance.adsdk.oa.uef.oa.uef.InterfaceC0035uef
            public void uef() {
                uef uefVar = uef.this;
                uefVar.oa(uefVar.orq.cz() == 1.0f);
            }
        });
        oa(this.orq.xs().floatValue() == 1.0f);
        uef(this.orq);
    }

    public boolean bcc() {
        return this.f24652ue;
    }

    public String cz() {
        return this.yo.ivm();
    }

    public com.bytedance.adsdk.oa.lw.zjm dj() {
        return this.yo.gsd();
    }

    public float ivm() {
        return this.fz;
    }

    public String lw() {
        lw lwVar = this.yo;
        if (lwVar != null) {
            return lwVar.xs();
        }
        return null;
    }

    public Matrix moa() {
        return this.ku;
    }

    public lw oa() {
        return this.yo;
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.yo
    public void uef(List<com.bytedance.adsdk.oa.uef.uef.yo> list, List<com.bytedance.adsdk.oa.uef.uef.yo> list2) {
    }

    public boolean xs() {
        com.bytedance.adsdk.oa.uef.oa.bcc bccVar = this.tpx;
        return (bccVar == null || bccVar.oa().isEmpty()) ? false : true;
    }

    public com.bytedance.adsdk.oa.yo.oa.uef zjm() {
        return this.yo.gzw();
    }

    private void moa(Canvas canvas, Matrix matrix, com.bytedance.adsdk.oa.uef.oa.uef<dz, Path> uefVar, com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVar2) {
        com.bytedance.adsdk.oa.ivm.ivm.uef(canvas, this.wk, this.dj);
        this.xs.set(uefVar.xs());
        this.xs.transform(matrix);
        this.zjm.setAlpha((int) (uefVar2.xs().intValue() * 2.55f));
        canvas.drawPath(this.xs, this.zjm);
        canvas.restore();
    }

    public void oa(uef uefVar) {
        this.gsd = uefVar;
    }

    public boolean yo() {
        return this.gzw != null;
    }

    private void lw(Canvas canvas, Matrix matrix, com.bytedance.adsdk.oa.uef.oa.uef<dz, Path> uefVar, com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVar2) {
        com.bytedance.adsdk.oa.ivm.ivm.uef(canvas, this.wk, this.dj);
        canvas.drawRect(this.wk, this.zjm);
        this.wrv.setAlpha((int) (uefVar2.xs().intValue() * 2.55f));
        this.xs.set(uefVar.xs());
        this.xs.transform(matrix);
        canvas.drawPath(this.xs, this.wrv);
        canvas.restore();
    }

    private void oa(RectF rectF, Matrix matrix) {
        if (yo() && this.yo.wrv() != lw.oa.INVERT) {
            this.sy.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.gzw.uef(this.sy, matrix, true);
            if (rectF.intersect(this.sy)) {
                return;
            }
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public static uef uef(oa oaVar, lw lwVar, com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, Context context) {
        switch (AnonymousClass2.uef[lwVar.dj().ordinal()]) {
            case 1:
                return new xs(czVar, lwVar, oaVar, xsVar);
            case 2:
                return new oa(czVar, lwVar, xsVar.oa(lwVar.xs()), xsVar, context);
            case 3:
                return new bcc(czVar, lwVar);
            case 4:
                if (uef(czVar, lwVar, "text:")) {
                    return new yo(czVar, lwVar, context);
                }
                if (uef(czVar, lwVar, "videoview:")) {
                    return new zjm(czVar, lwVar, context);
                }
                return new moa(czVar, lwVar);
            case 5:
                return new ivm(czVar, lwVar);
            case 6:
                return new cz(czVar, lwVar);
            default:
                Objects.toString(lwVar.dj());
                return null;
        }
    }

    private void yo(float f10) {
        this.f24651oa.gr().yo().uef(this.yo.ivm(), f10);
    }

    private void yo(Canvas canvas, Matrix matrix, com.bytedance.adsdk.oa.uef.oa.uef<dz, Path> uefVar, com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVar2) {
        com.bytedance.adsdk.oa.ivm.ivm.uef(canvas, this.wk, this.wrv);
        canvas.drawRect(this.wk, this.zjm);
        this.wrv.setAlpha((int) (uefVar2.xs().intValue() * 2.55f));
        this.xs.set(uefVar.xs());
        this.xs.transform(matrix);
        canvas.drawPath(this.xs, this.wrv);
        canvas.restore();
    }

    public void oa(Canvas canvas, Matrix matrix, int i5) {
        uef(i5);
    }

    private void oa(Canvas canvas, Matrix matrix, com.bytedance.adsdk.oa.uef.oa.uef<dz, Path> uefVar, com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVar2) {
        com.bytedance.adsdk.oa.ivm.ivm.uef(canvas, this.wk, this.zjm);
        canvas.drawRect(this.wk, this.zjm);
        this.xs.set(uefVar.xs());
        this.xs.transform(matrix);
        this.zjm.setAlpha((int) (uefVar2.xs().intValue() * 2.55f));
        canvas.drawPath(this.xs, this.wrv);
        canvas.restore();
    }

    private static boolean uef(com.bytedance.adsdk.oa.cz czVar, lw lwVar, String str) {
        com.bytedance.adsdk.oa.zjm zjmVarIvm;
        if (czVar == null || lwVar == null || str == null || (zjmVarIvm = czVar.ivm(lwVar.xs())) == null) {
            return false;
        }
        return str.equals(zjmVarIvm.zjm());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(boolean z2) {
        if (z2 != this.f24652ue) {
            this.f24652ue = z2;
            cq();
        }
    }

    public void uef(boolean z2) {
        if (z2 && this.cp == null) {
            this.cp = new com.bytedance.adsdk.oa.uef.uef();
        }
        this.pz = z2;
    }

    public BlurMaskFilter oa(float f10) {
        if (this.lw == f10) {
            return this.ivm;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.ivm = blurMaskFilter;
        this.lw = f10;
        return blurMaskFilter;
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef.InterfaceC0035uef
    public void uef() {
        cq();
    }

    public void uef(uef uefVar) {
        this.gzw = uefVar;
    }

    public void uef(com.bytedance.adsdk.oa.uef.oa.uef<?, ?> uefVar) {
        if (uefVar == null) {
            return;
        }
        this.gr.add(uefVar);
    }

    public void uef(RectF rectF, Matrix matrix, boolean z2) {
        this.wk.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        wk();
        this.uef.set(matrix);
        if (z2) {
            List<uef> list = this.rt;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.uef.preConcat(this.rt.get(size).moa.moa());
                }
            } else {
                uef uefVar = this.gsd;
                if (uefVar != null) {
                    this.uef.preConcat(uefVar.moa.moa());
                }
            }
        }
        this.uef.preConcat(this.moa.moa());
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(Canvas canvas, Matrix matrix, int i5) {
        Paint paint;
        Integer numXs;
        com.bytedance.adsdk.oa.lw.uef(this.dhk);
        if (this.f24652ue && !this.yo.orq()) {
            wk();
            com.bytedance.adsdk.oa.lw.uef("Layer#parentMatrix");
            this.ku.set(matrix);
            this.bcc.reset();
            this.bcc.set(matrix);
            for (int size = this.rt.size() - 1; size >= 0; size--) {
                this.bcc.preConcat(this.rt.get(size).moa.moa());
            }
            com.bytedance.adsdk.oa.lw.oa("Layer#parentMatrix");
            com.bytedance.adsdk.oa.uef.oa.uef<?, Integer> uefVarUef = this.moa.uef();
            int iIntValue = (int) ((((i5 / 255.0f) * ((uefVarUef == null || (numXs = uefVarUef.xs()) == null) ? 100 : numXs.intValue())) / 100.0f) * 255.0f);
            if (!yo() && !xs()) {
                this.bcc.preConcat(this.moa.moa());
                com.bytedance.adsdk.oa.lw.uef("Layer#drawLayer");
                oa(canvas, this.bcc, iIntValue);
                com.bytedance.adsdk.oa.lw.oa("Layer#drawLayer");
                yo(com.bytedance.adsdk.oa.lw.oa(this.dhk));
                return;
            }
            com.bytedance.adsdk.oa.lw.uef("Layer#computeBounds");
            uef(this.wk, this.bcc, false);
            oa(this.wk, matrix);
            this.bcc.preConcat(this.moa.moa());
            uef(this.wk, this.bcc);
            this.f24650ab.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.cz);
            if (!this.cz.isIdentity()) {
                Matrix matrix2 = this.cz;
                matrix2.invert(matrix2);
                this.cz.mapRect(this.f24650ab);
            }
            if (!this.wk.intersect(this.f24650ab)) {
                this.wk.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            com.bytedance.adsdk.oa.lw.oa("Layer#computeBounds");
            if (this.wk.width() >= 1.0f && this.wk.height() >= 1.0f) {
                com.bytedance.adsdk.oa.lw.uef("Layer#saveLayer");
                this.zjm.setAlpha(255);
                com.bytedance.adsdk.oa.ivm.ivm.uef(canvas, this.wk, this.zjm);
                com.bytedance.adsdk.oa.lw.oa("Layer#saveLayer");
                uef(canvas);
                com.bytedance.adsdk.oa.lw.uef("Layer#drawLayer");
                oa(canvas, this.bcc, iIntValue);
                com.bytedance.adsdk.oa.lw.oa("Layer#drawLayer");
                if (xs()) {
                    uef(canvas, this.bcc);
                }
                if (yo()) {
                    com.bytedance.adsdk.oa.lw.uef("Layer#drawMatte");
                    com.bytedance.adsdk.oa.lw.uef("Layer#saveLayer");
                    com.bytedance.adsdk.oa.ivm.ivm.uef(canvas, this.wk, this.cq, 19);
                    com.bytedance.adsdk.oa.lw.oa("Layer#saveLayer");
                    uef(canvas);
                    this.gzw.uef(canvas, matrix, iIntValue);
                    com.bytedance.adsdk.oa.lw.uef("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.oa.lw.oa("Layer#restoreLayer");
                    com.bytedance.adsdk.oa.lw.oa("Layer#drawMatte");
                }
                com.bytedance.adsdk.oa.lw.uef("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.oa.lw.oa("Layer#restoreLayer");
            }
            if (this.pz && (paint = this.cp) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.cp.setColor(-251901);
                this.cp.setStrokeWidth(4.0f);
                canvas.drawRect(this.wk, this.cp);
                this.cp.setStyle(Paint.Style.FILL);
                this.cp.setColor(1357638635);
                canvas.drawRect(this.wk, this.cp);
            }
            yo(com.bytedance.adsdk.oa.lw.oa(this.dhk));
            return;
        }
        com.bytedance.adsdk.oa.lw.oa(this.dhk);
    }

    private void uef(Canvas canvas) {
        com.bytedance.adsdk.oa.lw.uef("Layer#clearLayer");
        RectF rectF = this.wk;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.dz);
        com.bytedance.adsdk.oa.lw.oa("Layer#clearLayer");
    }

    private void uef(RectF rectF, Matrix matrix) {
        this.bs.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (xs()) {
            int size = this.tpx.uef().size();
            for (int i5 = 0; i5 < size; i5++) {
                com.bytedance.adsdk.oa.yo.oa.bcc bccVar = this.tpx.uef().get(i5);
                Path pathXs = this.tpx.oa().get(i5).xs();
                if (pathXs != null) {
                    this.xs.set(pathXs);
                    this.xs.transform(matrix);
                    int i10 = AnonymousClass2.f24653oa[bccVar.uef().ordinal()];
                    if (i10 == 1 || i10 == 2) {
                        return;
                    }
                    if ((i10 == 3 || i10 == 4) && bccVar.moa()) {
                        return;
                    }
                    this.xs.computeBounds(this.oib, false);
                    if (i5 == 0) {
                        this.bs.set(this.oib);
                    } else {
                        RectF rectF2 = this.bs;
                        rectF2.set(Math.min(rectF2.left, this.oib.left), Math.min(this.bs.top, this.oib.top), Math.max(this.bs.right, this.oib.right), Math.max(this.bs.bottom, this.oib.bottom));
                    }
                }
            }
            if (rectF.intersect(this.bs)) {
                return;
            }
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public void uef(int i5) {
        this.fz = (i5 / 255.0f) * ((this.moa.uef() != null ? this.moa.uef().xs().intValue() : 100) / 100.0f);
    }

    private void uef(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.oa.lw.uef("Layer#saveLayer");
        com.bytedance.adsdk.oa.ivm.ivm.uef(canvas, this.wk, this.dj, 19);
        if (Build.VERSION.SDK_INT < 28) {
            uef(canvas);
        }
        com.bytedance.adsdk.oa.lw.oa("Layer#saveLayer");
        for (int i5 = 0; i5 < this.tpx.uef().size(); i5++) {
            com.bytedance.adsdk.oa.yo.oa.bcc bccVar = this.tpx.uef().get(i5);
            com.bytedance.adsdk.oa.uef.oa.uef<dz, Path> uefVar = this.tpx.oa().get(i5);
            com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVar2 = this.tpx.yo().get(i5);
            int i10 = AnonymousClass2.f24653oa[bccVar.uef().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i5 == 0) {
                        this.zjm.setColor(-16777216);
                        this.zjm.setAlpha(255);
                        canvas.drawRect(this.wk, this.zjm);
                    }
                    if (bccVar.moa()) {
                        yo(canvas, matrix, uefVar, uefVar2);
                    } else {
                        uef(canvas, matrix, uefVar);
                    }
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        if (bccVar.moa()) {
                            oa(canvas, matrix, uefVar, uefVar2);
                        } else {
                            uef(canvas, matrix, uefVar, uefVar2);
                        }
                    }
                } else if (bccVar.moa()) {
                    lw(canvas, matrix, uefVar, uefVar2);
                } else {
                    moa(canvas, matrix, uefVar, uefVar2);
                }
            } else if (dz()) {
                this.zjm.setAlpha(255);
                canvas.drawRect(this.wk, this.zjm);
            }
        }
        com.bytedance.adsdk.oa.lw.uef("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.oa.lw.oa("Layer#restoreLayer");
    }

    private void uef(Canvas canvas, Matrix matrix, com.bytedance.adsdk.oa.uef.oa.uef<dz, Path> uefVar, com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVar2) {
        this.xs.set(uefVar.xs());
        this.xs.transform(matrix);
        this.zjm.setAlpha((int) (uefVar2.xs().intValue() * 2.55f));
        canvas.drawPath(this.xs, this.zjm);
    }

    private void uef(Canvas canvas, Matrix matrix, com.bytedance.adsdk.oa.uef.oa.uef<dz, Path> uefVar) {
        this.xs.set(uefVar.xs());
        this.xs.transform(matrix);
        canvas.drawPath(this.xs, this.wrv);
    }

    public void uef(float f10) {
        this.moa.uef(f10);
        if (this.tpx != null) {
            for (int i5 = 0; i5 < this.tpx.oa().size(); i5++) {
                this.tpx.oa().get(i5).uef(f10);
            }
        }
        com.bytedance.adsdk.oa.uef.oa.moa moaVar = this.orq;
        if (moaVar != null) {
            moaVar.uef(f10);
        }
        uef uefVar = this.gzw;
        if (uefVar != null) {
            uefVar.uef(f10);
        }
        for (int i10 = 0; i10 < this.gr.size(); i10++) {
            this.gr.get(i10).uef(f10);
        }
    }
}
