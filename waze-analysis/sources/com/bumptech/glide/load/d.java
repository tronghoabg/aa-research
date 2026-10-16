package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface d {
    ImageHeaderParser$ImageType a(InputStream inputStream);

    ImageHeaderParser$ImageType b(ByteBuffer byteBuffer);

    int c(InputStream inputStream, com.bumptech.glide.load.a.a.j jVar);

    int d(ByteBuffer byteBuffer, com.bumptech.glide.load.a.a.j jVar);

    boolean e(InputStream inputStream, com.bumptech.glide.load.a.a.j jVar);

    boolean f(ByteBuffer byteBuffer, com.bumptech.glide.load.a.a.j jVar);
}
