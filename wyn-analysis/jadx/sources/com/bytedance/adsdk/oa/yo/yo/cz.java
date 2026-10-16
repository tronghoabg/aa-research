package com.bytedance.adsdk.oa.yo.yo;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.oa.uef.oa.wk;
import com.bytedance.adsdk.oa.yo.oa;
import com.bytedance.adsdk.oa.yo.oa.ab;
import com.bytedance.adsdk.oa.yo.uef.dj;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class cz extends com.bytedance.adsdk.oa.yo.yo.uef {

    /* renamed from: ab, reason: collision with root package name */
    private final com.bytedance.adsdk.oa.cz f24643ab;
    private final RectF bcc;
    private final com.bytedance.adsdk.oa.xs bs;
    private final LongSparseArray<String> cq;
    private final Matrix cz;
    private com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> dhk;
    private final Paint dj;
    private final List<uef> dz;
    private com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> gr;
    private com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> gsd;
    private com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> gzw;
    private com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> oib;
    private com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> orq;
    private com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> rt;
    private com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> sy;
    private com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> tpx;

    /* renamed from: ue, reason: collision with root package name */
    private com.bytedance.adsdk.oa.uef.oa.uef<Typeface, Typeface> f24644ue;
    private final wk wk;
    private final Map<com.bytedance.adsdk.oa.yo.moa, List<com.bytedance.adsdk.oa.uef.uef.moa>> wrv;
    private final StringBuilder xs;
    private final Paint zjm;

    /* renamed from: com.bytedance.adsdk.oa.yo.yo.cz$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[oa.uef.values().length];
            uef = iArr;
            try {
                iArr[oa.uef.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uef[oa.uef.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                uef[oa.uef.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        private float f24645oa;
        private String uef;

        private uef() {
            this.uef = "";
            this.f24645oa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public void uef(String str, float f10) {
            this.uef = str;
            this.f24645oa = f10;
        }
    }

    public cz(com.bytedance.adsdk.oa.cz czVar, lw lwVar) {
        com.bytedance.adsdk.oa.yo.uef.oa oaVar;
        com.bytedance.adsdk.oa.yo.uef.oa oaVar2;
        com.bytedance.adsdk.oa.yo.uef.uef uefVar;
        com.bytedance.adsdk.oa.yo.uef.uef uefVar2;
        super(czVar, lwVar);
        this.xs = new StringBuilder(2);
        this.bcc = new RectF();
        this.cz = new Matrix();
        int i5 = 1;
        this.zjm = new Paint(i5) { // from class: com.bytedance.adsdk.oa.yo.yo.cz.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.dj = new Paint(i5) { // from class: com.bytedance.adsdk.oa.yo.yo.cz.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.wrv = new HashMap();
        this.cq = new LongSparseArray<>();
        this.dz = new ArrayList();
        this.f24643ab = czVar;
        this.bs = lwVar.uef();
        wk wkVarUef = lwVar.oib().uef();
        this.wk = wkVarUef;
        wkVarUef.uef(this);
        uef(wkVarUef);
        dj djVarDhk = lwVar.dhk();
        if (djVarDhk != null && (uefVar2 = djVarDhk.uef) != null) {
            com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVarUef = uefVar2.uef();
            this.sy = uefVarUef;
            uefVarUef.uef(this);
            uef(this.sy);
        }
        if (djVarDhk != null && (uefVar = djVarDhk.f24639oa) != null) {
            com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVarUef2 = uefVar.uef();
            this.dhk = uefVarUef2;
            uefVarUef2.uef(this);
            uef(this.dhk);
        }
        if (djVarDhk != null && (oaVar2 = djVarDhk.yo) != null) {
            com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef3 = oaVar2.uef();
            this.orq = uefVarUef3;
            uefVarUef3.uef(this);
            uef(this.orq);
        }
        if (djVarDhk == null || (oaVar = djVarDhk.moa) == null) {
            return;
        }
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef4 = oaVar.uef();
        this.gsd = uefVarUef4;
        uefVarUef4.uef(this);
        uef(this.gsd);
    }

    private boolean yo(int i5) {
        return Character.getType(i5) == 16 || Character.getType(i5) == 27 || Character.getType(i5) == 6 || Character.getType(i5) == 28 || Character.getType(i5) == 8 || Character.getType(i5) == 19;
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef
    public void oa(Canvas canvas, Matrix matrix, int i5) {
        super.oa(canvas, matrix, i5);
        com.bytedance.adsdk.oa.yo.oa oaVarXs = this.wk.xs();
        com.bytedance.adsdk.oa.yo.yo yoVar = this.bs.wk().get(oaVarXs.f24611oa);
        if (yoVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        uef(oaVarXs, matrix);
        if (this.f24643ab.rt()) {
            uef(oaVarXs, matrix, yoVar, canvas);
        } else {
            uef(oaVarXs, yoVar, canvas);
        }
        canvas.restore();
    }

    @Override // com.bytedance.adsdk.oa.yo.yo.uef, com.bytedance.adsdk.oa.uef.uef.lw
    public void uef(RectF rectF, Matrix matrix, boolean z2) {
        super.uef(rectF, matrix, z2);
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.bs.moa().width(), this.bs.moa().height());
    }

    private void uef(com.bytedance.adsdk.oa.yo.oa oaVar, Matrix matrix) {
        com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVar = this.oib;
        if (uefVar != null) {
            this.zjm.setColor(uefVar.xs().intValue());
        } else {
            com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVar2 = this.sy;
            if (uefVar2 != null) {
                this.zjm.setColor(uefVar2.xs().intValue());
            } else {
                this.zjm.setColor(oaVar.bcc);
            }
        }
        com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVar3 = this.tpx;
        if (uefVar3 != null) {
            this.dj.setColor(uefVar3.xs().intValue());
        } else {
            com.bytedance.adsdk.oa.uef.oa.uef<Integer, Integer> uefVar4 = this.dhk;
            if (uefVar4 != null) {
                this.dj.setColor(uefVar4.xs().intValue());
            } else {
                this.dj.setColor(oaVar.cz);
            }
        }
        int iIntValue = ((this.moa.uef() == null ? 100 : this.moa.uef().xs().intValue()) * 255) / 100;
        this.zjm.setAlpha(iIntValue);
        this.dj.setAlpha(iIntValue);
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVar5 = this.gzw;
        if (uefVar5 != null) {
            this.dj.setStrokeWidth(uefVar5.xs().floatValue());
            return;
        }
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVar6 = this.orq;
        if (uefVar6 != null) {
            this.dj.setStrokeWidth(uefVar6.xs().floatValue());
        } else {
            this.dj.setStrokeWidth(com.bytedance.adsdk.oa.ivm.ivm.uef() * oaVar.zjm);
        }
    }

    private uef oa(int i5) {
        for (int size = this.dz.size(); size < i5; size++) {
            this.dz.add(new uef());
        }
        return this.dz.get(i5 - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void uef(com.bytedance.adsdk.oa.yo.oa r17, android.graphics.Matrix r18, com.bytedance.adsdk.oa.yo.yo r19, android.graphics.Canvas r20) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            com.bytedance.adsdk.oa.uef.oa.uef<java.lang.Float, java.lang.Float> r1 = r0.gr
            if (r1 == 0) goto L13
            java.lang.Object r1 = r1.xs()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L15
        L13:
            float r1 = r7.yo
        L15:
            r2 = 1120403456(0x42c80000, float:100.0)
            float r4 = r1 / r2
            float r8 = com.bytedance.adsdk.oa.ivm.ivm.uef(r18)
            java.lang.String r1 = r7.uef
            java.util.List r9 = r0.uef(r1)
            int r10 = r9.size()
            int r1 = r7.lw
            float r1 = (float) r1
            r2 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r2
            com.bytedance.adsdk.oa.uef.oa.uef<java.lang.Float, java.lang.Float> r2 = r0.rt
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r2.xs()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
        L3b:
            float r1 = r1 + r2
        L3c:
            r5 = r1
            goto L4d
        L3e:
            com.bytedance.adsdk.oa.uef.oa.uef<java.lang.Float, java.lang.Float> r2 = r0.gsd
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r2.xs()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            goto L3b
        L4d:
            r11 = 0
            r1 = -1
            r12 = r1
            r13 = r11
        L51:
            if (r13 >= r10) goto La7
            java.lang.Object r1 = r9.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r2 = r7.cq
            if (r2 != 0) goto L5f
            r2 = 0
            goto L61
        L5f:
            float r2 = r2.x
        L61:
            r6 = 1
            r3 = r19
            java.util.List r14 = r0.uef(r1, r2, r3, r4, r5, r6)
            r15 = r11
        L69:
            int r1 = r14.size()
            if (r15 >= r1) goto L9d
            java.lang.Object r1 = r14.get(r15)
            com.bytedance.adsdk.oa.yo.yo.cz$uef r1 = (com.bytedance.adsdk.oa.yo.yo.cz.uef) r1
            int r12 = r12 + 1
            r20.save()
            float r2 = com.bytedance.adsdk.oa.yo.yo.cz.uef.uef(r1)
            r3 = r20
            r0.uef(r3, r7, r12, r2)
            java.lang.String r1 = com.bytedance.adsdk.oa.yo.yo.cz.uef.oa(r1)
            r6 = r4
            r2 = r7
            r4 = r3
            r7 = r5
            r5 = r8
            r3 = r19
            r0.uef(r1, r2, r3, r4, r5, r6, r7)
            r4 = r6
            r20.restore()
            int r15 = r15 + 1
            r0 = r16
            r5 = r7
            r7 = r17
            goto L69
        L9d:
            r7 = r5
            r5 = r8
            int r13 = r13 + 1
            r0 = r16
            r5 = r7
            r7 = r17
            goto L51
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.yo.yo.cz.uef(com.bytedance.adsdk.oa.yo.oa, android.graphics.Matrix, com.bytedance.adsdk.oa.yo.yo, android.graphics.Canvas):void");
    }

    private void uef(String str, com.bytedance.adsdk.oa.yo.oa oaVar, com.bytedance.adsdk.oa.yo.yo yoVar, Canvas canvas, float f10, float f11, float f12) {
        for (int i5 = 0; i5 < str.length(); i5++) {
            com.bytedance.adsdk.oa.yo.moa moaVar = this.bs.dz().get(com.bytedance.adsdk.oa.yo.moa.uef(str.charAt(i5), yoVar.uef(), yoVar.yo()));
            if (moaVar != null) {
                uef(moaVar, f11, oaVar, canvas);
                canvas.translate((com.bytedance.adsdk.oa.ivm.ivm.uef() * ((float) moaVar.oa()) * f11) + f12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void uef(com.bytedance.adsdk.oa.yo.oa r13, com.bytedance.adsdk.oa.yo.yo r14, android.graphics.Canvas r15) {
        /*
            r12 = this;
            android.graphics.Typeface r0 = r12.uef(r14)
            if (r0 != 0) goto L9
        L6:
            r4 = r12
            goto Ld0
        L9:
            java.lang.String r1 = r13.uef
            com.bytedance.adsdk.oa.cz r2 = r12.f24643ab
            com.bytedance.adsdk.oa.dhk r2 = r2.gsd()
            if (r2 == 0) goto L1b
            java.lang.String r3 = r12.cz()
            java.lang.String r1 = r2.oa(r3, r1)
        L1b:
            android.graphics.Paint r2 = r12.zjm
            r2.setTypeface(r0)
            com.bytedance.adsdk.oa.uef.oa.uef<java.lang.Float, java.lang.Float> r0 = r12.gr
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r0.xs()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L31
        L2f:
            float r0 = r13.yo
        L31:
            android.graphics.Paint r2 = r12.zjm
            float r3 = com.bytedance.adsdk.oa.ivm.ivm.uef()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r12.dj
            android.graphics.Paint r3 = r12.zjm
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r12.dj
            android.graphics.Paint r3 = r12.zjm
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r13.lw
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            com.bytedance.adsdk.oa.uef.oa.uef<java.lang.Float, java.lang.Float> r3 = r12.rt
            if (r3 == 0) goto L67
            java.lang.Object r3 = r3.xs()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L65:
            float r2 = r2 + r3
            goto L76
        L67:
            com.bytedance.adsdk.oa.uef.oa.uef<java.lang.Float, java.lang.Float> r3 = r12.gsd
            if (r3 == 0) goto L76
            java.lang.Object r3 = r3.xs()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L65
        L76:
            float r3 = com.bytedance.adsdk.oa.ivm.ivm.uef()
            float r3 = r3 * r2
            float r3 = r3 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r9 = r3 / r0
            java.util.List r0 = r12.uef(r1)
            int r1 = r0.size()
            r2 = 0
            r3 = -1
            r11 = r2
        L8b:
            if (r11 >= r1) goto L6
            java.lang.Object r4 = r0.get(r11)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            android.graphics.PointF r4 = r13.cq
            if (r4 != 0) goto L9b
            r4 = 0
        L99:
            r6 = r4
            goto L9e
        L9b:
            float r4 = r4.x
            goto L99
        L9e:
            r8 = 0
            r10 = 0
            r4 = r12
            r7 = r14
            java.util.List r14 = r4.uef(r5, r6, r7, r8, r9, r10)
            r5 = r2
        La7:
            int r6 = r14.size()
            if (r5 >= r6) goto Lcc
            java.lang.Object r6 = r14.get(r5)
            com.bytedance.adsdk.oa.yo.yo.cz$uef r6 = (com.bytedance.adsdk.oa.yo.yo.cz.uef) r6
            int r3 = r3 + 1
            r15.save()
            float r8 = com.bytedance.adsdk.oa.yo.yo.cz.uef.uef(r6)
            r12.uef(r15, r13, r3, r8)
            java.lang.String r6 = com.bytedance.adsdk.oa.yo.yo.cz.uef.oa(r6)
            r12.uef(r6, r13, r15, r9)
            r15.restore()
            int r5 = r5 + 1
            goto La7
        Lcc:
            int r11 = r11 + 1
            r14 = r7
            goto L8b
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.yo.yo.cz.uef(com.bytedance.adsdk.oa.yo.oa, com.bytedance.adsdk.oa.yo.yo, android.graphics.Canvas):void");
    }

    private void uef(Canvas canvas, com.bytedance.adsdk.oa.yo.oa oaVar, int i5, float f10) {
        PointF pointF = oaVar.wrv;
        PointF pointF2 = oaVar.cq;
        float fUef = com.bytedance.adsdk.oa.ivm.ivm.uef();
        float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f12 = (i5 * oaVar.ivm * fUef) + (pointF == null ? 0.0f : (oaVar.ivm * 0.6f * fUef) + pointF.y);
        float f13 = pointF == null ? 0.0f : pointF.x;
        if (pointF2 != null) {
            f11 = pointF2.x;
        }
        int i10 = AnonymousClass3.uef[oaVar.moa.ordinal()];
        if (i10 == 1) {
            canvas.translate(f13, f12);
        } else if (i10 == 2) {
            canvas.translate((f13 + f11) - f10, f12);
        } else {
            if (i10 != 3) {
                return;
            }
            canvas.translate(((f11 / 2.0f) + f13) - (f10 / 2.0f), f12);
        }
    }

    private Typeface uef(com.bytedance.adsdk.oa.yo.yo yoVar) {
        Typeface typefaceXs;
        com.bytedance.adsdk.oa.uef.oa.uef<Typeface, Typeface> uefVar = this.f24644ue;
        if (uefVar != null && (typefaceXs = uefVar.xs()) != null) {
            return typefaceXs;
        }
        Typeface typefaceUef = this.f24643ab.uef(yoVar);
        return typefaceUef != null ? typefaceUef : yoVar.moa();
    }

    private List<String> uef(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void uef(String str, com.bytedance.adsdk.oa.yo.oa oaVar, Canvas canvas, float f10) {
        int length = 0;
        while (length < str.length()) {
            String strUef = uef(str, length);
            length += strUef.length();
            uef(strUef, oaVar, canvas);
            canvas.translate(this.zjm.measureText(strUef) + f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private List<uef> uef(String str, float f10, com.bytedance.adsdk.oa.yo.yo yoVar, float f11, float f12, boolean z2) {
        float fMeasureText;
        int i5 = 0;
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char cCharAt = str.charAt(i12);
            if (z2) {
                com.bytedance.adsdk.oa.yo.moa moaVar = this.bs.dz().get(com.bytedance.adsdk.oa.yo.moa.uef(cCharAt, yoVar.uef(), yoVar.yo()));
                if (moaVar != null) {
                    fMeasureText = (com.bytedance.adsdk.oa.ivm.ivm.uef() * ((float) moaVar.oa()) * f11) + f12;
                }
            } else {
                fMeasureText = this.zjm.measureText(str.substring(i12, i12 + 1)) + f12;
            }
            if (cCharAt == ' ') {
                z10 = true;
                f15 = fMeasureText;
            } else if (z10) {
                z10 = false;
                i11 = i12;
                f14 = fMeasureText;
            } else {
                f14 += fMeasureText;
            }
            f13 += fMeasureText;
            if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f13 >= f10 && cCharAt != ' ') {
                i5++;
                uef uefVarOa = oa(i5);
                if (i11 == i10) {
                    uefVarOa.uef(str.substring(i10, i12).trim(), (f13 - fMeasureText) - ((r9.length() - r7.length()) * f15));
                    i10 = i12;
                    i11 = i10;
                    f13 = fMeasureText;
                    f14 = f13;
                } else {
                    uefVarOa.uef(str.substring(i10, i11 - 1).trim(), ((f13 - f14) - ((r7.length() - r13.length()) * f15)) - f15);
                    f13 = f14;
                    i10 = i11;
                }
            }
        }
        if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i5++;
            oa(i5).uef(str.substring(i10), f13);
        }
        return this.dz.subList(0, i5);
    }

    private void uef(com.bytedance.adsdk.oa.yo.moa moaVar, float f10, com.bytedance.adsdk.oa.yo.oa oaVar, Canvas canvas) {
        List<com.bytedance.adsdk.oa.uef.uef.moa> listUef = uef(moaVar);
        for (int i5 = 0; i5 < listUef.size(); i5++) {
            Path pathMoa = listUef.get(i5).moa();
            pathMoa.computeBounds(this.bcc, false);
            this.cz.reset();
            this.cz.preTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.bytedance.adsdk.oa.ivm.ivm.uef() * (-oaVar.xs));
            this.cz.preScale(f10, f10);
            pathMoa.transform(this.cz);
            if (oaVar.dj) {
                uef(pathMoa, this.zjm, canvas);
                uef(pathMoa, this.dj, canvas);
            } else {
                uef(pathMoa, this.dj, canvas);
                uef(pathMoa, this.zjm, canvas);
            }
        }
    }

    private void uef(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void uef(String str, com.bytedance.adsdk.oa.yo.oa oaVar, Canvas canvas) {
        if (oaVar.dj) {
            uef(str, this.zjm, canvas);
            uef(str, this.dj, canvas);
        } else {
            uef(str, this.dj, canvas);
            uef(str, this.zjm, canvas);
        }
    }

    private void uef(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        canvas.drawText(str, 0, str.length(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
    }

    private List<com.bytedance.adsdk.oa.uef.uef.moa> uef(com.bytedance.adsdk.oa.yo.moa moaVar) {
        if (this.wrv.containsKey(moaVar)) {
            return this.wrv.get(moaVar);
        }
        List<ab> listUef = moaVar.uef();
        int size = listUef.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new com.bytedance.adsdk.oa.uef.uef.moa(this.f24643ab, this, listUef.get(i5), this.bs));
        }
        this.wrv.put(moaVar, arrayList);
        return arrayList;
    }

    private String uef(String str, int i5) {
        int iCodePointAt = str.codePointAt(i5);
        int iCharCount = Character.charCount(iCodePointAt) + i5;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!yo(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j8 = iCodePointAt;
        if (this.cq.indexOfKey(j8) >= 0) {
            return this.cq.get(j8);
        }
        this.xs.setLength(0);
        while (i5 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i5);
            this.xs.appendCodePoint(iCodePointAt3);
            i5 += Character.charCount(iCodePointAt3);
        }
        String string = this.xs.toString();
        this.cq.put(j8, string);
        return string;
    }
}
