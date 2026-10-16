package Hf;

import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class I implements InterfaceC0603m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3471j f5045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0603m f5046b;

    /* JADX WARN: Multi-variable type inference failed */
    public I(tf.q qVar, InterfaceC0603m interfaceC0603m) {
        this.f5045a = (AbstractC3471j) qVar;
        this.f5046b = interfaceC0603m;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [lf.j, tf.q] */
    @Override // Hf.InterfaceC0603m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r5, jf.InterfaceC3103c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Hf.H
            if (r0 == 0) goto L13
            r0 = r6
            Hf.H r0 = (Hf.H) r0
            int r1 = r0.f5043c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5043c = r1
            goto L18
        L13:
            Hf.H r0 = new Hf.H
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f5042b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5043c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Hf.I r5 = r0.f5041a
            Fe.e.U(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Fe.e.U(r6)
            r0.f5041a = r4
            r0.f5043c = r3
            lf.j r6 = r4.f5045a
            Hf.m r2 = r4.f5046b
            java.lang.Object r6 = r6.invoke(r2, r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            r5 = r4
        L44:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L4f
            ef.C r5 = ef.C2515C.f34653a
            return r5
        L4f:
            If.a r6 = new If.a
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.I.emit(java.lang.Object, jf.c):java.lang.Object");
    }
}
