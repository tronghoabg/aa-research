package D6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class d1 extends AbstractC2614a {
    public static final Parcelable.Creator<d1> CREATOR = new A6.j(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f2415a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2416b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2417c;

    public d1(int i5, int i10, String str) {
        this.f2415a = i5;
        this.f2416b = i10;
        this.f2417c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f2415a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f2416b);
        AbstractC1304a.a0(parcel, 3, this.f2417c, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
