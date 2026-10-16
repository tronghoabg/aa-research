package Hf;

import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class A0 implements InterfaceC0603m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0603m f5013a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3471j f5014b;

    /* JADX WARN: Multi-variable type inference failed */
    public A0(InterfaceC0603m interfaceC0603m, tf.p pVar) {
        this.f5013a = interfaceC0603m;
        this.f5014b = (AbstractC3471j) pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [lf.c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4, types: [lf.j, tf.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(lf.AbstractC3464c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof Hf.z0
            if (r0 == 0) goto L13
            r0 = r8
            Hf.z0 r0 = (Hf.z0) r0
            int r1 = r0.f5241e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5241e = r1
            goto L18
        L13:
            Hf.z0 r0 = new Hf.z0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f5239c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f5241e
            ef.C r3 = ef.C2515C.f34653a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            Fe.e.U(r8)
            return r3
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            If.z r2 = r0.f5238b
            Hf.A0 r5 = r0.f5237a
            Fe.e.U(r8)     // Catch: java.lang.Throwable -> L3c
            goto L5c
        L3c:
            r8 = move-exception
            goto L76
        L3e:
            Fe.e.U(r8)
            If.z r2 = new If.z
            Hf.m r8 = r7.f5013a
            jf.h r6 = r0.getContext()
            r2.<init>(r8, r6)
            lf.j r8 = r7.f5014b     // Catch: java.lang.Throwable -> L3c
            r0.f5237a = r7     // Catch: java.lang.Throwable -> L3c
            r0.f5238b = r2     // Catch: java.lang.Throwable -> L3c
            r0.f5241e = r5     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r8 = r8.invoke(r2, r0)     // Catch: java.lang.Throwable -> L3c
            if (r8 != r1) goto L5b
            goto L74
        L5b:
            r5 = r7
        L5c:
            r2.releaseIntercepted()
            Hf.m r8 = r5.f5013a
            boolean r2 = r8 instanceof Hf.A0
            if (r2 == 0) goto L75
            Hf.A0 r8 = (Hf.A0) r8
            r2 = 0
            r0.f5237a = r2
            r0.f5238b = r2
            r0.f5241e = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            return r3
        L76:
            r2.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.A0.a(lf.c):java.lang.Object");
    }

    @Override // Hf.InterfaceC0603m
    public final Object emit(Object obj, InterfaceC3103c interfaceC3103c) {
        return this.f5013a.emit(obj, interfaceC3103c);
    }
}
