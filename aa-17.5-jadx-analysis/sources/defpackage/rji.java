package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rji {
    public static final rji a;
    public static final rji b;
    public static final rji c;
    public static final rji d;
    private static final /* synthetic */ rji[] e;

    static {
        rji rjiVar = new rji("MAIN", 0);
        a = rjiVar;
        rji rjiVar2 = new rji("CLUSTER", 1);
        b = rjiVar2;
        rji rjiVar3 = new rji("AUXILIARY", 2);
        c = rjiVar3;
        rji rjiVar4 = new rji("UNKNOWN", 3);
        d = rjiVar4;
        e = new rji[]{rjiVar, rjiVar2, rjiVar3, rjiVar4};
    }

    public static rji a(int i) {
        return i >= values().length ? d : values()[i];
    }

    public static rji valueOf(String str) {
        return (rji) Enum.valueOf(rji.class, str);
    }

    public static rji[] values() {
        return (rji[]) e.clone();
    }
}
