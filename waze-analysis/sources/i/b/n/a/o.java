package i.b.n.a;

import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class o extends dm<ac, o> implements ad {
    /* synthetic */ o(byte[] bArr) {
        super(ac.DEFAULT_INSTANCE);
    }

    public final void a(n nVar) {
        copyOnWrite();
        ((ac) this.instance).setBrandFilter(nVar);
    }

    public final void b(p pVar) {
        copyOnWrite();
        ((ac) this.instance).setCategoryFilter(pVar.build());
    }

    public final void c(String str) {
        copyOnWrite();
        ((ac) this.instance).setCategoryGroupId(str);
    }

    public final void d(s sVar) {
        copyOnWrite();
        ((ac) this.instance).setEvConnectorTypeFilter(sVar);
    }

    public final void e(u uVar) {
        copyOnWrite();
        ((ac) this.instance).setEvcsNetworkFilter(uVar);
    }

    public final void f(float f2) {
        copyOnWrite();
        ((ac) this.instance).setMinChargePowerKwFilter(f2);
    }

    public final void g(double d2) {
        copyOnWrite();
        ((ac) this.instance).setMinRatingFilter(d2);
    }

    public final void h() {
        copyOnWrite();
        ((ac) this.instance).setOpenNowFilter(true);
    }

    public final void i(x xVar) {
        copyOnWrite();
        ((ac) this.instance).setPriceLevelFilter(xVar);
    }

    public final void j(z zVar) {
        copyOnWrite();
        ((ac) this.instance).setProductFilter(zVar);
    }

    public final void k(String str) {
        copyOnWrite();
        ((ac) this.instance).setQuery(str);
    }

    public final void l(ab abVar) {
        copyOnWrite();
        ((ac) this.instance).setServiceFilter(abVar);
    }

    private o() {
        throw null;
    }
}
