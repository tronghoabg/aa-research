package androidx.camera.camera2.pipe.compat;

import android.os.Trace;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraInterop;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.Threads;
import h.g.b.x;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2SystemState {
    private final Set<CameraId> activeCameras;
    private final Set<CameraGraphId> activeGraphs;
    private final CameraPipe.CameraInteropConfig cameraInteropConfig;
    private final Object lock;
    private State systemState;
    private final Threads threads;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    final class State {
        private static final /* synthetic */ h.d.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State STOPPED = new State("STOPPED", 0);
        public static final State STARTED = new State("STARTED", 1);

        private static final /* synthetic */ State[] $values() {
            return new State[]{STOPPED, STARTED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = h.d.b.a(stateArr$values);
        }

        private State(String str, int i2) {
        }

        public static h.d.a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public Camera2SystemState(CameraPipe.CameraInteropConfig cameraInteropConfig, Threads threads) {
        x.f(cameraInteropConfig, "cameraInteropConfig");
        x.f(threads, "threads");
        this.cameraInteropConfig = cameraInteropConfig;
        this.threads = threads;
        this.lock = new Object();
        this.systemState = State.STOPPED;
        this.activeCameras = new LinkedHashSet();
        this.activeGraphs = new LinkedHashSet();
    }

    private final void invokeStarting() {
        this.systemState = State.STARTED;
        try {
            Trace.beginSection("onCameraSystemStarting");
            CameraInterop.CameraSystemCallbacks cameraSystemCallbacks = this.cameraInteropConfig.getCameraSystemCallbacks();
            if (cameraSystemCallbacks != null) {
                cameraSystemCallbacks.onCameraSystemStarting();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeStopped() {
        this.systemState = State.STOPPED;
        try {
            Trace.beginSection("onCameraSystemStopped");
            CameraInterop.CameraSystemCallbacks cameraSystemCallbacks = this.cameraInteropConfig.getCameraSystemCallbacks();
            if (cameraSystemCallbacks != null) {
                cameraSystemCallbacks.onCameraSystemStopped();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: onCameraClosed-EfqyGwQ, reason: not valid java name */
    public final void m1054onCameraClosedEfqyGwQ(String str) {
        x.f(str, "cameraId");
        synchronized (this.lock) {
            if (this.activeCameras.remove(CameraId.m546boximpl(str)) && this.activeCameras.isEmpty() && this.activeGraphs.isEmpty()) {
                invokeStopped();
            }
        }
    }

    /* renamed from: onCameraOpening-EfqyGwQ, reason: not valid java name */
    public final void m1055onCameraOpeningEfqyGwQ(String str) {
        x.f(str, "cameraId");
        synchronized (this.lock) {
            this.activeCameras.add(CameraId.m546boximpl(str));
            if (this.systemState == State.STOPPED) {
                invokeStarting();
            }
        }
    }

    public final void onGraphStarting(CameraGraphId cameraGraphId) {
        x.f(cameraGraphId, "graphId");
        synchronized (this.lock) {
            this.activeGraphs.add(cameraGraphId);
        }
    }

    public final void onGraphStopped(CameraGraphId cameraGraphId) {
        x.f(cameraGraphId, "graphId");
        synchronized (this.lock) {
            this.activeGraphs.remove(cameraGraphId);
            if (this.activeGraphs.isEmpty() && this.activeCameras.isEmpty()) {
                aj.z(this.threads.getCameraPipeScope(), null, null, new Camera2SystemState$onGraphStopped$1$1(this, null), 3);
            }
        }
    }
}
