package d6;

import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import u6.v;

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2388a extends AbstractC2389b {
    public static final Parcelable.Creator<C2388a> CREATOR = new C1559a(18);

    /* renamed from: a, reason: collision with root package name */
    public final long f34075a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34076b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f34077c;

    public C2388a(long j8, byte[] bArr, long j10) {
        this.f34075a = j10;
        this.f34076b = j8;
        this.f34077c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.f34075a);
        parcel.writeLong(this.f34076b);
        parcel.writeByteArray(this.f34077c);
    }

    public C2388a(Parcel parcel) {
        this.f34075a = parcel.readLong();
        this.f34076b = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i5 = v.f46721a;
        this.f34077c = bArrCreateByteArray;
    }
}
