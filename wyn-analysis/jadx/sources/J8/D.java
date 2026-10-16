package J8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes4.dex */
public final class D extends AbstractC0629d {
    public static final Parcelable.Creator<D> CREATOR = new I2.d(15);

    /* renamed from: a, reason: collision with root package name */
    public final String f5738a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5739b;

    public D(String str, String str2) {
        AbstractC1732v.f(str);
        this.f5738a = str;
        AbstractC1732v.f(str2);
        this.f5739b = str2;
    }

    @Override // J8.AbstractC0629d
    public final String V() {
        return "twitter.com";
    }

    @Override // J8.AbstractC0629d
    public final String W() {
        return "twitter.com";
    }

    @Override // J8.AbstractC0629d
    public final AbstractC0629d X() {
        return new D(this.f5738a, this.f5739b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f5738a, false);
        AbstractC1304a.a0(parcel, 2, this.f5739b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
