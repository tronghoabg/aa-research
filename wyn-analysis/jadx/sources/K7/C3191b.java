package k7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f4.C2555b;
import f7.AbstractC2614a;

/* renamed from: k7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3191b extends AbstractC2614a {
    public static final Parcelable.Creator<C3191b> CREATOR = new C2555b(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f39288a;

    /* renamed from: b, reason: collision with root package name */
    public final C3190a f39289b;

    public C3191b(int i5, C3190a c3190a) {
        this.f39288a = i5;
        this.f39289b = c3190a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f39288a);
        AbstractC1304a.Z(parcel, 2, this.f39289b, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public C3191b(C3190a c3190a) {
        this.f39288a = 1;
        this.f39289b = c3190a;
    }
}
