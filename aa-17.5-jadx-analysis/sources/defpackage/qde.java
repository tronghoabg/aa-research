package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.enterprise.connectedapps.CrossProfileConnector_Service;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class qde extends ijo implements qdf {
    final /* synthetic */ CrossProfileConnector_Service a;
    private final erb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qde(CrossProfileConnector_Service crossProfileConnector_Service) {
        super("com.google.android.enterprise.connectedapps.ICrossProfileService");
        this.a = crossProfileConnector_Service;
        this.b = new erb((byte[]) null, (byte[]) null, (byte[]) null);
    }

    @Override // defpackage.qdf
    public final void e(long j, int i, int i2, byte[] bArr) {
        this.a.getApplicationContext();
        ((BundleCallReceiver) this.b.a).a(j, i, i2, bArr);
    }

    @Override // defpackage.qdf
    public final byte[] f(long j, int i, long j2, int i2, byte[] bArr, qdc qdcVar) {
        return this.b.Q(this.a.getApplicationContext(), j, i, j2, i2, bArr, qdcVar);
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        qdc qdaVar;
        qdc qdcVar;
        if (i == 1) {
            long j = parcel.readLong();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            byte[] bArrCreateByteArray = parcel.createByteArray();
            ijp.d(parcel);
            e(j, i2, i3, bArrCreateByteArray);
            parcel2.writeNoException();
        } else if (i == 2) {
            long j2 = parcel.readLong();
            parcel.readInt();
            Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
            ijp.d(parcel);
            i(j2, bundle);
            parcel2.writeNoException();
        } else if (i == 3) {
            long j3 = parcel.readLong();
            int i4 = parcel.readInt();
            long j4 = parcel.readLong();
            int i5 = parcel.readInt();
            byte[] bArrCreateByteArray2 = parcel.createByteArray();
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                qdcVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.enterprise.connectedapps.ICrossProfileCallback");
                if (iInterfaceQueryLocalInterface instanceof qdc) {
                    qdcVar = (qdc) iInterfaceQueryLocalInterface;
                } else {
                    qdaVar = new qda(strongBinder);
                    ijp.d(parcel);
                    byte[] bArrF = f(j3, i4, j4, i5, bArrCreateByteArray2, qdaVar);
                    parcel2.writeNoException();
                    parcel2.writeByteArray(bArrF);
                }
            }
            qdaVar = qdcVar;
            ijp.d(parcel);
            byte[] bArrF2 = f(j3, i4, j4, i5, bArrCreateByteArray2, qdaVar);
            parcel2.writeNoException();
            parcel2.writeByteArray(bArrF2);
        } else if (i == 4) {
            long j5 = parcel.readLong();
            int i6 = parcel.readInt();
            ijp.d(parcel);
            byte[] bArrG = g(j5, i6);
            parcel2.writeNoException();
            parcel2.writeByteArray(bArrG);
        } else {
            if (i != 5) {
                return false;
            }
            long j6 = parcel.readLong();
            parcel.readInt();
            ijp.d(parcel);
            Bundle bundleH = h(j6);
            parcel2.writeNoException();
            ijp.h(parcel2, bundleH);
        }
        return true;
    }

    @Override // defpackage.qdf
    public final byte[] g(long j, int i) {
        this.a.getApplicationContext();
        Map map = ((BundleCallReceiver) this.b.a).a;
        Long lValueOf = Long.valueOf(j);
        byte[] bArr = (byte[]) map.get(lValueOf);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 250000 * i, Math.min(bArr.length, (i + 1) * 250000));
        if (i == ((int) Math.ceil(r0 / 250000.0d)) - 1) {
            map.remove(lValueOf);
        }
        return bArrCopyOfRange;
    }

    @Override // defpackage.qdf
    public final Bundle h(long j) {
        this.a.getApplicationContext();
        return (Bundle) ((BundleCallReceiver) this.b.a).b.remove(Long.valueOf(j));
    }

    @Override // defpackage.qdf
    public final void i(long j, Bundle bundle) {
        this.a.getApplicationContext();
        ((BundleCallReceiver) this.b.a).c(j, bundle);
    }
}
