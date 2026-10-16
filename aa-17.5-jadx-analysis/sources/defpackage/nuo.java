package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nuo {
    public static final nuo a;
    public static final nuo b;
    public static final nuo c;
    public static final nuo d;
    public static final nuo e;
    public static final nuo f;
    public static final nuo g;
    public static final nuo h;
    public static final nuo i;
    public static final nuo j;
    public static final nuo k;
    private static final /* synthetic */ nuo[] l;

    static {
        nuo nuoVar = new nuo("NONE", 0);
        a = nuoVar;
        nuo nuoVar2 = new nuo("MEDIA", 1);
        b = nuoVar2;
        nuo nuoVar3 = new nuo("NAVIGATION", 2);
        c = nuoVar3;
        nuo nuoVar4 = new nuo("PENDING_CALL", 3);
        d = nuoVar4;
        nuo nuoVar5 = new nuo("ONGOING_CALL", 4);
        e = nuoVar5;
        nuo nuoVar6 = new nuo("FEEDBACK", 5);
        f = nuoVar6;
        nuo nuoVar7 = new nuo("ASSISTANT_SUGGESTION", 6);
        g = nuoVar7;
        nuo nuoVar8 = new nuo("MESSAGING", 7);
        h = nuoVar8;
        nuo nuoVar9 = new nuo("RECOMMENDATION", 8);
        i = nuoVar9;
        nuo nuoVar10 = new nuo("NAVIGATION_ALERT", 9);
        j = nuoVar10;
        nuo nuoVar11 = new nuo("AUTOMATION", 10);
        k = nuoVar11;
        l = new nuo[]{nuoVar, nuoVar2, nuoVar3, nuoVar4, nuoVar5, nuoVar6, nuoVar7, nuoVar8, nuoVar9, nuoVar10, nuoVar11};
    }

    public static nuo valueOf(String str) {
        return (nuo) Enum.valueOf(nuo.class, str);
    }

    public static nuo[] values() {
        return (nuo[]) l.clone();
    }

    public final int a() {
        switch (ordinal()) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            default:
                throw new RuntimeException(null, null);
        }
    }
}
