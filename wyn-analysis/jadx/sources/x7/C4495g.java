package x7;

import A7.AbstractC0279p0;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Arrays;
import w7.C4381i;

/* renamed from: x7.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4495g extends AbstractC2614a {
    public static final Parcelable.Creator<C4495g> CREATOR = new C4381i(24);

    /* renamed from: a, reason: collision with root package name */
    public final long f47784a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47785b;

    public C4495g(long j8, boolean z2) {
        this.f47784a = j8;
        this.f47785b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4495g)) {
            return false;
        }
        C4495g c4495g = (C4495g) obj;
        return this.f47784a == c4495g.f47784a && this.f47785b == c4495g.f47785b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f47784a), Boolean.valueOf(this.f47785b)});
    }

    public final String toString() {
        long j8 = this.f47784a;
        int length = String.valueOf(j8).length();
        String str = true != this.f47785b ? "" : ", withVelocity";
        StringBuilder sb2 = new StringBuilder(AbstractC0279p0.g(length + 46, 1, str));
        sb2.append("DeviceOrientationRequest[samplingPeriodMicros=");
        sb2.append(j8);
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 2, 8);
        parcel.writeLong(this.f47784a);
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(this.f47785b ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
