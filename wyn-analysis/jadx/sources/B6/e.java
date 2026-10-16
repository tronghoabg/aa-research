package b6;

import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* loaded from: classes3.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new Z6.c(21);

    /* renamed from: b, reason: collision with root package name */
    public final String f19342b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19343c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19344d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f19342b = str;
        this.f19343c = str2;
        this.f19344d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (v.a(this.f19343c, eVar.f19343c) && v.a(this.f19342b, eVar.f19342b) && v.a(this.f19344d, eVar.f19344d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19342b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19343c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19344d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // b6.i
    public final String toString() {
        return this.f19351a + ": language=" + this.f19342b + ", description=" + this.f19343c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f19351a);
        parcel.writeString(this.f19342b);
        parcel.writeString(this.f19344d);
    }

    public e(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i5 = v.f46721a;
        this.f19342b = string;
        this.f19343c = parcel.readString();
        this.f19344d = parcel.readString();
    }
}
