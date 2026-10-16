package C;

import B.C0323n;
import B.C0324o;
import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3470i;
import p0.s;
import tf.p;

/* loaded from: classes.dex */
public final class k extends AbstractC3470i implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f1729a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0323n f1731c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f1732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f1733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0324o f1734f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C0323n c0323n, E e7, e eVar, C0324o c0324o, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1731c = c0323n;
        this.f1732d = e7;
        this.f1733e = eVar;
        this.f1734f = c0324o;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        k kVar = new k(this.f1731c, this.f1732d, this.f1733e, this.f1734f, interfaceC3103c);
        kVar.f1730b = obj;
        return kVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((s) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r9 == r0) goto L18;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r8.f1729a
            C.e r2 = r8.f1733e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L23
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L13
            Fe.e.U(r9)
            goto L5b
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            java.lang.Object r1 = r8.f1730b
            p0.s r1 = (p0.s) r1
            Fe.e.U(r9)
            goto L3a
        L23:
            Fe.e.U(r9)
            java.lang.Object r9 = r8.f1730b
            r1 = r9
            p0.s r1 = (p0.s) r1
            r8.f1730b = r1
            r8.f1729a = r5
            C.h r9 = C.o.f1749a
            p0.g r9 = p0.g.f43137b
            java.lang.Object r9 = C.o.a(r1, r9, r5, r8)
            if (r9 != r0) goto L3a
            goto L5a
        L3a:
            p0.k r9 = (p0.k) r9
            r9.a()
            C.h r6 = C.o.f1749a
            B.n r7 = r8.f1731c
            if (r7 == r6) goto L50
            C.j r6 = new C.j
            r6.<init>(r7, r2, r9, r3)
            r9 = 3
            Ef.E r7 = r8.f1732d
            Ef.H.D(r7, r3, r6, r9)
        L50:
            r8.f1730b = r3
            r8.f1729a = r4
            java.lang.Object r9 = C.o.b(r1, r8)
            if (r9 != r0) goto L5b
        L5a:
            return r0
        L5b:
            p0.k r9 = (p0.k) r9
            Nf.d r0 = r2.f1716d
            if (r9 != 0) goto L67
            r2.f1715c = r5
            r0.a(r3)
            goto L7b
        L67:
            r9.a()
            r2.f1714b = r5
            r0.a(r3)
            B.o r0 = r8.f1734f
            d0.c r1 = new d0.c
            long r2 = r9.f43143c
            r1.<init>(r2)
            r0.invoke(r1)
        L7b:
            ef.C r9 = ef.C2515C.f34653a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: C.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
