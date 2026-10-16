package x7;

import Va.M6;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Arrays;
import w7.C4381i;

/* loaded from: classes4.dex */
public final class w extends AbstractC2614a {
    public static final Parcelable.Creator<w> CREATOR = new C4381i(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f47823a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47824b;

    /* renamed from: c, reason: collision with root package name */
    public final long f47825c;

    /* renamed from: d, reason: collision with root package name */
    public final long f47826d;

    public w(int i5, int i10, long j8, long j10) {
        this.f47823a = i5;
        this.f47824b = i10;
        this.f47825c = j8;
        this.f47826d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f47823a == wVar.f47823a && this.f47824b == wVar.f47824b && this.f47825c == wVar.f47825c && this.f47826d == wVar.f47826d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47824b), Integer.valueOf(this.f47823a), Long.valueOf(this.f47826d), Long.valueOf(this.f47825c)});
    }

    public final String toString() {
        int i5 = this.f47823a;
        int length = String.valueOf(i5).length();
        int i10 = this.f47824b;
        int length2 = String.valueOf(i10).length();
        long j8 = this.f47826d;
        int length3 = String.valueOf(j8).length();
        long j10 = this.f47825c;
        StringBuilder sb2 = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j10).length());
        N0.a.l(i5, i10, "NetworkLocationStatus: Wifi status: ", " Cell status: ", sb2);
        M6.A(sb2, " elapsed time NS: ", j8, " system time ms: ");
        sb2.append(j10);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(this.f47823a);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(this.f47824b);
        AbstractC1304a.k0(parcel, 3, 8);
        parcel.writeLong(this.f47825c);
        AbstractC1304a.k0(parcel, 4, 8);
        parcel.writeLong(this.f47826d);
        AbstractC1304a.m0(iL0, parcel);
    }
}
