package G2;

import D6.B1;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class e extends j {
    public static final Parcelable.Creator<e> CREATOR = new B1(16);

    /* renamed from: b, reason: collision with root package name */
    public final String f4173b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4174c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4175d;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f4173b = str;
        this.f4174c = str2;
        this.f4175d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            int i5 = x.f9724a;
            if (Objects.equals(this.f4174c, eVar.f4174c) && Objects.equals(this.f4173b, eVar.f4173b) && Objects.equals(this.f4175d, eVar.f4175d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4173b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4174c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f4175d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // G2.j
    public final String toString() {
        return this.f4185a + ": language=" + this.f4173b + ", description=" + this.f4174c + ", text=" + this.f4175d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f4185a);
        parcel.writeString(this.f4173b);
        parcel.writeString(this.f4175d);
    }

    public e(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i5 = x.f9724a;
        this.f4173b = string;
        this.f4174c = parcel.readString();
        this.f4175d = parcel.readString();
    }
}
