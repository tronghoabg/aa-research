package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class N extends AbstractC2614a {
    public static final Parcelable.Creator<N> CREATOR = new U(10);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f46933a;

    public N(ArrayList arrayList) {
        this.f46933a = arrayList;
    }

    public final boolean equals(Object obj) {
        ArrayList arrayList;
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        ArrayList arrayList2 = this.f46933a;
        if (arrayList2 == null && n10.f46933a == null) {
            return true;
        }
        return arrayList2 != null && (arrayList = n10.f46933a) != null && arrayList2.containsAll(arrayList) && n10.f46933a.containsAll(arrayList2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f46933a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.e0(parcel, 1, this.f46933a, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
