package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class abko {
    public static final defpackage.abko a;
    public static final defpackage.abko b;
    public static final defpackage.abko c;
    public static final defpackage.abko d;
    public static final defpackage.abko e;
    public static final defpackage.abko f;
    public static final defpackage.abko g;
    public static final defpackage.abko h;
    private static final /* synthetic */ defpackage.abko[] i;

    static {
        defpackage.abko abkoVar = new defpackage.abko("AR_MINIMAP_DEFAULT_RESTRICTION", 0);
        a = abkoVar;
        defpackage.abko abkoVar2 = new defpackage.abko("AR_MINIMAP_LIVE_VIEW_RESTRICTION", 1);
        b = abkoVar2;
        defpackage.abko abkoVar3 = new defpackage.abko("INDOOR_RESTRICTION", 2);
        c = abkoVar3;
        defpackage.abko abkoVar4 = new defpackage.abko("TIMELINE_RESTRICTION", 3);
        d = abkoVar4;
        defpackage.abko abkoVar5 = new defpackage.abko("INCIDENT_RESTRICTION", 4);
        e = abkoVar5;
        defpackage.abko abkoVar6 = new defpackage.abko("LEGACY_AGMM_PLACEMARK_ONLY_RESTRICTION", 5);
        f = abkoVar6;
        defpackage.abko abkoVar7 = new defpackage.abko("TRANSIT_RESTRICTION", 6);
        g = abkoVar7;
        defpackage.abko abkoVar8 = new defpackage.abko("RESTRICTION_NOT_SET", 7);
        h = abkoVar8;
        i = new defpackage.abko[]{abkoVar, abkoVar2, abkoVar3, abkoVar4, abkoVar5, abkoVar6, abkoVar7, abkoVar8};
    }

    public static defpackage.abko a(int i2) {
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

    public static defpackage.abko valueOf(java.lang.String str) {
        return (defpackage.abko) java.lang.Enum.valueOf(defpackage.abko.class, str);
    }

    public static defpackage.abko[] values() {
        return (defpackage.abko[]) i.clone();
    }
}
