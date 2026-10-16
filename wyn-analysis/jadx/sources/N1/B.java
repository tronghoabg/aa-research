package N1;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class B implements Parcelable {
    public static final Parcelable.Creator<B> CREATOR = new I2.d(23);

    /* renamed from: a, reason: collision with root package name */
    public final A[] f8023a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8024b;

    public B(A... aArr) {
        this(-9223372036854775807L, aArr);
    }

    public final B c(A... aArr) {
        if (aArr.length == 0) {
            return this;
        }
        int i5 = Q1.x.f9724a;
        A[] aArr2 = this.f8023a;
        Object[] objArrCopyOf = Arrays.copyOf(aArr2, aArr2.length + aArr.length);
        System.arraycopy(aArr, 0, objArrCopyOf, aArr2.length, aArr.length);
        return new B(this.f8024b, (A[]) objArrCopyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final B e(B b5) {
        return b5 == null ? this : c(b5.f8023a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B.class == obj.getClass()) {
            B b5 = (B) obj;
            if (Arrays.equals(this.f8023a, b5.f8023a) && this.f8024b == b5.f8024b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return v0.O(this.f8024b) + (Arrays.hashCode(this.f8023a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f8023a));
        long j8 = this.f8024b;
        if (j8 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j8;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        A[] aArr = this.f8023a;
        parcel.writeInt(aArr.length);
        for (A a5 : aArr) {
            parcel.writeParcelable(a5, 0);
        }
        parcel.writeLong(this.f8024b);
    }

    public B(long j8, A... aArr) {
        this.f8024b = j8;
        this.f8023a = aArr;
    }

    public B(List list) {
        this((A[]) list.toArray(new A[0]));
    }

    public B(Parcel parcel) {
        this.f8023a = new A[parcel.readInt()];
        int i5 = 0;
        while (true) {
            A[] aArr = this.f8023a;
            if (i5 < aArr.length) {
                aArr[i5] = (A) parcel.readParcelable(A.class.getClassLoader());
                i5++;
            } else {
                this.f8024b = parcel.readLong();
                return;
            }
        }
    }
}
