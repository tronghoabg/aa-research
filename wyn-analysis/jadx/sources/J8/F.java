package J8;

import a.AbstractC1304a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class F extends AbstractC2614a {
    public static final Parcelable.Creator<F> CREATOR = new I2.d(16);

    /* renamed from: a, reason: collision with root package name */
    public final String f5740a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5741b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5742c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5743d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f5744e;

    public F(String str, String str2, boolean z2, boolean z10) {
        this.f5740a = str;
        this.f5741b = str2;
        this.f5742c = z2;
        this.f5743d = z10;
        this.f5744e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 2, this.f5740a, false);
        AbstractC1304a.a0(parcel, 3, this.f5741b, false);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f5742c ? 1 : 0);
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(this.f5743d ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
