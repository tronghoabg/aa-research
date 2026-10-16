package G1;

import Ef.E;
import Hf.v0;
import N.C0721e0;
import ef.C2515C;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes.dex */
public final class c extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f4145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3108h f4146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f4147c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0721e0 f4148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC3108h interfaceC3108h, v0 v0Var, C0721e0 c0721e0, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f4146b = interfaceC3108h;
        this.f4147c = v0Var;
        this.f4148d = c0721e0;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new c(this.f4146b, this.f4147c, this.f4148d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5.collect(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (Ef.H.P(r1, r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
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
            int r1 = r6.f4145a
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
            goto L48
        L19:
            Fe.e.U(r7)
            jf.i r7 = jf.C3109i.f38759a
            jf.h r1 = r6.f4146b
            boolean r7 = kotlin.jvm.internal.AbstractC3340k.a(r1, r7)
            N.e0 r4 = r6.f4148d
            Hf.v0 r5 = r6.f4147c
            if (r7 == 0) goto L39
            G1.a r7 = new G1.a
            r1 = 0
            r7.<init>(r4, r1)
            r6.f4145a = r3
            java.lang.Object r7 = r5.collect(r7, r6)
            if (r7 != r0) goto L48
            goto L47
        L39:
            G1.b r7 = new G1.b
            r3 = 0
            r7.<init>(r5, r4, r3)
            r6.f4145a = r2
            java.lang.Object r7 = Ef.H.P(r1, r7, r6)
            if (r7 != r0) goto L48
        L47:
            return r0
        L48:
            ef.C r7 = ef.C2515C.f34653a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
