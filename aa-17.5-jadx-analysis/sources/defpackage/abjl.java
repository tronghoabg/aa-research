package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class abjl {
    public static final abjl a;
    public static final abjl b;
    public static final abjl c;
    public static final abjl d;
    public static final abjl e;
    public static final abjl f;
    public static final abjl g;
    public static final abjl h;
    private static final /* synthetic */ abjl[] i;

    static {
        abjl abjlVar = new abjl("AR_MINIMAP_DEFAULT_RESTRICTION", 0);
        a = abjlVar;
        abjl abjlVar2 = new abjl("AR_MINIMAP_LIVE_VIEW_RESTRICTION", 1);
        b = abjlVar2;
        abjl abjlVar3 = new abjl("INDOOR_RESTRICTION", 2);
        c = abjlVar3;
        abjl abjlVar4 = new abjl("TIMELINE_RESTRICTION", 3);
        d = abjlVar4;
        abjl abjlVar5 = new abjl("INCIDENT_RESTRICTION", 4);
        e = abjlVar5;
        abjl abjlVar6 = new abjl("LEGACY_AGMM_PLACEMARK_ONLY_RESTRICTION", 5);
        f = abjlVar6;
        abjl abjlVar7 = new abjl("TRANSIT_RESTRICTION", 6);
        g = abjlVar7;
        abjl abjlVar8 = new abjl("RESTRICTION_NOT_SET", 7);
        h = abjlVar8;
        i = new abjl[]{abjlVar, abjlVar2, abjlVar3, abjlVar4, abjlVar5, abjlVar6, abjlVar7, abjlVar8};
    }

    public static abjl a(int i2) {
        switch (i2) {
            case 0:
                return h;
            case 1:
                return a;
            case 2:
                return b;
            case 3:
                return c;
            case 4:
                return d;
            case 5:
                return e;
            case 6:
                return f;
            case 7:
                return g;
            default:
                return null;
        }
    }

    public static abjl valueOf(String str) {
        return (abjl) Enum.valueOf(abjl.class, str);
    }

    public static abjl[] values() {
        return (abjl[]) i.clone();
    }
}
