package X6;

import a.AbstractC1304a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a extends AbstractC2614a {
    public static final Parcelable.Creator<a> CREATOR = new T6.f(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f16123a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16124b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16125c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f16126d;

    /* renamed from: e, reason: collision with root package name */
    public final GoogleSignInAccount f16127e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f16128f;

    public a(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f16123a = str;
        this.f16124b = str2;
        this.f16125c = str3;
        AbstractC1732v.i(arrayList);
        this.f16126d = arrayList;
        this.f16128f = pendingIntent;
        this.f16127e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC1732v.m(this.f16123a, aVar.f16123a) && AbstractC1732v.m(this.f16124b, aVar.f16124b) && AbstractC1732v.m(this.f16125c, aVar.f16125c) && AbstractC1732v.m(this.f16126d, aVar.f16126d) && AbstractC1732v.m(this.f16128f, aVar.f16128f) && AbstractC1732v.m(this.f16127e, aVar.f16127e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16123a, this.f16124b, this.f16125c, this.f16126d, this.f16128f, this.f16127e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f16123a, false);
        AbstractC1304a.a0(parcel, 2, this.f16124b, false);
        AbstractC1304a.a0(parcel, 3, this.f16125c, false);
        AbstractC1304a.c0(parcel, 4, this.f16126d);
        AbstractC1304a.Z(parcel, 5, this.f16127e, i5, false);
        AbstractC1304a.Z(parcel, 6, this.f16128f, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
