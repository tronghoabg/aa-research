package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes3.dex */
final class yrb extends yqr {
    private final String a;
    private final Level b;
    private final Set c;
    private final yqa d;
    private final int e;

    public yrb(String str, int i, Level level, Set set, yqa yqaVar) {
        super(str);
        this.a = "";
        this.e = 2;
        this.b = level;
        this.c = set;
        this.d = yqaVar;
    }

    @Override // defpackage.ypp
    public final void a(ypo ypoVar) {
        String strB = (String) ypoVar.c().d(ypi.a);
        if (strB == null) {
            strB = f();
        }
        if (strB == null) {
            strB = ypoVar.an().b();
            int iIndexOf = strB.indexOf(36, strB.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strB = strB.substring(0, iIndexOf);
            }
        }
        String strE = yrm.e(this.a, strB);
        yrc.c(ypoVar, strE.substring(0, Math.min(strE.length(), 23)), 2, this.b, this.c, this.d);
    }

    @Override // defpackage.ypp
    public final boolean b(Level level) {
        return true;
    }
}
