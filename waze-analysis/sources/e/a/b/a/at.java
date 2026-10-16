package e.a.b.a;

import android.os.Parcel;
import e.a.ee;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class at {
    private at() {
    }

    static ee a(int i2, Parcel parcel) {
        int i3 = i2 >> 16;
        int i4 = i2 & 32;
        ee eeVarD = ee.d(i3 & 255);
        return i4 != 0 ? eeVarD.g(parcel.readString()) : eeVarD;
    }

    static void b(Parcel parcel, int i2) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i2);
        parcel.setDataPosition(iDataPosition);
    }

    static boolean c(int i2, int i3) {
        return (i2 & i3) != 0;
    }
}
