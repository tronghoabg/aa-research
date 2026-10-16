package U1;

import N1.C0764m;
import N1.C0765n;

/* renamed from: U1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0847q implements Q1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12114a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N1.Y f12115b;

    public /* synthetic */ C0847q(N1.Y y10) {
        this.f12115b = y10;
    }

    @Override // Q1.g
    public final void invoke(Object obj) {
        switch (this.f12114a) {
            case 0:
                ((N1.H) obj).p(this.f12115b);
                break;
            default:
                V1.i iVar = (V1.i) obj;
                E4.n nVar = iVar.f12938o;
                N1.Y y10 = this.f12115b;
                if (nVar != null) {
                    C0765n c0765n = (C0765n) nVar.f2939c;
                    if (c0765n.f8240v == -1) {
                        C0764m c0764mA = c0765n.a();
                        c0764mA.f8201t = y10.f8126a;
                        c0764mA.f8202u = y10.f8127b;
                        C0765n c0765n2 = new C0765n(c0764mA);
                        iVar.f12938o = new E4.n((String) nVar.f2940d, nVar.f2938b, 4, c0765n2);
                    }
                }
                int i5 = y10.f8126a;
                break;
        }
    }

    public /* synthetic */ C0847q(V1.a aVar, N1.Y y10) {
        this.f12115b = y10;
    }
}
