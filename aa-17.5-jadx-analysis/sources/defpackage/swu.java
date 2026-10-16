package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* loaded from: classes.dex */
public class swu extends ijo implements IInterface {
    public swu() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    public void a(Status status, UsageReportingOptInOptions usageReportingOptInOptions) throws RemoteException {
        throw new IllegalStateException("Not implemented.");
    }

    public void b(Status status) throws RemoteException {
        throw new IllegalStateException("Not implemented.");
    }

    public void c(Status status) throws RemoteException {
        throw new IllegalStateException("Not implemented.");
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 2:
                Status status = (Status) ijp.a(parcel, Status.CREATOR);
                UsageReportingOptInOptions usageReportingOptInOptions = (UsageReportingOptInOptions) ijp.a(parcel, UsageReportingOptInOptions.CREATOR);
                ijp.d(parcel);
                a(status, usageReportingOptInOptions);
                return true;
            case 3:
                ijp.d(parcel);
                throw new IllegalStateException("Not implemented.");
            case 4:
                Status status2 = (Status) ijp.a(parcel, Status.CREATOR);
                ijp.d(parcel);
                b(status2);
                return true;
            case 5:
                Status status3 = (Status) ijp.a(parcel, Status.CREATOR);
                ijp.d(parcel);
                c(status3);
                return true;
            case 6:
                parcel.createStringArrayList();
                ijp.d(parcel);
                throw new IllegalStateException("Not implemented.");
            case 7:
                ijp.d(parcel);
                throw new IllegalStateException("Not implemented.");
            case 8:
                parcel.readInt();
                ijp.d(parcel);
                throw new IllegalStateException("Not implemented.");
            case 9:
                ijp.d(parcel);
                throw new IllegalStateException("Not implemented");
            case 10:
                ijp.d(parcel);
                throw new IllegalStateException("Not implemented");
            case 11:
                ijp.d(parcel);
                throw new IllegalStateException("Not implemented.");
            case 12:
                ijp.d(parcel);
                throw new IllegalStateException("Not implemented.");
            case 13:
                ijp.d(parcel);
                throw new IllegalStateException("Not implemented.");
            case 14:
                ijp.d(parcel);
                throw new IllegalStateException("Not implemented.");
            case 15:
                ijp.d(parcel);
                throw new IllegalStateException("Not implemented.");
            default:
                return false;
        }
    }
}
