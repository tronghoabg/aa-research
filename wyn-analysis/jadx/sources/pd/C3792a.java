package pd;

import cg.C1618g;

/* renamed from: pd.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3792a extends T3.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f43463c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f43464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3792a(c cVar, int i5) {
        super(cVar, 2);
        this.f43463c = i5;
        switch (i5) {
            case 1:
                this.f43464d = cVar;
                super(cVar, 2);
                Xd.b.b();
                break;
            default:
                this.f43464d = cVar;
                Xd.b.b();
                break;
        }
    }

    private final void e() {
        c cVar;
        int i5;
        C1618g c1618g = new C1618g();
        Xd.b.c();
        try {
            Xd.a aVar = Xd.b.f16226a;
            aVar.getClass();
            synchronized (this.f43464d.f43467a) {
                C1618g c1618g2 = this.f43464d.f43468b;
                c1618g.E(c1618g2, c1618g2.d());
                cVar = this.f43464d;
                cVar.f43472f = false;
                i5 = cVar.f43478m;
            }
            cVar.f43475i.E(c1618g, c1618g.f19902b);
            synchronized (this.f43464d.f43467a) {
                this.f43464d.f43478m -= i5;
            }
            aVar.getClass();
        } catch (Throwable th) {
            try {
                Xd.b.f16226a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // T3.d
    public final void b() {
        c cVar;
        switch (this.f43463c) {
            case 0:
                e();
                return;
            default:
                C1618g c1618g = new C1618g();
                Xd.b.c();
                try {
                    Xd.a aVar = Xd.b.f16226a;
                    aVar.getClass();
                    synchronized (this.f43464d.f43467a) {
                        C1618g c1618g2 = this.f43464d.f43468b;
                        c1618g.E(c1618g2, c1618g2.f19902b);
                        cVar = this.f43464d;
                        cVar.f43473g = false;
                    }
                    cVar.f43475i.E(c1618g, c1618g.f19902b);
                    this.f43464d.f43475i.flush();
                    aVar.getClass();
                    return;
                } catch (Throwable th) {
                    try {
                        Xd.b.f16226a.getClass();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }
}
