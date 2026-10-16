package N1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class J implements Comparable, Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new I2.d(24);

    /* renamed from: a, reason: collision with root package name */
    public final int f8045a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8046b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8047c;

    static {
        Q1.x.E(0);
        Q1.x.E(1);
        Q1.x.E(2);
    }

    public J() {
        this.f8045a = -1;
        this.f8046b = -1;
        this.f8047c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        J j8 = (J) obj;
        int i5 = this.f8045a - j8.f8045a;
        if (i5 != 0) {
            return i5;
        }
        int i10 = this.f8046b - j8.f8046b;
        return i10 == 0 ? this.f8047c - j8.f8047c : i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J.class == obj.getClass()) {
            J j8 = (J) obj;
            if (this.f8045a == j8.f8045a && this.f8046b == j8.f8046b && this.f8047c == j8.f8047c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f8045a * 31) + this.f8046b) * 31) + this.f8047c;
    }

    public final String toString() {
        return this.f8045a + "." + this.f8046b + "." + this.f8047c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f8045a);
        parcel.writeInt(this.f8046b);
        parcel.writeInt(this.f8047c);
    }

    public J(Parcel parcel) {
        this.f8045a = parcel.readInt();
        this.f8046b = parcel.readInt();
        this.f8047c = parcel.readInt();
    }
}
