package k7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class c extends AbstractC2614a {
    public static final Parcelable.Creator<c> CREATOR = new C2555b(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f39290a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39291b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39292c;

    public c(int i5, String str, int i10) {
        this.f39290a = i5;
        this.f39291b = str;
        this.f39292c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f39290a);
        AbstractC1304a.a0(parcel, 2, this.f39291b, false);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f39292c);
        AbstractC1304a.m0(iL0, parcel);
    }

    public c(String str, int i5) {
        this.f39290a = 1;
        this.f39291b = str;
        this.f39292c = i5;
    }
}
