package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gsn {
    public static final gsn a;
    public static final gsn b;
    public static final gsn c;
    public static final gsn d;
    public static final gsn e;
    public static final gsn f;
    public static final gsn g;
    public static final gsn h;
    public static final gsn i;
    public static final gsn j;
    public static final gsn k;
    public static final gsn l;
    private static final /* synthetic */ gsn[] m;

    static {
        gsn gsnVar = new gsn("ALPHA_JUMP_SHOW_KEYS", 0);
        a = gsnVar;
        gsn gsnVar2 = new gsn("ALPHA_JUMP_SELECT_KEY", 1);
        b = gsnVar2;
        gsn gsnVar3 = new gsn("SELECT_ITEM", 2);
        c = gsnVar3;
        gsn gsnVar4 = new gsn("SWITCH_TAB", 3);
        d = gsnVar4;
        gsn gsnVar5 = new gsn("PAGE_UP", 4);
        e = gsnVar5;
        gsn gsnVar6 = new gsn("PAGE_DOWN", 5);
        f = gsnVar6;
        gsn gsnVar7 = new gsn("BACK_PRESSED", 6);
        g = gsnVar7;
        gsn gsnVar8 = new gsn("OPEN_DRAWER", 7);
        h = gsnVar8;
        gsn gsnVar9 = new gsn("CLOSE_DRAWER", 8);
        i = gsnVar9;
        gsn gsnVar10 = new gsn("VEHICLE_PARKED", 9);
        j = gsnVar10;
        gsn gsnVar11 = new gsn("VEHICLE_DRIVING", 10);
        k = gsnVar11;
        gsn gsnVar12 = new gsn("VEHICLE_SPEED_UNKNOWN", 11);
        l = gsnVar12;
        gsn[] gsnVarArr = {gsnVar, gsnVar2, gsnVar3, gsnVar4, gsnVar5, gsnVar6, gsnVar7, gsnVar8, gsnVar9, gsnVar10, gsnVar11, gsnVar12};
        m = gsnVarArr;
        affa.p(gsnVarArr);
    }

    public static gsn valueOf(String str) {
        return (gsn) Enum.valueOf(gsn.class, str);
    }

    public static gsn[] values() {
        return (gsn[]) m.clone();
    }
}
