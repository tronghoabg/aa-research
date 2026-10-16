package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class bjv {
    public static final bjv a;
    public static final bjv b;
    public static final bjv c;
    public static final bjv d;
    private static final /* synthetic */ bjv[] e;

    static {
        bjv bjvVar = new bjv("Up", 0);
        a = bjvVar;
        bjv bjvVar2 = new bjv("Drag", 1);
        b = bjvVar2;
        bjv bjvVar3 = new bjv("Timeout", 2);
        c = bjvVar3;
        bjv bjvVar4 = new bjv("Cancel", 3);
        d = bjvVar4;
        bjv[] bjvVarArr = {bjvVar, bjvVar2, bjvVar3, bjvVar4};
        e = bjvVarArr;
        affa.p(bjvVarArr);
    }

    public static bjv valueOf(String str) {
        return (bjv) Enum.valueOf(bjv.class, str);
    }

    public static bjv[] values() {
        return (bjv[]) e.clone();
    }
}
