package d6;

import android.os.Parcel;
import android.os.Parcelable;
import c6.C1559a;

/* renamed from: d6.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2397j extends AbstractC2389b {
    public static final Parcelable.Creator<C2397j> CREATOR = new C1559a(22);

    /* renamed from: a, reason: collision with root package name */
    public final long f34109a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34110b;

    public C2397j(long j8, long j10) {
        this.f34109a = j8;
        this.f34110b = j10;
    }

    public static long c(long j8, Y4.b bVar) {
        long jQ = bVar.q();
        if ((128 & jQ) != 0) {
            return 8589934591L & ((((jQ & 1) << 32) | bVar.r()) + j8);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.f34109a);
        parcel.writeLong(this.f34110b);
    }
}
