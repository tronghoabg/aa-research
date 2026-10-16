package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zxs {
    public static final defpackage.zxs a;
    public static final defpackage.zxs b;
    public static final defpackage.zxs c;
    private static final /* synthetic */ defpackage.zxs[] d;

    static {
        defpackage.zxs zxsVar = new defpackage.zxs("TIER_UNSPECIFIED", 0);
        a = zxsVar;
        defpackage.zxs zxsVar2 = new defpackage.zxs("TIER_BASIC", 1);
        b = zxsVar2;
        defpackage.zxs zxsVar3 = new defpackage.zxs("TIER_PREMIUM", 2);
        c = zxsVar3;
        d = new defpackage.zxs[]{zxsVar, zxsVar2, zxsVar3};
    }

    public static defpackage.zxs valueOf(java.lang.String str) {
        return (defpackage.zxs) java.lang.Enum.valueOf(defpackage.zxs.class, str);
    }

    public static defpackage.zxs[] values() {
        return (defpackage.zxs[]) d.clone();
    }
}
