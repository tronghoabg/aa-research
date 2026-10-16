package D6;

import a.AbstractC1304a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import x6.C4470a;
import x6.C4481l;

/* loaded from: classes3.dex */
public final class K0 extends AbstractC2614a {
    public static final Parcelable.Creator<K0> CREATOR = new A6.j(20);

    /* renamed from: a, reason: collision with root package name */
    public final int f2338a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2339b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2340c;

    /* renamed from: d, reason: collision with root package name */
    public K0 f2341d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f2342e;

    public K0(int i5, String str, String str2, K0 k02, IBinder iBinder) {
        this.f2338a = i5;
        this.f2339b = str;
        this.f2340c = str2;
        this.f2341d = k02;
        this.f2342e = iBinder;
    }

    public final C4470a V() {
        K0 k02 = this.f2341d;
        return new C4470a(this.f2338a, this.f2339b, this.f2340c, k02 != null ? new C4470a(k02.f2338a, k02.f2339b, k02.f2340c, null) : null);
    }

    public final C4481l W() {
        H0 f02;
        K0 k02 = this.f2341d;
        C4470a c4470a = k02 == null ? null : new C4470a(k02.f2338a, k02.f2339b, k02.f2340c, null);
        IBinder iBinder = this.f2342e;
        if (iBinder == null) {
            f02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            f02 = iInterfaceQueryLocalInterface instanceof H0 ? (H0) iInterfaceQueryLocalInterface : new F0(iBinder);
        }
        return new C4481l(this.f2338a, this.f2339b, this.f2340c, c4470a, f02 != null ? new x6.t(f02) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f2338a);
        AbstractC1304a.a0(parcel, 2, this.f2339b, false);
        AbstractC1304a.a0(parcel, 3, this.f2340c, false);
        AbstractC1304a.Z(parcel, 4, this.f2341d, i5, false);
        AbstractC1304a.V(parcel, 5, this.f2342e);
        AbstractC1304a.m0(iL0, parcel);
    }
}
