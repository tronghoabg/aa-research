package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uvq implements defpackage.uub {
    public static final defpackage.uvq a;
    public static final defpackage.uvq b;
    public static final defpackage.uvq c;
    public static final defpackage.uvq d;
    public static final defpackage.uvq e;
    public static final defpackage.uvq f;
    public static final defpackage.uvq g;
    public static final int h;
    private static final /* synthetic */ defpackage.uvq[] i;

    static {
        defpackage.uvq uvqVar = new defpackage.uvq("UNCATEGORIZED", 0);
        a = uvqVar;
        defpackage.uvq uvqVar2 = new defpackage.uvq("AREA_HIGHLIGHT", 1);
        b = uvqVar2;
        defpackage.uvq uvqVar3 = new defpackage.uvq("MAJOR_EVENT", 2);
        c = uvqVar3;
        defpackage.uvq uvqVar4 = new defpackage.uvq("CRISIS_WILDFIRES", 3);
        d = uvqVar4;
        defpackage.uvq uvqVar5 = new defpackage.uvq("COVID19", 4);
        e = uvqVar5;
        defpackage.uvq uvqVar6 = new defpackage.uvq("SEARCH_RESULTS", 5);
        f = uvqVar6;
        defpackage.uvq uvqVar7 = new defpackage.uvq("AIR_QUALITY_HEATMAP", 6);
        g = uvqVar7;
        i = new defpackage.uvq[]{uvqVar, uvqVar2, uvqVar3, uvqVar4, uvqVar5, uvqVar6, uvqVar7};
        h = defpackage.uvm.c + defpackage.uvm.values().length;
    }

    public static defpackage.uvq valueOf(java.lang.String str) {
        return (defpackage.uvq) java.lang.Enum.valueOf(defpackage.uvq.class, str);
    }

    public static defpackage.uvq[] values() {
        return (defpackage.uvq[]) i.clone();
    }

    @Override // defpackage.uub
    public final int a() {
        return h + ordinal();
    }

    @Override // defpackage.uub
    public final int b() {
        return ordinal();
    }

    @Override // defpackage.uub
    public final defpackage.uwm c() {
        return defpackage.uwm.e;
    }
}
