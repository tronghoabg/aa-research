package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;

/* loaded from: classes.dex */
public final class sol extends ijo implements IInterface {
    private snp a;
    private final int b;

    public sol(snp snpVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = snpVar;
        this.b = i;
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
        snp snpVar = this.a;
        if (snpVar == null) {
            throw new NullPointerException("onPostInitComplete can be called only once per call to getRemoteService");
        }
        snpVar.z(i, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
            ijp.d(parcel);
            a(i2, strongBinder, bundle);
        } else if (i == 2) {
            parcel.readInt();
            ijp.d(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            ConnectionInfo connectionInfo = (ConnectionInfo) ijp.a(parcel, ConnectionInfo.CREATOR);
            ijp.d(parcel);
            snp snpVar = this.a;
            if (snpVar == null) {
                throw new NullPointerException("onPostInitCompleteWithConnectionInfo can be called only once per call to getRemoteService");
            }
            if (connectionInfo == null) {
                throw new NullPointerException("null reference");
            }
            snpVar.n = connectionInfo;
            if (snpVar.f()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo.d;
                sos.a().b(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a);
            }
            a(i3, strongBinder2, connectionInfo.a);
        }
        parcel2.writeNoException();
        return true;
    }
}
