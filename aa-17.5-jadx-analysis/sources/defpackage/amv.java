package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class amv {
    public final bym b;
    public final bwq c;
    public final amu d;
    public final byb e;
    public final byb f;
    private final bwq h;
    private final bwq i;
    private final bym j;
    private final bwq k;
    public final afec a = new ajc(11);
    public final bii g = new bii((byte[]) null, (char[]) null);

    public amv(Object obj) {
        bxp bxpVar = bxp.c;
        this.h = new ParcelableSnapshotMutableState(obj, bxpVar);
        this.i = new ParcelableSnapshotMutableState(obj, bxpVar);
        alg algVar = new alg(this, 4);
        lah lahVar = byj.a;
        this.j = new bvk(algVar, null);
        this.e = new ParcelableSnapshotMutableFloatState(Float.NaN);
        this.b = new bvk(new alg(this, 5), bxpVar);
        this.f = new ParcelableSnapshotMutableFloatState(BitmapDescriptorFactory.HUE_RED);
        this.k = new ParcelableSnapshotMutableState(null, bxpVar);
        this.c = new ParcelableSnapshotMutableState(new anf(afbe.a, new float[0]), bxpVar);
        this.d = new amu(this);
    }

    public final float a() {
        return this.f.e();
    }

    public final float b() {
        return this.e.e();
    }

    public final float c(float f) {
        float fMin;
        float fB = (Float.isNaN(b()) ? BitmapDescriptorFactory.HUE_RED : b()) + f;
        float[] fArr = n().a;
        float fMax = Float.NaN;
        int i = 1;
        if (fArr.length == 0) {
            fMin = Float.NaN;
        } else {
            fMin = fArr[0];
            int iCK = woy.cK(fArr);
            if (iCK > 0) {
                int i2 = 1;
                while (true) {
                    fMin = Math.min(fMin, fArr[i2]);
                    if (i2 == iCK) {
                        break;
                    }
                    i2++;
                }
            }
        }
        float[] fArr2 = n().a;
        if (fArr2.length != 0) {
            fMax = fArr2[0];
            int iCK2 = woy.cK(fArr2);
            if (iCK2 > 0) {
                while (true) {
                    fMax = Math.max(fMax, fArr2[i]);
                    if (i == iCK2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return afpt.d(fB, fMin, fMax);
    }

    public final float d() {
        if (Float.isNaN(b())) {
            asl.d("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return b();
    }

    public final Object e(akq akqVar, afeh afehVar, afck afckVar) {
        Object objR = this.g.r(akqVar, new bgf(this, afehVar, (afck) null, 1), afckVar);
        return objR == afcr.a ? objR : afak.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.Object r6, defpackage.akq r7, defpackage.afei r8, defpackage.afck r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.amr
            if (r0 == 0) goto L13
            r0 = r9
            amr r0 = (defpackage.amr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amr r0 = new amr
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            defpackage.woy.dF(r9)     // Catch: java.lang.Throwable -> L28
            goto L4f
        L28:
            r6 = move-exception
            goto L53
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.woy.dF(r9)
            anf r9 = r5.n()
            boolean r9 = r9.d(r6)
            if (r9 == 0) goto L57
            bii r9 = r5.g     // Catch: java.lang.Throwable -> L28
            amt r2 = new amt     // Catch: java.lang.Throwable -> L28
            r2.<init>(r5, r6, r8, r3)     // Catch: java.lang.Throwable -> L28
            r0.c = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = r9.r(r7, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r5.l(r3)
            goto L64
        L53:
            r5.l(r3)
            throw r6
        L57:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            r7.getClass()
            r5.m(r6)
            r5.k(r6)
        L64:
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amv.f(java.lang.Object, akq, afei, afck):java.lang.Object");
    }

    public final Object g() {
        return this.h.a();
    }

    public final Object h() {
        return this.k.a();
    }

    public final Object i() {
        return this.i.a();
    }

    public final Object j() {
        return this.j.a();
    }

    public final void k(Object obj) {
        this.h.b(obj);
    }

    public final void l(Object obj) {
        this.k.b(obj);
    }

    public final void m(Object obj) {
        this.i.b(obj);
    }

    public final anf n() {
        return (anf) this.c.a();
    }
}
