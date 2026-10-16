package x7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.internal.identity.zzeo;
import f7.AbstractC2614a;
import java.util.Arrays;
import w7.C4381i;

/* loaded from: classes4.dex */
public final class k extends AbstractC2614a {
    public static final Parcelable.Creator<k> CREATOR = new C4381i(8);

    /* renamed from: a, reason: collision with root package name */
    public final long f47789a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47790b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f47791c;

    /* renamed from: d, reason: collision with root package name */
    public final ClientIdentity f47792d;

    public k(long j8, int i5, boolean z2, ClientIdentity clientIdentity) {
        this.f47789a = j8;
        this.f47790b = i5;
        this.f47791c = z2;
        this.f47792d = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f47789a == kVar.f47789a && this.f47790b == kVar.f47790b && this.f47791c == kVar.f47791c && AbstractC1732v.m(this.f47792d, kVar.f47792d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f47789a), Integer.valueOf(this.f47790b), Boolean.valueOf(this.f47791c)});
    }

    public final String toString() {
        StringBuilder sbJ = N0.a.j("LastLocationRequest[");
        long j8 = this.f47789a;
        if (j8 != Long.MAX_VALUE) {
            sbJ.append("maxAge=");
            zzeo.zzc(j8, sbJ);
        }
        int i5 = this.f47790b;
        if (i5 != 0) {
            sbJ.append(", ");
            sbJ.append(z.d(i5));
        }
        if (this.f47791c) {
            sbJ.append(", bypass");
        }
        ClientIdentity clientIdentity = this.f47792d;
        if (clientIdentity != null) {
            sbJ.append(", impersonation=");
            sbJ.append(clientIdentity);
        }
        sbJ.append(']');
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 8);
        parcel.writeLong(this.f47789a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f47790b);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f47791c ? 1 : 0);
        AbstractC1304a.Z(parcel, 5, this.f47792d, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
