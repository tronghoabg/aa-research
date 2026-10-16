package x7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import w7.C4381i;

/* loaded from: classes4.dex */
public final class s extends AbstractC2614a {
    public static final Parcelable.Creator<s> CREATOR = new C4381i(15);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f47811a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47812b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f47813c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f47814d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f47815e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f47816f;

    public s(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f47811a = z2;
        this.f47812b = z10;
        this.f47813c = z11;
        this.f47814d = z12;
        this.f47815e = z13;
        this.f47816f = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f47811a ? 1 : 0);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f47812b ? 1 : 0);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f47813c ? 1 : 0);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f47814d ? 1 : 0);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f47815e ? 1 : 0);
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(this.f47816f ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
