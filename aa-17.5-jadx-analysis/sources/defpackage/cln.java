package defpackage;

/* loaded from: classes.dex */
public final class cln {
    public static final zh a;

    static {
        float[] fArr = clj.a;
        clv clvVar = clj.e;
        int i = clvVar.c;
        clk clkVar = new clk(clvVar);
        clv clvVar2 = clj.e;
        int i2 = clvVar2.c;
        clh clhVar = clj.x;
        int i3 = i2 | (clhVar.c << 6);
        clm clmVar = new clm(clvVar2, clhVar);
        clh clhVar2 = clj.x;
        int i4 = clhVar2.c;
        clv clvVar3 = clj.e;
        int i5 = i4 | (clvVar3.c << 6);
        clm clmVar2 = new clm(clhVar2, clvVar3);
        zh zhVar = zi.a;
        zh zhVar2 = new zh(6);
        zhVar2.g(i | (i << 6), clkVar);
        zhVar2.g(i3, clmVar);
        zhVar2.g(i5, clmVar2);
        a = zhVar2;
    }
}
