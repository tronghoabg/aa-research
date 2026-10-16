package X6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class p extends AbstractC2614a {
    public static final Parcelable.Creator<p> CREATOR = new T6.f(25);

    /* renamed from: a, reason: collision with root package name */
    public final String f16171a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16172b;

    public p(String str, String str2) {
        AbstractC1732v.j(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        AbstractC1732v.g(strTrim, "Account identifier cannot be empty");
        this.f16171a = strTrim;
        AbstractC1732v.f(str2);
        this.f16172b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC1732v.m(this.f16171a, pVar.f16171a) && AbstractC1732v.m(this.f16172b, pVar.f16172b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16171a, this.f16172b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f16171a, false);
        AbstractC1304a.a0(parcel, 2, this.f16172b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
