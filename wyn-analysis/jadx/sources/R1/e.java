package R1;

import N1.A;
import N1.C0765n;
import N1.C0775y;
import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e implements A {
    public static final Parcelable.Creator<e> CREATOR = new I2.d(28);

    /* renamed from: a, reason: collision with root package name */
    public final long f10100a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10101b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10102c;

    public e(long j8, long j10, long j11) {
        this.f10100a = j8;
        this.f10101b = j10;
        this.f10102c = j11;
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
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f10100a == eVar.f10100a && this.f10101b == eVar.f10101b && this.f10102c == eVar.f10102c;
    }

    public final int hashCode() {
        return v0.O(this.f10102c) + ((v0.O(this.f10101b) + ((v0.O(this.f10100a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f10100a + ", modification time=" + this.f10101b + ", timescale=" + this.f10102c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.f10100a);
        parcel.writeLong(this.f10101b);
        parcel.writeLong(this.f10102c);
    }

    public e(Parcel parcel) {
        this.f10100a = parcel.readLong();
        this.f10101b = parcel.readLong();
        this.f10102c = parcel.readLong();
    }
}
