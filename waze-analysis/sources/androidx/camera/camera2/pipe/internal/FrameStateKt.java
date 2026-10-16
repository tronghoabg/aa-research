package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.media.SharedOutputImage;
import androidx.camera.camera2.pipe.media.TrackedOutputImage;
import h.ab;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameStateKt {
    public static final SharedOutputImage acquireOrNullForExternalUse(SharedOutputImage sharedOutputImage) {
        x.f(sharedOutputImage, "<this>");
        final TrackedOutputImage trackedOutputImage = (TrackedOutputImage) sharedOutputImage.unwrapAs(TrackedOutputImage.class);
        if (trackedOutputImage == null) {
            return SharedOutputImage.CC.acquireOrNull$default(sharedOutputImage, null, 1, null);
        }
        trackedOutputImage.incrementExternalUse();
        SharedOutputImage sharedOutputImageAcquireOrNull = sharedOutputImage.acquireOrNull(new a() { // from class: androidx.camera.camera2.pipe.internal.FrameStateKt$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return FrameStateKt.acquireOrNullForExternalUse$lambda$0(trackedOutputImage);
            }
        });
        if (sharedOutputImageAcquireOrNull == null) {
            trackedOutputImage.decrementExternalUse();
        }
        return sharedOutputImageAcquireOrNull;
    }

    static final ab acquireOrNullForExternalUse$lambda$0(TrackedOutputImage trackedOutputImage) {
        trackedOutputImage.decrementExternalUse();
        return ab.f48028a;
    }
}
