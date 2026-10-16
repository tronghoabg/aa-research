package F7;

import D6.B1;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.F;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class g extends AbstractC2614a {
    public static final Parcelable.Creator<g> CREATOR = new B1(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f4028a;

    /* renamed from: b, reason: collision with root package name */
    public final d7.b f4029b;

    /* renamed from: c, reason: collision with root package name */
    public final F f4030c;

    public g(int i5, d7.b bVar, F f10) {
        this.f4028a = i5;
        this.f4029b = bVar;
        this.f4030c = f10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f4028a);
        AbstractC1304a.Z(parcel, 2, this.f4029b, i5, false);
        AbstractC1304a.Z(parcel, 3, this.f4030c, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
