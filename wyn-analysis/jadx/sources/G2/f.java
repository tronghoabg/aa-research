package G2;

import D6.B1;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends j {
    public static final Parcelable.Creator<f> CREATOR = new B1(17);

    /* renamed from: b, reason: collision with root package name */
    public final String f4176b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4177c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4178d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f4179e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f4176b = str;
        this.f4177c = str2;
        this.f4178d = str3;
        this.f4179e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            int i5 = x.f9724a;
            if (Objects.equals(this.f4176b, fVar.f4176b) && Objects.equals(this.f4177c, fVar.f4177c) && Objects.equals(this.f4178d, fVar.f4178d) && Arrays.equals(this.f4179e, fVar.f4179e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4176b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4177c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4178d;
        return Arrays.hashCode(this.f4179e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // G2.j
    public final String toString() {
        return this.f4185a + ": mimeType=" + this.f4176b + ", filename=" + this.f4177c + ", description=" + this.f4178d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f4176b);
        parcel.writeString(this.f4177c);
        parcel.writeString(this.f4178d);
        parcel.writeByteArray(this.f4179e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i5 = x.f9724a;
        this.f4176b = string;
        this.f4177c = parcel.readString();
        this.f4178d = parcel.readString();
        this.f4179e = parcel.createByteArray();
    }
}
