package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pgv {
    public static final defpackage.pgv a;
    public static final defpackage.pgv b;
    public static final defpackage.pgv c;
    private static final /* synthetic */ defpackage.pgv[] d;

    static {
        defpackage.pgv pgvVar = new defpackage.pgv("PENDING", 0);
        a = pgvVar;
        defpackage.pgv pgvVar2 = new defpackage.pgv("CONNECTED", 1);
        b = pgvVar2;
        defpackage.pgv pgvVar3 = new defpackage.pgv("DISCONNECTED", 2);
        c = pgvVar3;
        d = new defpackage.pgv[]{pgvVar, pgvVar2, pgvVar3};
    }

    public static defpackage.pgv valueOf(java.lang.String str) {
        return (defpackage.pgv) java.lang.Enum.valueOf(defpackage.pgv.class, str);
    }

    public static defpackage.pgv[] values() {
        return (defpackage.pgv[]) d.clone();
    }
}
