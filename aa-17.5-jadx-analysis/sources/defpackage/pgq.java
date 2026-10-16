package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class pgq {
    public static final pgq a;
    public static final pgq b;
    public static final pgq c;
    private static final /* synthetic */ pgq[] d;

    static {
        pgq pgqVar = new pgq("STOPPED", 0);
        a = pgqVar;
        pgq pgqVar2 = new pgq("TCP_STARTED", 1);
        b = pgqVar2;
        pgq pgqVar3 = new pgq("RFCOMM_STARTED", 2);
        c = pgqVar3;
        d = new pgq[]{pgqVar, pgqVar2, pgqVar3};
    }

    public static pgq valueOf(String str) {
        return (pgq) Enum.valueOf(pgq.class, str);
    }

    public static pgq[] values() {
        return (pgq[]) d.clone();
    }
}
