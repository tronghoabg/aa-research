package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class jeq {
    public static final jeq a;
    public static final jeq b;
    public static final jeq c;
    public static final jeq d;
    public static final jeq e;
    public static final jeq f;
    private static final /* synthetic */ jeq[] g;

    static {
        jeq jeqVar = new jeq("IDLE", 0);
        a = jeqVar;
        jeq jeqVar2 = new jeq("CONNECTING", 1);
        b = jeqVar2;
        jeq jeqVar3 = new jeq("CONNECTED", 2);
        c = jeqVar3;
        jeq jeqVar4 = new jeq("DISCONNECTING", 3);
        d = jeqVar4;
        jeq jeqVar5 = new jeq("DISCONNECTED", 4);
        e = jeqVar5;
        jeq jeqVar6 = new jeq("PREFLIGHT", 5);
        f = jeqVar6;
        g = new jeq[]{jeqVar, jeqVar2, jeqVar3, jeqVar4, jeqVar5, jeqVar6};
    }

    public static jeq valueOf(String str) {
        return (jeq) Enum.valueOf(jeq.class, str);
    }

    public static jeq[] values() {
        return (jeq[]) g.clone();
    }
}
