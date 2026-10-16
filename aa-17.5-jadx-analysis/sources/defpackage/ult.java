package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ult implements ulp {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/network/paint/SearchResultsPaintRequestSettingsProvider");
    private final ukr b;

    public ult(ukr ukrVar) {
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
            if (iJ != 0 && iJ == 3) {
                String str = abnrVar.be(i).d;
                if (str.equals("categorical-search") || str.equals("categorical-search-results-injection") || str.equals("hotel-categorical-search") || str.equals("hotel-categorical-search-injection") || str.equals("spotlit")) {
                    if (i != -1) {
                        zjj zjjVar = this.b.b;
                        return;
                    }
                    ((ynz) ((ynz) a.g()).ai((char) 9422)).u("Paint request template does not have search results AUX Layer.");
                }
            }
        }
        ((ynz) ((ynz) a.g()).ai((char) 9422)).u("Paint request template does not have search results AUX Layer.");
    }
}
