package defpackage;

import androidx.car.app.model.Alert;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ajyn implements ajuo {
    private final ajza a;
    private final ajyv b;
    private final ajys c;

    public ajyn(String[] strArr, boolean z) {
        this.a = new ajza(z, new ajyy(5), new ajyg(), new ajyy(3), new ajyy(4), new ajyf(0), new ajyh(), new ajyf(1), new ajyy(0), new ajyy(2));
        this.b = new ajyv(z, new ajyx(), new ajyg(), new ajyy(1), new ajyf(0), new ajyh(), new ajyf(1));
        ajuh[] ajuhVarArr = new ajuh[5];
        ajuhVarArr[0] = new ajyd();
        ajuhVarArr[1] = new ajyg();
        ajuhVarArr[2] = new ajyh();
        ajuhVarArr[3] = new ajyf(1);
        ajuhVarArr[4] = new ajye(strArr != null ? (String[]) strArr.clone() : new String[]{"EEE, dd-MMM-yy HH:mm:ss z"});
        this.c = new ajys(ajuhVarArr);
    }

    @Override // defpackage.ajuo
    public final int a() {
        return 1;
    }

    @Override // defpackage.ajuo
    public final List b(List list) {
        Iterator it = list.iterator();
        boolean z = true;
        int iA = Alert.DURATION_SHOW_INDEFINITELY;
        while (it.hasNext()) {
            ajui ajuiVar = (ajui) it.next();
            z &= ajuiVar instanceof ajyb;
            if (ajuiVar.a() < iA) {
                iA = ajuiVar.a();
            }
        }
        return iA > 0 ? z ? this.a.b(list) : this.b.b(list) : this.c.b(list);
    }

    @Override // defpackage.ajuo
    public final List c(ajoy ajoyVar, ajul ajulVar) throws ajut, ajpr {
        akbh akbhVar;
        akao akaoVar;
        ahgm.e(ajoyVar, "Header");
        ajzy[] ajzyVarArrA = ajoyVar.a();
        boolean z = false;
        boolean z2 = false;
        for (ajzy ajzyVar : ajzyVarArrA) {
            z2 |= !(ajzyVar.c("version") == null);
            z |= true ^ (ajzyVar.c("expires") == null);
        }
        if (!z && z2) {
            return "Set-Cookie2".equals(ajoyVar.b()) ? this.a.j(ajzyVarArrA, ajulVar) : this.b.j(ajzyVarArrA, ajulVar);
        }
        boolean z3 = ajoyVar instanceof akak;
        ajyr ajyrVar = ajyr.a;
        if (z3) {
            akak akakVar = (akak) ajoyVar;
            akbhVar = akakVar.a;
            akaoVar = new akao(akakVar.b, akbhVar.b);
        } else {
            String strC = ajoyVar.c();
            if (strC == null) {
                throw new ajut("Header value is null");
            }
            akbhVar = new akbh(strC.length());
            akbhVar.f(strC);
            akaoVar = new akao(0, akbhVar.b);
        }
        return this.c.j(new ajzy[]{ajyrVar.a(akbhVar, akaoVar)}, ajulVar);
    }

    @Override // defpackage.ajuo
    public final ajoy d() {
        return null;
    }

    @Override // defpackage.ajuo
    public final void e(ajui ajuiVar, ajul ajulVar) throws ajut {
        ahgm.e(ajuiVar, "Cookie");
        if (ajuiVar.a() <= 0) {
            this.c.e(ajuiVar, ajulVar);
        } else if (ajuiVar instanceof ajyb) {
            this.a.e(ajuiVar, ajulVar);
        } else {
            this.b.e(ajuiVar, ajulVar);
        }
    }

    @Override // defpackage.ajuo
    public final boolean f(ajui ajuiVar, ajul ajulVar) {
        ahgm.e(ajuiVar, "Cookie");
        return ajuiVar.a() > 0 ? ajuiVar instanceof ajyb ? this.a.f(ajuiVar, ajulVar) : this.b.f(ajuiVar, ajulVar) : this.c.f(ajuiVar, ajulVar);
    }

    public String toString() {
        return "default";
    }
}
