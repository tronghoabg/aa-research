package J8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes4.dex */
public final class A extends AbstractC0629d {
    public static final Parcelable.Creator<A> CREATOR = new I2.d(13);

    /* renamed from: a, reason: collision with root package name */
    public final String f5730a;

    public A(String str) {
        AbstractC1732v.f(str);
        this.f5730a = str;
    }

    @Override // J8.AbstractC0629d
    public final String V() {
        return "playgames.google.com";
    }

    @Override // J8.AbstractC0629d
    public final String W() {
        return "playgames.google.com";
    }

    @Override // J8.AbstractC0629d
    public final AbstractC0629d X() {
        return new A(this.f5730a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f5730a, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
