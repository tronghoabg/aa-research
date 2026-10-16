package d7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import f7.AbstractC2614a;
import p7.AbstractC3772b;
import r7.AbstractC3935e;

/* loaded from: classes3.dex */
public final class t extends AbstractC2614a {
    public static final Parcelable.Creator<t> CREATOR = new C1559a(26);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f34168a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34169b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34170c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34171d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34172e;

    public t(boolean z2, String str, int i5, int i10, long j8) {
        this.f34168a = z2;
        this.f34169b = str;
        this.f34170c = AbstractC3935e.W(i5) - 1;
        this.f34171d = AbstractC3772b.W(i10) - 1;
        this.f34172e = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f34168a ? 1 : 0);
        AbstractC1304a.a0(parcel, 2, this.f34169b, false);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f34170c);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f34171d);
        AbstractC1304a.k0(parcel, 5, 8);
        parcel.writeLong(this.f34172e);
        AbstractC1304a.m0(iL0, parcel);
    }
}
