package A6;

import D6.AbstractBinderC0359a0;
import D6.InterfaceC0362b0;
import a.AbstractC1304a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class g extends AbstractC2614a {
    public static final Parcelable.Creator<g> CREATOR = new j(1);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f404a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0362b0 f405b;

    /* renamed from: c, reason: collision with root package name */
    public final IBinder f406c;

    public g(boolean z2, IBinder iBinder, IBinder iBinder2) {
        this.f404a = z2;
        this.f405b = iBinder != null ? AbstractBinderC0359a0.zzd(iBinder) : null;
        this.f406c = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f404a ? 1 : 0);
        InterfaceC0362b0 interfaceC0362b0 = this.f405b;
        AbstractC1304a.V(parcel, 2, interfaceC0362b0 == null ? null : interfaceC0362b0.asBinder());
        AbstractC1304a.V(parcel, 3, this.f406c);
        AbstractC1304a.m0(iL0, parcel);
    }
}
