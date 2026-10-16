package androidx.camera.camera2.pipe;

import android.view.Surface;
import kotlinx.a.b;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraInterop {
    public static final CameraInterop INSTANCE = new CameraInterop();
    private static final b captureSessionIds = h.e.b.f(0);

    /* compiled from: WazeSource */
    public interface CameraSystemCallbacks {
        void onCameraSystemStarting();

        void onCameraSystemStopped();
    }

    /* compiled from: WazeSource */
    public interface CaptureSessionListener {
        /* renamed from: onActive-rphkYDA */
        void mo241onActiverphkYDA(String str, int i2);

        /* renamed from: onCaptureQueueEmpty-rphkYDA */
        void mo242onCaptureQueueEmptyrphkYDA(String str, int i2);

        /* renamed from: onClosed-rphkYDA */
        void mo243onClosedrphkYDA(String str, int i2);

        /* renamed from: onConfigureFailed-rphkYDA */
        void mo244onConfigureFailedrphkYDA(String str, int i2);

        /* renamed from: onConfigured-rphkYDA */
        void mo245onConfiguredrphkYDA(String str, int i2);

        /* renamed from: onReady-rphkYDA */
        void mo246onReadyrphkYDA(String str, int i2);

        /* renamed from: onSurfacePrepared-GyX_H3Q */
        void mo247onSurfacePreparedGyX_H3Q(String str, int i2, Surface surface);
    }

    private CameraInterop() {
    }

    private static /* synthetic */ void getCaptureSessionIds$annotations() {
    }

    /* compiled from: WazeSource */
    @h.g.a
    public final class CameraCaptureSessionId {
        private final int value;

        private /* synthetic */ CameraCaptureSessionId(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ CameraCaptureSessionId m557boximpl(int i2) {
            return new CameraCaptureSessionId(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m559equalsimpl(int i2, Object obj) {
            return (obj instanceof CameraCaptureSessionId) && i2 == ((CameraCaptureSessionId) obj).m563unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m560equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m562toStringimpl(int i2) {
            return a.a(i2, "CameraCaptureSessionId(value=", ")");
        }

        public boolean equals(Object obj) {
            return m559equalsimpl(this.value, obj);
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m562toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m563unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m558constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m561hashCodeimpl(int i2) {
            return i2;
        }
    }
}
