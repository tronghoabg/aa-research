package v7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class a0 extends AbstractC2614a {
    public static final Parcelable.Creator<a0> CREATOR = new U(26);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f46952a;

    public a0(ArrayList arrayList) {
        AbstractC1732v.i(arrayList);
        this.f46952a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        ArrayList arrayList = a0Var.f46952a;
        ArrayList arrayList2 = this.f46952a;
        return arrayList2.containsAll(arrayList) && a0Var.f46952a.containsAll(arrayList2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f46952a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.e0(parcel, 1, this.f46952a, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
