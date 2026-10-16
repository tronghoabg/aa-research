package N;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: N.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0737m0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public S8.b f7814a;

    /* renamed from: b, reason: collision with root package name */
    public int f7815b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7816c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f7817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0741o0 f7818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Q f7819f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0737m0(p0 p0Var, C0741o0 c0741o0, Q q4, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7817d = p0Var;
        this.f7818e = c0741o0;
        this.f7819f = q4;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C0737m0 c0737m0 = new C0737m0(this.f7817d, this.f7818e, this.f7819f, interfaceC3103c);
        c0737m0.f7816c = obj;
        return c0737m0;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0737m0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0737m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
