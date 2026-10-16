package J8;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;

/* renamed from: J8.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0631f extends AbstractC0629d {
    public static final Parcelable.Creator<C0631f> CREATOR = new I2.d(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f5803a;

    public C0631f(String str) {
        AbstractC1732v.f(str);
        this.f5803a = str;
    }

    @Override // J8.AbstractC0629d
    public final String V() {
        return "facebook.com";
    }

    @Override // J8.AbstractC0629d
    public final String W() {
        return "facebook.com";
    }

    @Override // J8.AbstractC0629d
    public final AbstractC0629d X() {
        return new C0631f(this.f5803a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f5803a, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
