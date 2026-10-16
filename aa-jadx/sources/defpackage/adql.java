package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class adql {
    public static final defpackage.adql a;
    public static final defpackage.adql b;
    public static final defpackage.adql c;
    public static final defpackage.adql d;
    public static final defpackage.adql e;
    public static final defpackage.adql f;
    private static final /* synthetic */ defpackage.adql[] g;

    static {
        defpackage.adql adqlVar = new defpackage.adql("UNINITIALIZED", 0);
        a = adqlVar;
        defpackage.adql adqlVar2 = new defpackage.adql("INITIALIZED", 1);
        b = adqlVar2;
        defpackage.adql adqlVar3 = new defpackage.adql("PREFIX_DELIVERED", 2);
        c = adqlVar3;
        defpackage.adql adqlVar4 = new defpackage.adql("ALL_MESSAGES_DELIVERED", 3);
        d = adqlVar4;
        defpackage.adql adqlVar5 = new defpackage.adql("SUFFIX_DELIVERED", 4);
        e = adqlVar5;
        defpackage.adql adqlVar6 = new defpackage.adql("CLOSED", 5);
        f = adqlVar6;
        g = new defpackage.adql[]{adqlVar, adqlVar2, adqlVar3, adqlVar4, adqlVar5, adqlVar6};
    }

    public static defpackage.adql valueOf(java.lang.String str) {
        return (defpackage.adql) java.lang.Enum.valueOf(defpackage.adql.class, str);
    }

    public static defpackage.adql[] values() {
        return (defpackage.adql[]) g.clone();
    }
}
