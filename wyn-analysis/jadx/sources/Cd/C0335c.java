package Cd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: Cd.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0335c extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2086a;

    /* renamed from: b, reason: collision with root package name */
    public int f2087b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Rd.e f2088c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tf.q f2090e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0335c(tf.q qVar, InterfaceC3103c interfaceC3103c, int i5) {
        super(3, interfaceC3103c);
        this.f2086a = i5;
        this.f2090e = qVar;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Rd.e eVar = (Rd.e) obj;
        InterfaceC3103c interfaceC3103c = (InterfaceC3103c) obj3;
        switch (this.f2086a) {
            case 0:
                C0335c c0335c = new C0335c(this.f2090e, interfaceC3103c, 0);
                c0335c.f2088c = eVar;
                c0335c.f2089d = obj2;
                return c0335c.invokeSuspend(C2515C.f34653a);
            default:
                C0335c c0335c2 = new C0335c(this.f2090e, interfaceC3103c, 1);
                c0335c2.f2088c = eVar;
                c0335c2.f2089d = obj2;
                return c0335c2.invokeSuspend(C2515C.f34653a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f2086a
            switch(r0) {
                case 0: goto L4c;
                default: goto L5;
            }
        L5:
            kf.a r0 = kf.a.f39711a
            int r1 = r6.f2087b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            Fe.e.U(r7)
            goto L49
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            Rd.e r1 = r6.f2088c
            Fe.e.U(r7)
            goto L39
        L23:
            Fe.e.U(r7)
            Rd.e r1 = r6.f2088c
            java.lang.Object r7 = r6.f2089d
            java.lang.Object r4 = r1.f10601a
            r6.f2088c = r1
            r6.f2087b = r3
            tf.q r3 = r6.f2090e
            java.lang.Object r7 = r3.invoke(r4, r7, r6)
            if (r7 != r0) goto L39
            goto L4b
        L39:
            Md.c r7 = (Md.c) r7
            if (r7 == 0) goto L49
            r3 = 0
            r6.f2088c = r3
            r6.f2087b = r2
            java.lang.Object r7 = r1.e(r7, r6)
            if (r7 != r0) goto L49
            goto L4b
        L49:
            ef.C r0 = ef.C2515C.f34653a
        L4b:
            return r0
        L4c:
            kf.a r0 = kf.a.f39711a
            int r1 = r6.f2087b
            ef.C r2 = ef.C2515C.f34653a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L6d
            if (r1 == r4) goto L67
            if (r1 != r3) goto L5f
            Fe.e.U(r7)
        L5d:
            r0 = r2
            goto L98
        L5f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L67:
            Rd.e r1 = r6.f2088c
            Fe.e.U(r7)
            goto L88
        L6d:
            Fe.e.U(r7)
            Rd.e r1 = r6.f2088c
            java.lang.Object r7 = r6.f2089d
            boolean r5 = r7 instanceof Md.c
            if (r5 != 0) goto L79
            goto L5d
        L79:
            java.lang.Object r5 = r1.f10601a
            r6.f2088c = r1
            r6.f2087b = r4
            tf.q r4 = r6.f2090e
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r0) goto L88
            goto L98
        L88:
            Md.c r7 = (Md.c) r7
            if (r7 != 0) goto L8d
            goto L5d
        L8d:
            r4 = 0
            r6.f2088c = r4
            r6.f2087b = r3
            java.lang.Object r7 = r1.e(r7, r6)
            if (r7 != r0) goto L5d
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Cd.C0335c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
