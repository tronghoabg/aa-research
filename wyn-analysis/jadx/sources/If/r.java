package If;

import Hf.InterfaceC0603m;

/* loaded from: classes5.dex */
public final class r implements InterfaceC0603m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gf.e f5502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5503b;

    public r(Gf.e eVar, int i5) {
        this.f5502a = eVar;
        this.f5503b = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (Ef.H.T(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Hf.InterfaceC0603m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, jf.InterfaceC3103c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof If.q
            if (r0 == 0) goto L13
            r0 = r7
            If.q r0 = (If.q) r0
            int r1 = r0.f5501c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5501c = r1
            goto L18
        L13:
            If.q r0 = new If.q
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f5499a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5501c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            Fe.e.U(r7)
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            Fe.e.U(r7)
            goto L4b
        L36:
            Fe.e.U(r7)
            ff.y r7 = new ff.y
            int r2 = r5.f5503b
            r7.<init>(r2, r6)
            r0.f5501c = r4
            Gf.e r6 = r5.f5502a
            java.lang.Object r6 = r6.i(r7, r0)
            if (r6 != r1) goto L4b
            goto L53
        L4b:
            r0.f5501c = r3
            java.lang.Object r6 = Ef.H.T(r0)
            if (r6 != r1) goto L54
        L53:
            return r1
        L54:
            ef.C r6 = ef.C2515C.f34653a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: If.r.emit(java.lang.Object, jf.c):java.lang.Object");
    }
}
