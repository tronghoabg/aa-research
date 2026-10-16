package C7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class a extends AbstractC2614a {
    public static final Parcelable.Creator<a> CREATOR = new A6.j(12);

    /* renamed from: a, reason: collision with root package name */
    public final String f1886a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1887b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1888c;

    public a(int i5, String str, byte[] bArr) {
        this.f1886a = str;
        this.f1887b = bArr;
        this.f1888c = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f1886a, false);
        AbstractC1304a.T(parcel, 3, this.f1887b, false);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f1888c);
        AbstractC1304a.m0(iL0, parcel);
    }
}
