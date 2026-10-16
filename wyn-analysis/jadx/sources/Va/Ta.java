package Va;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class Ta extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13723c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180va f13724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Xa f13725e;

    public /* synthetic */ Ta(Xa xa2, InterfaceC1180va interfaceC1180va, int i5) {
        this.f13723c = i5;
        this.f13725e = xa2;
        this.f13724d = interfaceC1180va;
    }

    @Override // Va.Ba
    public final void c() {
        switch (this.f13723c) {
            case 0:
                Xa xa2 = this.f13725e;
                HashMap map = (HashMap) xa2.f13858c;
                C1169v c1169v = new C1169v(18);
                c1169v.f14690d = this;
                map.put(this.f13724d, c1169v);
                Xa.k(xa2);
                break;
            default:
                ((HashMap) this.f13725e.f13858c).remove(this.f13724d);
                break;
        }
    }
}
