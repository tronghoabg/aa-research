package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class rjd extends ijo implements rje {
    private final rjf a;

    public rjd(rjf rjfVar) {
        super("com.google.android.gms.car.diagnostics.IDataCollectedCallback");
        this.a = rjfVar;
    }

    @Override // defpackage.rje
    public final void e(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        rjf rjfVar = this.a;
        if (parcelFileDescriptor == null) {
            rjfVar.j(new rjh(Status.c, (InputStream) null, 0));
        } else {
            rjfVar.j(new rjh(Status.a, new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), 0));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ijp.a(parcel, ParcelFileDescriptor.CREATOR);
        ijp.d(parcel);
        e(parcelFileDescriptor);
        return true;
    }
}
