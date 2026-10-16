package H2;

import D6.B1;
import Q1.k;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new B1(26);

    /* renamed from: a, reason: collision with root package name */
    public final long f4877a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4878b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4879c;

    public b(long j8, long j10, int i5) {
        k.c(j8 < j10);
        this.f4877a = j8;
        this.f4878b = j10;
        this.f4879c = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4877a == bVar.f4877a && this.f4878b == bVar.f4878b && this.f4879c == bVar.f4879c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4877a), Long.valueOf(this.f4878b), Integer.valueOf(this.f4879c)});
    }

    public final String toString() {
        int i5 = x.f9724a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f4877a + ", endTimeMs=" + this.f4878b + ", speedDivisor=" + this.f4879c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.f4877a);
        parcel.writeLong(this.f4878b);
        parcel.writeInt(this.f4879c);
    }
}
