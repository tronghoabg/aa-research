package G2;

import D6.B1;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class l extends j {
    public static final Parcelable.Creator<l> CREATOR = new B1(18);

    /* renamed from: b, reason: collision with root package name */
    public final String f4187b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4188c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4189d;

    public l(String str, String str2, String str3) {
        super("----");
        this.f4187b = str;
        this.f4188c = str2;
        this.f4189d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            int i5 = x.f9724a;
            if (Objects.equals(this.f4188c, lVar.f4188c) && Objects.equals(this.f4187b, lVar.f4187b) && Objects.equals(this.f4189d, lVar.f4189d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4187b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4188c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4189d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // G2.j
    public final String toString() {
        return this.f4185a + ": domain=" + this.f4187b + ", description=" + this.f4188c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f4185a);
        parcel.writeString(this.f4187b);
        parcel.writeString(this.f4189d);
    }

    public l(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i5 = x.f9724a;
        this.f4187b = string;
        this.f4188c = parcel.readString();
        this.f4189d = parcel.readString();
    }
}
