package N;

import ef.C2515C;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class F0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7685a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3108h f7687c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Hf.v0 f7688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(InterfaceC3108h interfaceC3108h, Hf.v0 v0Var, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7687c = interfaceC3108h;
        this.f7688d = v0Var;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        F0 f02 = new F0(this.f7687c, this.f7688d, interfaceC3103c);
        f02.f7686b = obj;
        return f02;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((F0) create((C0721e0) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r5.collect(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (Ef.H.P(r4, r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        return r0;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r6.f7685a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L15:
            Fe.e.U(r7)
            goto L4a
        L19:
            Fe.e.U(r7)
            java.lang.Object r7 = r6.f7686b
            N.e0 r7 = (N.C0721e0) r7
            jf.i r1 = jf.C3109i.f38759a
            jf.h r4 = r6.f7687c
            boolean r1 = kotlin.jvm.internal.AbstractC3340k.a(r4, r1)
            Hf.v0 r5 = r6.f7688d
            if (r1 == 0) goto L3b
            G1.a r1 = new G1.a
            r2 = 2
            r1.<init>(r7, r2)
            r6.f7685a = r3
            java.lang.Object r7 = r5.collect(r1, r6)
            if (r7 != r0) goto L4a
            goto L49
        L3b:
            N.E0 r1 = new N.E0
            r3 = 0
            r1.<init>(r5, r7, r3)
            r6.f7685a = r2
            java.lang.Object r7 = Ef.H.P(r4, r1, r6)
            if (r7 != r0) goto L4a
        L49:
            return r0
        L4a:
            ef.C r7 = ef.C2515C.f34653a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: N.F0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
