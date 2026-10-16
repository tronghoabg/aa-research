package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class ijp {
    public static final defpackage.ijp A;
    public static final defpackage.ijp B;
    public static final defpackage.ijp C;
    public static final defpackage.ijp D;
    public static final defpackage.ijp E;
    public static final defpackage.ijp F;
    private static final java.util.Map G;
    private static final /* synthetic */ defpackage.ijp[] H;
    public static final defpackage.ijp a;
    public static final defpackage.ijp b;
    public static final defpackage.ijp c;
    public static final defpackage.ijp d;
    public static final defpackage.ijp e;
    public static final defpackage.ijp f;
    public static final defpackage.ijp g;
    public static final defpackage.ijp h;
    public static final defpackage.ijp i;
    public static final defpackage.ijp j;
    public static final defpackage.ijp k;
    public static final defpackage.ijp l;
    public static final defpackage.ijp m;
    public static final defpackage.ijp n;
    public static final defpackage.ijp o;
    public static final defpackage.ijp p;
    public static final defpackage.ijp q;
    public static final defpackage.ijp r;
    public static final defpackage.ijp s;
    public static final defpackage.ijp t;
    public static final defpackage.ijp u;
    public static final defpackage.ijp v;
    public static final defpackage.ijp w;
    public static final defpackage.ijp x;
    public static final defpackage.ijp y;
    public static final defpackage.ijp z;

    static {
        defpackage.ijp ijpVar = new defpackage.ijp("svg", 0);
        a = ijpVar;
        defpackage.ijp ijpVar2 = new defpackage.ijp("a", 1);
        b = ijpVar2;
        defpackage.ijp ijpVar3 = new defpackage.ijp("circle", 2);
        c = ijpVar3;
        defpackage.ijp ijpVar4 = new defpackage.ijp("clipPath", 3);
        d = ijpVar4;
        defpackage.ijp ijpVar5 = new defpackage.ijp("defs", 4);
        e = ijpVar5;
        defpackage.ijp ijpVar6 = new defpackage.ijp("desc", 5);
        f = ijpVar6;
        defpackage.ijp ijpVar7 = new defpackage.ijp("ellipse", 6);
        g = ijpVar7;
        defpackage.ijp ijpVar8 = new defpackage.ijp("g", 7);
        h = ijpVar8;
        defpackage.ijp ijpVar9 = new defpackage.ijp("image", 8);
        i = ijpVar9;
        defpackage.ijp ijpVar10 = new defpackage.ijp("line", 9);
        j = ijpVar10;
        defpackage.ijp ijpVar11 = new defpackage.ijp("linearGradient", 10);
        k = ijpVar11;
        defpackage.ijp ijpVar12 = new defpackage.ijp("marker", 11);
        l = ijpVar12;
        defpackage.ijp ijpVar13 = new defpackage.ijp("mask", 12);
        m = ijpVar13;
        defpackage.ijp ijpVar14 = new defpackage.ijp("path", 13);
        n = ijpVar14;
        defpackage.ijp ijpVar15 = new defpackage.ijp("pattern", 14);
        o = ijpVar15;
        defpackage.ijp ijpVar16 = new defpackage.ijp("polygon", 15);
        p = ijpVar16;
        defpackage.ijp ijpVar17 = new defpackage.ijp("polyline", 16);
        q = ijpVar17;
        defpackage.ijp ijpVar18 = new defpackage.ijp("radialGradient", 17);
        r = ijpVar18;
        defpackage.ijp ijpVar19 = new defpackage.ijp("rect", 18);
        s = ijpVar19;
        defpackage.ijp ijpVar20 = new defpackage.ijp("solidColor", 19);
        t = ijpVar20;
        defpackage.ijp ijpVar21 = new defpackage.ijp("stop", 20);
        u = ijpVar21;
        defpackage.ijp ijpVar22 = new defpackage.ijp("style", 21);
        v = ijpVar22;
        defpackage.ijp ijpVar23 = new defpackage.ijp("SWITCH", 22);
        w = ijpVar23;
        defpackage.ijp ijpVar24 = new defpackage.ijp("symbol", 23);
        x = ijpVar24;
        defpackage.ijp ijpVar25 = new defpackage.ijp("text", 24);
        y = ijpVar25;
        defpackage.ijp ijpVar26 = new defpackage.ijp("textPath", 25);
        z = ijpVar26;
        defpackage.ijp ijpVar27 = new defpackage.ijp("title", 26);
        A = ijpVar27;
        defpackage.ijp ijpVar28 = new defpackage.ijp("tref", 27);
        B = ijpVar28;
        defpackage.ijp ijpVar29 = new defpackage.ijp("tspan", 28);
        C = ijpVar29;
        defpackage.ijp ijpVar30 = new defpackage.ijp("use", 29);
        D = ijpVar30;
        defpackage.ijp ijpVar31 = new defpackage.ijp("view", 30);
        E = ijpVar31;
        defpackage.ijp ijpVar32 = new defpackage.ijp("UNSUPPORTED", 31);
        F = ijpVar32;
        H = new defpackage.ijp[]{ijpVar, ijpVar2, ijpVar3, ijpVar4, ijpVar5, ijpVar6, ijpVar7, ijpVar8, ijpVar9, ijpVar10, ijpVar11, ijpVar12, ijpVar13, ijpVar14, ijpVar15, ijpVar16, ijpVar17, ijpVar18, ijpVar19, ijpVar20, ijpVar21, ijpVar22, ijpVar23, ijpVar24, ijpVar25, ijpVar26, ijpVar27, ijpVar28, ijpVar29, ijpVar30, ijpVar31, ijpVar32};
        G = new java.util.HashMap();
    }

    public static defpackage.ijp a(java.lang.String str) {
        java.util.Map map = G;
        defpackage.ijp ijpVar = (defpackage.ijp) map.get(str);
        if (ijpVar != null) {
            return ijpVar;
        }
        if (str.equals("switch")) {
            defpackage.ijp ijpVar2 = w;
            map.put(str, ijpVar2);
            return ijpVar2;
        }
        try {
            defpackage.ijp ijpVarValueOf = valueOf(str);
            if (ijpVarValueOf != w) {
                map.put(str, ijpVarValueOf);
                return ijpVarValueOf;
            }
        } catch (java.lang.IllegalArgumentException unused) {
        }
        java.util.Map map2 = G;
        defpackage.ijp ijpVar3 = F;
        map2.put(str, ijpVar3);
        return ijpVar3;
    }

    public static defpackage.ijp valueOf(java.lang.String str) {
        return (defpackage.ijp) java.lang.Enum.valueOf(defpackage.ijp.class, str);
    }

    public static defpackage.ijp[] values() {
        return (defpackage.ijp[]) H.clone();
    }
}
