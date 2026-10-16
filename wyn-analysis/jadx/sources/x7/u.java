package x7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.identity.ClientIdentity;
import f7.AbstractC2614a;
import java.util.Arrays;
import w7.C4381i;

/* loaded from: classes4.dex */
public final class u extends AbstractC2614a {
    public static final Parcelable.Creator<u> CREATOR = new C4381i(10);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f47819a;

    /* renamed from: b, reason: collision with root package name */
    public final ClientIdentity f47820b;

    public u(boolean z2, ClientIdentity clientIdentity) {
        this.f47819a = z2;
        this.f47820b = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f47819a == uVar.f47819a && AbstractC1732v.m(this.f47820b, uVar.f47820b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f47819a)});
    }

    public final String toString() {
        StringBuilder sbJ = N0.a.j("LocationAvailabilityRequest[");
        if (this.f47819a) {
            sbJ.append("bypass, ");
        }
        ClientIdentity clientIdentity = this.f47820b;
        if (clientIdentity != null) {
            sbJ.append("impersonation=");
            sbJ.append(clientIdentity);
            sbJ.append(", ");
        }
        sbJ.setLength(sbJ.length() - 2);
        sbJ.append(']');
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f47819a ? 1 : 0);
        AbstractC1304a.Z(parcel, 2, this.f47820b, i5, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
