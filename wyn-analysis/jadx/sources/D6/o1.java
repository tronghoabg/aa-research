package D6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class o1 extends AbstractC2614a {
    public static final Parcelable.Creator<o1> CREATOR = new A6.j(22);

    /* renamed from: a, reason: collision with root package name */
    public final String f2469a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2470b;

    /* renamed from: c, reason: collision with root package name */
    public final v1 f2471c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2472d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2473e;

    public o1(String str, int i5, v1 v1Var, int i10, boolean z2) {
        this.f2469a = str;
        this.f2470b = i5;
        this.f2471c = v1Var;
        this.f2472d = i10;
        this.f2473e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f2469a.equals(o1Var.f2469a) && this.f2470b == o1Var.f2470b && this.f2471c.V(o1Var.f2471c);
    }

    public final int hashCode() {
        return Objects.hash(this.f2469a, Integer.valueOf(this.f2470b), this.f2471c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f2469a, false);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f2470b);
        AbstractC1304a.Z(parcel, 3, this.f2471c, i5, false);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f2472d);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f2473e ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
