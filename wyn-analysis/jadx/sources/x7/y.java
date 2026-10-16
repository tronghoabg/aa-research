package x7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import w7.C4381i;

/* loaded from: classes4.dex */
public final class y extends AbstractC2614a {
    public static final Parcelable.Creator<y> CREATOR = new C4381i(19);

    /* renamed from: a, reason: collision with root package name */
    public final long f47831a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47832b;

    /* renamed from: c, reason: collision with root package name */
    public final WorkSource f47833c;

    /* renamed from: d, reason: collision with root package name */
    public final String f47834d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f47835e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f47836f;

    /* renamed from: g, reason: collision with root package name */
    public final String f47837g;

    /* renamed from: h, reason: collision with root package name */
    public final long f47838h;

    /* renamed from: i, reason: collision with root package name */
    public String f47839i;

    public y(long j8, boolean z2, WorkSource workSource, String str, int[] iArr, boolean z10, String str2, long j10, String str3) {
        this.f47831a = j8;
        this.f47832b = z2;
        this.f47833c = workSource;
        this.f47834d = str;
        this.f47835e = iArr;
        this.f47836f = z10;
        this.f47837g = str2;
        this.f47838h = j10;
        this.f47839i = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        AbstractC1732v.i(parcel);
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 8);
        parcel.writeLong(this.f47831a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f47832b ? 1 : 0);
        AbstractC1304a.Z(parcel, 3, this.f47833c, i5, false);
        AbstractC1304a.a0(parcel, 4, this.f47834d, false);
        AbstractC1304a.W(parcel, 5, this.f47835e, false);
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(this.f47836f ? 1 : 0);
        AbstractC1304a.a0(parcel, 7, this.f47837g, false);
        AbstractC1304a.k0(parcel, 8, 8);
        parcel.writeLong(this.f47838h);
        AbstractC1304a.a0(parcel, 9, this.f47839i, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
