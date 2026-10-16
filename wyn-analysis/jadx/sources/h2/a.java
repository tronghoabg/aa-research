package H2;

import D6.B1;
import N1.A;
import N1.C0765n;
import N1.C0775y;
import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements A {
    public static final Parcelable.Creator<a> CREATOR = new B1(24);

    /* renamed from: a, reason: collision with root package name */
    public final long f4872a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4873b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4874c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4875d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4876e;

    public a(long j8, long j10, long j11, long j12, long j13) {
        this.f4872a = j8;
        this.f4873b = j10;
        this.f4874c = j11;
        this.f4875d = j12;
        this.f4876e = j13;
    }

    @Override // N1.A
    public final /* synthetic */ void P(C0775y c0775y) {
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
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f4872a == aVar.f4872a && this.f4873b == aVar.f4873b && this.f4874c == aVar.f4874c && this.f4875d == aVar.f4875d && this.f4876e == aVar.f4876e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return v0.O(this.f4876e) + ((v0.O(this.f4875d) + ((v0.O(this.f4874c) + ((v0.O(this.f4873b) + ((v0.O(this.f4872a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f4872a + ", photoSize=" + this.f4873b + ", photoPresentationTimestampUs=" + this.f4874c + ", videoStartPosition=" + this.f4875d + ", videoSize=" + this.f4876e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.f4872a);
        parcel.writeLong(this.f4873b);
        parcel.writeLong(this.f4874c);
        parcel.writeLong(this.f4875d);
        parcel.writeLong(this.f4876e);
    }

    public a(Parcel parcel) {
        this.f4872a = parcel.readLong();
        this.f4873b = parcel.readLong();
        this.f4874c = parcel.readLong();
        this.f4875d = parcel.readLong();
        this.f4876e = parcel.readLong();
    }
}
