package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.AudioRestrictionMode;
import androidx.camera.camera2.pipe.CameraGraph;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface AudioRestrictionController {

    /* compiled from: WazeSource */
    public interface Listener {
        /* renamed from: onCameraAudioRestrictionUpdated-LwUUkyU */
        void mo986onCameraAudioRestrictionUpdatedLwUUkyU(int i2);
    }

    void addListener(Listener listener);

    /* renamed from: getGlobalAudioRestrictionMode-4o0Og1A, reason: not valid java name */
    AudioRestrictionMode mo1001getGlobalAudioRestrictionMode4o0Og1A();

    void removeCameraGraph(CameraGraph cameraGraph);

    void removeListener(Listener listener);

    /* renamed from: setGlobalAudioRestrictionMode-3NUV5dA, reason: not valid java name */
    void mo1002setGlobalAudioRestrictionMode3NUV5dA(AudioRestrictionMode audioRestrictionMode);

    /* renamed from: updateCameraGraphAudioRestrictionMode-TyYSX5E, reason: not valid java name */
    void mo1003updateCameraGraphAudioRestrictionModeTyYSX5E(CameraGraph cameraGraph, int i2);
}
