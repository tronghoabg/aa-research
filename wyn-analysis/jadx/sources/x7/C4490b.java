package x7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;
import w7.C4381i;

/* renamed from: x7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4490b extends AbstractC2614a {
    public static final Parcelable.Creator<C4490b> CREATOR = new C4381i(20);

    /* renamed from: a, reason: collision with root package name */
    public final int f47762a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47763b;

    public C4490b(int i5, int i10) {
        this.f47762a = i5;
        this.f47763b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4490b)) {
            return false;
        }
        C4490b c4490b = (C4490b) obj;
        return this.f47762a == c4490b.f47762a && this.f47763b == c4490b.f47763b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47762a), Integer.valueOf(this.f47763b)});
    }

    public final String toString() {
        int i5 = this.f47762a;
        int length = String.valueOf(i5).length();
        int i10 = this.f47763b;
        StringBuilder sb2 = new StringBuilder(length + 52 + String.valueOf(i10).length() + 1);
        N0.a.l(i5, i10, "ActivityTransition [mActivityType=", ", mTransitionType=", sb2);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        AbstractC1732v.i(parcel);
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f47762a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f47763b);
        AbstractC1304a.m0(iL0, parcel);
    }
}
