package ea;

import ef.C2515C;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import lf.AbstractC3471j;

/* renamed from: ea.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2498m extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f34563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2499n f34564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3108h f34565c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ V f34566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2498m(C2499n c2499n, InterfaceC3108h interfaceC3108h, V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f34564b = c2499n;
        this.f34565c = interfaceC3108h;
        this.f34566d = v2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2498m(this.f34564b, this.f34565c, this.f34566d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2498m) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r10.b(r9) == r0) goto L25;
     */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.C2498m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
