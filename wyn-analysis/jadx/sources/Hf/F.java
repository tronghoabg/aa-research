package Hf;

/* loaded from: classes5.dex */
public final class F implements InterfaceC0602l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0602l f5037b;

    public /* synthetic */ F(InterfaceC0602l interfaceC0602l, int i5) {
        this.f5036a = i5;
        this.f5037b = interfaceC0602l;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    @Override // Hf.InterfaceC0602l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(Hf.InterfaceC0603m r8, jf.InterfaceC3103c r9) {
        /*
            r7 = this;
            int r0 = r7.f5036a
            switch(r0) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            Hf.f r0 = new Hf.f
            r1 = 10
            r0.<init>(r8, r1)
            Hf.l r8 = r7.f5037b
            java.lang.Object r8 = r8.collect(r0, r9)
            kf.a r9 = kf.a.f39711a
            if (r8 != r9) goto L17
            goto L19
        L17:
            ef.C r8 = ef.C2515C.f34653a
        L19:
            return r8
        L1a:
            boolean r0 = r9 instanceof Hf.E
            if (r0 == 0) goto L2d
            r0 = r9
            Hf.E r0 = (Hf.E) r0
            int r1 = r0.f5033b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L2d
            int r1 = r1 - r2
            r0.f5033b = r1
            goto L32
        L2d:
            Hf.E r0 = new Hf.E
            r0.<init>(r7, r9)
        L32:
            java.lang.Object r9 = r0.f5032a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5033b
            r3 = 1
            if (r2 == 0) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.f5035d
            Fe.e.U(r9)     // Catch: If.C0620a -> L43
            goto L74
        L43:
            r9 = move-exception
            goto L70
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            Fe.e.U(r9)
            java.lang.Object r9 = new java.lang.Object
            r9.<init>()
            kotlin.jvm.internal.E r2 = new kotlin.jvm.internal.E
            r2.<init>()
            Hf.l r4 = r7.f5037b     // Catch: If.C0620a -> L6c
            Hf.j r5 = new Hf.j     // Catch: If.C0620a -> L6c
            r5.<init>(r2, r8, r9)     // Catch: If.C0620a -> L6c
            r0.f5035d = r9     // Catch: If.C0620a -> L6c
            r0.f5033b = r3     // Catch: If.C0620a -> L6c
            java.lang.Object r8 = r4.collect(r5, r0)     // Catch: If.C0620a -> L6c
            if (r8 != r1) goto L74
            goto L76
        L6c:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L70:
            java.lang.Object r0 = r9.f5458a
            if (r0 != r8) goto L77
        L74:
            ef.C r1 = ef.C2515C.f34653a
        L76:
            return r1
        L77:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.F.collect(Hf.m, jf.c):java.lang.Object");
    }
}
