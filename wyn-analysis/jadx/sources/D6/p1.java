package D6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import x6.C4488s;

/* loaded from: classes3.dex */
public final class p1 extends AbstractC2614a {
    public static final Parcelable.Creator<p1> CREATOR = new A6.j(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f2475a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2476b;

    public p1(int i5, int i10) {
        this.f2475a = i5;
        this.f2476b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f2475a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f2476b);
        AbstractC1304a.m0(iL0, parcel);
    }

    public p1(C4488s c4488s) {
        this.f2475a = c4488s.f47742a;
        this.f2476b = c4488s.f47743b;
    }
}
