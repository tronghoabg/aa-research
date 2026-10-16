package A6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class a extends AbstractC2614a {
    public static final Parcelable.Creator<a> CREATOR = new j(0);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f385a;

    public a(boolean z2) {
        this.f385a = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f385a ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
