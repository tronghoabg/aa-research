package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class pgm {
    public static final pgm a;
    public static final pgm b;
    public static final pgm c;
    private static final /* synthetic */ pgm[] d;

    static {
        pgm pgmVar = new pgm("DISCONNECTED", 0);
        a = pgmVar;
        pgm pgmVar2 = new pgm("REQUESTED", 1);
        b = pgmVar2;
        pgm pgmVar3 = new pgm("CONNECTED", 2);
        c = pgmVar3;
        d = new pgm[]{pgmVar, pgmVar2, pgmVar3};
    }

    public static pgm valueOf(String str) {
        return (pgm) Enum.valueOf(pgm.class, str);
    }

    public static pgm[] values() {
        return (pgm[]) d.clone();
    }

    final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        throw new RuntimeException(null, null);
    }
}
