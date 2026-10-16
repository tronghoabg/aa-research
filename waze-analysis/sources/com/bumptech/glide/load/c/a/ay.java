package com.bumptech.glide.load.c.a;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ay implements az {
    @Override // com.bumptech.glide.load.c.a.az
    public final /* bridge */ /* synthetic */ void a(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(new ax(this, (ByteBuffer) obj));
    }

    @Override // com.bumptech.glide.load.c.a.az
    public final /* bridge */ /* synthetic */ void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(new ax(this, (ByteBuffer) obj));
    }
}
