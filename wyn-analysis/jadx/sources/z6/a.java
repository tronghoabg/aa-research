package Z6;

import T6.f;
import a.AbstractC1304a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class a extends AbstractC2614a {
    public static final Parcelable.Creator<a> CREATOR = new f(29);

    /* renamed from: a, reason: collision with root package name */
    public final String f16997a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16998b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16999c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f17000d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17001e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f17002f;

    public a(int i5, String str, int i10, long j8, byte[] bArr, Bundle bundle) {
        this.f17001e = i5;
        this.f16997a = str;
        this.f16998b = i10;
        this.f16999c = j8;
        this.f17000d = bArr;
        this.f17002f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.f16997a + ", method: " + this.f16998b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f16997a, false);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f16998b);
        AbstractC1304a.k0(parcel, 3, 8);
        parcel.writeLong(this.f16999c);
        AbstractC1304a.T(parcel, 4, this.f17000d, false);
        AbstractC1304a.S(parcel, 5, this.f17002f, false);
        AbstractC1304a.k0(parcel, 1000, 4);
        parcel.writeInt(this.f17001e);
        AbstractC1304a.m0(iL0, parcel);
    }
}
