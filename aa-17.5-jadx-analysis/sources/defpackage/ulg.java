package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ulg implements ulp {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/network/paint/ContextualPaintRequestSettingsProvider");
    private final ukr b;
    private final String c;

    public ulg(ukr ukrVar, String str) {
        this.b = ukrVar;
        this.c = str;
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
            if (iJ != 0 && iJ == 3) {
                if (abnrVar.be(i).d.equals(this.c)) {
                    if (i != -1) {
                        ukr ukrVar = this.b;
                        yfq yfqVar = ukrVar.d;
                        zkh zkhVar = ukrVar.f;
                        Boolean bool = ukrVar.g;
                        yfq yfqVar2 = ukrVar.h;
                        zjo zjoVar = ukrVar.i;
                        abrv abrvVar = ukrVar.r;
                        yfq yfqVar3 = ukrVar.s;
                        abrw abrwVar = ukrVar.t;
                        return;
                    }
                }
            }
            i++;
        }
        ((ynz) a.a(uys.a).ai((char) 9409)).u("Paint request template does not have search results AUX Layer.");
    }
}
