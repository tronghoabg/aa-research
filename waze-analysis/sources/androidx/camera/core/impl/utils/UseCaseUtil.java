package androidx.camera.core.impl.utils;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import h.g.a.l;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseUtil {
    public static final UseCaseUtil INSTANCE = new UseCaseUtil();
    private static final String TAG = "UseCaseUtil";

    private UseCaseUtil() {
    }

    public static final boolean containsVideoCapture(Collection<? extends UseCase> collection) {
        x.f(collection, "<this>");
        for (UseCase useCase : collection) {
            if (useCase != null && isVideoCapture(useCase)) {
                return true;
            }
        }
        return false;
    }

    public static final ImageAnalysis findImageAnalysis(Collection<? extends UseCase> collection) {
        Object next;
        x.f(collection, "<this>");
        Iterator<T> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((UseCase) next) instanceof ImageAnalysis) {
                break;
            }
        }
        if (next instanceof ImageAnalysis) {
            return (ImageAnalysis) next;
        }
        return null;
    }

    public static final ImageCapture findImageCapture(Collection<? extends UseCase> collection) {
        Object next;
        x.f(collection, "<this>");
        Iterator<T> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((UseCase) next) instanceof ImageCapture) {
                break;
            }
        }
        if (next instanceof ImageCapture) {
            return (ImageCapture) next;
        }
        return null;
    }

    public static final Preview findPreview(Collection<? extends UseCase> collection) {
        Object next;
        x.f(collection, "<this>");
        Iterator<T> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((UseCase) next) instanceof Preview) {
                break;
            }
        }
        if (next instanceof Preview) {
            return (Preview) next;
        }
        return null;
    }

    public static final UseCase findVideoCapture(Collection<? extends UseCase> collection) {
        Object next;
        x.f(collection, "<this>");
        Iterator<T> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (isVideoCapture((UseCase) next)) {
                break;
            }
        }
        return (UseCase) next;
    }

    private final int getPreviewStabilizationMode(Collection<? extends UseCase> collection, l<? super UseCase, ? extends UseCaseConfig<?>> lVar) {
        Iterator<T> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int previewStabilizationMode = lVar.invoke((UseCase) it.next()).getPreviewStabilizationMode();
            if (previewStabilizationMode != 0) {
                if (i2 != previewStabilizationMode && i2 != 0) {
                    Logger.w(TAG, "Unexpected configurations: Overwriting current previewStabilizationMode(" + i2 + ") with useCasePreviewStabilization(" + previewStabilizationMode + ")!");
                }
                i2 = previewStabilizationMode;
            }
        }
        return i2;
    }

    public static final VideoStabilization getVideoStabilization(Collection<? extends UseCase> collection, l<? super UseCase, ? extends UseCaseConfig<?>> lVar) {
        x.f(collection, "<this>");
        x.f(lVar, "configProvider");
        VideoStabilization.Companion companion = VideoStabilization.Companion;
        UseCaseUtil useCaseUtil = INSTANCE;
        return companion.from$camera_core(useCaseUtil.getPreviewStabilizationMode(collection, lVar), useCaseUtil.getVideoStabilizationMode(collection, lVar));
    }

    public static /* synthetic */ VideoStabilization getVideoStabilization$default(Collection collection, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            lVar = new l() { // from class: androidx.camera.core.impl.utils.UseCaseUtil$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return UseCaseUtil.getVideoStabilization$lambda$0((UseCase) obj2);
                }
            };
        }
        return getVideoStabilization(collection, lVar);
    }

    static final UseCaseConfig getVideoStabilization$lambda$0(UseCase useCase) {
        x.f(useCase, "it");
        return useCase.getCurrentConfig();
    }

    private final int getVideoStabilizationMode(Collection<? extends UseCase> collection, l<? super UseCase, ? extends UseCaseConfig<?>> lVar) {
        Iterator<T> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int videoStabilizationMode = lVar.invoke((UseCase) it.next()).getVideoStabilizationMode();
            if (videoStabilizationMode != 0) {
                if (i2 != videoStabilizationMode && i2 != 0) {
                    Logger.w(TAG, "Unexpected configurations: Overwriting current videoStabilizationMode(" + i2 + ") with useCaseVideoStabilization(" + videoStabilizationMode + ")!");
                }
                i2 = videoStabilizationMode;
            }
        }
        return i2;
    }

    public static final boolean isVideoCapture(UseCase useCase) {
        x.f(useCase, "<this>");
        if (useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE)) {
            return useCase.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
        }
        Objects.toString(useCase);
        Logger.e(TAG, String.valueOf(useCase).concat(" UseCase does not have capture type."));
        return false;
    }
}
