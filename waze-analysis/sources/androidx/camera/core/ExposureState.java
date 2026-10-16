package androidx.camera.core;

import android.util.Range;
import android.util.Rational;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ExposureState {
    int getExposureCompensationIndex();

    Range<Integer> getExposureCompensationRange();

    Rational getExposureCompensationStep();

    boolean isExposureCompensationSupported();
}
