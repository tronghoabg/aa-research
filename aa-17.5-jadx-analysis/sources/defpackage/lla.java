package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class lla {
    public static final lla a;
    public static final lla b;
    private static final /* synthetic */ lla[] c;

    static {
        lla llaVar = new lla("LIST", 0);
        a = llaVar;
        lla llaVar2 = new lla("GRID", 1);
        b = llaVar2;
        lla[] llaVarArr = {llaVar, llaVar2};
        c = llaVarArr;
        affa.p(llaVarArr);
    }

    public static lla valueOf(String str) {
        return (lla) Enum.valueOf(lla.class, str);
    }

    public static lla[] values() {
        return (lla[]) c.clone();
    }
}
