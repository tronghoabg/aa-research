package x7;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Arrays;
import w7.C4381i;

/* loaded from: classes4.dex */
public final class x extends AbstractC2614a {
    public static final Parcelable.Creator<x> CREATOR = new C4381i(18);

    /* renamed from: a, reason: collision with root package name */
    public final int f47827a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47828b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47829c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47830d;

    public x(int i5, int i10, int i11, int i12) {
        AbstractC1732v.k("Start hour must be in range [0, 23].", i5 >= 0 && i5 <= 23);
        AbstractC1732v.k("Start minute must be in range [0, 59].", i10 >= 0 && i10 <= 59);
        AbstractC1732v.k("End hour must be in range [0, 23].", i11 >= 0 && i11 <= 23);
        AbstractC1732v.k("End minute must be in range [0, 59].", i12 >= 0 && i12 <= 59);
        AbstractC1732v.k("Parameters can't be all 0.", ((i5 + i10) + i11) + i12 > 0);
        this.f47827a = i5;
        this.f47828b = i10;
        this.f47829c = i11;
        this.f47830d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f47827a == xVar.f47827a && this.f47828b == xVar.f47828b && this.f47829c == xVar.f47829c && this.f47830d == xVar.f47830d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47827a), Integer.valueOf(this.f47828b), Integer.valueOf(this.f47829c), Integer.valueOf(this.f47830d)});
    }

    public final String toString() {
        int i5 = this.f47827a;
        int length = String.valueOf(i5).length();
        int i10 = this.f47828b;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f47829c;
        int length3 = String.valueOf(i11).length();
        int i12 = this.f47830d;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 10 + length3 + 12 + String.valueOf(i12).length() + 1);
        N0.a.l(i5, i10, "UserPreferredSleepWindow [startHour=", ", startMinute=", sb2);
        N0.a.l(i11, i12, ", endHour=", ", endMinute=", sb2);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        AbstractC1732v.i(parcel);
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f47827a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f47828b);
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(this.f47829c);
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(this.f47830d);
        AbstractC1304a.m0(iL0, parcel);
    }
}
