package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class pgw {
    public static final defpackage.pgw a;
    public static final defpackage.pgw b;
    private static final /* synthetic */ defpackage.pgw[] c;

    static {
        defpackage.pgw pgwVar = new defpackage.pgw("UNKNOWN", 0);
        a = pgwVar;
        defpackage.pgw pgwVar2 = new defpackage.pgw("FRX_REQUIRED", 1);
        b = pgwVar2;
        c = new defpackage.pgw[]{pgwVar, pgwVar2};
    }

    public static defpackage.pgw valueOf(java.lang.String str) {
        return (defpackage.pgw) java.lang.Enum.valueOf(defpackage.pgw.class, str);
    }

    public static defpackage.pgw[] values() {
        return (defpackage.pgw[]) c.clone();
    }
}
