package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uvr implements defpackage.uub {
    public static final defpackage.uvr a;
    public static final defpackage.uvr b;
    public static final defpackage.uvr c;
    public static final defpackage.uvr d;
    public static final defpackage.uvr e;
    public static final defpackage.uvr f;
    public static final defpackage.uvr g;
    public static final defpackage.uvr h;
    public static final defpackage.uvr i;
    public static final defpackage.uvr j;
    public static final defpackage.uvr k;
    public static final defpackage.uvr l;
    public static final defpackage.uvr m;
    public static final int n;
    private static final /* synthetic */ defpackage.uvr[] o;

    static {
        defpackage.uvr uvrVar = new defpackage.uvr("POLYLINE_DEACTIVATED", 0);
        a = uvrVar;
        defpackage.uvr uvrVar2 = new defpackage.uvr("POLYLINE_DEACTIVATED_WITH_STAMPS", 1);
        b = uvrVar2;
        defpackage.uvr uvrVar3 = new defpackage.uvr("POLYLINE_DIMMED", 2);
        c = uvrVar3;
        defpackage.uvr uvrVar4 = new defpackage.uvr("POLYLINE_BACKGROUND_LEGACY_CONSUMED", 3);
        d = uvrVar4;
        defpackage.uvr uvrVar5 = new defpackage.uvr("POLYLINE_BACKGROUND", 4);
        e = uvrVar5;
        defpackage.uvr uvrVar6 = new defpackage.uvr("POLYLINE_LEGACY_CONSUMED", 5);
        f = uvrVar6;
        defpackage.uvr uvrVar7 = new defpackage.uvr("POLYLINE", 6);
        g = uvrVar7;
        defpackage.uvr uvrVar8 = new defpackage.uvr("POLYLINE_OVERLAY", 7);
        h = uvrVar8;
        defpackage.uvr uvrVar9 = new defpackage.uvr("POLYLINE_EPHEMERAL_MEASLES", 8);
        i = uvrVar9;
        defpackage.uvr uvrVar10 = new defpackage.uvr("POLYLINE_MEASLES", 9);
        j = uvrVar10;
        defpackage.uvr uvrVar11 = new defpackage.uvr("STEP_ARROW_OVERLAY", 10);
        k = uvrVar11;
        defpackage.uvr uvrVar12 = new defpackage.uvr("DISTANCE_TOOL_POLYLINE", 11);
        l = uvrVar12;
        defpackage.uvr uvrVar13 = new defpackage.uvr("DISTANCE_TOOL_MEASLE", 12);
        m = uvrVar13;
        o = new defpackage.uvr[]{uvrVar, uvrVar2, uvrVar3, uvrVar4, uvrVar5, uvrVar6, uvrVar7, uvrVar8, uvrVar9, uvrVar10, uvrVar11, uvrVar12, uvrVar13};
        n = defpackage.uvi.b + defpackage.uvi.values().length;
    }

    public static defpackage.uvr valueOf(java.lang.String str) {
        return (defpackage.uvr) java.lang.Enum.valueOf(defpackage.uvr.class, str);
    }

    public static defpackage.uvr[] values() {
        return (defpackage.uvr[]) o.clone();
    }

    @Override // defpackage.uub
    public final int a() {
        return n + ordinal();
    }

    @Override // defpackage.uub
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.uub
    public final defpackage.uwm c() {
        return defpackage.uwm.j;
    }
}
