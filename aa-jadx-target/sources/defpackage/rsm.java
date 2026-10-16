package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rsm {
    public static final defpackage.rsm a;
    public static final defpackage.rsm b;
    public static final defpackage.rsm c;
    public static final defpackage.rsm d;
    public static final defpackage.rsm e;
    public static final defpackage.rsm f;
    public static final defpackage.rsm g;
    public static final defpackage.rsm h;
    public static final defpackage.rsm i;
    private static final /* synthetic */ defpackage.rsm[] j;

    static {
        defpackage.rsm rsmVar = new defpackage.rsm("UNKNOWN", 0);
        a = rsmVar;
        defpackage.rsm rsmVar2 = new defpackage.rsm("INVALID", 1);
        b = rsmVar2;
        defpackage.rsm rsmVar3 = new defpackage.rsm("ACCESSORY_ATTACHED", 2);
        c = rsmVar3;
        defpackage.rsm rsmVar4 = new defpackage.rsm("WIRELESS", 3);
        d = rsmVar4;
        defpackage.rsm rsmVar5 = new defpackage.rsm("WIRELESS_BRIDGE", 4);
        e = rsmVar5;
        defpackage.rsm rsmVar6 = new defpackage.rsm("CAR_SERVICE", 5);
        f = rsmVar6;
        defpackage.rsm rsmVar7 = new defpackage.rsm("RESTART", 6);
        g = rsmVar7;
        defpackage.rsm rsmVar8 = new defpackage.rsm("NEW_INTENT", 7);
        h = rsmVar8;
        defpackage.rsm rsmVar9 = new defpackage.rsm("FORCE_STARTED", 8);
        i = rsmVar9;
        j = new defpackage.rsm[]{rsmVar, rsmVar2, rsmVar3, rsmVar4, rsmVar5, rsmVar6, rsmVar7, rsmVar8, rsmVar9};
    }

    public static defpackage.rsm valueOf(java.lang.String str) {
        return (defpackage.rsm) java.lang.Enum.valueOf(defpackage.rsm.class, str);
    }

    public static defpackage.rsm[] values() {
        return (defpackage.rsm[]) j.clone();
    }
}
