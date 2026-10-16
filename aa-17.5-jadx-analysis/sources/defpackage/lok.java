package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lok {
    public static final lok a;
    public static final lok b;
    public static final lok c;
    public static final lok d;
    public static final lok e;
    public static final lok f;
    private static final /* synthetic */ lok[] g;

    static {
        lok lokVar = new lok("CONNECTING", 0);
        a = lokVar;
        lok lokVar2 = new lok("CONNECTED", 1);
        b = lokVar2;
        lok lokVar3 = new lok("FAILED_TO_CONNECT", 2);
        c = lokVar3;
        lok lokVar4 = new lok("SUSPENDED", 3);
        d = lokVar4;
        lok lokVar5 = new lok("RECONNECTING", 4);
        e = lokVar5;
        lok lokVar6 = new lok("DISCONNECTED_OUT_OF_CONNECTION_LIFECYCLE", 5);
        f = lokVar6;
        g = new lok[]{lokVar, lokVar2, lokVar3, lokVar4, lokVar5, lokVar6};
    }

    public static lok valueOf(String str) {
        return (lok) Enum.valueOf(lok.class, str);
    }

    public static lok[] values() {
        return (lok[]) g.clone();
    }
}
