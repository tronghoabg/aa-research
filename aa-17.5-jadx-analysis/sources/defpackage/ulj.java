package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ulj implements ulp {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/network/paint/EvcsPaintRequestSettingsProvider");
    private final ukr b;

    public ulj(ukr ukrVar) {
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
            if (iJ == 0 || iJ != 3 || !abnrVar.be(i).d.equals("evcs")) {
                i++;
            } else if (i != -1) {
                ukr ukrVar = this.b;
                abrv abrvVar = ukrVar.r;
                Boolean bool = ukrVar.g;
                zjo zjoVar = ukrVar.i;
                return;
            }
        }
        ((ynz) a.a(uys.a).ai((char) 9411)).u("Paint request template does not have evcs Layer.");
    }
}
