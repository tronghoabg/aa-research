package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xgu implements defpackage.eqg {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.SysChromeController");
    public final com.google.android.gms.car.display.CarDisplayId b;
    public defpackage.sax c;
    public boolean d;
    private final java.util.Set e;
    private final defpackage.eqi f;

    public xgu() {
        com.google.android.gms.car.display.CarDisplayId carDisplayId = com.google.android.gms.car.display.CarDisplayId.a;
        this.e = new defpackage.zf(0);
        this.f = new defpackage.eqi(this, true);
        this.d = false;
        this.b = carDisplayId;
    }

    public final void a() {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 10286)).u("removeChrome");
        if (this.c == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 10287)).u("Second removeChrome call will do nothing");
            return;
        }
        this.f.f(defpackage.epx.c);
        defpackage.ze zeVar = new defpackage.ze((defpackage.zf) this.e);
        while (zeVar.hasNext()) {
            this.c.i((defpackage.rct) zeVar.next());
        }
        this.c = null;
        this.d = false;
    }

    public final void b(defpackage.qsh qshVar) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 10290)).u("showChrome");
        if (this.c != null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 10292)).u("second showChrome call will do nothing.");
            return;
        }
        if (qshVar == null) {
            this.c = (defpackage.sax) defpackage.kgu.c(new defpackage.kjf(this, 10), "GH.SysChromeController", defpackage.zbe.SYSTEM_CHROME, defpackage.zbd.vi, true, "Unable to start system chrome", new java.lang.Object[0]);
        } else {
            try {
                defpackage.mkp.a.g();
                this.c = ((defpackage.rbu) qshVar).a.h(this.b);
            } catch (defpackage.qst | defpackage.qsu e) {
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 10291)).u("Failed to show chrome outside of lifetime.");
                throw new java.lang.IllegalStateException(e);
            }
        }
        this.f.f(defpackage.epx.e);
        android.content.Context context = defpackage.mkp.a.c;
        defpackage.yqm yqmVar2 = defpackage.nte.a;
        defpackage.ntb ntbVarA = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).a(this.b);
        defpackage.lel lelVar = defpackage.lem.a;
        lelVar.a();
        defpackage.ksc kscVar = defpackage.ksi.a;
        kscVar.a().e.eM(this, new defpackage.kkr(this, 9));
        if (lelVar.a().b()) {
            kscVar.a().e.eM(this, new defpackage.kkr(this, 10));
        }
        defpackage.ygw ygwVarO = defpackage.ygw.o(ntbVarA.l);
        int size = ygwVarO.size();
        for (int i = 0; i < size; i++) {
            nss nssVar = (nss) ygwVarO.get(i);
            defpackage.rct xgtVar = new xgt(nssVar, 0);
            this.e.add(xgtVar);
            this.c.f(xgtVar, "chrome", context, nssVar.b, 0);
        }
        this.d = true;
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return this.f;
    }
}
