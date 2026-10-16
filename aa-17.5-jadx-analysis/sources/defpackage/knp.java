package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class knp {
    public static final knp a;
    public static final knp b;
    public static final knp c;
    public static final knp d;
    public static final knp e;
    public static final knp f;
    public static final knp g;
    public static final knp h;
    public static final knp i;
    public static final knp j;
    public static final knp k;
    public static final knp l;
    public static final knp m;
    public static final knp n;
    public static final knp o;
    public static final knp p;
    private static final /* synthetic */ knp[] q;

    static {
        knp knpVar = new knp("RFCOMM_CONNECTING", 0);
        a = knpVar;
        knp knpVar2 = new knp("RFCOMM_CONNECTED", 1);
        b = knpVar2;
        knp knpVar3 = new knp("RECONNECTION_PREVENTED", 2);
        c = knpVar3;
        knp knpVar4 = new knp("BT_HFP_A2DP_CONNECTED", 3);
        d = knpVar4;
        knp knpVar5 = new knp("BT_HFP_A2DP_DISCONNECTED", 4);
        e = knpVar5;
        knp knpVar6 = new knp("VERSION_CHECK_SUCCEEDED", 5);
        f = knpVar6;
        knp knpVar7 = new knp("VERSION_CHECK_FAILED", 6);
        g = knpVar7;
        knp knpVar8 = new knp("WIFI_PROJECTION_REQUESTED", 7);
        h = knpVar8;
        knp knpVar9 = new knp("WIFI_CONNECTING", 8);
        i = knpVar9;
        knp knpVar10 = new knp("WIFI_CONNECTED", 9);
        j = knpVar10;
        knp knpVar11 = new knp("WIFI_DISCONNECTED", 10);
        k = knpVar11;
        knp knpVar12 = new knp("PROJECTION_INITIALIZING", 11);
        l = knpVar12;
        knp knpVar13 = new knp("PROJECTION_STARTED", 12);
        m = knpVar13;
        knp knpVar14 = new knp("PROJECTION_ENDED", 13);
        n = knpVar14;
        knp knpVar15 = new knp("IDLE_STATE_ENTERED", 14);
        o = knpVar15;
        knp knpVar16 = new knp("SHUTTING_DOWN", 15);
        p = knpVar16;
        q = new knp[]{knpVar, knpVar2, knpVar3, knpVar4, knpVar5, knpVar6, knpVar7, knpVar8, knpVar9, knpVar10, knpVar11, knpVar12, knpVar13, knpVar14, knpVar15, knpVar16};
    }

    public static knp valueOf(String str) {
        return (knp) Enum.valueOf(knp.class, str);
    }

    public static knp[] values() {
        return (knp[]) q.clone();
    }
}
