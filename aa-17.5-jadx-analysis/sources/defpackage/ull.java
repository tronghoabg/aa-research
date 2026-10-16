package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ull implements ulp {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/network/paint/MapActionsPaintRequestSettingsProvider");
    private final ukr b;

    public ull(ukr ukrVar) {
        this.b = ukrVar;
    }

    @Override // defpackage.ulp
    public final boolean a(List list, ulq ulqVar) {
        return true;
    }

    @Override // defpackage.ulp
    public final void b(tzy tzyVar, abnr abnrVar) {
        for (int i = 0; i < ((abgj) abnrVar.b).d.size(); i++) {
            int iJ = aclh.j(abnrVar.be(i).c);
            if (iJ != 0 && iJ == 3 && abnrVar.be(i).d.equals("map-actions")) {
                aazx aazxVar = this.b.v;
                return;
            }
        }
        ((ynz) ((ynz) a.g()).ai((char) 9413)).u("Paint request template does not have map-actions AUX Layer.");
    }
}
