package D6;

import a.AbstractC1304a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class z1 extends AbstractC2614a {
    public static final Parcelable.Creator<z1> CREATOR = new A6.j(29);

    /* renamed from: a, reason: collision with root package name */
    public final String f2549a;

    /* renamed from: b, reason: collision with root package name */
    public long f2550b;

    /* renamed from: c, reason: collision with root package name */
    public K0 f2551c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f2552d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2553e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2554f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2555g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2556h;

    public z1(String str, long j8, K0 k02, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f2549a = str;
        this.f2550b = j8;
        this.f2551c = k02;
        this.f2552d = bundle;
        this.f2553e = str2;
        this.f2554f = str3;
        this.f2555g = str4;
        this.f2556h = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f2549a, false);
        long j8 = this.f2550b;
        AbstractC1304a.k0(parcel, 2, 8);
        parcel.writeLong(j8);
        AbstractC1304a.Z(parcel, 3, this.f2551c, i5, false);
        AbstractC1304a.S(parcel, 4, this.f2552d, false);
        AbstractC1304a.a0(parcel, 5, this.f2553e, false);
        AbstractC1304a.a0(parcel, 6, this.f2554f, false);
        AbstractC1304a.a0(parcel, 7, this.f2555g, false);
        AbstractC1304a.a0(parcel, 8, this.f2556h, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
