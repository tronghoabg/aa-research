package zg;

import okhttp3.Call;

/* renamed from: zg.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4675n extends AbstractC4678q {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4666e f48630d;

    public C4675n(P p10, Call.Factory factory, InterfaceC4671j interfaceC4671j, InterfaceC4666e interfaceC4666e) {
        super(p10, factory, interfaceC4671j);
        this.f48630d = interfaceC4666e;
    }

    @Override // zg.AbstractC4678q
    public final Object b(C4683w c4683w, Object[] objArr) {
        return this.f48630d.e(c4683w);
    }
}
