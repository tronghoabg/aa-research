package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum cj implements eg {
    LOG_NONE(0),
    LOG_HEADER_ONLY(1),
    LOG_HEADER_AND_NON_PRIVATE_PAYLOAD_INTERNAL(2),
    LOG_HEADER_AND_FILTERED_PAYLOAD(3),
    LOG_HEADER_AND_PAYLOAD(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f12808g;

    cj(int i2) {
        this.f12808g = i2;
    }

    public static cj a(int i2) {
        if (i2 == 0) {
            return LOG_NONE;
        }
        if (i2 == 1) {
            return LOG_HEADER_ONLY;
        }
        if (i2 == 2) {
            return LOG_HEADER_AND_NON_PRIVATE_PAYLOAD_INTERNAL;
        }
        if (i2 == 3) {
            return LOG_HEADER_AND_FILTERED_PAYLOAD;
        }
        if (i2 != 4) {
            return null;
        }
        return LOG_HEADER_AND_PAYLOAD;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f12808g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12808g);
    }
}
