package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rwa {
    public static final rwa a;
    public static final rwa b;
    public static final rwa c;
    public static final rwa d;
    public static final rwa e;
    private static final /* synthetic */ rwa[] f;

    static {
        rwa rwaVar = new rwa("IDLE", 0);
        a = rwaVar;
        rwa rwaVar2 = new rwa("CONNECTING", 1);
        b = rwaVar2;
        rwa rwaVar3 = new rwa("CONNECTED", 2);
        c = rwaVar3;
        rwa rwaVar4 = new rwa("DISCONNECTING", 3);
        d = rwaVar4;
        rwa rwaVar5 = new rwa("DISCONNECTED", 4);
        e = rwaVar5;
        f = new rwa[]{rwaVar, rwaVar2, rwaVar3, rwaVar4, rwaVar5};
    }

    public static rwa valueOf(String str) {
        return (rwa) Enum.valueOf(rwa.class, str);
    }

    public static rwa[] values() {
        return (rwa[]) f.clone();
    }
}
