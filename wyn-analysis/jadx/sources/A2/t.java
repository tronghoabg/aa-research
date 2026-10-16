package a2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new Z6.c(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f17312a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17313b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17314c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17315d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17316e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17317f;

    public t(int i5, int i10, String str, String str2, String str3, String str4) {
        this.f17312a = i5;
        this.f17313b = i10;
        this.f17314c = str;
        this.f17315d = str2;
        this.f17316e = str3;
        this.f17317f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f17312a == tVar.f17312a && this.f17313b == tVar.f17313b && TextUtils.equals(this.f17314c, tVar.f17314c) && TextUtils.equals(this.f17315d, tVar.f17315d) && TextUtils.equals(this.f17316e, tVar.f17316e) && TextUtils.equals(this.f17317f, tVar.f17317f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = ((this.f17312a * 31) + this.f17313b) * 31;
        String str = this.f17314c;
        int iHashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17315d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17316e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f17317f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f17312a);
        parcel.writeInt(this.f17313b);
        parcel.writeString(this.f17314c);
        parcel.writeString(this.f17315d);
        parcel.writeString(this.f17316e);
        parcel.writeString(this.f17317f);
    }

    public t(Parcel parcel) {
        this.f17312a = parcel.readInt();
        this.f17313b = parcel.readInt();
        this.f17314c = parcel.readString();
        this.f17315d = parcel.readString();
        this.f17316e = parcel.readString();
        this.f17317f = parcel.readString();
    }
}
