package androidx.camera.camera2.pipe;

import h.ab;
import h.c.e;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraBackends {
    /* renamed from: get-SG3A4s8, reason: not valid java name */
    CameraBackend mo389getSG3A4s8(String str);

    Set<CameraBackendId> getActiveIds();

    Set<CameraBackendId> getAllIds();

    CameraBackend getDefault();

    Object shutdown(e<? super ab> eVar);
}
