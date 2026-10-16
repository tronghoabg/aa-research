package u1;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: u1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4225n extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public C4229r f46474a;

    /* renamed from: b, reason: collision with root package name */
    public int f46475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S3.n f46476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4225n(S3.n nVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46476c = nVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C4225n(this.f46476c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4225n) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r1.invoke(r7, r6) != r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[PHI: r1 r7
  0x0048: PHI (r1v1 u1.r) = (r1v3 u1.r), (r1v4 u1.r) binds: [B:13:0x0045, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0048: PHI (r7v5 java.lang.Object) = (r7v12 java.lang.Object), (r7v0 java.lang.Object) binds: [B:13:0x0045, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0051 -> B:18:0x0054). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r6.f46475b
            r2 = 2
            r3 = 1
            S3.n r4 = r6.f46476c
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            Fe.e.U(r7)
            goto L54
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            u1.r r1 = r6.f46474a
            Fe.e.U(r7)
            goto L48
        L20:
            Fe.e.U(r7)
            java.lang.Object r7 = r4.f10973d
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L61
        L2d:
            java.lang.Object r7 = r4.f10970a
            Ef.E r7 = (Ef.E) r7
            Ef.H.o(r7)
            java.lang.Object r7 = r4.f10971b
            r1 = r7
            u1.r r1 = (u1.C4229r) r1
            java.lang.Object r7 = r4.f10972c
            Gf.e r7 = (Gf.e) r7
            r6.f46474a = r1
            r6.f46475b = r3
            java.lang.Object r7 = r7.j(r6)
            if (r7 != r0) goto L48
            goto L53
        L48:
            r5 = 0
            r6.f46474a = r5
            r6.f46475b = r2
            java.lang.Object r7 = r1.invoke(r7, r6)
            if (r7 != r0) goto L54
        L53:
            return r0
        L54:
            java.lang.Object r7 = r4.f10973d
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2d
            ef.C r7 = ef.C2515C.f34653a
            return r7
        L61:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C4225n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
