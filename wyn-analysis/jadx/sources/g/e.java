package G;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final P.d f4129a = new P.d(new g[16]);

    /* JADX WARN: Path cross not found for [B:19:0x0063, B:22:0x006a], limit reached: 38 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b3 -> B:35:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(lf.AbstractC3464c r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r1 instanceof G.d
            if (r2 == 0) goto L17
            r2 = r1
            G.d r2 = (G.d) r2
            int r3 = r2.f4128g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f4128g = r3
            goto L1c
        L17:
            G.d r2 = new G.d
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f4126e
            kf.a r3 = kf.a.f39711a
            int r4 = r2.f4128g
            ef.C r5 = ef.C2515C.f34653a
            r6 = 0
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L42
            if (r4 != r8) goto L3a
            int r4 = r2.f4125d
            int r9 = r2.f4124c
            java.lang.Object[] r10 = r2.f4123b
            d0.d r11 = r2.f4122a
            Fe.e.U(r1)
            r17 = r8
            goto Lb4
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L42:
            Fe.e.U(r1)
            P.d r1 = r0.f4129a
            int r4 = r1.f8972c
            if (r4 <= 0) goto Lbc
            java.lang.Object[] r1 = r1.f8970a
            r10 = r1
            r9 = r4
            r11 = r6
            r4 = r7
        L51:
            r1 = r10[r4]
            G.g r1 = (G.g) r1
            r2.f4122a = r11
            r2.f4123b = r10
            r2.f4124c = r9
            r2.f4125d = r4
            r2.f4128g = r8
            t0.y r12 = r1.f4134c
            if (r12 == 0) goto L6a
            boolean r13 = r12.S()
            if (r13 == 0) goto L6a
            goto L6b
        L6a:
            r12 = r6
        L6b:
            if (r12 != 0) goto L71
            r17 = r8
            r15 = r9
            goto Lb0
        L71:
            if (r11 != 0) goto L83
            long r13 = r12.f44309c
            long r13 = Ba.c.R(r13)
            r17 = r8
            r15 = r9
            long r8 = d0.C2384c.f33931b
            d0.d r8 = a.AbstractC1304a.f(r8, r13)
            goto L87
        L83:
            r17 = r8
            r15 = r9
            r8 = r11
        L87:
            G.a r9 = r1.f4133b
            if (r9 != 0) goto L8d
            G.a r9 = r1.f4132a
        L8d:
            r9.getClass()
            long r12 = Fe.g.G(r12)
            d0.d r1 = r8.e(r12)
            android.graphics.Rect r8 = new android.graphics.Rect
            float r12 = r1.f33937a
            int r12 = (int) r12
            float r13 = r1.f33938b
            int r13 = (int) r13
            float r14 = r1.f33939c
            int r14 = (int) r14
            float r1 = r1.f33940d
            int r1 = (int) r1
            r8.<init>(r12, r13, r14, r1)
            android.view.View r1 = r9.f4119a
            r1.requestRectangleOnScreen(r8, r7)
            kf.a r1 = kf.a.f39711a
        Lb0:
            if (r5 != r3) goto Lb3
            return r3
        Lb3:
            r9 = r15
        Lb4:
            int r4 = r4 + 1
            if (r4 < r9) goto Lb9
            goto Lbc
        Lb9:
            r8 = r17
            goto L51
        Lbc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: G.e.a(lf.c):java.lang.Object");
    }
}
