package F2;

import D6.B1;
import N1.A;
import N1.C0765n;
import N1.C0775y;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements A {
    public static final Parcelable.Creator<c> CREATOR = new B1(5);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3819a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3820b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3821c;

    public c(String str, String str2, byte[] bArr) {
        this.f3819a = bArr;
        this.f3820b = str;
        this.f3821c = str2;
    }

    @Override // N1.A
    public final void P(C0775y c0775y) {
        String str = this.f3820b;
        if (str != null) {
            c0775y.f8279a = str;
        }
    }

    @Override // N1.A
    public final /* synthetic */ C0765n a() {
        return null;
    }

    @Override // N1.A
    public final /* synthetic */ byte[] b() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3819a, ((c) obj).f3819a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3819a);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f3820b + "\", url=\"" + this.f3821c + "\", rawMetadata.length=\"" + this.f3819a.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeByteArray(this.f3819a);
        parcel.writeString(this.f3820b);
        parcel.writeString(this.f3821c);
    }

    public c(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f3819a = bArrCreateByteArray;
        this.f3820b = parcel.readString();
        this.f3821c = parcel.readString();
    }
}
