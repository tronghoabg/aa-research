package d7;

import Y2.B;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.unity3d.ads.metadata.MediationMetaData;
import f7.AbstractC2614a;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class d extends AbstractC2614a {
    public static final Parcelable.Creator<d> CREATOR = new C1559a(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f34122a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34123b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34124c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34125d;

    public d(int i5, long j8, String str, boolean z2) {
        this.f34122a = str;
        this.f34123b = i5;
        this.f34124c = j8;
        this.f34125d = z2;
    }

    public final long V() {
        long j8 = this.f34124c;
        return j8 == -1 ? this.f34123b : j8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (AbstractC1732v.m(this.f34122a, dVar.f34122a) && V() == dVar.V() && this.f34125d == dVar.f34125d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34122a, Long.valueOf(V()), Boolean.valueOf(this.f34125d)});
    }

    public final String toString() {
        B b5 = new B(this);
        b5.g(this.f34122a, MediationMetaData.KEY_NAME);
        b5.g(Long.valueOf(V()), "version");
        b5.g(Boolean.valueOf(this.f34125d), "is_fully_rolled_out");
        return b5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, this.f34122a, false);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f34123b);
        long jV = V();
        AbstractC1304a.k0(parcel, 3, 8);
        parcel.writeLong(jV);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f34125d ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }

    public d(String str, long j8) {
        this(-1, j8, str, false);
    }
}
