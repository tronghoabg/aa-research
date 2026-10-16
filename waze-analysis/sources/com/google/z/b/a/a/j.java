package com.google.z.b.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum j implements eg {
    THIRD_PARTY(1),
    CURATION(2),
    PARTNER_FEED(3),
    EXTRACTION(4);


    /* renamed from: f, reason: collision with root package name */
    private final int f13528f;

    j(int i2) {
        this.f13528f = i2;
    }

    public static j a(int i2) {
        if (i2 == 1) {
            return THIRD_PARTY;
        }
        if (i2 == 2) {
            return CURATION;
        }
        if (i2 == 3) {
            return PARTNER_FEED;
        }
        if (i2 != 4) {
            return null;
        }
        return EXTRACTION;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f13528f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f13528f);
    }
}
