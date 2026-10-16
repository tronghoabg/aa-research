package H6;

import D6.B1;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class a extends AbstractC2614a {
    public static final Parcelable.Creator<a> CREATOR = new B1(28);

    /* renamed from: a, reason: collision with root package name */
    public final String f4927a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4928b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4929c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4930d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4931e;

    public a(String str, int i5, int i10, boolean z2, boolean z10) {
        this.f4927a = str;
        this.f4928b = i5;
        this.f4929c = i10;
        this.f4930d = z2;
        this.f4931e = z10;
    }

    public static a V() {
        return new a(12451000, 12451000, true, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f4927a, false);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f4928b);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f4929c);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f4930d ? 1 : 0);
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeInt(this.f4931e ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }

    public a(int i5, int i10, boolean z2, boolean z10) {
        String str;
        if (z2) {
            str = "0";
        } else {
            str = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        }
        int length = String.valueOf(i5).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + length + 13 + 2);
        N0.a.l(i5, i10, "afma-sdk-a-v", ".", sb2);
        this(wg.b.c(sb2, ".", str), i5, i10, z2, z10);
    }
}
