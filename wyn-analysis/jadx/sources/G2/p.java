package G2;

import D6.B1;
import Q1.x;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class p extends j {
    public static final Parcelable.Creator<p> CREATOR = new B1(22);

    /* renamed from: b, reason: collision with root package name */
    public final String f4199b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4200c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f4199b = str2;
        this.f4200c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f4185a.equals(pVar.f4185a)) {
                int i5 = x.f9724a;
                if (Objects.equals(this.f4199b, pVar.f4199b) && Objects.equals(this.f4200c, pVar.f4200c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = N0.a.c(527, 31, this.f4185a);
        String str = this.f4199b;
        int iHashCode = (iC + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4200c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // G2.j
    public final String toString() {
        return this.f4185a + ": url=" + this.f4200c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f4185a);
        parcel.writeString(this.f4199b);
        parcel.writeString(this.f4200c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(Parcel parcel) {
        String string = parcel.readString();
        int i5 = x.f9724a;
        super(string);
        this.f4199b = parcel.readString();
        this.f4200c = parcel.readString();
    }
}
