package com.bumptech.glide.load;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public enum ImageHeaderParser$ImageType {
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


    /* renamed from: a, reason: collision with root package name */
    private final boolean f2934a;

    ImageHeaderParser$ImageType(boolean z) {
        this.f2934a = z;
    }

    public boolean hasAlpha() {
        return this.f2934a;
    }

    public boolean isWebp() {
        int iOrdinal = ordinal();
        return iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 7;
    }
}
