package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nsv {
    public static final nsv a;
    public static final nsv b;
    public static final nsv c;
    public static final nsv d;
    public static final nsv e;
    public static final nsv f;
    public static final nsv g;
    public static final nsv h;
    private static final /* synthetic */ nsv[] i;

    static {
        nsv nsvVar = new nsv("CANONICAL", 0);
        a = nsvVar;
        nsv nsvVar2 = new nsv("CLUSTER", 1);
        b = nsvVar2;
        nsv nsvVar3 = new nsv("CLUSTER_WITH_LAUNCHER", 2);
        c = nsvVar3;
        nsv nsvVar4 = new nsv("AUXILIARY", 3);
        d = nsvVar4;
        nsv nsvVar5 = new nsv("WIDESCREEN", 4);
        e = nsvVar5;
        nsv nsvVar6 = new nsv("PORTRAIT", 5);
        f = nsvVar6;
        nsv nsvVar7 = new nsv("PORTRAIT_SHORT", 6);
        g = nsvVar7;
        nsv nsvVar8 = new nsv("PORTRAIT_NARROW", 7);
        h = nsvVar8;
        i = new nsv[]{nsvVar, nsvVar2, nsvVar3, nsvVar4, nsvVar5, nsvVar6, nsvVar7, nsvVar8};
    }

    public static nsv valueOf(String str) {
        return (nsv) Enum.valueOf(nsv.class, str);
    }

    public static nsv[] values() {
        return (nsv[]) i.clone();
    }
}
