package od;

import ne.C3618a;

/* loaded from: classes5.dex */
public final class F1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f41559b;

    public /* synthetic */ F1(a2 a2Var, int i5) {
        this.f41558a = i5;
        this.f41559b = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41558a) {
            case 0:
                B0 b02 = (B0) this.f41559b.f41915c;
                b02.f41519z = true;
                InterfaceC3724t interfaceC3724t = b02.f41514u;
                C3618a c3618a = b02.f41512s;
                interfaceC3724t.m((md.k0) c3618a.f41020a, (EnumC3721s) c3618a.f41021b, (md.b0) c3618a.f41022c);
                break;
            default:
                B0 b03 = (B0) this.f41559b.f41915c;
                if (!b03.f41519z) {
                    b03.f41514u.h();
                    break;
                }
                break;
        }
    }
}
