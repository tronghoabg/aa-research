package defpackage;

/* loaded from: classes2.dex */
final class iby extends RuntimeException {
    private static final long serialVersionUID = -2556382523004027815L;

    public iby() {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
