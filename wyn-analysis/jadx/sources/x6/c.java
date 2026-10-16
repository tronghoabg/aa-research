package X6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class c extends AbstractC2614a {
    public static final Parcelable.Creator<c> CREATOR = new T6.f(17);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16136a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16137b;

    public c(boolean z2, String str) {
        if (z2) {
            AbstractC1732v.i(str);
        }
        this.f16136a = z2;
        this.f16137b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16136a == cVar.f16136a && AbstractC1732v.m(this.f16137b, cVar.f16137b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f16136a), this.f16137b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f16136a ? 1 : 0);
        AbstractC1304a.a0(parcel, 2, this.f16137b, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
