package Ef;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3470i;

/* loaded from: classes5.dex */
public final class v0 extends AbstractC3470i implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public C0 f3776a;

    /* renamed from: b, reason: collision with root package name */
    public Jf.j f3777b;

    /* renamed from: c, reason: collision with root package name */
    public int f3778c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0 f3780e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(z0 z0Var, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f3780e = z0Var;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        v0 v0Var = new v0(this.f3780e, interfaceC3103c);
        v0Var.f3779d = obj;
        return v0Var;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((Af.m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0069 -> B:25:0x007e). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r5.f3778c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            Jf.j r1 = r5.f3777b
            Ef.C0 r3 = r5.f3776a
            java.lang.Object r4 = r5.f3779d
            Af.m r4 = (Af.m) r4
            Fe.e.U(r6)
            goto L7e
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            Fe.e.U(r6)
            goto L83
        L24:
            Fe.e.U(r6)
            java.lang.Object r6 = r5.f3779d
            Af.m r6 = (Af.m) r6
            Ef.z0 r1 = r5.f3780e
            r1.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = Ef.z0.f3793a
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof Ef.r
            if (r4 == 0) goto L44
            Ef.r r1 = (Ef.r) r1
            Ef.s r1 = r1.f3763e
            r5.f3778c = r3
            r6.c(r1, r5)
            return r0
        L44:
            boolean r3 = r1 instanceof Ef.InterfaceC0491h0
            if (r3 == 0) goto L83
            Ef.h0 r1 = (Ef.InterfaceC0491h0) r1
            Ef.C0 r1 = r1.b()
            if (r1 == 0) goto L83
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = Jf.j.f6120a
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.AbstractC3340k.c(r3, r4)
            Jf.j r3 = (Jf.j) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L61:
            boolean r6 = r1.equals(r3)
            if (r6 != 0) goto L83
            boolean r6 = r1 instanceof Ef.r
            if (r6 == 0) goto L7e
            r6 = r1
            Ef.r r6 = (Ef.r) r6
            r5.f3779d = r4
            r5.f3776a = r3
            r5.f3777b = r1
            r5.f3778c = r2
            Ef.s r6 = r6.f3763e
            r4.c(r6, r5)
            kf.a r6 = kf.a.f39711a
            return r0
        L7e:
            Jf.j r1 = r1.f()
            goto L61
        L83:
            ef.C r6 = ef.C2515C.f34653a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ef.v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
