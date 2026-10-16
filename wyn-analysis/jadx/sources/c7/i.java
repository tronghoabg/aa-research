package C7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class i extends AbstractC2614a {
    public static final Parcelable.Creator<i> CREATOR = new A6.j(13);

    /* renamed from: a, reason: collision with root package name */
    public final long f1896a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f1897b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1898c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1899d;

    public i(long j8, a[] aVarArr, int i5, boolean z2) {
        this.f1896a = j8;
        this.f1897b = aVarArr;
        this.f1899d = z2;
        if (z2) {
            this.f1898c = i5;
        } else {
            this.f1898c = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 2, 8);
        parcel.writeLong(this.f1896a);
        AbstractC1304a.d0(parcel, 3, this.f1897b, i5);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f1898c);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f1899d ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
