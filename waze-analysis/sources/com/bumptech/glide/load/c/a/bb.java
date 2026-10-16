package com.bumptech.glide.load.c.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bb extends RuntimeException {
    private static final long serialVersionUID = -2556382523004027815L;

    bb() {
        super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
}
