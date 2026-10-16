package C7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class b extends AbstractC2614a {
    public static final Parcelable.Creator<b> CREATOR = new A6.j(16);

    /* renamed from: a, reason: collision with root package name */
    public String f1889a;

    /* renamed from: b, reason: collision with root package name */
    public DataHolder f1890b;

    /* renamed from: c, reason: collision with root package name */
    public ParcelFileDescriptor f1891c;

    /* renamed from: d, reason: collision with root package name */
    public long f1892d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f1893e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f1889a, false);
        AbstractC1304a.Z(parcel, 3, this.f1890b, i5, false);
        AbstractC1304a.Z(parcel, 4, this.f1891c, i5, false);
        AbstractC1304a.k0(parcel, 5, 8);
        parcel.writeLong(this.f1892d);
        AbstractC1304a.T(parcel, 6, this.f1893e, false);
        AbstractC1304a.m0(iL0, parcel);
        this.f1891c = null;
    }
}
