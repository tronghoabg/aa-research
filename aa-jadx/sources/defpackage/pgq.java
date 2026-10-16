package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pgq {
    public static final defpackage.pgq a;
    public static final defpackage.pgq b;
    private static final /* synthetic */ defpackage.pgq[] c;

    static {
        defpackage.pgq pgqVar = new defpackage.pgq("WIFI_PROJECTION_PROTOCOL_CONNECTION", 0);
        a = pgqVar;
        defpackage.pgq pgqVar2 = new defpackage.pgq("SETUP_EVENT_MANAGER_INSTANCE", 1);
        b = pgqVar2;
        c = new defpackage.pgq[]{pgqVar, pgqVar2};
    }

    public static defpackage.pgq valueOf(java.lang.String str) {
        return (defpackage.pgq) java.lang.Enum.valueOf(defpackage.pgq.class, str);
    }

    public static defpackage.pgq[] values() {
        return (defpackage.pgq[]) c.clone();
    }
}
