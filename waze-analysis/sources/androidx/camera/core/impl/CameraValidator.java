package androidx.camera.core.impl;

import android.content.Context;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraSelector;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraValidator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.impl.CameraValidator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static CameraValidator create(Context context, CameraSelector cameraSelector) {
            return CameraValidator.Companion.create(context, cameraSelector);
        }
    }

    /* compiled from: WazeSource */
    public final class CameraIdListIncorrectException extends Exception {
        private final int availableCameraCount;

        public CameraIdListIncorrectException(String str, int i2, Throwable th) {
            super(str, th);
            this.availableCameraCount = i2;
        }

        public final int getAvailableCameraCount() {
            return this.availableCameraCount;
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CameraValidator create(Context context, CameraSelector cameraSelector) {
            x.f(context, "context");
            return new CameraValidatorImpl(context, cameraSelector);
        }
    }

    boolean isChangeInvalid(Set<? extends CameraInternal> set, Set<CameraIdentifier> set2);

    void validateOnFirstInit(CameraRepository cameraRepository);
}
