package B;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class B extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Object f1351a;

    /* renamed from: b, reason: collision with root package name */
    public int f1352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N.V f1353c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D.i f1354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(D.i iVar, N.V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1353c = v2;
        this.f1354d = iVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new B(this.f1354d, this.f1353c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r2.a(r1, r6) == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r6.f1352b
            D.i r2 = r6.f1354d
            r3 = 2
            r4 = 1
            N.V r5 = r6.f1353c
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r6.f1351a
            D.a r0 = (D.a) r0
            Fe.e.U(r7)
            goto L5d
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            java.lang.Object r1 = r6.f1351a
            N.V r1 = (N.V) r1
            Fe.e.U(r7)
            goto L46
        L28:
            Fe.e.U(r7)
            java.lang.Object r7 = r5.getValue()
            D.a r7 = (D.a) r7
            if (r7 == 0) goto L4a
            D.b r1 = new D.b
            r1.<init>(r7)
            if (r2 == 0) goto L45
            r6.f1351a = r5
            r6.f1352b = r4
            java.lang.Object r7 = r2.a(r1, r6)
            if (r7 != r0) goto L45
            goto L5b
        L45:
            r1 = r5
        L46:
            r7 = 0
            r1.setValue(r7)
        L4a:
            D.a r7 = new D.a
            r7.<init>()
            if (r2 == 0) goto L5e
            r6.f1351a = r7
            r6.f1352b = r3
            java.lang.Object r1 = r2.a(r7, r6)
            if (r1 != r0) goto L5c
        L5b:
            return r0
        L5c:
            r0 = r7
        L5d:
            r7 = r0
        L5e:
            r5.setValue(r7)
            ef.C r7 = ef.C2515C.f34653a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: B.B.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
