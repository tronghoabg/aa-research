package d7;

import a.AbstractC1304a;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import f7.AbstractC2614a;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class s extends AbstractC2614a {
    public static final Parcelable.Creator<s> CREATOR = new C1559a(25);

    /* renamed from: a, reason: collision with root package name */
    public final String f34161a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34162b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34163c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f34164d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34165e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f34166f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f34167g;

    public s(String str, boolean z2, boolean z10, IBinder iBinder, boolean z11, boolean z12, boolean z13) {
        this.f34161a = str;
        this.f34162b = z2;
        this.f34163c = z10;
        this.f34164d = (Context) BinderC3877b.S(BinderC3877b.R(iBinder));
        this.f34165e = z11;
        this.f34166f = z12;
        this.f34167g = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f34161a, false);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f34162b ? 1 : 0);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f34163c ? 1 : 0);
        AbstractC1304a.V(parcel, 4, new BinderC3877b(this.f34164d));
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f34165e ? 1 : 0);
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(this.f34166f ? 1 : 0);
        AbstractC1304a.k0(parcel, 8, 4);
        parcel.writeInt(this.f34167g ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
