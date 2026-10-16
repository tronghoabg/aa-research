package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class eyk {
    public final eyl a;
    public final ezf b;
    public final List c;
    public final fbp d;
    public fbl e;
    public final fah f;

    public eyk(eyl eylVar, afec afecVar, afeg afegVar) {
        this.a = eylVar;
        this.b = new eyy();
        this.c = eylVar.d;
        eyl eylVar2 = new eyl(eylVar.a, eylVar.b, eylVar.c, eylVar.q, woy.bZ(eylVar.d, new eyz(new ewm(this, 7))), eylVar.e, eylVar.p, eylVar.f, eylVar.g, eylVar.h, eylVar.i, eylVar.j, eylVar.k, eylVar.l, eylVar.m);
        eylVar2.n = eylVar.n;
        eylVar2.o = eylVar.o;
        fbp fbpVar = (fbp) afecVar.invoke(eylVar2);
        this.d = fbpVar;
        erb erbVar = new erb(fbpVar);
        String str = eylVar.b;
        this.f = new fah(erbVar, str == null ? ":memory:" : str, afegVar);
        b();
    }

    private final void b() {
        fbp fbpVar = this.d;
        if (fbpVar != null) {
            fbpVar.d(this.a.p == 3);
        }
    }

    public final void a(fca fcaVar) {
        dan.j(fcaVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        dan.j(fcaVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.b.b + "')");
    }

    public eyk(eyl eylVar, ezf ezfVar, afeg afegVar) {
        this.a = eylVar;
        this.b = ezfVar;
        this.c = eylVar.d;
        fbp fbpVarA = eylVar.c.a(dsq.g(eylVar.a, eylVar.b, new fbm(this, ezfVar.a), false, false));
        this.d = fbpVarA;
        erb erbVar = new erb(fbpVarA);
        String str = eylVar.b;
        this.f = new fah(erbVar, str == null ? ":memory:" : str, afegVar);
        b();
    }
}
