package C6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class g extends AbstractC2614a {
    public static final Parcelable.Creator<g> CREATOR = new A6.j(10);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1831a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1832b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1833c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1834d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1835e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1836f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1837g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1838h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1839i;

    public g(boolean z2, boolean z10, String str, boolean z11, float f10, int i5, boolean z12, boolean z13, boolean z14) {
        this.f1831a = z2;
        this.f1832b = z10;
        this.f1833c = str;
        this.f1834d = z11;
        this.f1835e = f10;
        this.f1836f = i5;
        this.f1837g = z12;
        this.f1838h = z13;
        this.f1839i = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f1831a ? 1 : 0);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f1832b ? 1 : 0);
        AbstractC1304a.a0(parcel, 4, this.f1833c, false);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f1834d ? 1 : 0);
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeFloat(this.f1835e);
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(this.f1836f);
        AbstractC1304a.k0(parcel, 8, 4);
        parcel.writeInt(this.f1837g ? 1 : 0);
        AbstractC1304a.k0(parcel, 9, 4);
        parcel.writeInt(this.f1838h ? 1 : 0);
        AbstractC1304a.k0(parcel, 10, 4);
        parcel.writeInt(this.f1839i ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }

    public g(boolean z2, boolean z10, boolean z11, float f10, boolean z12, boolean z13, boolean z14) {
        this(z2, z10, null, z11, f10, -1, z12, z13, z14);
    }
}
