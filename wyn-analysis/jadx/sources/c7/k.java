package C7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class k extends AbstractC2614a {
    public static final Parcelable.Creator<k> CREATOR = new A6.j(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f1901a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1902b;

    public k(int i5, boolean z2) {
        this.f1901a = i5;
        this.f1902b = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f1901a);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f1902b ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
