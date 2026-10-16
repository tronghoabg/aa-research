package Z6;

import a.AbstractC1304a;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class b extends AbstractC2614a {
    public static final Parcelable.Creator<b> CREATOR = new c(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f17003a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f17004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17005c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f17006d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17007e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f17008f;

    public b(int i5, int i10, PendingIntent pendingIntent, int i11, Bundle bundle, byte[] bArr) {
        this.f17007e = i5;
        this.f17003a = i10;
        this.f17005c = i11;
        this.f17008f = bundle;
        this.f17006d = bArr;
        this.f17004b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f17003a);
        AbstractC1304a.Z(parcel, 2, this.f17004b, i5, false);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f17005c);
        AbstractC1304a.S(parcel, 4, this.f17008f, false);
        AbstractC1304a.T(parcel, 5, this.f17006d, false);
        AbstractC1304a.k0(parcel, 1000, 4);
        parcel.writeInt(this.f17007e);
        AbstractC1304a.m0(iL0, parcel);
    }
}
