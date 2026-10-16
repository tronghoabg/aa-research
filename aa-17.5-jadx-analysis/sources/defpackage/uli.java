package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class uli implements ulp {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/network/paint/DestinationPaintRequestSettingsProvider");
    private final ukr b;

    public uli(ukr ukrVar) {
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
            if (iJ == 0 || iJ != 3 || !abnrVar.be(i).d.equals("destinations")) {
                i++;
            } else if (i != -1) {
                ukr ukrVar = this.b;
                zjo zjoVar = ukrVar.i;
                abrw abrwVar = ukrVar.t;
                return;
            }
        }
        ((ynz) a.a(uys.a).ai((char) 9410)).u("Paint request template does not have destinations Layer.");
    }
}
