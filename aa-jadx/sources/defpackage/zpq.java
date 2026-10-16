package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zpq {
    public static final defpackage.zpq a;
    public static final defpackage.zpq b;
    public static final defpackage.zpq c;
    public static final defpackage.zpq d;
    private static final /* synthetic */ defpackage.zpq[] e;

    static {
        defpackage.zpq zpqVar = new defpackage.zpq("POSSIBLE", 0);
        a = zpqVar;
        defpackage.zpq zpqVar2 = new defpackage.zpq("VALID", 1);
        b = zpqVar2;
        defpackage.zpq zpqVar3 = new defpackage.zpq("STRICT_GROUPING", 2);
        c = zpqVar3;
        defpackage.zpq zpqVar4 = new defpackage.zpq("EXACT_GROUPING", 3);
        d = zpqVar4;
        e = new defpackage.zpq[]{zpqVar, zpqVar2, zpqVar3, zpqVar4};
    }

    public static defpackage.zpq valueOf(java.lang.String str) {
        return (defpackage.zpq) java.lang.Enum.valueOf(defpackage.zpq.class, str);
    }

    public static defpackage.zpq[] values() {
        return (defpackage.zpq[]) e.clone();
    }
}
