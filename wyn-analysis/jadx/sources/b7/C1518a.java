package b7;

import a.AbstractC1304a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* renamed from: b7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1518a extends AbstractC2614a {
    public static final Parcelable.Creator<C1518a> CREATOR = new Z6.c(28);

    /* renamed from: a, reason: collision with root package name */
    public final int f19366a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19367b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f19368c;

    public C1518a(int i5, int i10, Bundle bundle) {
        this.f19366a = i5;
        this.f19367b = i10;
        this.f19368c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f19366a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f19367b);
        AbstractC1304a.S(parcel, 3, this.f19368c, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
