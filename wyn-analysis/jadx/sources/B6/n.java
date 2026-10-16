package b6;

import android.os.Parcel;
import android.os.Parcelable;
import u6.v;

/* loaded from: classes3.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new Z6.c(27);

    /* renamed from: b, reason: collision with root package name */
    public final String f19364b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19365c;

    public n(String str, String str2, String str3) {
        super(str);
        this.f19364b = str2;
        this.f19365c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f19351a.equals(nVar.f19351a) && v.a(this.f19364b, nVar.f19364b) && v.a(this.f19365c, nVar.f19365c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iC = N0.a.c(527, 31, this.f19351a);
        String str = this.f19364b;
        int iHashCode = (iC + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19365c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // b6.i
    public final String toString() {
        return this.f19351a + ": url=" + this.f19365c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeString(this.f19351a);
        parcel.writeString(this.f19364b);
        parcel.writeString(this.f19365c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(Parcel parcel) {
        String string = parcel.readString();
        int i5 = v.f46721a;
        super(string);
        this.f19364b = parcel.readString();
        this.f19365c = parcel.readString();
    }
}
