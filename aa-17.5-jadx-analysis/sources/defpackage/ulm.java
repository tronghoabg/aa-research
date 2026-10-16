package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ulm implements ulp {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/network/paint/MapsDirectionsRequestSettingsProvider");
    private final ukr b;

    public ulm(ukr ukrVar) {
        this.b = ukrVar;
    }

    @Override // defpackage.ulp
    public final boolean a(List list, ulq ulqVar) {
        return true;
    }

    @Override // defpackage.ulp
    public final void b(tzy tzyVar, abnr abnrVar) {
        int i = 0;
        while (true) {
            if (i >= ((abgj) abnrVar.b).d.size()) {
                break;
            }
            int iJ = aclh.j(abnrVar.be(i).c);
            if (iJ == 0 || iJ != 3 || !abnrVar.be(i).d.equals("directions")) {
                i++;
            } else if (i != -1) {
                aaie aaieVar = this.b.u;
                return;
            }
        }
        ((ynz) ((ynz) a.g()).ai((char) 9414)).u("Paint request template does not have maps directions AUX Layer.");
    }
}
