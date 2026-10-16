package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class mdj {
    public static final mdj a;
    public static final mdj b;
    public static final mdj c;
    public static final mdj d;
    public static final mdj e;
    public static final mdj f;
    public static final mdj g;
    public static final mdj h;
    private static final /* synthetic */ mdj[] i;

    static {
        mdj mdjVar = new mdj("PHONE", 0);
        a = mdjVar;
        mdj mdjVar2 = new mdj("CONTACTS", 1);
        b = mdjVar2;
        mdj mdjVar3 = new mdj("LOCATION", 2);
        c = mdjVar3;
        mdj mdjVar4 = new mdj("SMS", 3);
        d = mdjVar4;
        mdj mdjVar5 = new mdj("MICROPHONE", 4);
        e = mdjVar5;
        mdj mdjVar6 = new mdj("CALENDAR", 5);
        f = mdjVar6;
        mdj mdjVar7 = new mdj("CALL_LOG", 6);
        g = mdjVar7;
        mdj mdjVar8 = new mdj("NEARBY_DEVICES", 7);
        h = mdjVar8;
        i = new mdj[]{mdjVar, mdjVar2, mdjVar3, mdjVar4, mdjVar5, mdjVar6, mdjVar7, mdjVar8};
    }

    public static mdj valueOf(String str) {
        return (mdj) Enum.valueOf(mdj.class, str);
    }

    public static mdj[] values() {
        return (mdj[]) i.clone();
    }
}
