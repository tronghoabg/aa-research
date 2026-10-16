package X6;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class i extends AbstractC2614a {
    public static final Parcelable.Creator<i> CREATOR = new T6.f(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f16150a;

    public i(int i5) {
        this.f16150a = i5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return AbstractC1732v.m(Integer.valueOf(this.f16150a), Integer.valueOf(((i) obj).f16150a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f16150a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f16150a);
        AbstractC1304a.m0(iL0, parcel);
    }
}
