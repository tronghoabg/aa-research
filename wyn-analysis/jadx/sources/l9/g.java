package L9;

import He.m;
import bf.AbstractC1531f;

/* loaded from: classes4.dex */
public final class g implements A9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7051a;

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f7051a) {
            case 0:
                m mVar = AbstractC1531f.f19477a;
                Fe.b.l(mVar);
                return mVar;
            case 1:
                m mVar2 = AbstractC1531f.f19478b;
                Fe.b.l(mVar2);
                return mVar2;
            case 2:
                Ie.e eVar = Ie.b.f5444a;
                if (eVar != null) {
                    return eVar;
                }
                throw new NullPointerException("scheduler == null");
            case 3:
                return new M9.a();
            default:
                return new Xd.c(23);
        }
    }

    public /* synthetic */ g(Object obj, int i5) {
        this.f7051a = i5;
    }
}
