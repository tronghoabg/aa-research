package l7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class g extends AbstractC2614a {
    public static final Parcelable.Creator<g> CREATOR = new C2555b(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f40032a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40033b;

    /* renamed from: c, reason: collision with root package name */
    public final C3397a f40034c;

    public g(C3397a c3397a, String str) {
        this.f40032a = 1;
        this.f40033b = str;
        this.f40034c = c3397a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f40032a);
        AbstractC1304a.a0(parcel, 2, this.f40033b, false);
        AbstractC1304a.Z(parcel, 3, this.f40034c, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public g(C3397a c3397a, String str, int i5) {
        this.f40032a = i5;
        this.f40033b = str;
        this.f40034c = c3397a;
    }
}
