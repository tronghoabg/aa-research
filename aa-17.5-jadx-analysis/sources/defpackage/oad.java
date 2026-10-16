package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class oad {
    public static final oad a;
    public static final oad b;
    public static final oad c;
    public static final oad d;
    private static final /* synthetic */ oad[] e;

    static {
        oad oadVar = new oad("DO_NOT_DISTURB", 0);
        a = oadVar;
        oad oadVar2 = new oad("BADGE", 1);
        b = oadVar2;
        oad oadVar3 = new oad("AUTOMATION", 2);
        c = oadVar3;
        oad oadVar4 = new oad("HIDDEN", 3);
        d = oadVar4;
        oad[] oadVarArr = {oadVar, oadVar2, oadVar3, oadVar4};
        e = oadVarArr;
        affa.p(oadVarArr);
    }

    public static oad valueOf(String str) {
        return (oad) Enum.valueOf(oad.class, str);
    }

    public static oad[] values() {
        return (oad[]) e.clone();
    }
}
