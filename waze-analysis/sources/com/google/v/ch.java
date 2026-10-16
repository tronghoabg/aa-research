package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ch implements eg {
    UNCOMPRESSED(0),
    ZIPPY_COMPRESSED(1),
    GIPFELI_COMPRESSED(2),
    BROTLI_COMPRESSED(3),
    ZSTD_COMPRESSED(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f12796g;

    ch(int i2) {
        this.f12796g = i2;
    }

    public static ch a(int i2) {
        if (i2 == 0) {
            return UNCOMPRESSED;
        }
        if (i2 == 1) {
            return ZIPPY_COMPRESSED;
        }
        if (i2 == 2) {
            return GIPFELI_COMPRESSED;
        }
        if (i2 == 3) {
            return BROTLI_COMPRESSED;
        }
        if (i2 != 4) {
            return null;
        }
        return ZSTD_COMPRESSED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12796g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12796g);
    }
}
