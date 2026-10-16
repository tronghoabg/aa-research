package X6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class b extends AbstractC2614a {
    public static final Parcelable.Creator<b> CREATOR = new T6.f(16);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16129a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16130b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16131c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16132d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16133e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f16134f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f16135g;

    public b(boolean z2, String str, String str2, boolean z10, String str3, ArrayList arrayList, boolean z11) {
        boolean z12 = true;
        if (z10 && z11) {
            z12 = false;
        }
        AbstractC1732v.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z12);
        this.f16129a = z2;
        if (z2) {
            AbstractC1732v.j(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f16130b = str;
        this.f16131c = str2;
        this.f16132d = z10;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f16134f = arrayList2;
        this.f16133e = str3;
        this.f16135g = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16129a == bVar.f16129a && AbstractC1732v.m(this.f16130b, bVar.f16130b) && AbstractC1732v.m(this.f16131c, bVar.f16131c) && this.f16132d == bVar.f16132d && AbstractC1732v.m(this.f16133e, bVar.f16133e) && AbstractC1732v.m(this.f16134f, bVar.f16134f) && this.f16135g == bVar.f16135g;
    }

    public final int hashCode() {
        Boolean boolValueOf = Boolean.valueOf(this.f16129a);
        Boolean boolValueOf2 = Boolean.valueOf(this.f16132d);
        Boolean boolValueOf3 = Boolean.valueOf(this.f16135g);
        return Arrays.hashCode(new Object[]{boolValueOf, this.f16130b, this.f16131c, boolValueOf2, this.f16133e, this.f16134f, boolValueOf3});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f16129a ? 1 : 0);
        AbstractC1304a.a0(parcel, 2, this.f16130b, false);
        AbstractC1304a.a0(parcel, 3, this.f16131c, false);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f16132d ? 1 : 0);
        AbstractC1304a.a0(parcel, 5, this.f16133e, false);
        AbstractC1304a.c0(parcel, 6, this.f16134f);
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(this.f16135g ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
