package od;

import Va.X7;
import md.AbstractC3537e;
import me.C3558a;

/* renamed from: od.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3710o extends T3.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ md.k0 f42023c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ md.b0 f42024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3558a f42025e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3710o(C3558a c3558a, md.k0 k0Var, md.b0 b0Var) {
        super(((C3716q) c3558a.f40738c).f42065f, 1);
        this.f42025e = c3558a;
        this.f42023c = k0Var;
        this.f42024d = b0Var;
    }

    @Override // T3.d
    public final void c() {
        Xd.b.c();
        try {
            Xd.c cVar = ((C3716q) this.f42025e.f40738c).f42061b;
            Xd.b.a();
            Xd.a aVar = Xd.b.f16226a;
            aVar.getClass();
            e();
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

    public final void e() {
        md.k0 k0Var = this.f42023c;
        md.b0 b0Var = this.f42024d;
        md.k0 k0Var2 = (md.k0) this.f42025e.f40737b;
        if (k0Var2 != null) {
            b0Var = new md.b0();
            k0Var = k0Var2;
        }
        ((C3716q) this.f42025e.f40738c).k = true;
        try {
            C3558a c3558a = this.f42025e;
            C3716q c3716q = (C3716q) c3558a.f40738c;
            AbstractC3537e abstractC3537e = (AbstractC3537e) c3558a.f40736a;
            c3716q.getClass();
            abstractC3537e.i(k0Var, b0Var);
            ((C3716q) this.f42025e.f40738c).g();
            X7 x72 = ((C3716q) this.f42025e.f40738c).f42064e;
            if (k0Var.f()) {
                ((InterfaceC3734w0) x72.f13843c).a();
            } else {
                ((InterfaceC3734w0) x72.f13844d).a();
            }
        } catch (Throwable th) {
            ((C3716q) this.f42025e.f40738c).g();
            X7 x73 = ((C3716q) this.f42025e.f40738c).f42064e;
            if (k0Var.f()) {
                ((InterfaceC3734w0) x73.f13843c).a();
            } else {
                ((InterfaceC3734w0) x73.f13844d).a();
            }
            throw th;
        }
    }
}
