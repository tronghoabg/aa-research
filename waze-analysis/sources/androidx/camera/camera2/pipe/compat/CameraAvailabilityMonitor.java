package androidx.camera.camera2.pipe.compat;

import h.ab;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraAvailabilityMonitor {

    /* compiled from: WazeSource */
    public interface Session extends AutoCloseable {
        /* renamed from: awaitAvailableCamera-KLykuaI */
        Object mo1007awaitAvailableCameraKLykuaI(long j2, am<ab> amVar, h.c.e<? super Boolean> eVar);
    }

    /* renamed from: startMonitoring-0r8Bogc */
    Object mo1006startMonitoring0r8Bogc(String str, h.c.e<? super Session> eVar);
}
