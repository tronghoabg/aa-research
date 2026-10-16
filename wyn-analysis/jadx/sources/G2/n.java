package G2;

import D6.B1;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n extends j {
    public static final Parcelable.Creator<n> CREATOR = new B1(20);

    /* renamed from: b, reason: collision with root package name */
    public final String f4195b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4196c;

    public n(String str, byte[] bArr) {
        super("PRIV");
        this.f4195b = str;
        this.f4196c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            int i5 = x.f9724a;
            if (Objects.equals(this.f4195b, nVar.f4195b) && Arrays.equals(this.f4196c, nVar.f4196c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4195b;
        return Arrays.hashCode(this.f4196c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // G2.j
    public final String toString() {
        return this.f4185a + ": owner=" + this.f4195b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f4195b);
        parcel.writeByteArray(this.f4196c);
    }

    public n(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i5 = x.f9724a;
        this.f4195b = string;
        this.f4196c = parcel.createByteArray();
    }
}
