package D6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class r1 extends AbstractC2614a {
    public static final Parcelable.Creator<r1> CREATOR = new A6.j(25);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2486a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2487b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2488c;

    public r1(x6.w wVar) {
        this(wVar.f47753a, wVar.f47754b, wVar.f47755c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f2486a ? 1 : 0);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f2487b ? 1 : 0);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f2488c ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }

    public r1(boolean z2, boolean z10, boolean z11) {
        this.f2486a = z2;
        this.f2487b = z10;
        this.f2488c = z11;
    }
}
