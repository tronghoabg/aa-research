package od;

import java.io.InputStream;
import java.util.logging.Logger;
import md.AbstractC3537e;
import me.C3558a;

/* renamed from: od.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3707n extends T3.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42016c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3558a f42017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f42018e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3707n(C3558a c3558a, md.b0 b0Var) {
        super(((C3716q) c3558a.f40738c).f42065f, 1);
        this.f42017d = c3558a;
        this.f42018e = b0Var;
    }

    @Override // T3.d
    public final void c() {
        switch (this.f42016c) {
            case 0:
                C3558a c3558a = this.f42017d;
                Xd.b.c();
                try {
                    Xd.c cVar = ((C3716q) c3558a.f40738c).f42061b;
                    Xd.b.a();
                    Xd.b.f16226a.getClass();
                    if (((md.k0) c3558a.f40737b) == null) {
                        try {
                            ((AbstractC3537e) c3558a.f40736a).k((md.b0) this.f42018e);
                        } catch (Throwable th) {
                            md.k0 k0VarH = md.k0.f40675f.g(th).h("Failed to read headers");
                            c3558a.f40737b = k0VarH;
                            ((C3716q) c3558a.f40738c).f42069j.g(k0VarH);
                        }
                    }
                    Xd.b.f16226a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        Xd.b.f16226a.getClass();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                Xd.b.c();
                try {
                    Xd.c cVar2 = ((C3716q) this.f42017d.f40738c).f42061b;
                    Xd.b.a();
                    Xd.a aVar = Xd.b.f16226a;
                    aVar.getClass();
                    e();
                    aVar.getClass();
                    return;
                } catch (Throwable th4) {
                    try {
                        Xd.b.f16226a.getClass();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
        }
    }

    public void e() {
        C3558a c3558a = this.f42017d;
        md.k0 k0Var = (md.k0) c3558a.f40737b;
        C3716q c3716q = (C3716q) c3558a.f40738c;
        L4.g gVar = (L4.g) this.f42018e;
        if (k0Var != null) {
            Logger logger = AbstractC3669a0.f41885a;
            while (true) {
                InputStream inputStreamA = gVar.a();
                if (inputStreamA == null) {
                    return;
                } else {
                    AbstractC3669a0.b(inputStreamA);
                }
            }
        } else {
            while (true) {
                try {
                    InputStream inputStreamA2 = gVar.a();
                    if (inputStreamA2 == null) {
                        return;
                    }
                    try {
                        ((AbstractC3537e) c3558a.f40736a).l(c3716q.f42060a.e(inputStreamA2));
                        inputStreamA2.close();
                    } catch (Throwable th) {
                        AbstractC3669a0.b(inputStreamA2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Logger logger2 = AbstractC3669a0.f41885a;
                    while (true) {
                        InputStream inputStreamA3 = gVar.a();
                        if (inputStreamA3 == null) {
                            md.k0 k0VarH = md.k0.f40675f.g(th2).h("Failed to read message.");
                            c3558a.f40737b = k0VarH;
                            c3716q.f42069j.g(k0VarH);
                            return;
                        }
                        AbstractC3669a0.b(inputStreamA3);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3707n(C3558a c3558a, L4.g gVar) {
        super(((C3716q) c3558a.f40738c).f42065f, 1);
        this.f42017d = c3558a;
        this.f42018e = gVar;
    }
}
