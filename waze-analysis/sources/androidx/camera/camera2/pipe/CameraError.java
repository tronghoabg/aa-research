package androidx.camera.camera2.pipe;

import android.hardware.camera2.CameraAccessException;
import androidx.camera.camera2.pipe.core.Log;
import h.g.b.o;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class CameraError {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int ERROR_UNDETERMINED = 0;
    private static final int ERROR_CAMERA_IN_USE = 1;
    private static final int ERROR_CAMERA_LIMIT_EXCEEDED = 2;
    private static final int ERROR_CAMERA_DISABLED = 3;
    private static final int ERROR_CAMERA_DEVICE = 4;
    private static final int ERROR_CAMERA_SERVICE = 5;
    private static final int ERROR_CAMERA_DISCONNECTED = 6;
    private static final int ERROR_ILLEGAL_ARGUMENT_EXCEPTION = 7;
    private static final int ERROR_SECURITY_EXCEPTION = 8;
    private static final int ERROR_GRAPH_CONFIG = 9;
    private static final int ERROR_DO_NOT_DISTURB_ENABLED = 10;
    private static final int ERROR_UNKNOWN_EXCEPTION = 11;
    private static final int ERROR_CAMERA_OPENER = 12;
    private static final int ERROR_CAMERA_OPEN_TIMEOUT = 13;

    private /* synthetic */ CameraError(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CameraError m471boximpl(int i2) {
        return new CameraError(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m473equalsimpl(int i2, Object obj) {
        return (obj instanceof CameraError) && i2 == ((CameraError) obj).m478unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m474equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: isDisconnected-impl, reason: not valid java name */
    public static final boolean m476isDisconnectedimpl(int i2) {
        return m474equalsimpl0(i2, ERROR_CAMERA_DISCONNECTED) || m474equalsimpl0(i2, ERROR_CAMERA_IN_USE) || m474equalsimpl0(i2, ERROR_CAMERA_LIMIT_EXCEEDED);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m477toStringimpl(int i2) {
        return "CameraError(" + (m474equalsimpl0(i2, ERROR_UNDETERMINED) ? "ERROR_UNDETERMINED" : m474equalsimpl0(i2, ERROR_CAMERA_IN_USE) ? "ERROR_CAMERA_IN_USE" : m474equalsimpl0(i2, ERROR_CAMERA_LIMIT_EXCEEDED) ? "ERROR_CAMERA_LIMIT_EXCEEDED" : m474equalsimpl0(i2, ERROR_CAMERA_DISABLED) ? "ERROR_CAMERA_DISABLED" : m474equalsimpl0(i2, ERROR_CAMERA_DEVICE) ? "ERROR_CAMERA_DEVICE" : m474equalsimpl0(i2, ERROR_CAMERA_SERVICE) ? "ERROR_CAMERA_SERVICE" : m474equalsimpl0(i2, ERROR_CAMERA_DISCONNECTED) ? "ERROR_CAMERA_DISCONNECTED" : m474equalsimpl0(i2, ERROR_ILLEGAL_ARGUMENT_EXCEPTION) ? "ERROR_ILLEGAL_ARGUMENT_EXCEPTION" : m474equalsimpl0(i2, ERROR_SECURITY_EXCEPTION) ? "ERROR_SECURITY_EXCEPTION" : m474equalsimpl0(i2, ERROR_GRAPH_CONFIG) ? "ERROR_GRAPH_CONFIG" : m474equalsimpl0(i2, ERROR_DO_NOT_DISTURB_ENABLED) ? "ERROR_DO_NOT_DISTURB_ENABLED" : m474equalsimpl0(i2, ERROR_UNKNOWN_EXCEPTION) ? "ERROR_UNKNOWN_EXCEPTION" : m474equalsimpl0(i2, ERROR_CAMERA_OPENER) ? "ERROR_CAMERA_OPENER" : m474equalsimpl0(i2, ERROR_CAMERA_OPEN_TIMEOUT) ? "ERROR_CAMERA_OPEN_TIMEOUT" : "ERROR_UNKNOWN") + ")";
    }

    public boolean equals(Object obj) {
        return m473equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m477toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m478unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final boolean isDoNotDisturbException(Throwable th) {
            if (!(th instanceof RuntimeException)) {
                return false;
            }
            StackTraceElement[] stackTrace = ((RuntimeException) th).getStackTrace();
            x.c(stackTrace);
            return x.n(stackTrace.length == 0 ? null : stackTrace[0].getMethodName(), "_enableShutterSound");
        }

        /* renamed from: from-PVuDhNw$camera_camera2_pipe, reason: not valid java name */
        public final int m480fromPVuDhNw$camera_camera2_pipe(CameraAccessException cameraAccessException) {
            x.f(cameraAccessException, "exception");
            int reason = cameraAccessException.getReason();
            if (reason == 1) {
                return m483getERROR_CAMERA_DISABLEDv7Vf74A();
            }
            if (reason == 2) {
                return m484getERROR_CAMERA_DISCONNECTEDv7Vf74A();
            }
            if (reason == 3) {
                return m494getERROR_UNDETERMINEDv7Vf74A();
            }
            if (reason == 4) {
                return m485getERROR_CAMERA_IN_USEv7Vf74A();
            }
            if (reason == 5) {
                return m486getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A();
            }
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                Objects.toString(cameraAccessException);
                android.util.Log.w(Log.TAG, "Unexpected CameraAccessException: ".concat(String.valueOf(cameraAccessException)));
            }
            return m495getERROR_UNKNOWN_EXCEPTIONv7Vf74A();
        }

        /* renamed from: getERROR_CAMERA_DEVICE-v7Vf74A, reason: not valid java name */
        public final int m482getERROR_CAMERA_DEVICEv7Vf74A() {
            return CameraError.ERROR_CAMERA_DEVICE;
        }

        /* renamed from: getERROR_CAMERA_DISABLED-v7Vf74A, reason: not valid java name */
        public final int m483getERROR_CAMERA_DISABLEDv7Vf74A() {
            return CameraError.ERROR_CAMERA_DISABLED;
        }

        /* renamed from: getERROR_CAMERA_DISCONNECTED-v7Vf74A, reason: not valid java name */
        public final int m484getERROR_CAMERA_DISCONNECTEDv7Vf74A() {
            return CameraError.ERROR_CAMERA_DISCONNECTED;
        }

        /* renamed from: getERROR_CAMERA_IN_USE-v7Vf74A, reason: not valid java name */
        public final int m485getERROR_CAMERA_IN_USEv7Vf74A() {
            return CameraError.ERROR_CAMERA_IN_USE;
        }

        /* renamed from: getERROR_CAMERA_LIMIT_EXCEEDED-v7Vf74A, reason: not valid java name */
        public final int m486getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A() {
            return CameraError.ERROR_CAMERA_LIMIT_EXCEEDED;
        }

        /* renamed from: getERROR_CAMERA_OPENER-v7Vf74A, reason: not valid java name */
        public final int m487getERROR_CAMERA_OPENERv7Vf74A() {
            return CameraError.ERROR_CAMERA_OPENER;
        }

        /* renamed from: getERROR_CAMERA_OPEN_TIMEOUT-v7Vf74A, reason: not valid java name */
        public final int m488getERROR_CAMERA_OPEN_TIMEOUTv7Vf74A() {
            return CameraError.ERROR_CAMERA_OPEN_TIMEOUT;
        }

        /* renamed from: getERROR_CAMERA_SERVICE-v7Vf74A, reason: not valid java name */
        public final int m489getERROR_CAMERA_SERVICEv7Vf74A() {
            return CameraError.ERROR_CAMERA_SERVICE;
        }

        /* renamed from: getERROR_DO_NOT_DISTURB_ENABLED-v7Vf74A, reason: not valid java name */
        public final int m490getERROR_DO_NOT_DISTURB_ENABLEDv7Vf74A() {
            return CameraError.ERROR_DO_NOT_DISTURB_ENABLED;
        }

        /* renamed from: getERROR_GRAPH_CONFIG-v7Vf74A, reason: not valid java name */
        public final int m491getERROR_GRAPH_CONFIGv7Vf74A() {
            return CameraError.ERROR_GRAPH_CONFIG;
        }

        /* renamed from: getERROR_ILLEGAL_ARGUMENT_EXCEPTION-v7Vf74A, reason: not valid java name */
        public final int m492getERROR_ILLEGAL_ARGUMENT_EXCEPTIONv7Vf74A() {
            return CameraError.ERROR_ILLEGAL_ARGUMENT_EXCEPTION;
        }

        /* renamed from: getERROR_SECURITY_EXCEPTION-v7Vf74A, reason: not valid java name */
        public final int m493getERROR_SECURITY_EXCEPTIONv7Vf74A() {
            return CameraError.ERROR_SECURITY_EXCEPTION;
        }

        /* renamed from: getERROR_UNDETERMINED-v7Vf74A, reason: not valid java name */
        public final int m494getERROR_UNDETERMINEDv7Vf74A() {
            return CameraError.ERROR_UNDETERMINED;
        }

        /* renamed from: getERROR_UNKNOWN_EXCEPTION-v7Vf74A, reason: not valid java name */
        public final int m495getERROR_UNKNOWN_EXCEPTIONv7Vf74A() {
            return CameraError.ERROR_UNKNOWN_EXCEPTION;
        }

        public final boolean shouldHandleDoNotDisturbException$camera_camera2_pipe(Throwable th) {
            x.f(th, "throwable");
            return false;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: from-PVuDhNw$camera_camera2_pipe, reason: not valid java name */
        public final int m479fromPVuDhNw$camera_camera2_pipe(int i2) {
            if (i2 == 1) {
                return m485getERROR_CAMERA_IN_USEv7Vf74A();
            }
            if (i2 == 2) {
                return m486getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A();
            }
            if (i2 == 3) {
                return m483getERROR_CAMERA_DISABLEDv7Vf74A();
            }
            if (i2 == 4) {
                return m482getERROR_CAMERA_DEVICEv7Vf74A();
            }
            if (i2 == 5) {
                return m489getERROR_CAMERA_SERVICEv7Vf74A();
            }
            throw new IllegalArgumentException("Unexpected StateCallback error code: " + i2);
        }

        /* renamed from: from-PVuDhNw$camera_camera2_pipe, reason: not valid java name */
        public final int m481fromPVuDhNw$camera_camera2_pipe(Throwable th) {
            x.f(th, "throwable");
            if (th instanceof CameraAccessException) {
                return m480fromPVuDhNw$camera_camera2_pipe((CameraAccessException) th);
            }
            if (th instanceof IllegalArgumentException) {
                return m492getERROR_ILLEGAL_ARGUMENT_EXCEPTIONv7Vf74A();
            }
            if (th instanceof SecurityException) {
                return m493getERROR_SECURITY_EXCEPTIONv7Vf74A();
            }
            shouldHandleDoNotDisturbException$camera_camera2_pipe(th);
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                Objects.toString(th);
                android.util.Log.w(Log.TAG, "Unexpected throwable: ".concat(String.valueOf(th)));
            }
            return m495getERROR_UNKNOWN_EXCEPTIONv7Vf74A();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m472constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m475hashCodeimpl(int i2) {
        return i2;
    }
}
