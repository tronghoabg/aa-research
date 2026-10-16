package com.bumptech.glide.load;

/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    UNKNOWN(false);


    /* renamed from: a, reason: collision with root package name */
    public final boolean f24259a;

    ImageHeaderParser$ImageType(boolean z2) {
        this.f24259a = z2;
    }

    public boolean hasAlpha() {
        return this.f24259a;
    }
}
