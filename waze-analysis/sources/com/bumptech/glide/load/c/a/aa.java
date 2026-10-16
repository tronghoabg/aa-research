package com.bumptech.glide.load.c.a;

import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aa implements com.bumptech.glide.load.d {
    @Override // com.bumptech.glide.load.d
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.d
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.d
    public final int c(InputStream inputStream, com.bumptech.glide.load.a.a.j jVar) {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @Override // com.bumptech.glide.load.d
    public final int d(ByteBuffer byteBuffer, com.bumptech.glide.load.a.a.j jVar) {
        return c(com.bumptech.glide.g.c.a(byteBuffer), jVar);
    }

    @Override // com.bumptech.glide.load.d
    public final boolean e(InputStream inputStream, com.bumptech.glide.load.a.a.j jVar) {
        return false;
    }

    @Override // com.bumptech.glide.load.d
    public final boolean f(ByteBuffer byteBuffer, com.bumptech.glide.load.a.a.j jVar) {
        return false;
    }
}
