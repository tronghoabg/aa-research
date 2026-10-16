package T6;

import a.AbstractC1304a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class b extends AbstractC2614a {
    public static final Parcelable.Creator<b> CREATOR = new f(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f11758a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11759b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11760c;

    /* renamed from: d, reason: collision with root package name */
    public final Account f11761d;

    public b(int i5, int i10, String str, Account account) {
        this.f11758a = i5;
        this.f11759b = i10;
        this.f11760c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f11761d = account;
        } else {
            this.f11761d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f11758a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f11759b);
        AbstractC1304a.a0(parcel, 3, this.f11760c, false);
        AbstractC1304a.Z(parcel, 4, this.f11761d, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
