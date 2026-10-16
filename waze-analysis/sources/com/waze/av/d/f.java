package com.waze.av.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new w(11);

    /* renamed from: a, reason: collision with root package name */
    private final String f16062a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16063b;

    /* renamed from: c, reason: collision with root package name */
    private final float f16064c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f16065d;

    public f(String str, int i2, float f2, Integer num) {
        x.f(str, "evConnectorType");
        this.f16062a = str;
        this.f16063b = i2;
        this.f16064c = f2;
        this.f16065d = num;
    }

    public final float a() {
        return this.f16064c;
    }

    public final int b() {
        return this.f16063b;
    }

    public final Integer c() {
        return this.f16065d;
    }

    public final String d() {
        return this.f16062a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return x.n(this.f16062a, fVar.f16062a) && this.f16063b == fVar.f16063b && Float.compare(this.f16064c, fVar.f16064c) == 0 && x.n(this.f16065d, fVar.f16065d);
    }

    public final int hashCode() {
        int iHashCode = (((this.f16062a.hashCode() * 31) + this.f16063b) * 31) + Float.floatToIntBits(this.f16064c);
        Integer num = this.f16065d;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "EVConnector(evConnectorType=" + this.f16062a + ", count=" + this.f16063b + ", maxPowerKw=" + this.f16064c + ", availableCount=" + this.f16065d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iIntValue;
        x.f(parcel, "dest");
        parcel.writeString(this.f16062a);
        parcel.writeInt(this.f16063b);
        parcel.writeFloat(this.f16064c);
        Integer num = this.f16065d;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }
}
