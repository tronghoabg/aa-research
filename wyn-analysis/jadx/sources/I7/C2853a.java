package i7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import f7.AbstractC2614a;

/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2853a extends AbstractC2614a {
    public static final Parcelable.Creator<C2853a> CREATOR = new C2555b(6);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f36876a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36877b;

    public C2853a(boolean z2, int i5) {
        this.f36876a = z2;
        this.f36877b = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f36876a ? 1 : 0);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f36877b);
        AbstractC1304a.m0(iL0, parcel);
    }
}
