package q2;

import Q1.x;
import U1.C0850u;
import k2.H;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X2.j f44112b;

    public /* synthetic */ q(X2.j jVar, int i5, long j8) {
        this.f44111a = 1;
        this.f44112b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        X2.j jVar = this.f44112b;
        int i5 = this.f44111a;
        jVar.getClass();
        switch (i5) {
            case 0:
                int i10 = x.f9724a;
                V1.d dVar = ((U1.r) jVar.f16076c).f12116a.f12167r;
                dVar.L(dVar.K(), 1016, new V1.b(14));
                break;
            case 1:
                int i11 = x.f9724a;
                V1.d dVar2 = ((U1.r) jVar.f16076c).f12116a.f12167r;
                dVar2.L(dVar2.I((H) dVar2.f12902d.f1848e), 1018, new Uc.l(29));
                break;
            case 2:
                int i12 = x.f9724a;
                V1.d dVar3 = ((U1.r) jVar.f16076c).f12116a.f12167r;
                dVar3.L(dVar3.I((H) dVar3.f12902d.f1848e), 1021, new V1.b(4));
                break;
            case 3:
                int i13 = x.f9724a;
                V1.d dVar4 = ((U1.r) jVar.f16076c).f12116a.f12167r;
                dVar4.L(dVar4.K(), 1030, new Uc.l(19));
                break;
            case 4:
                int i14 = x.f9724a;
                C0850u c0850u = ((U1.r) jVar.f16076c).f12116a;
                c0850u.getClass();
                V1.d dVar5 = c0850u.f12167r;
                dVar5.L(dVar5.K(), 1015, new V1.b(10));
                break;
            default:
                int i15 = x.f9724a;
                V1.d dVar6 = ((U1.r) jVar.f16076c).f12116a.f12167r;
                dVar6.L(dVar6.K(), 1019, new Uc.l(28));
                break;
        }
    }

    public /* synthetic */ q(X2.j jVar, long j8, int i5) {
        this.f44111a = 2;
        this.f44112b = jVar;
    }

    public /* synthetic */ q(X2.j jVar, Object obj, int i5) {
        this.f44111a = i5;
        this.f44112b = jVar;
    }

    public /* synthetic */ q(X2.j jVar, String str, long j8, long j10) {
        this.f44111a = 0;
        this.f44112b = jVar;
    }
}
