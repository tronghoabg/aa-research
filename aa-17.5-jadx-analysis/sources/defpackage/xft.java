package defpackage;

import android.content.Context;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.Set;

/* loaded from: classes.dex */
public final class xft implements eqa {
    public static final yph a = yph.c("GH.SysChromeController");
    public final CarDisplayId b;
    public sab c;
    public boolean d;
    private final Set e;
    private final eqc f;

    public xft() {
        CarDisplayId carDisplayId = CarDisplayId.a;
        this.e = new yy(0);
        this.f = new eqc(this, true);
        this.d = false;
        this.b = carDisplayId;
    }

    public final void a() {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 10258)).u("removeChrome");
        if (this.c == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 10259)).u("Second removeChrome call will do nothing");
            return;
        }
        this.f.f(eps.c);
        yx yxVar = new yx((yy) this.e);
        while (yxVar.hasNext()) {
            this.c.i((rby) yxVar.next());
        }
        this.c = null;
        this.d = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(qrn qrnVar) {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 10262)).u("showChrome");
        if (this.c != null) {
            ((ype) ((ype) yphVar.h()).ai((char) 10264)).u("second showChrome call will do nothing.");
            return;
        }
        if (qrnVar == null) {
            this.c = (sab) kgq.c(new kiz(this, 10), "GH.SysChromeController", yzz.SYSTEM_CHROME, yzy.ve, true, "Unable to start system chrome", new Object[0]);
        } else {
            try {
                mki.a.g();
                this.c = ((raz) qrnVar).a.h(this.b);
            } catch (qrz | qsa e) {
                ((ype) ((ype) a.g()).ai((char) 10263)).u("Failed to show chrome outside of lifetime.");
                throw new IllegalStateException(e);
            }
        }
        this.f.f(eps.e);
        Context context = mki.a.c;
        yph yphVar2 = nsr.a;
        nso nsoVarA = ((nsr) mki.a.i(nsr.class)).a(this.b);
        leg legVar = leh.a;
        legVar.a();
        kru kruVar = ksa.a;
        kruVar.a().e.fE(this, new kkl(this, 9));
        if (legVar.a().b()) {
            kruVar.a().e.fE(this, new kkl(this, 10));
        }
        yfq yfqVarO = yfq.o(nsoVarA.l);
        int size = yfqVarO.size();
        for (int i = 0; i < size; i++) {
            nsf nsfVar = (nsf) yfqVarO.get(i);
            xfs xfsVar = new xfs(nsfVar, 0);
            this.e.add(xfsVar);
            this.c.f(xfsVar, "chrome", context, nsfVar.b, 0);
        }
        this.d = true;
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.f;
    }
}
