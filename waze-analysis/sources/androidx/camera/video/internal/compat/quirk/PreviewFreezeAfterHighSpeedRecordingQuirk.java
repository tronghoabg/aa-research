package androidx.camera.video.internal.compat.quirk;

import androidx.camera.core.impl.Quirk;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PreviewFreezeAfterHighSpeedRecordingQuirk implements Quirk {
    public static final PreviewFreezeAfterHighSpeedRecordingQuirk INSTANCE = new PreviewFreezeAfterHighSpeedRecordingQuirk();
    private static final boolean isPixelPhone;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    static {
        /*
            androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk r0 = new androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk
            r0.<init>()
            androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk.INSTANCE = r0
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "google"
            r2 = 1
            boolean r0 = h.n.o.m(r0, r1, r2)
            r1 = 0
            if (r0 == 0) goto L23
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r3 = "MODEL"
            h.g.b.x.e(r0, r3)
            java.lang.String r3 = "Pixel"
            boolean r0 = h.n.o.o(r0, r3, r2)
            if (r0 == 0) goto L23
            goto L24
        L23:
            r2 = r1
        L24:
            androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk.isPixelPhone = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk.<clinit>():void");
    }

    private PreviewFreezeAfterHighSpeedRecordingQuirk() {
    }

    public static final boolean load() {
        return isPixelPhone;
    }
}
