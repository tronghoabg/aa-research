package defpackage;

import j$.util.Objects;
import java.util.List;

/* loaded from: classes3.dex */
public final class ulk implements ulp {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/network/paint/IndoorPaintRequestSettingsProvider");

    @Override // defpackage.ulp
    public final boolean a(List list, ulq ulqVar) {
        if (list.isEmpty()) {
            return true;
        }
        return Objects.equals(((ulq) list.get(0)).b.d, ulqVar.b.d);
    }

    @Override // defpackage.ulp
    public final void b(tzy tzyVar, abnr abnrVar) {
        if (tzyVar == null) {
            return;
        }
        String strF = tzyVar.b.f();
        int i = 0;
        while (true) {
            if (i >= ((abgj) abnrVar.b).d.size()) {
                i = -1;
                break;
            }
            int iJ = aclh.j(abnrVar.be(i).c);
            if (iJ != 0 && iJ == 3 && abnrVar.be(i).d.equals("indoor")) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            ((ynz) ((ynz) a.g()).ai((char) 9412)).u("Paint request template does not have Indoor AUX Layer.");
            return;
        }
        abnr abnrVar2 = (abnr) abnrVar.be(i).K();
        abnp abnpVarN = abgc.a.n();
        abnpVarN.t();
        abgc abgcVar = (abgc) abnpVarN.b;
        abgcVar.b |= 1;
        abgcVar.c = "lv";
        abnpVarN.t();
        abgc abgcVar2 = (abgc) abnpVarN.b;
        abgcVar2.b |= 2;
        abgcVar2.d = strF;
        abnrVar2.bk(abnpVarN);
        abnrVar.bh(i, (abgd) abnrVar2.q());
    }
}
