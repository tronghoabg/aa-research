package zg;

import Ef.C0502n;
import ac.C1346a;
import jf.InterfaceC3103c;
import okhttp3.Call;

/* renamed from: zg.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4677p extends AbstractC4678q {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4666e f48632d;

    public C4677p(P p10, Call.Factory factory, InterfaceC4671j interfaceC4671j, InterfaceC4666e interfaceC4666e) {
        super(p10, factory, interfaceC4671j);
        this.f48632d = interfaceC4666e;
    }

    @Override // zg.AbstractC4678q
    public final Object b(C4683w c4683w, Object[] objArr) {
        InterfaceC4664c interfaceC4664c = (InterfaceC4664c) this.f48632d.e(c4683w);
        InterfaceC3103c interfaceC3103c = (InterfaceC3103c) objArr[objArr.length - 1];
        try {
            C0502n c0502n = new C0502n(1, A6.h.A(interfaceC3103c));
            c0502n.v(new C4679s(interfaceC4664c, 1));
            interfaceC4664c.i(new C1346a(c0502n, 28));
            Object objS = c0502n.s();
            kf.a aVar = kf.a.f39711a;
            return objS;
        } catch (Exception e7) {
            return a0.n(e7, interfaceC3103c);
        }
    }
}
