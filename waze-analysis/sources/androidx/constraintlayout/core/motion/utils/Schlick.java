package androidx.constraintlayout.core.motion.utils;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class Schlick extends Easing {
    private static final boolean DEBUG = false;
    double mEps;
    double mS;
    double mT;

    Schlick(String str) {
        this.mStr = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.mS = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i2 = iIndexOf2 + 1;
        this.mT = Double.parseDouble(str.substring(i2, str.indexOf(44, i2)).trim());
    }

    private double dfunc(double d2) {
        double d3 = this.mT;
        double d4 = d3 - d2;
        double d5 = this.mS;
        if (d2 < d3) {
            double d6 = d5 * d3 * d3;
            double d7 = (d5 * d4) + d2;
            return d6 / (d7 * d7);
        }
        double d8 = d3 - 1.0d;
        double d9 = (((-d5) * d4) - d2) + 1.0d;
        return ((d5 * d8) * d8) / (d9 * d9);
    }

    private double func(double d2) {
        double d3 = this.mT;
        double d4 = d3 - d2;
        double d5 = this.mS;
        return d2 < d3 ? (d3 * d2) / (d2 + (d5 * d4)) : ((1.0d - d3) * ((-1.0d) + d2)) / ((1.0d - d2) - (d5 * d4));
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d2) {
        return func(d2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d2) {
        return dfunc(d2);
    }
}
