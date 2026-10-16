package G2;

import D6.B1;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends j {
    public static final Parcelable.Creator<b> CREATOR = new B1(13);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4161b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f4161b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4185a.equals(bVar.f4185a) && Arrays.equals(this.f4161b, bVar.f4161b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4161b) + N0.a.c(527, 31, this.f4185a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f4185a);
        parcel.writeByteArray(this.f4161b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Parcel parcel) {
        String string = parcel.readString();
        int i5 = x.f9724a;
        super(string);
        this.f4161b = parcel.createByteArray();
    }
}
