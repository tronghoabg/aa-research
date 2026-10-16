package androidx.camera.core.impl.utils;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class LongRational {
    private final long mDenominator;
    private final long mNumerator;

    LongRational(double d2) {
        this((long) (d2 * 10000.0d), 10000L);
    }

    long getDenominator() {
        return this.mDenominator;
    }

    long getNumerator() {
        return this.mNumerator;
    }

    double toDouble() {
        return this.mNumerator / this.mDenominator;
    }

    public String toString() {
        return this.mNumerator + DomExceptionUtils.SEPARATOR + this.mDenominator;
    }

    LongRational(long j2, long j3) {
        this.mNumerator = j2;
        this.mDenominator = j3;
    }
}
