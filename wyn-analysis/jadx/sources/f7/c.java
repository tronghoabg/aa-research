package F7;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.U;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes4.dex */
public abstract class c extends zab {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i5, Parcel parcel, Parcel parcel2, int i10) {
        switch (i5) {
            case 3:
                zac.zab(parcel);
                break;
            case 4:
                zac.zab(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                zac.zab(parcel);
                break;
            case 7:
                zac.zab(parcel);
                break;
            case 8:
                g gVar = (g) zac.zaa(parcel, g.CREATOR);
                zac.zab(parcel);
                U u10 = (U) this;
                u10.f26489b.post(new e0(3, u10, gVar));
                break;
            case 9:
                zac.zab(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
