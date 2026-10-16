package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uuu implements utf {
    public static final uuu a;
    public static final uuu b;
    public static final uuu c;
    public static final uuu d;
    public static final uuu e;
    public static final uuu f;
    public static final uuu g;
    public static final int h;
    private static final /* synthetic */ uuu[] i;

    static {
        uuu uuuVar = new uuu("UNCATEGORIZED", 0);
        a = uuuVar;
        uuu uuuVar2 = new uuu("AREA_HIGHLIGHT", 1);
        b = uuuVar2;
        uuu uuuVar3 = new uuu("MAJOR_EVENT", 2);
        c = uuuVar3;
        uuu uuuVar4 = new uuu("CRISIS_WILDFIRES", 3);
        d = uuuVar4;
        uuu uuuVar5 = new uuu("COVID19", 4);
        e = uuuVar5;
        uuu uuuVar6 = new uuu("SEARCH_RESULTS", 5);
        f = uuuVar6;
        uuu uuuVar7 = new uuu("AIR_QUALITY_HEATMAP", 6);
        g = uuuVar7;
        i = new uuu[]{uuuVar, uuuVar2, uuuVar3, uuuVar4, uuuVar5, uuuVar6, uuuVar7};
        h = uuq.c + uuq.values().length;
    }

    public static uuu valueOf(String str) {
        return (uuu) Enum.valueOf(uuu.class, str);
    }

    public static uuu[] values() {
        return (uuu[]) i.clone();
    }

    @Override // defpackage.utf
    public final int a() {
        return h + ordinal();
    }

    @Override // defpackage.utf
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.utf
    public final uvp c() {
        return uvp.e;
    }
}
