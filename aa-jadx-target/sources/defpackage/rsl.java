package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rsl {
    public static final defpackage.rsl a;
    public static final defpackage.rsl b;
    private static final /* synthetic */ defpackage.rsl[] c;

    static {
        defpackage.rsl rslVar = new defpackage.rsl("CHARGE_ONLY_SHOWN", 0);
        a = rslVar;
        defpackage.rsl rslVar2 = new defpackage.rsl("CHARGE_ONLY_MORE_INFO_SELECTED", 1);
        b = rslVar2;
        c = new defpackage.rsl[]{rslVar, rslVar2};
    }

    public static defpackage.rsl valueOf(java.lang.String str) {
        return (defpackage.rsl) java.lang.Enum.valueOf(defpackage.rsl.class, str);
    }

    public static defpackage.rsl[] values() {
        return (defpackage.rsl[]) c.clone();
    }
}
