package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class uof {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/TileThrottler");
    public final Map b = new HashMap();
    private final tmb c;
    private final abgl d;

    public uof(tmb tmbVar, abgl abglVar) {
        this.c = tmbVar;
        this.d = abglVar;
    }

    public final void a(ukp ukpVar) {
        Map map = this.b;
        if (map.containsKey(ukpVar)) {
            return;
        }
        map.put(ukpVar, new uoe(this.c, this.d));
    }

    public final void b(ukp ukpVar) {
        this.b.remove(ukpVar);
    }

    public final boolean c(ukp ukpVar) {
        uoe uoeVar = (uoe) this.b.get(ukpVar);
        if (uoeVar == null) {
            return true;
        }
        tmb tmbVar = uoeVar.a;
        if (tmbVar.f().toEpochMilli() < uoeVar.d) {
            ((ynz) ((ynz) a.d()).ai(9493)).L("Request for %s tile throttled. Will be OK in %d ms", uoeVar.b.name(), uoeVar.d - tmbVar.f().toEpochMilli());
            return false;
        }
        double d = uoeVar.c;
        double dRandom = Math.random() * 0.9d;
        TimeUnit timeUnit = TimeUnit.DAYS;
        uoeVar.c = Math.min(86400000L, (long) (d * (dRandom + 1.1d)));
        uoeVar.d = tmbVar.f().toEpochMilli() + uoeVar.c;
        ((ynz) ((ynz) a.d()).ai(9494)).L("Request for %s tile allowed. If fails, will back off for %d ms", uoeVar.b.name(), uoeVar.c);
        return true;
    }
}
