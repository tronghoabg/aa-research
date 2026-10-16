package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class qbm {
    public static final qbm a;
    public static final qbm b;
    public static final qbm c;
    public static final qbm d;
    public static final qbm e;
    public static final qbm f;
    public static final qbm g;
    public static final qbm h;
    public static final qbm i;
    private static final /* synthetic */ qbm[] j;

    static {
        qbm qbmVar = new qbm("CACHE_WRITE_FAILED", 0);
        a = qbmVar;
        qbm qbmVar2 = new qbm("CACHE_READ_FAILED", 1);
        b = qbmVar2;
        qbm qbmVar3 = new qbm("CACHE_CLEARED", 2);
        c = qbmVar3;
        qbm qbmVar4 = new qbm("PARSE_FAILED", 3);
        d = qbmVar4;
        qbm qbmVar5 = new qbm("SATISFIED_BY_OFFLINE", 4);
        e = qbmVar5;
        qbm qbmVar6 = new qbm("RESOURCE_UNAVAILABLE", 5);
        f = qbmVar6;
        qbm qbmVar7 = new qbm("RESOURCE_SERVER_ERROR", 6);
        g = qbmVar7;
        qbm qbmVar8 = new qbm("RESOURCE_FAILED", 7);
        h = qbmVar8;
        qbm qbmVar9 = new qbm("RESOURCE_OTHER", 8);
        i = qbmVar9;
        j = new qbm[]{qbmVar, qbmVar2, qbmVar3, qbmVar4, qbmVar5, qbmVar6, qbmVar7, qbmVar8, qbmVar9};
    }

    public static qbm valueOf(String str) {
        return (qbm) Enum.valueOf(qbm.class, str);
    }

    public static qbm[] values() {
        return (qbm[]) j.clone();
    }
}
