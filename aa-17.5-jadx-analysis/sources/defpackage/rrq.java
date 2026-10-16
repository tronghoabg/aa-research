package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class rrq {
    public static final rrq a;
    public static final rrq b;
    public static final rrq c;
    public static final rrq d;
    public static final rrq e;
    public static final rrq f;
    public static final rrq g;
    public static final rrq h;
    public static final rrq i;
    public static final rrq j;
    public static final rrq k;
    public static final rrq l;
    public static final rrq m;
    private static final /* synthetic */ rrq[] n;

    static {
        rrq rrqVar = new rrq("CREATE", 0);
        a = rrqVar;
        rrq rrqVar2 = new rrq("ALREADY_STARTED", 1);
        b = rrqVar2;
        rrq rrqVar3 = new rrq("DESTROY", 2);
        c = rrqVar3;
        rrq rrqVar4 = new rrq("SET_STATE_NOT_CONNECTED", 3);
        d = rrqVar4;
        rrq rrqVar5 = new rrq("SET_STATE_CONNECTING", 4);
        e = rrqVar5;
        rrq rrqVar6 = new rrq("SET_STATE_WAITING_FOR_PATCHER", 5);
        f = rrqVar6;
        rrq rrqVar7 = new rrq("SET_STATE_DISCOVERED", 6);
        g = rrqVar7;
        rrq rrqVar8 = new rrq("STATE_ALREADY_NOT_CONNECTED_IN_TEARDOWN", 7);
        h = rrqVar8;
        rrq rrqVar9 = new rrq("SECURITY_PATCHER_SUCCESS_SET_STATE_DISCOVERED", 8);
        i = rrqVar9;
        rrq rrqVar10 = new rrq("SECURITY_PATCHER_SUCCESS_STATE_NOT_WAITING_FOR_PATCHER", 9);
        j = rrqVar10;
        rrq rrqVar11 = new rrq("SECURITY_PATCHER_FAILURE", 10);
        k = rrqVar11;
        rrq rrqVar12 = new rrq("GEARHEAD_PROJECTION_ENABLED", 11);
        l = rrqVar12;
        rrq rrqVar13 = new rrq("GEARHEAD_PROJECTION_DISABLED", 12);
        m = rrqVar13;
        n = new rrq[]{rrqVar, rrqVar2, rrqVar3, rrqVar4, rrqVar5, rrqVar6, rrqVar7, rrqVar8, rrqVar9, rrqVar10, rrqVar11, rrqVar12, rrqVar13};
    }

    public static rrq valueOf(String str) {
        return (rrq) Enum.valueOf(rrq.class, str);
    }

    public static rrq[] values() {
        return (rrq[]) n.clone();
    }
}
