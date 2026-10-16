package Hf;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class J extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5047a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0602l f5049c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC3471j f5050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(InterfaceC0602l interfaceC0602l, tf.q qVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5049c = interfaceC0602l;
        this.f5050d = (AbstractC3471j) qVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [lf.j, tf.q] */
    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        J j8 = new J(this.f5049c, this.f5050d, interfaceC3103c);
        j8.f5048b = obj;
        return j8;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((InterfaceC0603m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Type inference failed for: r4v0, types: [lf.j, tf.q] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r5.f5047a
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r5.f5048b
            Hf.I r0 = (Hf.I) r0
            Fe.e.U(r6)     // Catch: If.C0620a -> L11
            goto L43
        L11:
            r6 = move-exception
            goto L38
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            Fe.e.U(r6)
            java.lang.Object r6 = r5.f5048b
            Hf.m r6 = (Hf.InterfaceC0603m) r6
            Hf.l r1 = r5.f5049c
            Hf.I r3 = new Hf.I
            lf.j r4 = r5.f5050d
            r3.<init>(r4, r6)
            r5.f5048b = r3     // Catch: If.C0620a -> L36
            r5.f5047a = r2     // Catch: If.C0620a -> L36
            java.lang.Object r6 = r1.collect(r3, r5)     // Catch: If.C0620a -> L36
            if (r6 != r0) goto L43
            return r0
        L36:
            r6 = move-exception
            r0 = r3
        L38:
            java.lang.Object r1 = r6.f5458a
            if (r1 != r0) goto L46
            jf.h r6 = r5.getContext()
            Ef.H.p(r6)
        L43:
            ef.C r6 = ef.C2515C.f34653a
            return r6
        L46:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.J.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
