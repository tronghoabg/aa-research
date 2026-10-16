package Hf;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class s0 extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public int f5195a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ InterfaceC0603m f5196b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f5197c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f5198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(u0 u0Var, InterfaceC3103c interfaceC3103c) {
        super(3, interfaceC3103c);
        this.f5198d = u0Var;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        s0 s0Var = new s0(this.f5198d, (InterfaceC3103c) obj3);
        s0Var.f5196b = (InterfaceC0603m) obj;
        s0Var.f5197c = iIntValue;
        return s0Var.invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r1.emit(r9, r8) != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[PHI: r1
  0x006a: PHI (r1v3 Hf.m) = (r1v2 Hf.m), (r1v6 Hf.m) binds: [B:25:0x0067, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[PHI: r1
  0x007d: PHI (r1v4 Hf.m) = (r1v3 Hf.m), (r1v7 Hf.m) binds: [B:28:0x007a, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r8.f5195a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            Hf.u0 r7 = r8.f5198d
            if (r1 == 0) goto L36
            if (r1 == r6) goto L32
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L26
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            goto L32
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            Hf.m r1 = r8.f5196b
            Fe.e.U(r9)
            goto L7d
        L26:
            Hf.m r1 = r8.f5196b
            Fe.e.U(r9)
            goto L6a
        L2c:
            Hf.m r1 = r8.f5196b
            Fe.e.U(r9)
            goto L5a
        L32:
            Fe.e.U(r9)
            goto L8b
        L36:
            Fe.e.U(r9)
            Hf.m r1 = r8.f5196b
            int r9 = r8.f5197c
            if (r9 <= 0) goto L4a
            Hf.m0 r9 = Hf.m0.f5159a
            r8.f5195a = r6
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L8b
            goto L8a
        L4a:
            r7.getClass()
            r8.f5196b = r1
            r8.f5195a = r5
            r5 = 0
            java.lang.Object r9 = Ef.H.m(r5, r8)
            if (r9 != r0) goto L5a
            goto L8a
        L5a:
            r7.getClass()
            Hf.m0 r9 = Hf.m0.f5160b
            r8.f5196b = r1
            r8.f5195a = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L6a
            goto L8a
        L6a:
            r7.getClass()
            r8.f5196b = r1
            r8.f5195a = r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r9 = Ef.H.m(r3, r8)
            if (r9 != r0) goto L7d
            goto L8a
        L7d:
            Hf.m0 r9 = Hf.m0.f5161c
            r3 = 0
            r8.f5196b = r3
            r8.f5195a = r2
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L8b
        L8a:
            return r0
        L8b:
            ef.C r9 = ef.C2515C.f34653a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
