package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import j$.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class qdb extends ijo implements qdc {
    public final qcw a;
    private final qcx b;
    private final BundleCallReceiver c;

    public qdb(qcx qcxVar, qcw qcwVar) {
        super("com.google.android.enterprise.connectedapps.ICrossProfileCallback");
        this.c = new BundleCallReceiver();
        this.b = qcxVar;
        this.a = qcwVar;
    }

    @Override // defpackage.qdc
    public final void e(long j, int i, byte[] bArr) {
        qcx qcxVar = this.b;
        Bundle preparedCall = this.c.getPreparedCall(j, i, bArr);
        qcw qcwVar = this.a;
        qcxVar.h(qcwVar);
        qcwVar.c.a(preparedCall);
        ScheduledExecutorService scheduledExecutorService = qcxVar.b;
        qcxVar.getClass();
        scheduledExecutorService.execute(new qct(qcxVar, 8));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            qdb qdbVar = (qdb) obj;
            if (this.b.equals(qdbVar.b) && this.a.equals(qdbVar.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qdc
    public final void f(long j, int i, int i2, byte[] bArr) {
        this.c.a(j, i, i2, bArr);
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            long j = parcel.readLong();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            byte[] bArrCreateByteArray = parcel.createByteArray();
            ijp.d(parcel);
            f(j, i2, i3, bArrCreateByteArray);
        } else if (i == 2) {
            long j2 = parcel.readLong();
            parcel.readInt();
            Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
            ijp.d(parcel);
            h(j2, bundle);
        } else if (i == 3) {
            long j3 = parcel.readLong();
            int i4 = parcel.readInt();
            parcel.readInt();
            byte[] bArrCreateByteArray2 = parcel.createByteArray();
            ijp.d(parcel);
            g(j3, i4, bArrCreateByteArray2);
        } else {
            if (i != 4) {
                return false;
            }
            long j4 = parcel.readLong();
            int i5 = parcel.readInt();
            byte[] bArrCreateByteArray3 = parcel.createByteArray();
            ijp.d(parcel);
            e(j4, i5, bArrCreateByteArray3);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.qdc
    public final void g(long j, int i, byte[] bArr) {
        qcx qcxVar = this.b;
        qcw qcwVar = this.a;
        qcxVar.h(qcwVar);
        Bundle preparedCall = this.c.getPreparedCall(j, i, bArr);
        qcz qczVar = qcwVar.c;
        qczVar.c.o(qczVar.a.a(preparedCall, "result", qczVar.b));
    }

    @Override // defpackage.qdc
    public final void h(long j, Bundle bundle) {
        this.c.c(j, bundle);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }

    public qdb() {
        throw null;
    }
}
