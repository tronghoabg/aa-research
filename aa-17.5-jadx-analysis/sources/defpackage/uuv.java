package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uuv implements utf {
    public static final uuv a;
    public static final uuv b;
    public static final uuv c;
    public static final uuv d;
    public static final uuv e;
    public static final uuv f;
    public static final uuv g;
    public static final uuv h;
    public static final uuv i;
    public static final uuv j;
    public static final uuv k;
    public static final uuv l;
    public static final uuv m;
    public static final int n;
    private static final /* synthetic */ uuv[] o;

    static {
        uuv uuvVar = new uuv("POLYLINE_DEACTIVATED", 0);
        a = uuvVar;
        uuv uuvVar2 = new uuv("POLYLINE_DEACTIVATED_WITH_STAMPS", 1);
        b = uuvVar2;
        uuv uuvVar3 = new uuv("POLYLINE_DIMMED", 2);
        c = uuvVar3;
        uuv uuvVar4 = new uuv("POLYLINE_BACKGROUND_LEGACY_CONSUMED", 3);
        d = uuvVar4;
        uuv uuvVar5 = new uuv("POLYLINE_BACKGROUND", 4);
        e = uuvVar5;
        uuv uuvVar6 = new uuv("POLYLINE_LEGACY_CONSUMED", 5);
        f = uuvVar6;
        uuv uuvVar7 = new uuv("POLYLINE", 6);
        g = uuvVar7;
        uuv uuvVar8 = new uuv("POLYLINE_OVERLAY", 7);
        h = uuvVar8;
        uuv uuvVar9 = new uuv("POLYLINE_EPHEMERAL_MEASLES", 8);
        i = uuvVar9;
        uuv uuvVar10 = new uuv("POLYLINE_MEASLES", 9);
        j = uuvVar10;
        uuv uuvVar11 = new uuv("STEP_ARROW_OVERLAY", 10);
        k = uuvVar11;
        uuv uuvVar12 = new uuv("DISTANCE_TOOL_POLYLINE", 11);
        l = uuvVar12;
        uuv uuvVar13 = new uuv("DISTANCE_TOOL_MEASLE", 12);
        m = uuvVar13;
        o = new uuv[]{uuvVar, uuvVar2, uuvVar3, uuvVar4, uuvVar5, uuvVar6, uuvVar7, uuvVar8, uuvVar9, uuvVar10, uuvVar11, uuvVar12, uuvVar13};
        n = uum.b + uum.values().length;
    }

    public static uuv valueOf(String str) {
        return (uuv) Enum.valueOf(uuv.class, str);
    }

    public static uuv[] values() {
        return (uuv[]) o.clone();
    }

    @Override // defpackage.utf
    public final int a() {
        return n + ordinal();
    }

    @Override // defpackage.utf
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.utf
    public final uvp c() {
        return uvp.j;
    }
}
