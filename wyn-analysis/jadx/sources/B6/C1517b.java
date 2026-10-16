package b6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import u6.v;

/* renamed from: b6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1517b extends i {
    public static final Parcelable.Creator<C1517b> CREATOR = new Z6.c(18);

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f19330b;

    public C1517b(String str, byte[] bArr) {
        super(str);
        this.f19330b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1517b.class == obj.getClass()) {
            C1517b c1517b = (C1517b) obj;
            if (this.f19351a.equals(c1517b.f19351a) && Arrays.equals(this.f19330b, c1517b.f19330b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19330b) + N0.a.c(527, 31, this.f19351a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f19351a);
        parcel.writeByteArray(this.f19330b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1517b(Parcel parcel) {
        String string = parcel.readString();
        int i5 = v.f46721a;
        super(string);
        this.f19330b = parcel.createByteArray();
    }
}
