package com.bumptech.glide.load;

import defpackage.hxl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        HEIF(true),
        ANIMATED_HEIF(true),
        UNKNOWN(false);

        private final boolean a;

        ImageType(boolean z) {
            this.a = z;
        }

        public boolean hasAlpha() {
            return this.a;
        }

        public boolean isWebp() {
            int iOrdinal = ordinal();
            return iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 7;
        }
    }

    ImageType a(InputStream inputStream) throws IOException;

    ImageType b(ByteBuffer byteBuffer) throws IOException;

    int c(InputStream inputStream, hxl hxlVar) throws IOException;

    int d(ByteBuffer byteBuffer, hxl hxlVar) throws IOException;

    boolean e(InputStream inputStream, hxl hxlVar) throws IOException;

    boolean f(ByteBuffer byteBuffer, hxl hxlVar) throws IOException;
}
