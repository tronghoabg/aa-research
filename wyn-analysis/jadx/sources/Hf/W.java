package Hf;

import If.AbstractC0621b;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class W extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f5090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0602l f5091c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0621b f5092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public W(o0 o0Var, InterfaceC0602l interfaceC0602l, InterfaceC0590b0 interfaceC0590b0, Object obj, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5090b = o0Var;
        this.f5091c = interfaceC0602l;
        this.f5092d = (AbstractC0621b) interfaceC0590b0;
        this.f5093e = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Hf.b0, If.b] */
    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new W(this.f5090b, this.f5091c, this.f5092d, this.f5093e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((W) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r6.collect(r2, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r6.collect(r2, r8) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (Hf.k0.k(r9, r1, r8) == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Hf.b0, Hf.m, If.b] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r8.f5089a
            If.b r2 = r8.f5092d
            r3 = 4
            r4 = 3
            r5 = 1
            Hf.l r6 = r8.f5091c
            r7 = 2
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r7) goto L1f
            if (r1 == r4) goto L23
            if (r1 != r3) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            Fe.e.U(r9)
            goto L50
        L23:
            Fe.e.U(r9)
            goto L75
        L27:
            Fe.e.U(r9)
            Hf.p0 r9 = Hf.n0.f5168a
            Hf.o0 r1 = r8.f5090b
            if (r1 != r9) goto L39
            r8.f5089a = r5
            java.lang.Object r9 = r6.collect(r2, r8)
            if (r9 != r0) goto L75
            goto L74
        L39:
            Hf.p0 r9 = Hf.n0.f5169b
            r5 = 0
            if (r1 != r9) goto L59
            If.E r9 = r2.h()
            Hf.U r1 = new Hf.U
            r1.<init>(r7, r5)
            r8.f5089a = r7
            java.lang.Object r9 = Hf.k0.p(r9, r1, r8)
            if (r9 != r0) goto L50
            goto L74
        L50:
            r8.f5089a = r4
            java.lang.Object r9 = r6.collect(r2, r8)
            if (r9 != r0) goto L75
            goto L74
        L59:
            If.E r9 = r2.h()
            Hf.l r9 = r1.a(r9)
            Hf.l r9 = Hf.k0.m(r9)
            Hf.V r1 = new Hf.V
            java.lang.Object r4 = r8.f5093e
            r1.<init>(r6, r2, r4, r5)
            r8.f5089a = r3
            java.lang.Object r9 = Hf.k0.k(r9, r1, r8)
            if (r9 != r0) goto L75
        L74:
            return r0
        L75:
            ef.C r9 = ef.C2515C.f34653a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.W.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
