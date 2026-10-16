package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class igg {
    public static final igg a;
    public static final igg b;
    public static final igg c;
    public static final igg d;
    public static final igg e;
    public static final igg f;
    public static final igg g;
    public static final igg h;
    public static final igg i;
    public static final igg j;
    private static final /* synthetic */ igg[] k;

    static {
        igg iggVar = new igg("all", 0);
        a = iggVar;
        igg iggVar2 = new igg("aural", 1);
        b = iggVar2;
        igg iggVar3 = new igg("braille", 2);
        c = iggVar3;
        igg iggVar4 = new igg("embossed", 3);
        d = iggVar4;
        igg iggVar5 = new igg("handheld", 4);
        e = iggVar5;
        igg iggVar6 = new igg("print", 5);
        f = iggVar6;
        igg iggVar7 = new igg("projection", 6);
        g = iggVar7;
        igg iggVar8 = new igg("screen", 7);
        h = iggVar8;
        igg iggVar9 = new igg("tty", 8);
        i = iggVar9;
        igg iggVar10 = new igg("tv", 9);
        j = iggVar10;
        k = new igg[]{iggVar, iggVar2, iggVar3, iggVar4, iggVar5, iggVar6, iggVar7, iggVar8, iggVar9, iggVar10};
    }

    public static igg valueOf(String str) {
        return (igg) Enum.valueOf(igg.class, str);
    }

    public static igg[] values() {
        return (igg[]) k.clone();
    }
}
