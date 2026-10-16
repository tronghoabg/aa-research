package D6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class Q extends AbstractC2614a {
    public static final Parcelable.Creator<Q> CREATOR = new A6.j(18);

    /* renamed from: a, reason: collision with root package name */
    public final String f2357a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2358b;

    public Q(String str, String str2) {
        this.f2357a = str;
        this.f2358b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f2357a, false);
        AbstractC1304a.a0(parcel, 2, this.f2358b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
