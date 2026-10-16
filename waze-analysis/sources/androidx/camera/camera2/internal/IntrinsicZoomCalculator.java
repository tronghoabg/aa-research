package androidx.camera.camera2.internal;

import androidx.camera.camera2.pipe.CameraMetadata;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface IntrinsicZoomCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public abstract class Bindings {
        public abstract IntrinsicZoomCalculator bindIntrinsicZoomCalculatorImpl(IntrinsicZoomCalculatorImpl intrinsicZoomCalculatorImpl);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final IntrinsicZoomCalculator NO_OP_INTRINSIC_ZOOM_CALCULATOR = new IntrinsicZoomCalculator() { // from class: androidx.camera.camera2.internal.IntrinsicZoomCalculator$Companion$NO_OP_INTRINSIC_ZOOM_CALCULATOR$1
            @Override // androidx.camera.camera2.internal.IntrinsicZoomCalculator
            public Float calculateIntrinsicZoomRatio(CameraMetadata cameraMetadata) {
                x.f(cameraMetadata, "cameraMetadata");
                return Float.valueOf(1.0f);
            }
        };

        private Companion() {
        }

        public final IntrinsicZoomCalculator getNO_OP_INTRINSIC_ZOOM_CALCULATOR() {
            return NO_OP_INTRINSIC_ZOOM_CALCULATOR;
        }
    }

    Float calculateIntrinsicZoomRatio(CameraMetadata cameraMetadata);
}
