package D6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class A1 extends AbstractC2614a {
    public static final Parcelable.Creator<A1> CREATOR = new B1(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2336a;

    public A1(int i5) {
        this.f2336a = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f2336a);
        AbstractC1304a.m0(iL0, parcel);
    }
}
