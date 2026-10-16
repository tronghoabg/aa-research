package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes2.dex */
public final class ssy extends ijo implements ssz {
    public final sty a;

    public ssy(sty styVar) {
        super("com.google.android.gms.location.ILocationCallback");
        this.a = styVar;
    }

    @Override // defpackage.ssz
    public final void e() {
        this.a.b().b(new stz(this, 0));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            LocationResult locationResult = (LocationResult) ijp.a(parcel, LocationResult.CREATOR);
            ijp.d(parcel);
            this.a.b().b(new stz(locationResult, 1));
        } else if (i == 2) {
            ijp.d(parcel);
            this.a.b().b(new swz(1));
        } else {
            if (i != 3) {
                return false;
            }
            e();
        }
        return true;
    }

    public ssy() {
        throw null;
    }
}
