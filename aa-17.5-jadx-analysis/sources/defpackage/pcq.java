package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pcq {
    public static final pcq a;
    public static final pcq b;
    public static final pcq c;
    public static final pcq d;
    private static final /* synthetic */ pcq[] e;

    static {
        pcq pcqVar = new pcq("BLUETOOTH_UNBONDED", 0);
        a = pcqVar;
        pcq pcqVar2 = new pcq("BLUETOOTH_DISCONNECTED", 1);
        b = pcqVar2;
        pcq pcqVar3 = new pcq("BLUETOOTH_CONNECTED_WITHOUT_PROFILE", 2);
        c = pcqVar3;
        pcq pcqVar4 = new pcq("BLUETOOTH_CONNECTED_WITH_PROFILE", 3);
        d = pcqVar4;
        pcq[] pcqVarArr = {pcqVar, pcqVar2, pcqVar3, pcqVar4};
        e = pcqVarArr;
        affa.p(pcqVarArr);
    }

    public static pcq valueOf(String str) {
        return (pcq) Enum.valueOf(pcq.class, str);
    }

    public static pcq[] values() {
        return (pcq[]) e.clone();
    }
}
