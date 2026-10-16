package b6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import u6.v;

/* loaded from: classes3.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new Z6.c(25);

    /* renamed from: b, reason: collision with root package name */
    public final String f19360b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f19361c;

    public l(String str, byte[] bArr) {
        super("PRIV");
        this.f19360b = str;
        this.f19361c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (v.a(this.f19360b, lVar.f19360b) && Arrays.equals(this.f19361c, lVar.f19361c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19360b;
        return Arrays.hashCode(this.f19361c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // b6.i
    public final String toString() {
        return this.f19351a + ": owner=" + this.f19360b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f19360b);
        parcel.writeByteArray(this.f19361c);
    }

    public l(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i5 = v.f46721a;
        this.f19360b = string;
        this.f19361c = parcel.createByteArray();
    }
}
