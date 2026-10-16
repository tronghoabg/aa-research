package J8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;

/* renamed from: J8.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0630e extends AbstractC0629d {
    public static final Parcelable.Creator<C0630e> CREATOR = new I2.d(19);

    /* renamed from: a, reason: collision with root package name */
    public final String f5798a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5799b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5800c;

    /* renamed from: d, reason: collision with root package name */
    public String f5801d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5802e;

    public C0630e(boolean z2, String str, String str2, String str3, String str4) {
        AbstractC1732v.f(str);
        this.f5798a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f5799b = str2;
        this.f5800c = str3;
        this.f5801d = str4;
        this.f5802e = z2;
    }

    @Override // J8.AbstractC0629d
    public final String V() {
        return "password";
    }

    @Override // J8.AbstractC0629d
    public final String W() {
        return !TextUtils.isEmpty(this.f5799b) ? "password" : "emailLink";
    }

    @Override // J8.AbstractC0629d
    public final AbstractC0629d X() {
        return new C0630e(this.f5802e, this.f5798a, this.f5799b, this.f5800c, this.f5801d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f5798a, false);
        AbstractC1304a.a0(parcel, 2, this.f5799b, false);
        AbstractC1304a.a0(parcel, 3, this.f5800c, false);
        AbstractC1304a.a0(parcel, 4, this.f5801d, false);
        boolean z2 = this.f5802e;
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
