package androidx.camera.camera2.compat.quirk;

import android.util.Size;
import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import h.a.c;
import h.a.i;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CamcorderProfileResolutionQuirk implements Quirk {
    public static final Companion Companion = new Companion(null);
    private final StreamConfigurationMapCompat streamConfigurationMapCompat;
    private final f supportedResolution$delegate;

    public CamcorderProfileResolutionQuirk(StreamConfigurationMapCompat streamConfigurationMapCompat) {
        x.f(streamConfigurationMapCompat, "streamConfigurationMapCompat");
        this.streamConfigurationMapCompat = streamConfigurationMapCompat;
        this.supportedResolution$delegate = g.a(new a() { // from class: androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return CamcorderProfileResolutionQuirk.supportedResolution_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final List<Size> getSupportedResolution() {
        return (List) this.supportedResolution$delegate.getValue();
    }

    static final List supportedResolution_delegate$lambda$0(CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk) {
        List listH;
        Size[] outputSizes = camcorderProfileResolutionQuirk.streamConfigurationMapCompat.getOutputSizes(34);
        if (outputSizes == null || (listH = c.i(outputSizes)) == null) {
            listH = i.h();
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            String str = Camera2Logger.TRUNCATED_TAG;
            Objects.toString(listH);
            android.util.Log.d(str, "supportedResolutions = ".concat(String.valueOf(listH)));
        }
        return listH;
    }

    public final List<Size> getSupportedResolutions() {
        return i.ao(getSupportedResolution());
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled(CameraMetadata cameraMetadata) {
            x.f(cameraMetadata, "cameraMetadata");
            return CameraMetadata.Companion.isHardwareLevelLegacy(cameraMetadata);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
