package androidx.camera.core.impl;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ConvergenceUtils {
    private static final Set<CameraCaptureMetaData.AeState> AE_CONVERGED_STATE_SET;
    private static final Set<CameraCaptureMetaData.AeState> AE_TORCH_AS_FLASH_CONVERGED_STATE_SET;
    private static final Set<CameraCaptureMetaData.AfState> AF_CONVERGED_STATE_SET = DesugarCollections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AfState.PASSIVE_FOCUSED, CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED, CameraCaptureMetaData.AfState.LOCKED_FOCUSED, CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED));
    private static final Set<CameraCaptureMetaData.AwbState> AWB_CONVERGED_STATE_SET = DesugarCollections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AwbState.CONVERGED, CameraCaptureMetaData.AwbState.UNKNOWN));
    private static final String TAG = "ConvergenceUtils";

    static {
        Set<CameraCaptureMetaData.AeState> setUnmodifiableSet = DesugarCollections.unmodifiableSet(EnumSet.of(CameraCaptureMetaData.AeState.CONVERGED, CameraCaptureMetaData.AeState.FLASH_REQUIRED, CameraCaptureMetaData.AeState.UNKNOWN));
        AE_CONVERGED_STATE_SET = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(CameraCaptureMetaData.AeState.FLASH_REQUIRED);
        enumSetCopyOf.remove(CameraCaptureMetaData.AeState.UNKNOWN);
        AE_TORCH_AS_FLASH_CONVERGED_STATE_SET = DesugarCollections.unmodifiableSet(enumSetCopyOf);
    }

    private ConvergenceUtils() {
    }

    public static boolean is3AConverged(CameraCaptureResult cameraCaptureResult, boolean z, int i2) {
        boolean z2 = cameraCaptureResult.getAfMode() == CameraCaptureMetaData.AfMode.OFF || (i2 & 1) == 0 || AF_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAfState());
        CameraCaptureMetaData.AeMode aeMode = cameraCaptureResult.getAeMode();
        CameraCaptureMetaData.AeMode aeMode2 = CameraCaptureMetaData.AeMode.OFF;
        boolean z3 = !z ? !(aeMode == aeMode2 || (i2 & 2) != 0 || AE_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAeState())) : !(aeMode == aeMode2 || (i2 & 2) == 0 || AE_TORCH_AS_FLASH_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAeState()));
        boolean z4 = cameraCaptureResult.getAwbMode() == CameraCaptureMetaData.AwbMode.OFF || (i2 & 4) == 0 || AWB_CONVERGED_STATE_SET.contains(cameraCaptureResult.getAwbState());
        Logger.d(TAG, "checkCaptureResult: AE =" + cameraCaptureResult.getAeState() + ", AF =" + cameraCaptureResult.getAfState() + ", AWB=" + cameraCaptureResult.getAwbState() + ", required3aModes = " + Integer.toHexString(i2));
        return z2 && z3 && z4;
    }

    public static boolean is3AConverged(CameraCaptureResult cameraCaptureResult, boolean z) {
        return is3AConverged(cameraCaptureResult, z, 7);
    }
}
