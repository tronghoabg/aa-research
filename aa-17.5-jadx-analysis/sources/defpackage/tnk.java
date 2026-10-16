package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class tnk {
    public static final tnk a;
    public static final tnk b;
    public static final tnk c;
    public static final tnk d;
    public static final tnk e;
    public static final tnk f;
    public static final tnk g;
    public static final tnk h;
    public static final tnk i;
    private static final /* synthetic */ tnk[] j;

    static {
        tnk tnkVar = new tnk("NotEligible", 0);
        a = tnkVar;
        tnk tnkVar2 = new tnk("ThermalStatusSevere", 1);
        b = tnkVar2;
        tnk tnkVar3 = new tnk("AreaUnsupported", 2);
        c = tnkVar3;
        tnk tnkVar4 = new tnk("ViewportQualityLow", 3);
        d = tnkVar4;
        tnk tnkVar5 = new tnk("ManualOverride", 4);
        e = tnkVar5;
        tnk tnkVar6 = new tnk("OptedOut", 5);
        f = tnkVar6;
        tnk tnkVar7 = new tnk("CompassModeNotSupported", 6);
        g = tnkVar7;
        tnk tnkVar8 = new tnk("IncompatibleFeature", 7);
        h = tnkVar8;
        tnk tnkVar9 = new tnk("Other", 8);
        i = tnkVar9;
        tnk[] tnkVarArr = {tnkVar, tnkVar2, tnkVar3, tnkVar4, tnkVar5, tnkVar6, tnkVar7, tnkVar8, tnkVar9};
        j = tnkVarArr;
        affa.p(tnkVarArr);
    }

    public static tnk valueOf(String str) {
        return (tnk) Enum.valueOf(tnk.class, str);
    }

    public static tnk[] values() {
        return (tnk[]) j.clone();
    }
}
