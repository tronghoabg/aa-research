package G6;

import D6.B1;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* renamed from: G6.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0553q extends AbstractC2614a {
    public static final Parcelable.Creator<C0553q> CREATOR = new B1(23);

    /* renamed from: a, reason: collision with root package name */
    public final String f4627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4628b;

    public C0553q(String str, int i5) {
        this.f4627a = str == null ? "" : str;
        this.f4628b = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f4627a, false);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f4628b);
        AbstractC1304a.m0(iL0, parcel);
    }
}
