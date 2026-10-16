package androidx.compose.ui.unit;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DensityKt {
    public static final Density Density(float f2, float f3) {
        return new DensityImpl(f2, f3);
    }

    public static /* synthetic */ Density Density$default(float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = 1.0f;
        }
        return Density(f2, f3);
    }
}
