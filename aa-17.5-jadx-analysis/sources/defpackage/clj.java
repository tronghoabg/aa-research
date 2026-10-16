package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class clj {
    private static final clw A;
    private static final clw B;
    public static final float[] a;
    public static final float[] b;
    public static final clw c;
    public static final clw d;
    public static final clv e;
    public static final clv f;
    public static final clv g;
    public static final clv h;
    public static final clv i;
    public static final clv j;
    public static final clv k;
    public static final clv l;
    public static final clv m;
    public static final clv n;
    public static final clv o;
    public static final clv p;
    public static final clv q;
    public static final clv r;
    public static final clh s;
    public static final clh t;
    public static final clv u;
    public static final clv v;
    public static final clv w;
    public static final clh x;
    public static final clh[] y;
    private static final float[] z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        z = fArr3;
        clw clwVar = new clw(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d);
        A = clwVar;
        clw clwVar2 = new clw(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d);
        B = clwVar2;
        clw clwVar3 = new clw(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = clwVar3;
        clw clwVar4 = new clw(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = clwVar4;
        clx clxVar = clp.a;
        clv clvVar = new clv("sRGB IEC61966-2.1", fArr, clp.d, clwVar, 0);
        e = clvVar;
        clv clvVar2 = new clv("sRGB IEC61966-2.1 (Linear)", fArr, clp.d, 1.0d, BitmapDescriptorFactory.HUE_RED, 1.0f, 1);
        f = clvVar2;
        clv clvVar3 = new clv("scRGB-nl IEC 61966-2-2:2003", fArr, clp.d, null, new cli(1), new cli(0), -0.799f, 2.399f, clwVar, 2);
        g = clvVar3;
        clv clvVar4 = new clv("scRGB IEC 61966-2-2:2003", fArr, clp.d, 1.0d, -0.5f, 7.499f, 3);
        h = clvVar4;
        clv clvVar5 = new clv("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, clp.d, new clw(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), 4);
        i = clvVar5;
        clv clvVar6 = new clv("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, clp.d, new clw(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d), 5);
        j = clvVar6;
        clv clvVar7 = new clv("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new clx(0.314f, 0.351f), 2.6d, BitmapDescriptorFactory.HUE_RED, 1.0f, 6);
        k = clvVar7;
        clv clvVar8 = new clv("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, clp.d, clwVar, 7);
        l = clvVar8;
        clv clvVar9 = new clv("NTSC (1953)", fArr2, clp.a, new clw(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), 8);
        m = clvVar9;
        clv clvVar10 = new clv("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, clp.d, new clw(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), 9);
        n = clvVar10;
        clv clvVar11 = new clv("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, clp.d, 2.2d, BitmapDescriptorFactory.HUE_RED, 1.0f, 10);
        o = clvVar11;
        clv clvVar12 = new clv("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, clp.b, new clw(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d), 11);
        p = clvVar12;
        clv clvVar13 = new clv("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0E-4f, -0.077f}, clp.c, 1.0d, -65504.0f, 65504.0f, 12);
        q = clvVar13;
        clv clvVar14 = new clv("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, clp.c, 1.0d, -65504.0f, 65504.0f, 13);
        r = clvVar14;
        cly clyVar = new cly();
        s = clyVar;
        clq clqVar = new clq();
        t = clqVar;
        clv clvVar15 = new clv("None", fArr, clp.d, clwVar2, 16);
        u = clvVar15;
        clv clvVar16 = new clv("Hybrid Log Gamma encoding", fArr3, clp.d, null, new cli(2), new cli(3), BitmapDescriptorFactory.HUE_RED, 1.0f, clwVar3, 17);
        v = clvVar16;
        clv clvVar17 = new clv("Perceptual Quantizer encoding", fArr3, clp.d, null, new cli(4), new cli(5), BitmapDescriptorFactory.HUE_RED, 1.0f, clwVar4, 18);
        w = clvVar17;
        clr clrVar = new clr();
        x = clrVar;
        y = new clh[]{clvVar, clvVar2, clvVar3, clvVar4, clvVar5, clvVar6, clvVar7, clvVar8, clvVar9, clvVar10, clvVar11, clvVar12, clvVar13, clvVar14, clyVar, clqVar, clvVar15, clvVar16, clvVar17, clrVar};
    }

    public static final double a(clw clwVar, double d2) {
        double dExp;
        double d3 = clwVar.g + 1.0d;
        double d4 = d2 < 0.0d ? -1.0d : 1.0d;
        double d5 = d2 * d4;
        double d6 = clwVar.b * d5;
        if (d6 <= 1.0d) {
            dExp = Math.pow(d6, clwVar.c);
        } else {
            dExp = Math.exp((d5 - clwVar.f) * clwVar.d) + clwVar.e;
        }
        return d3 * d4 * dExp;
    }

    public static final double b(clw clwVar, double d2) {
        double d3 = 1.0d / clwVar.b;
        double d4 = 1.0d / clwVar.c;
        double d5 = 1.0d / clwVar.d;
        double d6 = clwVar.g + 1.0d;
        double d7 = d2 < 0.0d ? -1.0d : 1.0d;
        double d8 = (d2 * d7) / d6;
        return d7 * (d8 <= 1.0d ? d3 * Math.pow(d8, d4) : clwVar.f + (d5 * Math.log(d8 - clwVar.e)));
    }

    public static final double c(clw clwVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = clwVar.d;
        double dPow = clwVar.b + (clwVar.c * Math.pow(d4, d5));
        return d3 * Math.pow((dPow >= 0.0d ? dPow : 0.0d) / (clwVar.e + (clwVar.f * Math.pow(d4, d5))), clwVar.g);
    }

    public static final double d(clw clwVar, double d2) {
        double d3 = -clwVar.b;
        double d4 = 1.0d / clwVar.g;
        double d5 = -clwVar.f;
        double d6 = 1.0d / clwVar.d;
        double d7 = d2 < 0.0d ? -1.0d : 1.0d;
        double d8 = d2 * d7;
        return d7 * Math.pow(Math.max(d3 + (clwVar.e * Math.pow(d8, d4)), 0.0d) / (clwVar.c + (d5 * Math.pow(d8, d4))), d6);
    }
}
