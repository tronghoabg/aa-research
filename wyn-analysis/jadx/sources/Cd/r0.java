package Cd;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class r0 extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2171a;

    /* renamed from: b, reason: collision with root package name */
    public int f2172b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Rd.e f2173c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf.q f2174d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(tf.q qVar, InterfaceC3103c interfaceC3103c, int i5) {
        super(3, interfaceC3103c);
        this.f2171a = i5;
        this.f2174d = qVar;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Rd.e eVar = (Rd.e) obj;
        switch (this.f2171a) {
            case 0:
                r0 r0Var = new r0(this.f2174d, (InterfaceC3103c) obj3, 0);
                r0Var.f2173c = eVar;
                return r0Var.invokeSuspend(C2515C.f34653a);
            case 1:
                r0 r0Var2 = new r0(this.f2174d, (InterfaceC3103c) obj3, 1);
                r0Var2.f2173c = eVar;
                return r0Var2.invokeSuspend(C2515C.f34653a);
            default:
                r0 r0Var3 = new r0(this.f2174d, (InterfaceC3103c) obj3, 2);
                r0Var3.f2173c = eVar;
                return r0Var3.invokeSuspend(C2515C.f34653a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r14 == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cc, code lost:
    
        if (r14 == r6) goto L59;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cd.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
