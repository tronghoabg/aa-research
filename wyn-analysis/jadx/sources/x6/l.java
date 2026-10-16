package X6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l extends AbstractC2614a {
    public static final Parcelable.Creator<l> CREATOR = new T6.f(22);

    /* renamed from: a, reason: collision with root package name */
    public final p f16158a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16159b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16160c;

    public l(p pVar, String str, int i5) {
        AbstractC1732v.i(pVar);
        this.f16158a = pVar;
        this.f16159b = str;
        this.f16160c = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC1732v.m(this.f16158a, lVar.f16158a) && AbstractC1732v.m(this.f16159b, lVar.f16159b) && this.f16160c == lVar.f16160c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16158a, this.f16159b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.f16158a, i5, false);
        AbstractC1304a.a0(parcel, 2, this.f16159b, false);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f16160c);
        AbstractC1304a.m0(iL0, parcel);
    }
}
