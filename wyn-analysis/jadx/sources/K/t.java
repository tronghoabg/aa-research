package K;

import N.C0740o;
import i0.C2826d;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Z.k f6295a = E.L.c(Z.i.f16922a, 24);

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(h0.AbstractC2765c r9, java.lang.String r10, Z.k r11, long r12, N.C0740o r14, int r15) {
        /*
            java.lang.String r0 = "painter"
            kotlin.jvm.internal.AbstractC3340k.e(r9, r0)
            r0 = -1142959010(0xffffffffbbdfd45e, float:-0.006830736)
            r14.N(r0)
            Z.i r0 = Z.i.f16922a
            long r1 = e0.C2465q.f34380i
            boolean r1 = e0.C2465q.b(r12, r1)
            if (r1 == 0) goto L17
            r1 = 0
            goto L38
        L17:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 5
            if (r1 < r2) goto L25
            e0.k r1 = e0.C2459k.f34369a
            android.graphics.BlendModeColorFilter r1 = r1.a(r12, r3)
            goto L32
        L25:
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            int r2 = e0.z.s(r12)
            android.graphics.PorterDuff$Mode r3 = e0.z.u(r3)
            r1.<init>(r2, r3)
        L32:
            e0.r r2 = new e0.r
            r2.<init>(r1)
            r1 = r2
        L38:
            r2 = 1547385429(0x5c3b3a55, float:2.1079983E17)
            r14.M(r2)
            r2 = 0
            if (r10 == 0) goto L68
            r3 = 1157296644(0x44faf204, float:2007.563)
            r14.M(r3)
            boolean r3 = r14.e(r10)
            java.lang.Object r4 = r14.F()
            if (r3 != 0) goto L55
            N.P r3 = N.C0732k.f7800a
            if (r4 != r3) goto L5e
        L55:
            K.s r4 = new K.s
            r3 = 0
            r4.<init>(r10, r3)
            r14.U(r4)
        L5e:
            r14.p(r2)
            tf.l r4 = (tf.l) r4
            Z.k r3 = Fe.g.J(r0, r2, r4)
            goto L69
        L68:
            r3 = r0
        L69:
            r14.p(r2)
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.AbstractC3340k.e(r11, r4)
            long r5 = r9.f()
            long r7 = d0.f.f33950c
            boolean r5 = d0.f.a(r5, r7)
            if (r5 != 0) goto L95
            long r5 = r9.f()
            float r7 = d0.f.d(r5)
            boolean r7 = java.lang.Float.isInfinite(r7)
            if (r7 == 0) goto L97
            float r5 = d0.f.b(r5)
            boolean r5 = java.lang.Float.isInfinite(r5)
            if (r5 == 0) goto L97
        L95:
            Z.k r0 = K.t.f6295a
        L97:
            Z.k r0 = r11.g(r0)
            r0.f r5 = r0.C3902g.f44297b
            Z.d r6 = Z.a.f16904e
            kotlin.jvm.internal.AbstractC3340k.e(r0, r4)
            b0.h r4 = new b0.h
            r4.<init>(r9, r6, r5, r1)
            Z.k r0 = r0.g(r4)
            Z.k r0 = r0.g(r3)
            E.AbstractC0426p.a(r0, r14, r2)
            N.i0 r14 = r14.r()
            if (r14 != 0) goto Lb9
            return
        Lb9:
            K.r r0 = new K.r
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r6)
            r14.f7788d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K.t.a(h0.c, java.lang.String, Z.k, long, N.o, int):void");
    }

    public static final void b(C2826d c2826d, Z.k kVar, long j8, C0740o c0740o, int i5) {
        c0740o.M(-800853103);
        a(ic.d.L(c2826d, c0740o), null, kVar, j8, c0740o, (i5 & 112) | 8 | (i5 & 896) | (i5 & 7168));
        c0740o.p(false);
    }
}
