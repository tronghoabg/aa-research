package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import u6.AbstractC4256a;
import u6.v;

/* renamed from: c6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1562d implements Parcelable {
    public static final Parcelable.Creator<C1562d> CREATOR = new C1559a(3);

    /* renamed from: a, reason: collision with root package name */
    public final long f19664a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19665b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19666c;

    public C1562d(long j8, long j10, int i5) {
        AbstractC4256a.e(j8 < j10);
        this.f19664a = j8;
        this.f19665b = j10;
        this.f19666c = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1562d.class == obj.getClass()) {
            C1562d c1562d = (C1562d) obj;
            if (this.f19664a == c1562d.f19664a && this.f19665b == c1562d.f19665b && this.f19666c == c1562d.f19666c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f19664a), Long.valueOf(this.f19665b), Integer.valueOf(this.f19666c)});
    }

    public final String toString() {
        int i5 = v.f46721a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f19664a + ", endTimeMs=" + this.f19665b + ", speedDivisor=" + this.f19666c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.f19664a);
        parcel.writeLong(this.f19665b);
        parcel.writeInt(this.f19666c);
    }
}
