package J8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;

/* loaded from: classes4.dex */
public final class I extends AbstractC0629d {
    public static final Parcelable.Creator<I> CREATOR = new I2.d(18);

    /* renamed from: a, reason: collision with root package name */
    public final String f5752a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5753b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5754c;

    /* renamed from: d, reason: collision with root package name */
    public final zzahr f5755d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5756e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5757f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5758g;

    public I(String str, String str2, String str3, zzahr zzahrVar, String str4, String str5, String str6) {
        this.f5752a = zzag.zzb(str);
        this.f5753b = str2;
        this.f5754c = str3;
        this.f5755d = zzahrVar;
        this.f5756e = str4;
        this.f5757f = str5;
        this.f5758g = str6;
    }

    public static I Y(zzahr zzahrVar) {
        AbstractC1732v.j(zzahrVar, "Must specify a non-null webSignInCredential");
        return new I(null, null, null, zzahrVar, null, null, null);
    }

    @Override // J8.AbstractC0629d
    public final String V() {
        return this.f5752a;
    }

    @Override // J8.AbstractC0629d
    public final String W() {
        return this.f5752a;
    }

    @Override // J8.AbstractC0629d
    public final AbstractC0629d X() {
        return new I(this.f5752a, this.f5753b, this.f5754c, this.f5755d, this.f5756e, this.f5757f, this.f5758g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f5752a, false);
        AbstractC1304a.a0(parcel, 2, this.f5753b, false);
        AbstractC1304a.a0(parcel, 3, this.f5754c, false);
        AbstractC1304a.Z(parcel, 4, this.f5755d, i5, false);
        AbstractC1304a.a0(parcel, 5, this.f5756e, false);
        AbstractC1304a.a0(parcel, 6, this.f5757f, false);
        AbstractC1304a.a0(parcel, 7, this.f5758g, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
