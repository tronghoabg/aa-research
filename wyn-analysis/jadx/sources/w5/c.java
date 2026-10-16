package W5;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import u6.v;

/* loaded from: classes3.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final b[] f15149a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15150b;

    public c(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public final c c(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        int i5 = v.f46721a;
        b[] bVarArr2 = this.f15149a;
        Object[] objArrCopyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
        System.arraycopy(bVarArr, 0, objArrCopyOf, bVarArr2.length, bVarArr.length);
        return new c(this.f15150b, (b[]) objArrCopyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (Arrays.equals(this.f15149a, cVar.f15149a) && this.f15150b == cVar.f15150b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return v0.O(this.f15150b) + (Arrays.hashCode(this.f15149a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f15149a));
        long j8 = this.f15150b;
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
        b[] bVarArr = this.f15149a;
        parcel.writeInt(bVarArr.length);
        for (b bVar : bVarArr) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f15150b);
    }

    public c(long j8, b... bVarArr) {
        this.f15150b = j8;
        this.f15149a = bVarArr;
    }

    public c(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public c(Parcel parcel) {
        this.f15149a = new b[parcel.readInt()];
        int i5 = 0;
        while (true) {
            b[] bVarArr = this.f15149a;
            if (i5 < bVarArr.length) {
                bVarArr[i5] = (b) parcel.readParcelable(b.class.getClassLoader());
                i5++;
            } else {
                this.f15150b = parcel.readLong();
                return;
            }
        }
    }
}
