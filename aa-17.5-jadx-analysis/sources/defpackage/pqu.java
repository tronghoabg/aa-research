package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pqu {
    public static final pqu a;
    public static final pqu b;
    public static final pqu c;
    private static final /* synthetic */ pqu[] d;

    static {
        pqu pquVar = new pqu("UNKNOWN", 0);
        a = pquVar;
        pqu pquVar2 = new pqu("GWS", 1);
        b = pquVar2;
        pqu pquVar3 = new pqu("PHENOTYPE", 2);
        c = pquVar3;
        d = new pqu[]{pquVar, pquVar2, pquVar3};
    }

    public static pqu valueOf(String str) {
        return (pqu) Enum.valueOf(pqu.class, str);
    }

    public static pqu[] values() {
        return (pqu[]) d.clone();
    }
}
