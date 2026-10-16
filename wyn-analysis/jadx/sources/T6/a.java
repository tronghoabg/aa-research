package T6;

import A7.AbstractC0279p0;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class a extends AbstractC2614a {
    public static final Parcelable.Creator<a> CREATOR = new I2.d(29);

    /* renamed from: a, reason: collision with root package name */
    public final int f11752a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11753b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11754c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11755d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11756e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11757f;

    public a(int i5, long j8, String str, int i10, int i11, String str2) {
        this.f11752a = i5;
        this.f11753b = j8;
        AbstractC1732v.i(str);
        this.f11754c = str;
        this.f11755d = i10;
        this.f11756e = i11;
        this.f11757f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        a aVar = (a) obj;
        return this.f11752a == aVar.f11752a && this.f11753b == aVar.f11753b && AbstractC1732v.m(this.f11754c, aVar.f11754c) && this.f11755d == aVar.f11755d && this.f11756e == aVar.f11756e && AbstractC1732v.m(this.f11757f, aVar.f11757f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11752a), Long.valueOf(this.f11753b), this.f11754c, Integer.valueOf(this.f11755d), Integer.valueOf(this.f11756e), this.f11757f});
    }

    public final String toString() {
        int i5 = this.f11755d;
        String str = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        StringBuilder sb2 = new StringBuilder("AccountChangeEvent {accountName = ");
        AbstractC3256n.p(sb2, this.f11754c, ", changeType = ", str, ", changeData = ");
        sb2.append(this.f11757f);
        sb2.append(", eventIndex = ");
        return AbstractC0279p0.j(this.f11756e, "}", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f11752a);
        AbstractC1304a.k0(parcel, 2, 8);
        parcel.writeLong(this.f11753b);
        AbstractC1304a.a0(parcel, 3, this.f11754c, false);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f11755d);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f11756e);
        AbstractC1304a.a0(parcel, 6, this.f11757f, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
