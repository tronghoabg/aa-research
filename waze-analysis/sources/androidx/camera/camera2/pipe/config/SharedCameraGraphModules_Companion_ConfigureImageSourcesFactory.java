package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.media.ImageReaderImageSources;
import androidx.camera.camera2.pipe.media.ImageSources;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SharedCameraGraphModules_Companion_ConfigureImageSourcesFactory implements c<ImageSources> {
    private final e<CameraPipe.Config> cameraPipeConfigProvider;
    private final e<ImageReaderImageSources> imageReaderImageSourcesProvider;

    private SharedCameraGraphModules_Companion_ConfigureImageSourcesFactory(e<ImageReaderImageSources> eVar, e<CameraPipe.Config> eVar2) {
        this.imageReaderImageSourcesProvider = eVar;
        this.cameraPipeConfigProvider = eVar2;
    }

    public static ImageSources configureImageSources(ImageReaderImageSources imageReaderImageSources, CameraPipe.Config config) {
        ImageSources imageSourcesConfigureImageSources = SharedCameraGraphModules.Companion.configureImageSources(imageReaderImageSources, config);
        r.g(imageSourcesConfigureImageSources);
        return imageSourcesConfigureImageSources;
    }

    public static SharedCameraGraphModules_Companion_ConfigureImageSourcesFactory create(e<ImageReaderImageSources> eVar, e<CameraPipe.Config> eVar2) {
        return new SharedCameraGraphModules_Companion_ConfigureImageSourcesFactory(eVar, eVar2);
    }

    @Override // g.a.a, f.a.a
    public ImageSources get() {
        return configureImageSources(this.imageReaderImageSourcesProvider.get(), this.cameraPipeConfigProvider.get());
    }
}
