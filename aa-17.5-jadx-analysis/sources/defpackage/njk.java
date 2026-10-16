package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class njk {
    public static final njk a;
    public static final njk b;
    public static final njk c;
    public static final njk d;
    public static final njk e;
    public static final njk f;
    public static final njk g;
    public static final njk h;
    public static final njk i;
    private static final /* synthetic */ njk[] j;

    static {
        njk njkVar = new njk("PHONE", 0);
        a = njkVar;
        njk njkVar2 = new njk("IN_CALL_INFO", 1);
        b = njkVar2;
        njk njkVar3 = new njk("IN_CALL_APP", 2);
        c = njkVar3;
        njk njkVar4 = new njk("MEDIA", 3);
        d = njkVar4;
        njk njkVar5 = new njk("NAV_START", 4);
        e = njkVar5;
        njk njkVar6 = new njk("NAV_FULLSCREEN", 5);
        f = njkVar6;
        njk njkVar7 = new njk("RECENT", 6);
        g = njkVar7;
        njk njkVar8 = new njk("DASHBOARD", 7);
        h = njkVar8;
        njk njkVar9 = new njk("OTHER", 8);
        i = njkVar9;
        njk[] njkVarArr = {njkVar, njkVar2, njkVar3, njkVar4, njkVar5, njkVar6, njkVar7, njkVar8, njkVar9};
        j = njkVarArr;
        affa.p(njkVarArr);
    }

    public static njk valueOf(String str) {
        return (njk) Enum.valueOf(njk.class, str);
    }

    public static njk[] values() {
        return (njk[]) j.clone();
    }
}
