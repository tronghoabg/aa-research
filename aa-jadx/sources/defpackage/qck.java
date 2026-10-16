package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qck {
    public static final defpackage.qck a;
    public static final defpackage.qck b;
    public static final defpackage.qck c;
    public static final defpackage.qck d;
    public static final defpackage.qck e;
    public static final defpackage.qck f;
    public static final defpackage.qck g;
    public static final defpackage.qck h;
    public static final defpackage.qck i;
    private static final /* synthetic */ defpackage.qck[] j;

    static {
        defpackage.qck qckVar = new defpackage.qck("CACHE_WRITE_FAILED", 0);
        a = qckVar;
        defpackage.qck qckVar2 = new defpackage.qck("CACHE_READ_FAILED", 1);
        b = qckVar2;
        defpackage.qck qckVar3 = new defpackage.qck("CACHE_CLEARED", 2);
        c = qckVar3;
        defpackage.qck qckVar4 = new defpackage.qck("PARSE_FAILED", 3);
        d = qckVar4;
        defpackage.qck qckVar5 = new defpackage.qck("SATISFIED_BY_OFFLINE", 4);
        e = qckVar5;
        defpackage.qck qckVar6 = new defpackage.qck("RESOURCE_UNAVAILABLE", 5);
        f = qckVar6;
        defpackage.qck qckVar7 = new defpackage.qck("RESOURCE_SERVER_ERROR", 6);
        g = qckVar7;
        defpackage.qck qckVar8 = new defpackage.qck("RESOURCE_FAILED", 7);
        h = qckVar8;
        defpackage.qck qckVar9 = new defpackage.qck("RESOURCE_OTHER", 8);
        i = qckVar9;
        j = new defpackage.qck[]{qckVar, qckVar2, qckVar3, qckVar4, qckVar5, qckVar6, qckVar7, qckVar8, qckVar9};
    }

    public static defpackage.qck valueOf(java.lang.String str) {
        return (defpackage.qck) java.lang.Enum.valueOf(defpackage.qck.class, str);
    }

    public static defpackage.qck[] values() {
        return (defpackage.qck[]) j.clone();
    }
}
