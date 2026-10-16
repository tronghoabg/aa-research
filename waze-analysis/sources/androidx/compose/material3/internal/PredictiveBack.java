package androidx.compose.material3.internal;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PredictiveBack {
    public static final int $stable = 0;
    public static final PredictiveBack INSTANCE = new PredictiveBack();

    private PredictiveBack() {
    }

    public final float transform$material3(float f2) {
        return BackHandlerKt.PredictiveBackEasing.transform(f2);
    }
}
