package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pfu {
    public static final pfu a;
    public static final pfu b;
    private static final /* synthetic */ pfu[] c;

    static {
        pfu pfuVar = new pfu("WIFI_PROJECTION_PROTOCOL_CONNECTION", 0);
        a = pfuVar;
        pfu pfuVar2 = new pfu("SETUP_EVENT_MANAGER_INSTANCE", 1);
        b = pfuVar2;
        c = new pfu[]{pfuVar, pfuVar2};
    }

    public static pfu valueOf(String str) {
        return (pfu) Enum.valueOf(pfu.class, str);
    }

    public static pfu[] values() {
        return (pfu[]) c.clone();
    }
}
