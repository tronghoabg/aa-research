package x7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.Arrays;
import w7.C4381i;

/* loaded from: classes4.dex */
public final class t extends AbstractC2614a {
    public static final Parcelable.Creator<t> CREATOR = new C4381i(17);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f47817a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47818b;

    public t(ArrayList arrayList, int i5) {
        this.f47817a = arrayList;
        this.f47818b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return AbstractC1732v.m(this.f47817a, tVar.f47817a) && this.f47818b == tVar.f47818b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f47817a, Integer.valueOf(this.f47818b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        AbstractC1732v.i(parcel);
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.e0(parcel, 1, this.f47817a, false);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f47818b);
        AbstractC1304a.m0(iL0, parcel);
    }
}
