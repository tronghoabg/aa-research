package defpackage;

import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class daq {
    public static final boolean a(View view) {
        return view.isShowingLayoutBounds();
    }

    public static final boolean b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f3 * f8) - (f4 * f7);
        float f18 = (f9 * f14) - (f10 * f13);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f9 * f15) - (f11 * f13);
        float f21 = (f2 * f7) - (f3 * f6);
        float f22 = (f9 * f16) - (f12 * f13);
        float f23 = (f * f8) - (f4 * f5);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f * f7) - (f3 * f5);
        float f26 = (f10 * f16) - (f12 * f14);
        float f27 = (f * f6) - (f2 * f5);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f27 * f28) - (f25 * f26)) + (f23 * f24)) + (f21 * f22)) - (f19 * f20)) + (f17 * f18);
        if (f29 != BitmapDescriptorFactory.HUE_RED) {
            float f30 = 1.0f / f29;
            fArr2[0] = (((f6 * f28) - (f7 * f26)) + (f8 * f24)) * f30;
            fArr2[1] = ((((-f2) * f28) + (f3 * f26)) - (f4 * f24)) * f30;
            fArr2[2] = (((f14 * f17) - (f15 * f19)) + (f16 * f21)) * f30;
            fArr2[3] = ((((-f10) * f17) + (f11 * f19)) - (f12 * f21)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f31 * f28) + (f7 * f22)) - (f8 * f20)) * f30;
            fArr2[5] = (((f28 * f) - (f3 * f22)) + (f4 * f20)) * f30;
            float f32 = -f13;
            fArr2[6] = (((f32 * f17) + (f15 * f23)) - (f16 * f25)) * f30;
            fArr2[7] = (((f17 * f9) - (f11 * f23)) + (f12 * f25)) * f30;
            fArr2[8] = (((f5 * f26) - (f6 * f22)) + (f8 * f18)) * f30;
            fArr2[9] = ((((-f) * f26) + (f22 * f2)) - (f4 * f18)) * f30;
            fArr2[10] = (((f13 * f19) - (f14 * f23)) + (f16 * f27)) * f30;
            fArr2[11] = ((((-f9) * f19) + (f23 * f10)) - (f12 * f27)) * f30;
            fArr2[12] = (((f31 * f24) + (f6 * f20)) - (f7 * f18)) * f30;
            fArr2[13] = (((f * f24) - (f2 * f20)) + (f3 * f18)) * f30;
            fArr2[14] = (((f32 * f21) + (f14 * f25)) - (f15 * f27)) * f30;
            fArr2[15] = (((f9 * f21) - (f10 * f25)) + (f11 * f27)) * f30;
        }
        return f29 != BitmapDescriptorFactory.HUE_RED;
    }

    public static final void c(dec decVar) {
        decVar.a(ddx.j, afak.a);
    }

    public static final void d(dec decVar, String str) {
        deb debVar = ddx.a;
        List listSingletonList = Collections.singletonList(str);
        listSingletonList.getClass();
        decVar.a(debVar, listSingletonList);
    }

    public static final void e(dec decVar, cgm cgmVar) {
        decVar.a(ddx.r, cgmVar);
    }

    public static final void f(dec decVar, ddn ddnVar) {
        decVar.a(ddx.c, ddnVar);
    }

    public static final void g(dec decVar, int i) {
        decVar.a(ddx.A, new ddo(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062 A[LOOP:0: B:5:0x000d->B:35:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0065 A[EDGE_INSN: B:43:0x0065->B:36:0x0065 BREAK  A[LOOP:0: B:5:0x000d->B:35:0x0062], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [cfx] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [cfx] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ddu h(defpackage.cxb r8, boolean r9) {
        /*
            cxx r0 = r8.v
            int r1 = r0.a()
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L65
            cfx r0 = r0.f
        Ld:
            if (r0 == 0) goto L65
            int r1 = r0.r
            r1 = r1 & 8
            if (r1 == 0) goto L5c
            r1 = r0
            r3 = r2
        L17:
            if (r1 == 0) goto L5c
            boolean r4 = r1 instanceof defpackage.cyu
            if (r4 == 0) goto L1f
            r2 = r1
            goto L65
        L1f:
            int r4 = r1.r
            r4 = r4 & 8
            if (r4 == 0) goto L57
            boolean r4 = r1 instanceof defpackage.cwe
            if (r4 == 0) goto L57
            r4 = r1
            cwe r4 = (defpackage.cwe) r4
            cfx r4 = r4.C
            r5 = 0
        L2f:
            r6 = 1
            if (r4 == 0) goto L55
            int r7 = r4.r
            r7 = r7 & 8
            if (r7 == 0) goto L52
            int r5 = r5 + 1
            if (r5 != r6) goto L3e
            r1 = r4
            goto L52
        L3e:
            if (r3 != 0) goto L49
            byw r3 = new byw
            r6 = 16
            cfx[] r6 = new defpackage.cfx[r6]
            r3.<init>(r6)
        L49:
            if (r1 == 0) goto L4e
            r3.n(r1)
        L4e:
            r3.n(r4)
            r1 = r2
        L52:
            cfx r4 = r4.u
            goto L2f
        L55:
            if (r5 == r6) goto L17
        L57:
            cfx r1 = defpackage.bzi.n(r3)
            goto L17
        L5c:
            int r1 = r0.s
            r1 = r1 & 8
            if (r1 == 0) goto L65
            cfx r0 = r0.u
            goto Ld
        L65:
            r2.getClass()
            cyu r2 = (defpackage.cyu) r2
            cfx r0 = r2.M()
            ddr r1 = r8.r()
            if (r1 != 0) goto L79
            ddr r1 = new ddr
            r1.<init>()
        L79:
            ddu r2 = new ddu
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.daq.h(cxb, boolean):ddu");
    }
}
