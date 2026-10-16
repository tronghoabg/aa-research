package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class clr {
    private static final defpackage.cme A;
    private static final defpackage.cme B;
    public static final float[] a;
    public static final float[] b;
    public static final defpackage.cme c;
    public static final defpackage.cme d;
    public static final defpackage.cmd e;
    public static final defpackage.cmd f;
    public static final defpackage.cmd g;
    public static final defpackage.cmd h;
    public static final defpackage.cmd i;
    public static final defpackage.cmd j;
    public static final defpackage.cmd k;
    public static final defpackage.cmd l;
    public static final defpackage.cmd m;
    public static final defpackage.cmd n;
    public static final defpackage.cmd o;
    public static final defpackage.cmd p;
    public static final defpackage.cmd q;
    public static final defpackage.cmd r;
    public static final defpackage.clp s;
    public static final defpackage.clp t;
    public static final defpackage.cmd u;
    public static final defpackage.cmd v;
    public static final defpackage.cmd w;
    public static final defpackage.clp x;
    public static final defpackage.clp[] y;
    private static final float[] z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        z = fArr3;
        defpackage.cme cmeVar = new defpackage.cme(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d);
        A = cmeVar;
        defpackage.cme cmeVar2 = new defpackage.cme(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d);
        B = cmeVar2;
        defpackage.cme cmeVar3 = new defpackage.cme(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = cmeVar3;
        defpackage.cme cmeVar4 = new defpackage.cme(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = cmeVar4;
        defpackage.cmf cmfVar = defpackage.clx.a;
        defpackage.cmd cmdVar = new defpackage.cmd("sRGB IEC61966-2.1", fArr, defpackage.clx.d, cmeVar, 0);
        e = cmdVar;
        defpackage.cmd cmdVar2 = new defpackage.cmd("sRGB IEC61966-2.1 (Linear)", fArr, defpackage.clx.d, 1.0d, 0.0f, 1.0f, 1);
        f = cmdVar2;
        defpackage.cmd cmdVar3 = new defpackage.cmd("scRGB-nl IEC 61966-2-2:2003", fArr, defpackage.clx.d, null, new defpackage.clq(1), new defpackage.clq(0), -0.799f, 2.399f, cmeVar, 2);
        g = cmdVar3;
        defpackage.cmd cmdVar4 = new defpackage.cmd("scRGB IEC 61966-2-2:2003", fArr, defpackage.clx.d, 1.0d, -0.5f, 7.499f, 3);
        h = cmdVar4;
        defpackage.cmd cmdVar5 = new defpackage.cmd("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, defpackage.clx.d, new defpackage.cme(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), 4);
        i = cmdVar5;
        defpackage.cmd cmdVar6 = new defpackage.cmd("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, defpackage.clx.d, new defpackage.cme(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d), 5);
        j = cmdVar6;
        defpackage.cmd cmdVar7 = new defpackage.cmd("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new defpackage.cmf(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = cmdVar7;
        defpackage.cmd cmdVar8 = new defpackage.cmd("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, defpackage.clx.d, cmeVar, 7);
        l = cmdVar8;
        defpackage.cmd cmdVar9 = new defpackage.cmd("NTSC (1953)", fArr2, defpackage.clx.a, new defpackage.cme(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), 8);
        m = cmdVar9;
        defpackage.cmd cmdVar10 = new defpackage.cmd("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, defpackage.clx.d, new defpackage.cme(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), 9);
        n = cmdVar10;
        defpackage.cmd cmdVar11 = new defpackage.cmd("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, defpackage.clx.d, 2.2d, 0.0f, 1.0f, 10);
        o = cmdVar11;
        defpackage.cmd cmdVar12 = new defpackage.cmd("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, defpackage.clx.b, new defpackage.cme(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d), 11);
        p = cmdVar12;
        defpackage.cmd cmdVar13 = new defpackage.cmd("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, defpackage.clx.c, 1.0d, -65504.0f, 65504.0f, 12);
        q = cmdVar13;
        defpackage.cmd cmdVar14 = new defpackage.cmd("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, defpackage.clx.c, 1.0d, -65504.0f, 65504.0f, 13);
        r = cmdVar14;
        defpackage.cmg cmgVar = new defpackage.cmg();
        s = cmgVar;
        defpackage.cly clyVar = new defpackage.cly();
        t = clyVar;
        defpackage.cmd cmdVar15 = new defpackage.cmd("None", fArr, defpackage.clx.d, cmeVar2, 16);
        u = cmdVar15;
        defpackage.cmd cmdVar16 = new defpackage.cmd("Hybrid Log Gamma encoding", fArr3, defpackage.clx.d, null, new defpackage.clq(2), new defpackage.clq(3), 0.0f, 1.0f, cmeVar3, 17);
        v = cmdVar16;
        defpackage.cmd cmdVar17 = new defpackage.cmd("Perceptual Quantizer encoding", fArr3, defpackage.clx.d, null, new defpackage.clq(4), new defpackage.clq(5), 0.0f, 1.0f, cmeVar4, 18);
        w = cmdVar17;
        defpackage.clz clzVar = new defpackage.clz();
        x = clzVar;
        y = new defpackage.clp[]{cmdVar, cmdVar2, cmdVar3, cmdVar4, cmdVar5, cmdVar6, cmdVar7, cmdVar8, cmdVar9, cmdVar10, cmdVar11, cmdVar12, cmdVar13, cmdVar14, cmgVar, clyVar, cmdVar15, cmdVar16, cmdVar17, clzVar};
    }

    public static final double a(defpackage.cme cmeVar, double d2) {
        double dExp;
        double d3 = cmeVar.g + 1.0d;
        double d4 = d2 < 0.0d ? -1.0d : 1.0d;
        double d5 = d2 * d4;
        double d6 = cmeVar.b * d5;
        if (d6 <= 1.0d) {
            dExp = java.lang.Math.pow(d6, cmeVar.c);
        } else {
            dExp = java.lang.Math.exp((d5 - cmeVar.f) * cmeVar.d) + cmeVar.e;
        }
        return d3 * d4 * dExp;
    }

    public static final double b(defpackage.cme cmeVar, double d2) {
        double d3 = 1.0d / cmeVar.b;
        double d4 = 1.0d / cmeVar.c;
        double d5 = 1.0d / cmeVar.d;
        double d6 = cmeVar.g + 1.0d;
        double d7 = d2 < 0.0d ? -1.0d : 1.0d;
        double d8 = (d2 * d7) / d6;
        return d7 * (d8 <= 1.0d ? d3 * java.lang.Math.pow(d8, d4) : cmeVar.f + (d5 * java.lang.Math.log(d8 - cmeVar.e)));
    }

    public static final double c(defpackage.cme cmeVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = cmeVar.d;
        double dPow = cmeVar.b + (cmeVar.c * java.lang.Math.pow(d4, d5));
        return d3 * java.lang.Math.pow((dPow >= 0.0d ? dPow : 0.0d) / (cmeVar.e + (cmeVar.f * java.lang.Math.pow(d4, d5))), cmeVar.g);
    }

    public static final double d(defpackage.cme cmeVar, double d2) {
        double d3 = -cmeVar.b;
        double d4 = 1.0d / cmeVar.g;
        double d5 = -cmeVar.f;
        double d6 = 1.0d / cmeVar.d;
        double d7 = d2 < 0.0d ? -1.0d : 1.0d;
        double d8 = d2 * d7;
        return d7 * java.lang.Math.pow(java.lang.Math.max(d3 + (cmeVar.e * java.lang.Math.pow(d8, d4)), 0.0d) / (cmeVar.c + (d5 * java.lang.Math.pow(d8, d4))), d6);
    }
}
