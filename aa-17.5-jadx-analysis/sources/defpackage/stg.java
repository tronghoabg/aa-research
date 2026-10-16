package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes2.dex */
public final class stg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        boolean zAf = false;
        int iN = 0;
        int iN2 = 0;
        boolean zAf2 = false;
        long jQ = -1;
        float fM = 0.0f;
        int iN3 = Integer.MAX_VALUE;
        long jQ2 = Long.MAX_VALUE;
        long jQ3 = Long.MAX_VALUE;
        long jQ4 = 0;
        long jQ5 = 600000;
        long jQ6 = 3600000;
        int iN4 = 102;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iN4 = spu.N(parcel, i);
                    break;
                case 2:
                    jQ6 = spu.Q(parcel, i);
                    break;
                case 3:
                    jQ5 = spu.Q(parcel, i);
                    break;
                case 4:
                case 14:
                default:
                    spu.ae(parcel, i);
                    break;
                case 5:
                    jQ2 = spu.Q(parcel, i);
                    break;
                case 6:
                    iN3 = spu.N(parcel, i);
                    break;
                case 7:
                    fM = spu.M(parcel, i);
                    break;
                case '\b':
                    jQ4 = spu.Q(parcel, i);
                    break;
                case '\t':
                    zAf = spu.af(parcel, i);
                    break;
                case '\n':
                    jQ3 = spu.Q(parcel, i);
                    break;
                case 11:
                    jQ = spu.Q(parcel, i);
                    break;
                case '\f':
                    iN = spu.N(parcel, i);
                    break;
                case '\r':
                    iN2 = spu.N(parcel, i);
                    break;
                case 15:
                    zAf2 = spu.af(parcel, i);
                    break;
                case 16:
                    workSource = (WorkSource) spu.T(parcel, i, WorkSource.CREATOR);
                    break;
                case 17:
                    clientIdentity = (ClientIdentity) spu.T(parcel, i, ClientIdentity.CREATOR);
                    break;
            }
        }
        spu.ac(parcel, iP);
        return new LocationRequest(iN4, jQ6, jQ5, jQ4, jQ2, jQ3, iN3, fM, zAf, jQ, iN, iN2, zAf2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
