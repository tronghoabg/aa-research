package E6;

import D6.B1;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class a extends AbstractC2614a {
    public static final Parcelable.Creator<a> CREATOR = new B1(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f3586a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3587b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3588c;

    public a(String str, String str2, String str3) {
        this.f3586a = str;
        this.f3587b = str2;
        this.f3588c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f3586a, false);
        AbstractC1304a.a0(parcel, 2, this.f3587b, false);
        AbstractC1304a.a0(parcel, 3, this.f3588c, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
