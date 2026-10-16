package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.Quirk;
import h.g.b.x;
import h.n.o;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PreviewGreenTintQuirk implements Quirk {
    public static final PreviewGreenTintQuirk INSTANCE = new PreviewGreenTintQuirk();

    private PreviewGreenTintQuirk() {
    }

    private final boolean isMotoE20() {
        return o.m("motorola", Build.BRAND, true) && o.m("moto e20", Build.MODEL, true);
    }

    public static final boolean load() {
        return INSTANCE.isMotoE20();
    }

    public static final boolean shouldForceEnableStreamSharing(String str, Collection<? extends UseCase> collection) {
        x.f(str, "cameraId");
        x.f(collection, "appUseCases");
        PreviewGreenTintQuirk previewGreenTintQuirk = INSTANCE;
        if (previewGreenTintQuirk.isMotoE20()) {
            return previewGreenTintQuirk.shouldForceEnableStreamSharingForMotoE20(str, collection);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean shouldForceEnableStreamSharingForMotoE20(java.lang.String r5, java.util.Collection<? extends androidx.camera.core.UseCase> r6) {
        /*
            r4 = this;
            java.lang.String r4 = "0"
            boolean r4 = h.g.b.x.n(r5, r4)
            r5 = 0
            if (r4 == 0) goto L73
            int r4 = r6.size()
            r0 = 2
            if (r4 == r0) goto L11
            goto L73
        L11:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r4 = r6 instanceof java.util.Collection
            r0 = 1
            if (r4 == 0) goto L23
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L23
        L21:
            r1 = r5
            goto L38
        L23:
            java.util.Iterator r1 = r6.iterator()
        L27:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            androidx.camera.core.UseCase r2 = (androidx.camera.core.UseCase) r2
            boolean r2 = r2 instanceof androidx.camera.core.Preview
            if (r2 == 0) goto L27
            r1 = r0
        L38:
            if (r4 == 0) goto L45
            r4 = r6
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L45
        L43:
            r4 = r5
            goto L6e
        L45:
            java.util.Iterator r4 = r6.iterator()
        L49:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L43
            java.lang.Object r6 = r4.next()
            androidx.camera.core.UseCase r6 = (androidx.camera.core.UseCase) r6
            androidx.camera.core.impl.UseCaseConfig r2 = r6.getCurrentConfig()
            androidx.camera.core.impl.Config$Option<androidx.camera.core.impl.UseCaseConfigFactory$CaptureType> r3 = androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_TYPE
            boolean r2 = r2.containsOption(r3)
            if (r2 == 0) goto L49
            androidx.camera.core.impl.UseCaseConfig r6 = r6.getCurrentConfig()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r6 = r6.getCaptureType()
            androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r2 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE
            if (r6 != r2) goto L49
            r4 = r0
        L6e:
            if (r1 == 0) goto L73
            if (r4 == 0) goto L73
            return r0
        L73:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk.shouldForceEnableStreamSharingForMotoE20(java.lang.String, java.util.Collection):boolean");
    }
}
