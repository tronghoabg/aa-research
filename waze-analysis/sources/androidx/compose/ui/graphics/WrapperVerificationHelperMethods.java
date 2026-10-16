package androidx.compose.ui.graphics;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WrapperVerificationHelperMethods {
    public static final int $stable = 0;
    public static final WrapperVerificationHelperMethods INSTANCE = new WrapperVerificationHelperMethods();

    private WrapperVerificationHelperMethods() {
    }

    /* renamed from: getColor-vNxB06k, reason: not valid java name */
    public final long m8684getColorvNxB06k(android.graphics.Paint paint) {
        return AndroidColor_androidKt.fromColorLong(Color.Companion, paint.getColorLong());
    }

    /* renamed from: setBlendMode-GB0RdKg, reason: not valid java name */
    public final void m8685setBlendModeGB0RdKg(android.graphics.Paint paint, int i2) {
        paint.setBlendMode(AndroidBlendMode_androidKt.m8072toAndroidBlendModes9anfk8(i2));
    }

    /* renamed from: setColor-4WTKRHQ, reason: not valid java name */
    public final void m8686setColor4WTKRHQ(android.graphics.Paint paint, long j2) {
        paint.setColor(AndroidColor_androidKt.m8091toSupportedColorLong8_81llA(j2));
    }
}
