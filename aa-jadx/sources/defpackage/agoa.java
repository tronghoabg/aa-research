package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class agoa {
    public static /* synthetic */ int m(double d) {
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(d);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }
}
