package D6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class O0 extends AbstractC2614a {
    public static final Parcelable.Creator<O0> CREATOR = new A6.j(19);

    /* renamed from: a, reason: collision with root package name */
    public final int f2343a;

    public O0(int i5) {
        this.f2343a = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f2343a);
        AbstractC1304a.m0(iL0, parcel);
    }
}
