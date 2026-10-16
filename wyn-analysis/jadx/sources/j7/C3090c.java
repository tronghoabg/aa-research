package j7;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: j7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3090c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        ArrayList arrayListC = null;
        String strY = null;
        boolean Z10 = false;
        String strY2 = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                arrayListC = v0.C(parcel, i5, d7.d.CREATOR);
            } else if (c10 == 2) {
                Z10 = v0.Z(i5, parcel);
            } else if (c10 == 3) {
                strY2 = v0.y(i5, parcel);
            } else if (c10 != 4) {
                v0.m0(i5, parcel);
            } else {
                strY = v0.y(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new C3088a(arrayListC, Z10, strY2, strY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new C3088a[i5];
    }
}
