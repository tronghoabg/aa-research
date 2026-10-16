package J8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class r extends AbstractC0629d {
    public static final Parcelable.Creator<r> CREATOR = new I2.d(9);

    /* renamed from: a, reason: collision with root package name */
    public final String f5815a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5816b;

    public r(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f5815a = str;
        this.f5816b = str2;
    }

    @Override // J8.AbstractC0629d
    public final String V() {
        return "google.com";
    }

    @Override // J8.AbstractC0629d
    public final String W() {
        return "google.com";
    }

    @Override // J8.AbstractC0629d
    public final AbstractC0629d X() {
        return new r(this.f5815a, this.f5816b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f5815a, false);
        AbstractC1304a.a0(parcel, 2, this.f5816b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
