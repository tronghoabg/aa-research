package I2;

import D6.B1;
import Q1.x;
import Va.M6;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new B1(29);

    /* renamed from: a, reason: collision with root package name */
    public final long f5282a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5283b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f5284c;

    public a(long j8, byte[] bArr, long j10) {
        this.f5282a = j10;
        this.f5283b = j8;
        this.f5284c = bArr;
    }

    @Override // I2.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb2.append(this.f5282a);
        sb2.append(", identifier= ");
        return M6.s(sb2, this.f5283b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.f5282a);
        parcel.writeLong(this.f5283b);
        parcel.writeByteArray(this.f5284c);
    }

    public a(Parcel parcel) {
        this.f5282a = parcel.readLong();
        this.f5283b = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i5 = x.f9724a;
        this.f5284c = bArrCreateByteArray;
    }
}
