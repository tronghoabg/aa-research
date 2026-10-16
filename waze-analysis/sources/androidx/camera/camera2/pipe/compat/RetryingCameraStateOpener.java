package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface RetryingCameraStateOpener {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: openCameraWithRetry-zDSwpeU$default, reason: not valid java name */
        public static /* synthetic */ Object m1093openCameraWithRetryzDSwpeU$default(RetryingCameraStateOpener retryingCameraStateOpener, String str, Camera2DeviceCloser camera2DeviceCloser, l lVar, am amVar, h.c.e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openCameraWithRetry-zDSwpeU");
            }
            if ((i2 & 4) != 0) {
                lVar = new l() { // from class: androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        RetryingCameraStateOpener.CC.openCameraWithRetry_zDSwpeU$lambda$0((ab) obj2);
                        return true;
                    }
                };
            }
            l lVar2 = lVar;
            if ((i2 & 8) != 0) {
                amVar = bo.j();
            }
            return retryingCameraStateOpener.mo1092openCameraWithRetryzDSwpeU(str, camera2DeviceCloser, lVar2, amVar, eVar);
        }

        public static boolean openCameraWithRetry_zDSwpeU$lambda$0(ab abVar) {
            x.f(abVar, "<unused var>");
            return true;
        }
    }

    void cancelOpen();

    /* renamed from: openAndAwaitCameraWithRetry-0r8Bogc, reason: not valid java name */
    AwaitOpenCameraResult mo1091openAndAwaitCameraWithRetry0r8Bogc(String str, Camera2DeviceCloser camera2DeviceCloser);

    /* renamed from: openCameraWithRetry-zDSwpeU, reason: not valid java name */
    Object mo1092openCameraWithRetryzDSwpeU(String str, Camera2DeviceCloser camera2DeviceCloser, l<? super ab, Boolean> lVar, am<ab> amVar, h.c.e<? super OpenCameraResult> eVar);
}
