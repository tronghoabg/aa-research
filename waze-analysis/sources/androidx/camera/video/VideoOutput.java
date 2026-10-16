package androidx.camera.video;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface VideoOutput {

    /* compiled from: WazeSource */
    public enum SourceState {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    EncoderProfilesResolver getEncoderProfilesResolver(CameraInfo cameraInfo, int i2);

    VideoCapabilities getMediaCapabilities(CameraInfo cameraInfo, int i2);

    Observable<MediaSpec> getMediaSpec();

    Observable<StreamInfo> getStreamInfo();

    boolean isQualitySelectorDefault();

    Observable<Boolean> isSourceStreamRequired();

    void onSourceStateChanged(SourceState sourceState);

    void onSurfaceRequested(SurfaceRequest surfaceRequest);

    void onSurfaceRequested(SurfaceRequest surfaceRequest, Timebase timebase, boolean z);

    void onValidateConfig();

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.video.VideoOutput$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$isQualitySelectorDefault(VideoOutput videoOutput) {
            return true;
        }

        public static void $default$onValidateConfig(VideoOutput videoOutput) {
        }

        public static void $default$onSourceStateChanged(VideoOutput videoOutput, SourceState sourceState) {
        }
    }
}
