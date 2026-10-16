package androidx.camera.camera2.pipe;

import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.CameraGraph;
import h.g.a.l;
import java.util.List;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraControls3A {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.CameraControls3A$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: converge3A-3VUeUZc$default, reason: not valid java name */
        public static /* synthetic */ am m429converge3A3VUeUZc$default(CameraControls3A cameraControls3A, List list, List list2, List list3, Converge3ABehavior converge3ABehavior, Converge3ABehavior converge3ABehavior2, Converge3ABehavior converge3ABehavior3, l lVar, Integer num, Long l2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: converge3A-3VUeUZc");
            }
            if (1 == (i2 & 1)) {
                list = null;
            }
            if ((i2 & 2) != 0) {
                list2 = null;
            }
            if ((i2 & 4) != 0) {
                list3 = null;
            }
            if ((i2 & 8) != 0) {
                converge3ABehavior = null;
            }
            if ((i2 & 16) != 0) {
                converge3ABehavior2 = null;
            }
            if ((i2 & 32) != 0) {
                converge3ABehavior3 = null;
            }
            if ((i2 & 64) != 0) {
                lVar = null;
            }
            if ((i2 & 128) != 0) {
                num = 60;
            }
            if ((i2 & 256) != 0) {
                l2 = Long.valueOf(CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS);
            }
            return cameraControls3A.mo425converge3A3VUeUZc(list, list2, list3, converge3ABehavior, converge3ABehavior2, converge3ABehavior3, lVar, num, l2);
        }

        /* renamed from: setTorchOff-NqN7i0k$default, reason: not valid java name */
        public static /* synthetic */ am m430setTorchOffNqN7i0k$default(CameraControls3A cameraControls3A, AeMode aeMode, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTorchOff-NqN7i0k");
            }
            if (1 == (i2 & 1)) {
                aeMode = null;
            }
            return cameraControls3A.mo426setTorchOffNqN7i0k(aeMode);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: submit3A-ydBZfZg$default, reason: not valid java name */
        public static /* synthetic */ am m431submit3AydBZfZg$default(CameraControls3A cameraControls3A, AeMode aeMode, AfMode afMode, AwbMode awbMode, List list, List list2, List list3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submit3A-ydBZfZg");
            }
            if (1 == (i2 & 1)) {
                aeMode = null;
            }
            if ((i2 & 2) != 0) {
                afMode = null;
            }
            if ((i2 & 4) != 0) {
                awbMode = null;
            }
            if ((i2 & 8) != 0) {
                list = null;
            }
            if ((i2 & 16) != 0) {
                list2 = null;
            }
            if ((i2 & 32) != 0) {
                list3 = null;
            }
            return cameraControls3A.mo427submit3AydBZfZg(aeMode, afMode, awbMode, list, list2, list3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: update3A-znct4lo$default, reason: not valid java name */
        public static /* synthetic */ am m432update3Aznct4lo$default(CameraControls3A cameraControls3A, AeMode aeMode, AfMode afMode, AwbMode awbMode, ControlMode controlMode, FlashMode flashMode, List list, List list2, List list3, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update3A-znct4lo");
            }
            if (1 == (i2 & 1)) {
                aeMode = null;
            }
            if ((i2 & 2) != 0) {
                afMode = null;
            }
            if ((i2 & 4) != 0) {
                awbMode = null;
            }
            if ((i2 & 8) != 0) {
                controlMode = null;
            }
            if ((i2 & 16) != 0) {
                flashMode = null;
            }
            if ((i2 & 32) != 0) {
                list = null;
            }
            if ((i2 & 64) != 0) {
                list2 = null;
            }
            if ((i2 & 128) != 0) {
                list3 = null;
            }
            return cameraControls3A.mo428update3Aznct4lo(aeMode, afMode, awbMode, controlMode, flashMode, list, list2, list3, z & ((i2 & 256) == 0));
        }
    }

    /* renamed from: converge3A-3VUeUZc, reason: not valid java name */
    am<Result3A> mo425converge3A3VUeUZc(List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Converge3ABehavior converge3ABehavior, Converge3ABehavior converge3ABehavior2, Converge3ABehavior converge3ABehavior3, l<? super FrameMetadata, Boolean> lVar, Integer num, Long l2);

    /* renamed from: setTorchOff-NqN7i0k, reason: not valid java name */
    am<Result3A> mo426setTorchOffNqN7i0k(AeMode aeMode);

    am<Result3A> setTorchOn();

    /* renamed from: submit3A-ydBZfZg, reason: not valid java name */
    am<Result3A> mo427submit3AydBZfZg(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3);

    /* renamed from: update3A-znct4lo, reason: not valid java name */
    am<Result3A> mo428update3Aznct4lo(AeMode aeMode, AfMode afMode, AwbMode awbMode, ControlMode controlMode, FlashMode flashMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, boolean z);
}
