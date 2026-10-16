package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nve {
    public static final defpackage.nve a;
    public static final defpackage.nve b;
    public static final defpackage.nve c;
    public static final defpackage.nve d;
    public static final defpackage.nve e;
    public static final defpackage.nve f;
    public static final defpackage.nve g;
    public static final defpackage.nve h;
    public static final defpackage.nve i;
    public static final defpackage.nve j;
    public static final defpackage.nve k;
    private static final /* synthetic */ defpackage.nve[] l;

    static {
        defpackage.nve nveVar = new defpackage.nve("NONE", 0);
        a = nveVar;
        defpackage.nve nveVar2 = new defpackage.nve("MEDIA", 1);
        b = nveVar2;
        defpackage.nve nveVar3 = new defpackage.nve("NAVIGATION", 2);
        c = nveVar3;
        defpackage.nve nveVar4 = new defpackage.nve("PENDING_CALL", 3);
        d = nveVar4;
        defpackage.nve nveVar5 = new defpackage.nve("ONGOING_CALL", 4);
        e = nveVar5;
        defpackage.nve nveVar6 = new defpackage.nve("FEEDBACK", 5);
        f = nveVar6;
        defpackage.nve nveVar7 = new defpackage.nve("ASSISTANT_SUGGESTION", 6);
        g = nveVar7;
        defpackage.nve nveVar8 = new defpackage.nve("MESSAGING", 7);
        h = nveVar8;
        defpackage.nve nveVar9 = new defpackage.nve("RECOMMENDATION", 8);
        i = nveVar9;
        defpackage.nve nveVar10 = new defpackage.nve("NAVIGATION_ALERT", 9);
        j = nveVar10;
        defpackage.nve nveVar11 = new defpackage.nve("AUTOMATION", 10);
        k = nveVar11;
        l = new defpackage.nve[]{nveVar, nveVar2, nveVar3, nveVar4, nveVar5, nveVar6, nveVar7, nveVar8, nveVar9, nveVar10, nveVar11};
    }

    public static defpackage.nve valueOf(java.lang.String str) {
        return (defpackage.nve) java.lang.Enum.valueOf(defpackage.nve.class, str);
    }

    public static defpackage.nve[] values() {
        return (defpackage.nve[]) l.clone();
    }

    public final int a() {
        switch (ordinal()) {
            case defpackage.abnt.b /* 0 */:
                return 2;
            case 1:
                return 3;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return 4;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return 5;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return 6;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return 7;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            default:
                throw new java.lang.RuntimeException(null, null);
        }
    }
}
