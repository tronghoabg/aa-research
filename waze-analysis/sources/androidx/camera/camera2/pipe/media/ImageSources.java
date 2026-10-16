package androidx.camera.camera2.pipe.media;

import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.ImageSourceConfig;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ImageSources {
    ImageSource createImageSource(CameraStream cameraStream, ImageSourceConfig imageSourceConfig);
}
