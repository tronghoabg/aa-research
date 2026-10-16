package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraValidator;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraValidatorImpl implements CameraValidator {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CameraValidator";
    private final CameraSelector availableCamerasSelector;
    private final Context context;
    private final boolean isVirtualDevice;
    private final ValidationCriteria validationCriteria;

    /* compiled from: WazeSource */
    final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public final int getDeviceId(Context context) {
            x.f(context, "context");
            return context.getDeviceId();
        }
    }

    /* compiled from: WazeSource */
    final class ValidationCriteria {
        private final boolean checkBack;
        private final boolean checkFront;

        public ValidationCriteria(boolean z, boolean z2) {
            this.checkBack = z;
            this.checkFront = z2;
        }

        public static /* synthetic */ ValidationCriteria copy$default(ValidationCriteria validationCriteria, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = validationCriteria.checkBack;
            }
            if ((i2 & 2) != 0) {
                z2 = validationCriteria.checkFront;
            }
            return validationCriteria.copy(z, z2);
        }

        public final boolean component1() {
            return this.checkBack;
        }

        public final boolean component2() {
            return this.checkFront;
        }

        public final ValidationCriteria copy(boolean z, boolean z2) {
            return new ValidationCriteria(z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationCriteria)) {
                return false;
            }
            ValidationCriteria validationCriteria = (ValidationCriteria) obj;
            return this.checkBack == validationCriteria.checkBack && this.checkFront == validationCriteria.checkFront;
        }

        public final boolean getCheckBack() {
            return this.checkBack;
        }

        public final boolean getCheckFront() {
            return this.checkFront;
        }

        public int hashCode() {
            return (CameraValidatorImpl$ValidationCriteria$$ExternalSyntheticBackport0.m(this.checkBack) * 31) + CameraValidatorImpl$ValidationCriteria$$ExternalSyntheticBackport0.m(this.checkFront);
        }

        public String toString() {
            return "ValidationCriteria(checkBack=" + this.checkBack + ", checkFront=" + this.checkFront + ")";
        }
    }

    public CameraValidatorImpl(Context context, CameraSelector cameraSelector) {
        x.f(context, "context");
        this.context = context;
        this.availableCamerasSelector = cameraSelector;
        this.isVirtualDevice = isVirtualDevice(context);
        this.validationCriteria = getValidationCriteria();
    }

    private final ValidationCriteria getValidationCriteria() {
        CameraSelector cameraSelector = this.availableCamerasSelector;
        PackageManager packageManager = this.context.getPackageManager();
        Integer lensFacing = cameraSelector != null ? cameraSelector.getLensFacing() : null;
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        boolean zHasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
        boolean z = false;
        boolean z2 = zHasSystemFeature && (lensFacing == null || lensFacing.intValue() == 1);
        if (zHasSystemFeature2 && (lensFacing == null || lensFacing.intValue() == 0)) {
            z = true;
        }
        return new ValidationCriteria(z2, z);
    }

    private final boolean hasCamera(Set<? extends CameraInternal> set, CameraSelector cameraSelector) {
        try {
            cameraSelector.select(new LinkedHashSet<>(set));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private final boolean isVirtualDevice(Context context) {
        return Build.VERSION.SDK_INT >= 34 && Api34Impl.INSTANCE.getDeviceId(context) != 0;
    }

    @Override // androidx.camera.core.impl.CameraValidator
    public boolean isChangeInvalid(Set<? extends CameraInternal> set, Set<CameraIdentifier> set2) {
        x.f(set, "currentCameras");
        x.f(set2, "removedCameras");
        if (this.isVirtualDevice || !(this.validationCriteria.getCheckBack() || this.validationCriteria.getCheckFront())) {
            return false;
        }
        CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
        x.e(cameraSelector, "DEFAULT_BACK_CAMERA");
        boolean zHasCamera = hasCamera(set, cameraSelector);
        CameraSelector cameraSelector2 = CameraSelector.DEFAULT_FRONT_CAMERA;
        x.e(cameraSelector2, "DEFAULT_FRONT_CAMERA");
        boolean zHasCamera2 = hasCamera(set, cameraSelector2);
        Set<CameraIdentifier> set3 = set2;
        ArrayList arrayList = new ArrayList(i.q(set3, 10));
        Iterator<T> it = set3.iterator();
        while (it.hasNext()) {
            arrayList.add(((CameraIdentifier) it.next()).getInternalId());
        }
        Set setAu = i.au(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (!setAu.contains(((CameraInternal) obj).getCameraInfoInternal().getCameraId())) {
                arrayList2.add(obj);
            }
        }
        Set<? extends CameraInternal> setAu2 = i.au(arrayList2);
        CameraSelector cameraSelector3 = CameraSelector.DEFAULT_BACK_CAMERA;
        x.e(cameraSelector3, "DEFAULT_BACK_CAMERA");
        boolean zHasCamera3 = hasCamera(setAu2, cameraSelector3);
        CameraSelector cameraSelector4 = CameraSelector.DEFAULT_FRONT_CAMERA;
        x.e(cameraSelector4, "DEFAULT_FRONT_CAMERA");
        return (this.validationCriteria.getCheckBack() && zHasCamera && !zHasCamera3) || (this.validationCriteria.getCheckFront() && zHasCamera2 && !hasCamera(setAu2, cameraSelector4));
    }

    @Override // androidx.camera.core.impl.CameraValidator
    public void validateOnFirstInit(CameraRepository cameraRepository) throws CameraValidator.CameraIdListIncorrectException {
        x.f(cameraRepository, "cameraRepository");
        if (this.isVirtualDevice) {
            Logger.d(TAG, "Virtual device with " + cameraRepository.getCameras().size() + " cameras. Skipping validation.");
            return;
        }
        Logger.d(TAG, "Verifying camera lens facing on ".concat(String.valueOf(Build.DEVICE)));
        RuntimeException runtimeException = null;
        if (this.validationCriteria.getCheckBack()) {
            try {
                x.c(CameraSelector.DEFAULT_BACK_CAMERA.select(cameraRepository.getCameras()));
            } catch (RuntimeException e2) {
                runtimeException = e2;
                Logger.w(TAG, "Camera LENS_FACING_BACK verification failed", runtimeException);
            }
        }
        if (this.validationCriteria.getCheckFront()) {
            try {
                x.c(CameraSelector.DEFAULT_FRONT_CAMERA.select(cameraRepository.getCameras()));
            } catch (RuntimeException e3) {
                Logger.w(TAG, "Camera LENS_FACING_FRONT verification failed", e3);
                if (runtimeException == null) {
                    runtimeException = e3;
                }
            }
        }
        if (runtimeException != null) {
            throw new CameraValidator.CameraIdListIncorrectException("Expected camera missing from device.", cameraRepository.getCameras().size(), runtimeException);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
