package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rsk {
    public static final defpackage.rsk a;
    public static final defpackage.rsk b;
    public static final defpackage.rsk c;
    public static final defpackage.rsk d;
    public static final defpackage.rsk e;
    public static final defpackage.rsk f;
    public static final defpackage.rsk g;
    public static final defpackage.rsk h;
    public static final defpackage.rsk i;
    public static final defpackage.rsk j;
    public static final defpackage.rsk k;
    public static final defpackage.rsk l;
    public static final defpackage.rsk m;
    private static final /* synthetic */ defpackage.rsk[] n;

    static {
        defpackage.rsk rskVar = new defpackage.rsk("CREATE", 0);
        a = rskVar;
        defpackage.rsk rskVar2 = new defpackage.rsk("ALREADY_STARTED", 1);
        b = rskVar2;
        defpackage.rsk rskVar3 = new defpackage.rsk("DESTROY", 2);
        c = rskVar3;
        defpackage.rsk rskVar4 = new defpackage.rsk("SET_STATE_NOT_CONNECTED", 3);
        d = rskVar4;
        defpackage.rsk rskVar5 = new defpackage.rsk("SET_STATE_CONNECTING", 4);
        e = rskVar5;
        defpackage.rsk rskVar6 = new defpackage.rsk("SET_STATE_WAITING_FOR_PATCHER", 5);
        f = rskVar6;
        defpackage.rsk rskVar7 = new defpackage.rsk("SET_STATE_DISCOVERED", 6);
        g = rskVar7;
        defpackage.rsk rskVar8 = new defpackage.rsk("STATE_ALREADY_NOT_CONNECTED_IN_TEARDOWN", 7);
        h = rskVar8;
        defpackage.rsk rskVar9 = new defpackage.rsk("SECURITY_PATCHER_SUCCESS_SET_STATE_DISCOVERED", 8);
        i = rskVar9;
        defpackage.rsk rskVar10 = new defpackage.rsk("SECURITY_PATCHER_SUCCESS_STATE_NOT_WAITING_FOR_PATCHER", 9);
        j = rskVar10;
        defpackage.rsk rskVar11 = new defpackage.rsk("SECURITY_PATCHER_FAILURE", 10);
        k = rskVar11;
        defpackage.rsk rskVar12 = new defpackage.rsk("GEARHEAD_PROJECTION_ENABLED", 11);
        l = rskVar12;
        defpackage.rsk rskVar13 = new defpackage.rsk("GEARHEAD_PROJECTION_DISABLED", 12);
        m = rskVar13;
        n = new defpackage.rsk[]{rskVar, rskVar2, rskVar3, rskVar4, rskVar5, rskVar6, rskVar7, rskVar8, rskVar9, rskVar10, rskVar11, rskVar12, rskVar13};
    }

    public static defpackage.rsk valueOf(java.lang.String str) {
        return (defpackage.rsk) java.lang.Enum.valueOf(defpackage.rsk.class, str);
    }

    public static defpackage.rsk[] values() {
        return (defpackage.rsk[]) n.clone();
    }
}
