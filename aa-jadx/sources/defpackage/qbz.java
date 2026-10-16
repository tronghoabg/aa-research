package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class qbz {
    public static final defpackage.qbz a;
    public static final defpackage.qbz b;
    private static final /* synthetic */ defpackage.qbz[] c;

    static {
        defpackage.qbz qbzVar = new defpackage.qbz("LOWEST", 0);
        a = qbzVar;
        defpackage.qbz qbzVar2 = new defpackage.qbz("HIGH", 1);
        b = qbzVar2;
        c = new defpackage.qbz[]{qbzVar, qbzVar2};
    }

    public static defpackage.qbz valueOf(java.lang.String str) {
        return (defpackage.qbz) java.lang.Enum.valueOf(defpackage.qbz.class, str);
    }

    public static defpackage.qbz[] values() {
        return (defpackage.qbz[]) c.clone();
    }
}
