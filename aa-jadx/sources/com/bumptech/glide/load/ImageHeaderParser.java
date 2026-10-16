package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes2.dex */
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

    com.bumptech.glide.load.ImageHeaderParser.ImageType a(java.io.InputStream inputStream) throws java.io.IOException;

    com.bumptech.glide.load.ImageHeaderParser.ImageType b(java.nio.ByteBuffer byteBuffer) throws java.io.IOException;

    int c(java.io.InputStream inputStream, defpackage.hxu hxuVar) throws java.io.IOException;

    int d(java.nio.ByteBuffer byteBuffer, defpackage.hxu hxuVar) throws java.io.IOException;

    boolean e(java.io.InputStream inputStream, defpackage.hxu hxuVar) throws java.io.IOException;

    boolean f(java.nio.ByteBuffer byteBuffer, defpackage.hxu hxuVar) throws java.io.IOException;
}
