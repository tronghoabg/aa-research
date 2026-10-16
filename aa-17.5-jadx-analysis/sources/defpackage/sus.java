package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;

/* loaded from: classes.dex */
public final class sus extends ijo implements IInterface {
    private final nok a;

    public sus(nok nokVar) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = nokVar;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                Status status = (Status) ijp.a(parcel, Status.CREATOR);
                ijp.d(parcel);
                oni.n(status, null, this.a);
                return true;
            case 2:
                Status status2 = (Status) ijp.a(parcel, Status.CREATOR);
                ijp.d(parcel);
                oni.n(status2, null, this.a);
                return true;
            case 3:
                Status status3 = (Status) ijp.a(parcel, Status.CREATOR);
                ijp.d(parcel);
                oni.n(status3, null, this.a);
                return true;
            case 4:
                Status status4 = (Status) ijp.a(parcel, Status.CREATOR);
                Configurations configurations = (Configurations) ijp.a(parcel, Configurations.CREATOR);
                ijp.d(parcel);
                oni.l(status4, configurations, this.a);
                return true;
            case 5:
                Status status5 = (Status) ijp.a(parcel, Status.CREATOR);
                ijp.d(parcel);
                oni.n(status5, null, this.a);
                return true;
            case 6:
                Status status6 = (Status) ijp.a(parcel, Status.CREATOR);
                ExperimentTokens experimentTokens = (ExperimentTokens) ijp.a(parcel, ExperimentTokens.CREATOR);
                ijp.d(parcel);
                oni.l(status6, experimentTokens, this.a);
                return true;
            case 7:
                Status status7 = (Status) ijp.a(parcel, Status.CREATOR);
                DogfoodsToken dogfoodsToken = (DogfoodsToken) ijp.a(parcel, DogfoodsToken.CREATOR);
                ijp.d(parcel);
                oni.l(status7, dogfoodsToken, this.a);
                return true;
            case 8:
                Status status8 = (Status) ijp.a(parcel, Status.CREATOR);
                ijp.d(parcel);
                oni.n(status8, null, this.a);
                return true;
            case 9:
                Status status9 = (Status) ijp.a(parcel, Status.CREATOR);
                Flag flag = (Flag) ijp.a(parcel, Flag.CREATOR);
                ijp.d(parcel);
                oni.l(status9, flag, this.a);
                return true;
            case 10:
                Status status10 = (Status) ijp.a(parcel, Status.CREATOR);
                Configurations configurations2 = (Configurations) ijp.a(parcel, Configurations.CREATOR);
                ijp.d(parcel);
                oni.l(status10, configurations2, this.a);
                return true;
            case 11:
                Status status11 = (Status) ijp.a(parcel, Status.CREATOR);
                parcel.readLong();
                ijp.d(parcel);
                oni.l(status11, null, this.a);
                return true;
            case 12:
                Status status12 = (Status) ijp.a(parcel, Status.CREATOR);
                ijp.d(parcel);
                oni.n(status12, null, this.a);
                return true;
            case 13:
                Status status13 = (Status) ijp.a(parcel, Status.CREATOR);
                FlagOverrides flagOverrides = (FlagOverrides) ijp.a(parcel, FlagOverrides.CREATOR);
                ijp.d(parcel);
                oni.l(status13, flagOverrides, this.a);
                return true;
            case 14:
                Status status14 = (Status) ijp.a(parcel, Status.CREATOR);
                ijp.d(parcel);
                oni.n(status14, null, this.a);
                return true;
            case 15:
                Status status15 = (Status) ijp.a(parcel, Status.CREATOR);
                ijp.d(parcel);
                oni.n(status15, null, this.a);
                return true;
            case 16:
                Status status16 = (Status) ijp.a(parcel, Status.CREATOR);
                long j = parcel.readLong();
                ijp.d(parcel);
                oni.l(status16, Long.valueOf(j), this.a);
                return true;
            default:
                return false;
        }
    }
}
