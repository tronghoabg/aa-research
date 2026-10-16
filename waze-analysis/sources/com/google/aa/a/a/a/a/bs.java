package com.google.aa.a.a.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum bs implements eg {
    CLOUD_ENVIRONMENT_UNKNOWN(0),
    CLOUD_ENVIRONMENT_NONPROD(1),
    CLOUD_ENVIRONMENT_PREPROD(2),
    CLOUD_ENVIRONMENT_PROD(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f3687f;

    bs(int i2) {
        this.f3687f = i2;
    }

    public static bs a(int i2) {
        if (i2 == 0) {
            return CLOUD_ENVIRONMENT_UNKNOWN;
        }
        if (i2 == 1) {
            return CLOUD_ENVIRONMENT_NONPROD;
        }
        if (i2 == 2) {
            return CLOUD_ENVIRONMENT_PREPROD;
        }
        if (i2 != 3) {
            return null;
        }
        return CLOUD_ENVIRONMENT_PROD;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f3687f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3687f);
    }
}
