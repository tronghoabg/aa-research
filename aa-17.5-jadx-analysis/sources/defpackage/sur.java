package defpackage;

import android.location.Location;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class sur extends ijo implements IInterface {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sur(nok nokVar, int i) {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
        this.b = i;
        this.a = nokVar;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        int i2 = this.b;
        if (i2 == 0) {
            if (i != 2) {
                return false;
            }
            byte[] bArrCreateByteArray = parcel.createByteArray();
            ijp.d(parcel);
            ((smr) this.a).b(new stz(bArrCreateByteArray, 4));
            return true;
        }
        if (i2 == 1) {
            if (i != 1) {
                return false;
            }
            Status status = (Status) ijp.a(parcel, Status.CREATOR);
            Location location = (Location) ijp.a(parcel, Location.CREATOR);
            ijp.d(parcel);
            oni.n(status, location, (nok) this.a);
            return true;
        }
        if (i != 2) {
            return false;
        }
        Status status2 = (Status) ijp.a(parcel, Status.CREATOR);
        byte[] bArrCreateByteArray2 = parcel.createByteArray();
        ijp.d(parcel);
        if (!status2.c()) {
            oni.l(status2, null, (nok) this.a);
            return true;
        }
        try {
            oni.l(status2, (wbn) abnv.B(wbn.a, bArrCreateByteArray2, abnj.a), (nok) this.a);
            return true;
        } catch (abon e) {
            ((nok) this.a).b(e);
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sur(nok nokVar, int i, byte[] bArr) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.b = i;
        this.a = nokVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sur(smr smrVar, int i) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.b = i;
        this.a = smrVar;
    }
}
