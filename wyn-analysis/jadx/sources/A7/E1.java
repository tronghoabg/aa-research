package A7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class E1 extends AbstractC2614a {
    public static final Parcelable.Creator<E1> CREATOR = new A6.j(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f487a;

    /* renamed from: b, reason: collision with root package name */
    public final long f488b;

    /* renamed from: c, reason: collision with root package name */
    public final int f489c;

    public E1(String str, long j8, int i5) {
        this.f487a = str;
        this.f488b = j8;
        this.f489c = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f487a, false);
        AbstractC1304a.k0(parcel, 2, 8);
        parcel.writeLong(this.f488b);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f489c);
        AbstractC1304a.m0(iL0, parcel);
    }
}
