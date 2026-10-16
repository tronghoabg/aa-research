package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nts {
    public static final nts a;
    public static final nts b;
    public static final nts c;
    public static final nts d;
    public static final nts e;
    public static final nts f;
    public static final nts g;
    public static final nts h;
    public static final nts i;
    public static final nts j;
    public static final nts k;
    public static final nts l;
    public static final nts m;
    public static final nts n;
    private static final /* synthetic */ nts[] o;

    static {
        nts ntsVar = new nts("TYPE_1X", 0);
        a = ntsVar;
        nts ntsVar2 = new nts("TYPE_3G", 1);
        b = ntsVar2;
        nts ntsVar3 = new nts("TYPE_H", 2);
        c = ntsVar3;
        nts ntsVar4 = new nts("TYPE_EDGE", 3);
        d = ntsVar4;
        nts ntsVar5 = new nts("TYPE_ROAM", 4);
        e = ntsVar5;
        nts ntsVar6 = new nts("TYPE_4G", 5);
        f = ntsVar6;
        nts ntsVar7 = new nts("TYPE_4G_PLUS", 6);
        g = ntsVar7;
        nts ntsVar8 = new nts("TYPE_LTE", 7);
        h = ntsVar8;
        nts ntsVar9 = new nts("TYPE_LTE_PLUS", 8);
        i = ntsVar9;
        nts ntsVar10 = new nts("TYPE_5G", 9);
        j = ntsVar10;
        nts ntsVar11 = new nts("TYPE_5G_E", 10);
        k = ntsVar11;
        nts ntsVar12 = new nts("TYPE_5G_PLUS", 11);
        l = ntsVar12;
        nts ntsVar13 = new nts("TYPE_UNKNOWN", 12);
        m = ntsVar13;
        nts ntsVar14 = new nts("TYPE_NONE", 13);
        n = ntsVar14;
        o = new nts[]{ntsVar, ntsVar2, ntsVar3, ntsVar4, ntsVar5, ntsVar6, ntsVar7, ntsVar8, ntsVar9, ntsVar10, ntsVar11, ntsVar12, ntsVar13, ntsVar14};
    }

    public static nts valueOf(String str) {
        return (nts) Enum.valueOf(nts.class, str);
    }

    public static nts[] values() {
        return (nts[]) o.clone();
    }
}
