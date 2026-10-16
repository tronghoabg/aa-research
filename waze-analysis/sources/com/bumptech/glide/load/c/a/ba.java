package com.bumptech.glide.load.c.a;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ba implements az {
    @Override // com.bumptech.glide.load.c.a.az
    public final /* bridge */ /* synthetic */ void a(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // com.bumptech.glide.load.c.a.az
    public final /* bridge */ /* synthetic */ void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }
}
