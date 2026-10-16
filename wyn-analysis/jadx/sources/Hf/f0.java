package Hf;

import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class f0 implements InterfaceC0602l, InterfaceC0593d {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3471j f5125a;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(tf.p pVar) {
        this.f5125a = (AbstractC3471j) pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v3, types: [lf.j, tf.p] */
    @Override // Hf.InterfaceC0602l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(Hf.InterfaceC0603m r7, jf.InterfaceC3103c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Hf.C0587a
            if (r0 == 0) goto L13
            r0 = r8
            Hf.a r0 = (Hf.C0587a) r0
            int r1 = r0.f5108d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5108d = r1
            goto L18
        L13:
            Hf.a r0 = new Hf.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f5106b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5108d
            ef.C r3 = ef.C2515C.f34653a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            If.z r7 = r0.f5105a
            Fe.e.U(r8)     // Catch: java.lang.Throwable -> L2b
            goto L53
        L2b:
            r8 = move-exception
            goto L5d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            Fe.e.U(r8)
            If.z r8 = new If.z
            jf.h r2 = r0.getContext()
            r8.<init>(r7, r2)
            r0.f5105a = r8     // Catch: java.lang.Throwable -> L5b
            r0.f5108d = r4     // Catch: java.lang.Throwable -> L5b
            lf.j r7 = r6.f5125a     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r7 = r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L5b
            if (r7 != r1) goto L4e
            goto L4f
        L4e:
            r7 = r3
        L4f:
            if (r7 != r1) goto L52
            return r1
        L52:
            r7 = r8
        L53:
            r7.releaseIntercepted()
            return r3
        L57:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L5d
        L5b:
            r7 = move-exception
            goto L57
        L5d:
            r7.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.f0.collect(Hf.m, jf.c):java.lang.Object");
    }
}
