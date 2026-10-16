package b6;

import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* loaded from: classes3.dex */
public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new Z6.c(23);

    /* renamed from: b, reason: collision with root package name */
    public final String f19352b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19353c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19354d;

    public j(String str, String str2, String str3) {
        super("----");
        this.f19352b = str;
        this.f19353c = str2;
        this.f19354d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (v.a(this.f19353c, jVar.f19353c) && v.a(this.f19352b, jVar.f19352b) && v.a(this.f19354d, jVar.f19354d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19352b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19353c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19354d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // b6.i
    public final String toString() {
        return this.f19351a + ": domain=" + this.f19352b + ", description=" + this.f19353c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f19351a);
        parcel.writeString(this.f19352b);
        parcel.writeString(this.f19354d);
    }

    public j(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i5 = v.f46721a;
        this.f19352b = string;
        this.f19353c = parcel.readString();
        this.f19354d = parcel.readString();
    }
}
