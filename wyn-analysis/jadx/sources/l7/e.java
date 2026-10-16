package l7;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;
import k7.C3191b;

/* loaded from: classes3.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        String strY = null;
        String strY2 = null;
        C3191b c3191b = null;
        int iF0 = 0;
        int iF02 = 0;
        boolean Z10 = false;
        int iF03 = 0;
        boolean Z11 = false;
        int iF04 = 0;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 1:
                    iF0 = v0.f0(i5, parcel);
                    break;
                case 2:
                    iF02 = v0.f0(i5, parcel);
                    break;
                case 3:
                    Z10 = v0.Z(i5, parcel);
                    break;
                case 4:
                    iF03 = v0.f0(i5, parcel);
                    break;
                case 5:
                    Z11 = v0.Z(i5, parcel);
                    break;
                case 6:
                    strY = v0.y(i5, parcel);
                    break;
                case 7:
                    iF04 = v0.f0(i5, parcel);
                    break;
                case '\b':
                    strY2 = v0.y(i5, parcel);
                    break;
                case '\t':
                    c3191b = (C3191b) v0.x(parcel, i5, C3191b.CREATOR);
                    break;
                default:
                    v0.m0(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new C3397a(iF0, iF02, Z10, iF03, Z11, strY, iF04, strY2, c3191b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new C3397a[i5];
    }
}
