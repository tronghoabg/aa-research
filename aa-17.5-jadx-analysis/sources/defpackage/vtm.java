package defpackage;

/* loaded from: classes3.dex */
public final class vtm extends vmc {
    public vtm(vmb vmbVar, ajgu ajguVar) {
        super(vmbVar, ajguVar);
    }

    @Override // defpackage.vmc
    protected final String e() {
        return "";
    }

    @Override // defpackage.vmc
    protected final String g() {
        ajgu ajguVar = this.a;
        ajgr ajgrVar = ajguVar.A;
        if (ajgrVar == null) {
            ajgrVar = ajgr.a;
        }
        int iAs = a.as(ajgrVar.c);
        if (iAs == 0) {
            iAs = 1;
        }
        int i = iAs - 1;
        if (i == 1) {
            return "Primes Initialized";
        }
        if (i == 2) {
            return "Primes Crash Monitor Initialized";
        }
        if (i == 3) {
            return "Primes First Activity Launched";
        }
        ajgr ajgrVar2 = ajguVar.A;
        if (ajgrVar2 == null) {
            ajgrVar2 = ajgr.a;
        }
        int iAs2 = a.as(ajgrVar2.c);
        if (iAs2 == 0) {
            return "UNKNOWN";
        }
        switch (iAs2) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "PRIMES_INITIALIZED";
            case 3:
                return "PRIMES_CRASH_MONITORING_INITIALIZED";
            case 4:
                return "PRIMES_FIRST_ACTIVITY_LAUNCHED";
            case 5:
                return "PRIMES_CUSTOM_LAUNCHED";
            case 6:
                return "PRIMES_CRASH_LOOP_MONITOR_INITIALIZED";
            default:
                return "PRIMES_CRASH_LOOP_MONITOR_RECOVERED";
        }
    }

    @Override // defpackage.vmc
    protected final boolean h() {
        return (this.a.b & 8388608) != 0;
    }
}
