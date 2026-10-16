package androidx.camera.video.internal.config;

import android.util.Rational;
import androidx.camera.core.Logger;
import h.g.b.x;
import h.h.a;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CaptureEncodeRatesKt {
    private static final String TAG = "CaptureEncodeRates";

    private static final boolean isInvalidCaptureToEncodeRatio(Rational rational) {
        return x.n(rational, Rational.NaN) || x.n(rational, Rational.ZERO) || x.n(rational, Rational.NEGATIVE_INFINITY) || x.n(rational, Rational.POSITIVE_INFINITY);
    }

    public static final int toCaptureRate(int i2, Rational rational) {
        if (rational == null) {
            return i2;
        }
        if (!isInvalidCaptureToEncodeRatio(rational)) {
            return a.b(i2 * rational.floatValue());
        }
        Objects.toString(rational);
        Logger.w(TAG, "Invalid capture-to-encode ratio: ".concat(rational.toString()));
        return i2;
    }

    public static final int toEncodeRate(int i2, Rational rational) {
        if (rational == null) {
            return i2;
        }
        if (!isInvalidCaptureToEncodeRatio(rational)) {
            return a.b(i2 / rational.floatValue());
        }
        Objects.toString(rational);
        Logger.w(TAG, "Invalid capture-to-encode ratio: ".concat(rational.toString()));
        return i2;
    }
}
