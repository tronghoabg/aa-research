package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rrs {
    public static final rrs a;
    public static final rrs b;
    public static final rrs c;
    public static final rrs d;
    public static final rrs e;
    public static final rrs f;
    public static final rrs g;
    public static final rrs h;
    public static final rrs i;
    private static final /* synthetic */ rrs[] j;

    static {
        rrs rrsVar = new rrs("UNKNOWN", 0);
        a = rrsVar;
        rrs rrsVar2 = new rrs("INVALID", 1);
        b = rrsVar2;
        rrs rrsVar3 = new rrs("ACCESSORY_ATTACHED", 2);
        c = rrsVar3;
        rrs rrsVar4 = new rrs("WIRELESS", 3);
        d = rrsVar4;
        rrs rrsVar5 = new rrs("WIRELESS_BRIDGE", 4);
        e = rrsVar5;
        rrs rrsVar6 = new rrs("CAR_SERVICE", 5);
        f = rrsVar6;
        rrs rrsVar7 = new rrs("RESTART", 6);
        g = rrsVar7;
        rrs rrsVar8 = new rrs("NEW_INTENT", 7);
        h = rrsVar8;
        rrs rrsVar9 = new rrs("FORCE_STARTED", 8);
        i = rrsVar9;
        j = new rrs[]{rrsVar, rrsVar2, rrsVar3, rrsVar4, rrsVar5, rrsVar6, rrsVar7, rrsVar8, rrsVar9};
    }

    public static rrs valueOf(String str) {
        return (rrs) Enum.valueOf(rrs.class, str);
    }

    public static rrs[] values() {
        return (rrs[]) j.clone();
    }
}
