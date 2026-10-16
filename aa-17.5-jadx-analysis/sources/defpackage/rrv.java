package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated
/* loaded from: classes.dex */
public final class rrv {
    public static final rrv a;
    public static final rrv b;
    public static final rrv c;
    public static final rrv d;
    public static final rrv e;
    private static final /* synthetic */ rrv[] f;

    static {
        rrv rrvVar = new rrv("STARTED", 0);
        a = rrvVar;
        rrv rrvVar2 = new rrv("ENDED", 1);
        b = rrvVar2;
        rrv rrvVar3 = new rrv("CAR_PROCESS_STATE_CACHED", 2);
        c = rrvVar3;
        rrv rrvVar4 = new rrv("GEARHEAD_PROJECTION_PROCESS_STATE_CACHED", 3);
        d = rrvVar4;
        rrv rrvVar5 = new rrv("GEARHEAD_CAR_PROCESS_STATE_CACHED", 4);
        e = rrvVar5;
        f = new rrv[]{rrvVar, rrvVar2, rrvVar3, rrvVar4, rrvVar5};
    }

    public static rrv valueOf(String str) {
        return (rrv) Enum.valueOf(rrv.class, str);
    }

    public static rrv[] values() {
        return (rrv[]) f.clone();
    }
}
