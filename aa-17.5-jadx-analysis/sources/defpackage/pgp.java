package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class pgp {
    public static final pgp a;
    public static final pgp b;
    public static final pgp c;
    private static final /* synthetic */ pgp[] d;

    static {
        pgp pgpVar = new pgp("NOT_REQUESTED", 0);
        a = pgpVar;
        pgp pgpVar2 = new pgp("REQUESTED", 1);
        b = pgpVar2;
        pgp pgpVar3 = new pgp("RECEIVED", 2);
        c = pgpVar3;
        d = new pgp[]{pgpVar, pgpVar2, pgpVar3};
    }

    public static pgp valueOf(String str) {
        return (pgp) Enum.valueOf(pgp.class, str);
    }

    public static pgp[] values() {
        return (pgp[]) d.clone();
    }
}
