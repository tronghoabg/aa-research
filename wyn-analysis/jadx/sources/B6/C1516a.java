package b6;

import E5.C0448e0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import u6.v;

/* renamed from: b6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1516a extends i {
    public static final Parcelable.Creator<C1516a> CREATOR = new Z6.c(17);

    /* renamed from: b, reason: collision with root package name */
    public final String f19326b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19327c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19328d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f19329e;

    public C1516a(String str, String str2, int i5, byte[] bArr) {
        super("APIC");
        this.f19326b = str;
        this.f19327c = str2;
        this.f19328d = i5;
        this.f19329e = bArr;
    }

    @Override // b6.i, W5.b
    public final void d(C0448e0 c0448e0) {
        c0448e0.a(this.f19328d, this.f19329e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1516a.class == obj.getClass()) {
            C1516a c1516a = (C1516a) obj;
            if (this.f19328d == c1516a.f19328d && v.a(this.f19326b, c1516a.f19326b) && v.a(this.f19327c, c1516a.f19327c) && Arrays.equals(this.f19329e, c1516a.f19329e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = (527 + this.f19328d) * 31;
        String str = this.f19326b;
        int iHashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19327c;
        return Arrays.hashCode(this.f19329e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // b6.i
    public final String toString() {
        return this.f19351a + ": mimeType=" + this.f19326b + ", description=" + this.f19327c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f19326b);
        parcel.writeString(this.f19327c);
        parcel.writeInt(this.f19328d);
        parcel.writeByteArray(this.f19329e);
    }

    public C1516a(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i5 = v.f46721a;
        this.f19326b = string;
        this.f19327c = parcel.readString();
        this.f19328d = parcel.readInt();
        this.f19329e = parcel.createByteArray();
    }
}
