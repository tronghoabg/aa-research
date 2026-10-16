package defpackage;

import j$.time.Duration;

/* loaded from: classes.dex */
public final class lix {
    static final Duration a = Duration.ofMillis(500);
    public final eqj b = new lin();
    private eqj c;

    public static lix b() {
        return (lix) mki.a.b(lix.class, new jqw(20));
    }

    public final eqj a() {
        eqj eqjVar = this.c;
        if (eqjVar != null) {
            return eqjVar;
        }
        eqj eqjVar2 = this.b;
        Duration duration = a;
        afco afcoVar = tby.a;
        duration.getClass();
        eqj eqjVarA = tby.A(eqjVar2, duration, new ooh(10));
        this.c = eqjVarA;
        return eqjVarA;
    }
}
