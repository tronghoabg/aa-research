package androidx.collection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final /* synthetic */ class DoubleList$$ExternalSyntheticBackport0 {
    public static /* synthetic */ int m(double d2) {
        long jDoubleToLongBits = Double.doubleToLongBits(d2);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }
}
