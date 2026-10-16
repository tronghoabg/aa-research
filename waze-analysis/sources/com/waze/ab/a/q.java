package com.waze.ab.a;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final int f13741a;

    /* renamed from: b, reason: collision with root package name */
    private final int f13742b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13743c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13744d;

    public /* synthetic */ q(byte[] bArr) {
        int iLongValue = (int) ConfigValues.CONFIG_VALUE_CARPOOL_USER_IMAGE_HEIGHT_PX.b().longValue();
        int iLongValue2 = (int) ConfigValues.CONFIG_VALUE_CARPOOL_USER_IMAGE_HEIGHT_PX.b().longValue();
        this.f13741a = iLongValue;
        this.f13742b = iLongValue2;
        this.f13743c = 1;
        this.f13744d = 1;
    }

    public final int a() {
        return this.f13742b;
    }

    public final int b() {
        return this.f13741a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f13741a != qVar.f13741a || this.f13742b != qVar.f13742b) {
            return false;
        }
        int i2 = qVar.f13743c;
        int i3 = qVar.f13744d;
        return true;
    }

    public final int hashCode() {
        return (((((this.f13741a * 31) + this.f13742b) * 31) + 1) * 31) + 1;
    }

    public final String toString() {
        return "UserImageParams(outputWidth=" + this.f13741a + ", outputHeight=" + this.f13742b + ", aspectRatioX=1, aspectRatioY=1)";
    }

    public q() {
        this(null);
    }
}
