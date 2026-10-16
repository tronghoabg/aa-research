package J8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes4.dex */
public final class u extends AbstractC0629d implements Cloneable {
    public static final Parcelable.Creator<u> CREATOR = new I2.d(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f5817a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5818b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5819c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5820d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5821e;

    public u(boolean z2, String str, String str2, String str3, String str4) {
        AbstractC1732v.a("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true);
        this.f5817a = str;
        this.f5818b = str2;
        this.f5819c = str3;
        this.f5820d = z2;
        this.f5821e = str4;
    }

    public static u Y(String str, String str2) {
        return new u(true, str, str2, null, null);
    }

    @Override // J8.AbstractC0629d
    public final String V() {
        return "phone";
    }

    @Override // J8.AbstractC0629d
    public final String W() {
        return "phone";
    }

    @Override // J8.AbstractC0629d
    public final AbstractC0629d X() {
        return (u) clone();
    }

    public final Object clone() {
        return new u(this.f5820d, this.f5817a, this.f5818b, this.f5819c, this.f5821e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f5817a, false);
        AbstractC1304a.a0(parcel, 2, this.f5818b, false);
        AbstractC1304a.a0(parcel, 4, this.f5819c, false);
        boolean z2 = this.f5820d;
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC1304a.a0(parcel, 6, this.f5821e, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
