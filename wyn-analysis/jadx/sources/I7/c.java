package i7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class c extends AbstractC2614a {
    public static final Parcelable.Creator<c> CREATOR = new C2555b(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f36879a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f36880b;

    public c(int i5, boolean z2) {
        this.f36879a = i5;
        this.f36880b = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f36879a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f36880b ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
