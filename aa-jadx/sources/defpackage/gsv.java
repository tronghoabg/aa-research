package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class gsv {
    public static final defpackage.gsv a;
    public static final defpackage.gsv b;
    public static final defpackage.gsv c;
    public static final defpackage.gsv d;
    public static final defpackage.gsv e;
    public static final defpackage.gsv f;
    public static final defpackage.gsv g;
    public static final defpackage.gsv h;
    public static final defpackage.gsv i;
    public static final defpackage.gsv j;
    public static final defpackage.gsv k;
    public static final defpackage.gsv l;
    private static final /* synthetic */ defpackage.gsv[] m;

    static {
        defpackage.gsv gsvVar = new defpackage.gsv("ALPHA_JUMP_SHOW_KEYS", 0);
        a = gsvVar;
        defpackage.gsv gsvVar2 = new defpackage.gsv("ALPHA_JUMP_SELECT_KEY", 1);
        b = gsvVar2;
        defpackage.gsv gsvVar3 = new defpackage.gsv("SELECT_ITEM", 2);
        c = gsvVar3;
        defpackage.gsv gsvVar4 = new defpackage.gsv("SWITCH_TAB", 3);
        d = gsvVar4;
        defpackage.gsv gsvVar5 = new defpackage.gsv("PAGE_UP", 4);
        e = gsvVar5;
        defpackage.gsv gsvVar6 = new defpackage.gsv("PAGE_DOWN", 5);
        f = gsvVar6;
        defpackage.gsv gsvVar7 = new defpackage.gsv("BACK_PRESSED", 6);
        g = gsvVar7;
        defpackage.gsv gsvVar8 = new defpackage.gsv("OPEN_DRAWER", 7);
        h = gsvVar8;
        defpackage.gsv gsvVar9 = new defpackage.gsv("CLOSE_DRAWER", 8);
        i = gsvVar9;
        defpackage.gsv gsvVar10 = new defpackage.gsv("VEHICLE_PARKED", 9);
        j = gsvVar10;
        defpackage.gsv gsvVar11 = new defpackage.gsv("VEHICLE_DRIVING", 10);
        k = gsvVar11;
        defpackage.gsv gsvVar12 = new defpackage.gsv("VEHICLE_SPEED_UNKNOWN", 11);
        l = gsvVar12;
        defpackage.gsv[] gsvVarArr = {gsvVar, gsvVar2, gsvVar3, gsvVar4, gsvVar5, gsvVar6, gsvVar7, gsvVar8, gsvVar9, gsvVar10, gsvVar11, gsvVar12};
        m = gsvVarArr;
        defpackage.afga.p(gsvVarArr);
    }

    public static defpackage.gsv valueOf(java.lang.String str) {
        return (defpackage.gsv) java.lang.Enum.valueOf(defpackage.gsv.class, str);
    }

    public static defpackage.gsv[] values() {
        return (defpackage.gsv[]) m.clone();
    }
}
