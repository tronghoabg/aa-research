package I2;

import Q1.o;
import Va.M6;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k extends b {
    public static final Parcelable.Creator<k> CREATOR = new d(3);

    /* renamed from: a, reason: collision with root package name */
    public final long f5317a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5318b;

    public k(long j8, long j10) {
        this.f5317a = j8;
        this.f5318b = j10;
    }

    public static long c(long j8, o oVar) {
        long jU = oVar.u();
        if ((128 & jU) != 0) {
            return 8589934591L & ((((jU & 1) << 32) | oVar.w()) + j8);
        }
        return -9223372036854775807L;
    }

    @Override // I2.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb2.append(this.f5317a);
        sb2.append(", playbackPositionUs= ");
        return M6.s(sb2, this.f5318b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.f5317a);
        parcel.writeLong(this.f5318b);
    }
}
