package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class mko {
    public static final defpackage.mko a;
    public static final defpackage.mko b;
    public static final defpackage.mko c;
    private static final /* synthetic */ defpackage.mko[] d;

    static {
        defpackage.mko mkoVar = new defpackage.mko("COMMON", 0);
        a = mkoVar;
        defpackage.mko mkoVar2 = new defpackage.mko("LITE", 1);
        b = mkoVar2;
        defpackage.mko mkoVar3 = new defpackage.mko("CROSS_PROFILE", 2);
        c = mkoVar3;
        d = new defpackage.mko[]{mkoVar, mkoVar2, mkoVar3};
    }

    public static defpackage.mko valueOf(java.lang.String str) {
        return (defpackage.mko) java.lang.Enum.valueOf(defpackage.mko.class, str);
    }

    public static defpackage.mko[] values() {
        return (defpackage.mko[]) d.clone();
    }
}
