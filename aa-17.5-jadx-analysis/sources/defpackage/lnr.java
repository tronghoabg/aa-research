package defpackage;

import android.os.Bundle;
import j$.util.Map;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class lnr implements loj {
    public static final yph a = yph.c("GH.MediaActiveBrowsConn");
    public final ljx b;
    public final llu c;
    private final lok d;
    private final Map e = new HashMap();

    public lnr(lok lokVar, ljx ljxVar, llu lluVar) {
        this.d = lokVar;
        this.b = ljxVar;
        this.c = lluVar;
    }

    public final Bundle a() {
        llu lluVar = this.c;
        if (lluVar.s()) {
            return lluVar.n();
        }
        ((ype) ((ype) ((ype) a.g()).q(ypd.LARGE)).ai((char) 4081)).u("getExtras called outside active connection lifetime");
        return Bundle.EMPTY;
    }

    public final eqj b(String str) {
        return (eqj) Map.EL.computeIfAbsent(this.e, str, new gjm(this, 16));
    }

    public final eqj c() {
        llu lluVar = this.c;
        if (lluVar.s()) {
            return b(lluVar.o());
        }
        ((ype) ((ype) ((ype) a.g()).q(ypd.LARGE)).ai((char) 4080)).u("fetchRootSubscription called outside active connection lifetime");
        lpb lpbVarB = lpb.b(4);
        afco afcoVar = tby.a;
        return new eqm(lpbVarB);
    }

    @Override // defpackage.los
    public final ljx d() {
        return this.b;
    }

    @Override // defpackage.los
    public final lok e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lnr)) {
            return false;
        }
        lnr lnrVar = (lnr) obj;
        return Objects.equals(this.d, lnrVar.d) && Objects.equals(this.b, lnrVar.b) && Objects.equals(this.c, lnrVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.b, this.c);
    }

    public final String toString() {
        return String.format("%s{connectionStatus=%s, packageInfo=%s}", getClass().getSimpleName(), this.d, this.b);
    }
}
