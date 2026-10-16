package W6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class a extends AbstractC2614a {
    public static final Parcelable.Creator<a> CREATOR = new T6.f(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f15163a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15164b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15165c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15166d;

    public a(int i5, boolean z2, boolean z10, long j8) {
        this.f15163a = i5;
        this.f15164b = z2;
        this.f15165c = j8;
        this.f15166d = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f15163a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f15164b ? 1 : 0);
        AbstractC1304a.k0(parcel, 3, 8);
        parcel.writeLong(this.f15165c);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f15166d ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
