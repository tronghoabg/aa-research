package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ip implements com.google.v.eg {
    MEDIA_FORMAT_UNSPECIFIED(0),
    MEDIA_FORMAT_PHOTO(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f11988d;

    ip(int i2) {
        this.f11988d = i2;
    }

    public static ip a(int i2) {
        if (i2 == 0) {
            return MEDIA_FORMAT_UNSPECIFIED;
        }
        if (i2 != 1) {
            return null;
        }
        return MEDIA_FORMAT_PHOTO;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11988d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11988d);
    }
}
