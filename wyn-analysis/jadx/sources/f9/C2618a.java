package f9;

import a.AbstractC1304a;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import f7.AbstractC2614a;

/* renamed from: f9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2618a extends AbstractC2614a {
    public static final Parcelable.Creator<C2618a> CREATOR = new C2555b(1);

    /* renamed from: a, reason: collision with root package name */
    public String f35242a;

    /* renamed from: b, reason: collision with root package name */
    public String f35243b;

    /* renamed from: c, reason: collision with root package name */
    public int f35244c;

    /* renamed from: d, reason: collision with root package name */
    public long f35245d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f35246e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f35247f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f35242a, false);
        AbstractC1304a.a0(parcel, 2, this.f35243b, false);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f35244c);
        long j8 = this.f35245d;
        AbstractC1304a.k0(parcel, 4, 8);
        parcel.writeLong(j8);
        Bundle bundle = this.f35246e;
        if (bundle == null) {
            bundle = new Bundle();
        }
        AbstractC1304a.S(parcel, 5, bundle, false);
        AbstractC1304a.Z(parcel, 6, this.f35247f, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
