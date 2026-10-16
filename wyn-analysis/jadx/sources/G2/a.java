package G2;

import D6.B1;
import N1.C0775y;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends j {
    public static final Parcelable.Creator<a> CREATOR = new B1(12);

    /* renamed from: b, reason: collision with root package name */
    public final String f4157b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4158c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4159d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f4160e;

    public a(String str, String str2, int i5, byte[] bArr) {
        super("APIC");
        this.f4157b = str;
        this.f4158c = str2;
        this.f4159d = i5;
        this.f4160e = bArr;
    }

    @Override // G2.j, N1.A
    public final void P(C0775y c0775y) {
        c0775y.a(this.f4159d, this.f4160e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f4159d == aVar.f4159d) {
                int i5 = x.f9724a;
                if (Objects.equals(this.f4157b, aVar.f4157b) && Objects.equals(this.f4158c, aVar.f4158c) && Arrays.equals(this.f4160e, aVar.f4160e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = (527 + this.f4159d) * 31;
        String str = this.f4157b;
        int iHashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4158c;
        return Arrays.hashCode(this.f4160e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // G2.j
    public final String toString() {
        return this.f4185a + ": mimeType=" + this.f4157b + ", description=" + this.f4158c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f4157b);
        parcel.writeString(this.f4158c);
        parcel.writeInt(this.f4159d);
        parcel.writeByteArray(this.f4160e);
    }

    public a(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i5 = x.f9724a;
        this.f4157b = string;
        this.f4158c = parcel.readString();
        this.f4159d = parcel.readInt();
        this.f4160e = parcel.createByteArray();
    }
}
