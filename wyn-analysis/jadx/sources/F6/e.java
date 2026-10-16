package F6;

import D6.B1;
import a.AbstractC1304a;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class e extends AbstractC2614a {
    public static final Parcelable.Creator<e> CREATOR = new B1(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f3953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3954b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3955c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3956d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3957e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3958f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3959g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f3960h;

    /* renamed from: i, reason: collision with root package name */
    public final a f3961i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3962j;
    public final Bundle k;

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z2, Bundle bundle) {
        this.f3953a = str;
        this.f3954b = str2;
        this.f3955c = str3;
        this.f3956d = str4;
        this.f3957e = str5;
        this.f3958f = str6;
        this.f3959g = str7;
        this.f3960h = intent;
        this.f3961i = (a) BinderC3877b.S(BinderC3877b.R(iBinder));
        this.f3962j = z2;
        this.k = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f3953a, false);
        AbstractC1304a.a0(parcel, 3, this.f3954b, false);
        AbstractC1304a.a0(parcel, 4, this.f3955c, false);
        AbstractC1304a.a0(parcel, 5, this.f3956d, false);
        AbstractC1304a.a0(parcel, 6, this.f3957e, false);
        AbstractC1304a.a0(parcel, 7, this.f3958f, false);
        AbstractC1304a.a0(parcel, 8, this.f3959g, false);
        AbstractC1304a.Z(parcel, 9, this.f3960h, i5, false);
        AbstractC1304a.V(parcel, 10, new BinderC3877b(this.f3961i).asBinder());
        AbstractC1304a.k0(parcel, 11, 4);
        parcel.writeInt(this.f3962j ? 1 : 0);
        AbstractC1304a.S(parcel, 12, this.k, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public e(Intent intent, a aVar) {
        this(null, null, null, null, null, null, null, intent, new BinderC3877b(aVar).asBinder(), false, new Bundle());
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new BinderC3877b(aVar).asBinder(), false, new Bundle());
    }
}
