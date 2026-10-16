package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ryf {
    public static final ryf a;
    public static final ryf b;
    public static final ryf c;
    public static final ryf d;
    public static final ryf e;
    public static final ryf f;
    public static final ryf g;
    public static final ryf h;
    public static final ryf i;
    public static final ryf j;
    public static final ryf k;
    public static final ryf l;
    private static final /* synthetic */ ryf[] m;

    static {
        ryf ryfVar = new ryf("NONE", 0);
        a = ryfVar;
        ryf ryfVar2 = new ryf("PORT", 1);
        b = ryfVar2;
        ryf ryfVar3 = new ryf("GADGET", 2);
        c = ryfVar3;
        ryf ryfVar4 = new ryf("ROLES", 3);
        d = ryfVar4;
        ryf ryfVar5 = new ryf("FUNCTION", 4);
        e = ryfVar5;
        ryf ryfVar6 = new ryf("FUNCTION_NONE", 5);
        f = ryfVar6;
        ryf ryfVar7 = new ryf("FUNCTION_MTP", 6);
        g = ryfVar7;
        ryf ryfVar8 = new ryf("FUNCTION_PTP", 7);
        h = ryfVar8;
        ryf ryfVar9 = new ryf("FUNCTION_RNDIS", 8);
        i = ryfVar9;
        ryf ryfVar10 = new ryf("FUNCTION_MIDI", 9);
        j = ryfVar10;
        ryf ryfVar11 = new ryf("FUNCTION_NCM", 10);
        k = ryfVar11;
        ryf ryfVar12 = new ryf("FUNCTION_SEARCH", 11);
        l = ryfVar12;
        m = new ryf[]{ryfVar, ryfVar2, ryfVar3, ryfVar4, ryfVar5, ryfVar6, ryfVar7, ryfVar8, ryfVar9, ryfVar10, ryfVar11, ryfVar12};
    }

    public static ryf valueOf(String str) {
        return (ryf) Enum.valueOf(ryf.class, str);
    }

    public static ryf[] values() {
        return (ryf[]) m.clone();
    }
}
