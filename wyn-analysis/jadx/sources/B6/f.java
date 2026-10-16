package b6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import u6.v;

/* loaded from: classes3.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new Z6.c(22);

    /* renamed from: b, reason: collision with root package name */
    public final String f19345b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19346c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19347d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f19348e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f19345b = str;
        this.f19346c = str2;
        this.f19347d = str3;
        this.f19348e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (v.a(this.f19345b, fVar.f19345b) && v.a(this.f19346c, fVar.f19346c) && v.a(this.f19347d, fVar.f19347d) && Arrays.equals(this.f19348e, fVar.f19348e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19345b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19346c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19347d;
        return Arrays.hashCode(this.f19348e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // b6.i
    public final String toString() {
        return this.f19351a + ": mimeType=" + this.f19345b + ", filename=" + this.f19346c + ", description=" + this.f19347d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f19345b);
        parcel.writeString(this.f19346c);
        parcel.writeString(this.f19347d);
        parcel.writeByteArray(this.f19348e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i5 = v.f46721a;
        this.f19345b = string;
        this.f19346c = parcel.readString();
        this.f19347d = parcel.readString();
        this.f19348e = parcel.createByteArray();
    }
}
