package Kd;

import ef.C2515C;
import io.ktor.utils.io.X;
import io.ktor.utils.io.b0;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes5.dex */
public final class j extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f6756a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Qf.a f6758c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X f6759d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Qf.a aVar, X x5, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f6758c = aVar;
        this.f6759d = x5;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        j jVar = new j(this.f6758c, this.f6759d, interfaceC3103c);
        jVar.f6757b = obj;
        return jVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((b0) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r11.f(r10) == r0) goto L15;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r10.f6756a
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L20
            if (r1 == r2) goto L18
            if (r1 != r3) goto L10
            Fe.e.U(r11)
            goto L50
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            java.lang.Object r1 = r10.f6757b
            io.ktor.utils.io.b0 r1 = (io.ktor.utils.io.b0) r1
            Fe.e.U(r11)
            goto L42
        L20:
            Fe.e.U(r11)
            java.lang.Object r11 = r10.f6757b
            r1 = r11
            io.ktor.utils.io.b0 r1 = (io.ktor.utils.io.b0) r1
            io.ktor.utils.io.J r7 = r1.f37387a
            r10.f6757b = r1
            r10.f6756a = r2
            Qf.a r11 = Kd.o.f6782a
            io.ktor.utils.io.X r5 = r10.f6759d
            Qf.a r6 = r10.f6758c
            io.ktor.utils.io.q r4 = new io.ktor.utils.io.q
            r8 = 8193(0x2001, double:4.048E-320)
            r4.<init>(r5, r6, r7, r8)
            java.lang.Object r11 = r4.d(r2, r10)
            if (r11 != r0) goto L42
            goto L4f
        L42:
            io.ktor.utils.io.J r11 = r1.f37387a
            r1 = 0
            r10.f6757b = r1
            r10.f6756a = r3
            java.lang.Object r11 = r11.f(r10)
            if (r11 != r0) goto L50
        L4f:
            return r0
        L50:
            ef.C r11 = ef.C2515C.f34653a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Kd.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
