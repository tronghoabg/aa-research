package D6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class y1 extends AbstractC2614a {
    public static final Parcelable.Creator<y1> CREATOR = new A6.j(28);

    /* renamed from: a, reason: collision with root package name */
    public final int f2545a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2546b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2547c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2548d;

    public y1(int i5, long j8, int i10, String str) {
        this.f2545a = i5;
        this.f2546b = i10;
        this.f2547c = str;
        this.f2548d = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f2545a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f2546b);
        AbstractC1304a.a0(parcel, 3, this.f2547c, false);
        AbstractC1304a.k0(parcel, 4, 8);
        parcel.writeLong(this.f2548d);
        AbstractC1304a.m0(iL0, parcel);
    }
}
