package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ich extends java.lang.RuntimeException {
    private static final long serialVersionUID = -2556382523004027815L;

    public ich() {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
