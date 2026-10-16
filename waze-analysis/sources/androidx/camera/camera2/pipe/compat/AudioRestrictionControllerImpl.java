package androidx.camera.camera2.pipe.compat;

import android.os.Build;
import androidx.camera.camera2.pipe.AudioRestrictionMode;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.compat.AudioRestrictionController;
import androidx.camera.camera2.pipe.config.CameraPipeJob;
import androidx.camera.camera2.pipe.core.CoroutineMutex;
import androidx.camera.camera2.pipe.core.MutexesKt;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraPipeLifetime;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AudioRestrictionControllerImpl implements AudioRestrictionController {
    private final CopyOnWriteArrayList<AudioRestrictionController.Listener> activeListeners;
    private final Map<CameraGraph, AudioRestrictionMode> audioRestrictionModeMap;
    private final CoroutineMutex coroutineMutex;
    private AudioRestrictionMode globalAudioRestrictionMode;
    private final Object lock;
    private final af scope;

    public AudioRestrictionControllerImpl(Threads threads, CameraPipeLifetime cameraPipeLifetime, @CameraPipeJob br brVar) {
        x.f(threads, "threads");
        x.f(cameraPipeLifetime, "cameraPipeLifetime");
        x.f(brVar, "cameraPipeJob");
        this.scope = aj.e(aj.P(brVar).plus(threads.getLightweightDispatcher().plus(new ae("CXCP-AudioRestrictionControllerImpl"))));
        this.coroutineMutex = new CoroutineMutex();
        this.lock = new Object();
        this.audioRestrictionModeMap = new LinkedHashMap();
        this.activeListeners = new CopyOnWriteArrayList<>();
        cameraPipeLifetime.addShutdownAction(CameraPipeLifetime.ShutdownType.SCOPE, new Runnable() { // from class: androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                aj.h(this.f$0.scope, null);
            }
        });
    }

    /* renamed from: computeAudioRestrictionMode-4o0Og1A, reason: not valid java name */
    private final AudioRestrictionMode m1004computeAudioRestrictionMode4o0Og1A() {
        if (!this.audioRestrictionModeMap.containsValue(AudioRestrictionMode.m330boximpl(AudioRestrictionMode.Companion.m339getAUDIO_RESTRICTION_VIBRATION_SOUND_b5Q8KE()))) {
            AudioRestrictionMode audioRestrictionModeMo1001getGlobalAudioRestrictionMode4o0Og1A = mo1001getGlobalAudioRestrictionMode4o0Og1A();
            int iM339getAUDIO_RESTRICTION_VIBRATION_SOUND_b5Q8KE = AudioRestrictionMode.Companion.m339getAUDIO_RESTRICTION_VIBRATION_SOUND_b5Q8KE();
            if (audioRestrictionModeMo1001getGlobalAudioRestrictionMode4o0Og1A == null || !AudioRestrictionMode.m333equalsimpl0(audioRestrictionModeMo1001getGlobalAudioRestrictionMode4o0Og1A.m336unboximpl(), iM339getAUDIO_RESTRICTION_VIBRATION_SOUND_b5Q8KE)) {
                if (!this.audioRestrictionModeMap.containsValue(AudioRestrictionMode.m330boximpl(AudioRestrictionMode.Companion.m338getAUDIO_RESTRICTION_VIBRATION_b5Q8KE()))) {
                    AudioRestrictionMode audioRestrictionModeMo1001getGlobalAudioRestrictionMode4o0Og1A2 = mo1001getGlobalAudioRestrictionMode4o0Og1A();
                    int iM338getAUDIO_RESTRICTION_VIBRATION_b5Q8KE = AudioRestrictionMode.Companion.m338getAUDIO_RESTRICTION_VIBRATION_b5Q8KE();
                    if (audioRestrictionModeMo1001getGlobalAudioRestrictionMode4o0Og1A2 == null || !AudioRestrictionMode.m333equalsimpl0(audioRestrictionModeMo1001getGlobalAudioRestrictionMode4o0Og1A2.m336unboximpl(), iM338getAUDIO_RESTRICTION_VIBRATION_b5Q8KE)) {
                        if (!this.audioRestrictionModeMap.containsValue(AudioRestrictionMode.m330boximpl(AudioRestrictionMode.Companion.m337getAUDIO_RESTRICTION_NONE_b5Q8KE()))) {
                            AudioRestrictionMode audioRestrictionModeMo1001getGlobalAudioRestrictionMode4o0Og1A3 = mo1001getGlobalAudioRestrictionMode4o0Og1A();
                            int iM337getAUDIO_RESTRICTION_NONE_b5Q8KE = AudioRestrictionMode.Companion.m337getAUDIO_RESTRICTION_NONE_b5Q8KE();
                            if (audioRestrictionModeMo1001getGlobalAudioRestrictionMode4o0Og1A3 == null || !AudioRestrictionMode.m333equalsimpl0(audioRestrictionModeMo1001getGlobalAudioRestrictionMode4o0Og1A3.m336unboximpl(), iM337getAUDIO_RESTRICTION_NONE_b5Q8KE)) {
                                return null;
                            }
                        }
                        return AudioRestrictionMode.m330boximpl(AudioRestrictionMode.Companion.m337getAUDIO_RESTRICTION_NONE_b5Q8KE());
                    }
                }
                return AudioRestrictionMode.m330boximpl(AudioRestrictionMode.Companion.m338getAUDIO_RESTRICTION_VIBRATION_b5Q8KE());
            }
        }
        return AudioRestrictionMode.m330boximpl(AudioRestrictionMode.Companion.m339getAUDIO_RESTRICTION_VIBRATION_SOUND_b5Q8KE());
    }

    /* renamed from: updateListenersMode-3NUV5dA, reason: not valid java name */
    private final void m1005updateListenersMode3NUV5dA(AudioRestrictionMode audioRestrictionMode) {
        AudioRestrictionMode audioRestrictionModeM1004computeAudioRestrictionMode4o0Og1A = m1004computeAudioRestrictionMode4o0Og1A();
        if (audioRestrictionModeM1004computeAudioRestrictionMode4o0Og1A == null || x.n(audioRestrictionModeM1004computeAudioRestrictionMode4o0Og1A, audioRestrictionMode)) {
            return;
        }
        MutexesKt.withLockLaunch(this.coroutineMutex, this.scope, new AudioRestrictionControllerImpl$updateListenersMode$1(this, audioRestrictionModeM1004computeAudioRestrictionMode4o0Og1A, null));
    }

    @Override // androidx.camera.camera2.pipe.compat.AudioRestrictionController
    public void addListener(AudioRestrictionController.Listener listener) {
        x.f(listener, "listener");
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        synchronized (this.lock) {
            this.activeListeners.add(listener);
            AudioRestrictionMode audioRestrictionModeM1004computeAudioRestrictionMode4o0Og1A = m1004computeAudioRestrictionMode4o0Og1A();
            if (audioRestrictionModeM1004computeAudioRestrictionMode4o0Og1A != null) {
                MutexesKt.withLockLaunch(this.coroutineMutex, this.scope, new AudioRestrictionControllerImpl$addListener$1$1(listener, audioRestrictionModeM1004computeAudioRestrictionMode4o0Og1A, null));
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.AudioRestrictionController
    /* renamed from: getGlobalAudioRestrictionMode-4o0Og1A */
    public AudioRestrictionMode mo1001getGlobalAudioRestrictionMode4o0Og1A() {
        AudioRestrictionMode audioRestrictionMode;
        synchronized (this.lock) {
            audioRestrictionMode = this.globalAudioRestrictionMode;
        }
        return audioRestrictionMode;
    }

    @Override // androidx.camera.camera2.pipe.compat.AudioRestrictionController
    public void removeCameraGraph(CameraGraph cameraGraph) {
        x.f(cameraGraph, "cameraGraph");
        synchronized (this.lock) {
            AudioRestrictionMode audioRestrictionModeM1004computeAudioRestrictionMode4o0Og1A = m1004computeAudioRestrictionMode4o0Og1A();
            this.audioRestrictionModeMap.remove(cameraGraph);
            m1005updateListenersMode3NUV5dA(audioRestrictionModeM1004computeAudioRestrictionMode4o0Og1A);
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.AudioRestrictionController
    public void removeListener(AudioRestrictionController.Listener listener) {
        x.f(listener, "listener");
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        this.activeListeners.remove(listener);
    }

    @Override // androidx.camera.camera2.pipe.compat.AudioRestrictionController
    /* renamed from: setGlobalAudioRestrictionMode-3NUV5dA */
    public void mo1002setGlobalAudioRestrictionMode3NUV5dA(AudioRestrictionMode audioRestrictionMode) {
        if (audioRestrictionMode == null) {
            throw new IllegalArgumentException("Unsupported setting AudioRestrictionMode to null.");
        }
        synchronized (this.lock) {
            AudioRestrictionMode audioRestrictionModeM1004computeAudioRestrictionMode4o0Og1A = m1004computeAudioRestrictionMode4o0Og1A();
            this.globalAudioRestrictionMode = audioRestrictionMode;
            m1005updateListenersMode3NUV5dA(audioRestrictionModeM1004computeAudioRestrictionMode4o0Og1A);
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.AudioRestrictionController
    /* renamed from: updateCameraGraphAudioRestrictionMode-TyYSX5E */
    public void mo1003updateCameraGraphAudioRestrictionModeTyYSX5E(CameraGraph cameraGraph, int i2) {
        x.f(cameraGraph, "cameraGraph");
        synchronized (this.lock) {
            AudioRestrictionMode audioRestrictionModeM1004computeAudioRestrictionMode4o0Og1A = m1004computeAudioRestrictionMode4o0Og1A();
            this.audioRestrictionModeMap.put(cameraGraph, AudioRestrictionMode.m330boximpl(i2));
            m1005updateListenersMode3NUV5dA(audioRestrictionModeM1004computeAudioRestrictionMode4o0Og1A);
        }
    }
}
