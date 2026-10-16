package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class qpd extends qpb {
    final /* synthetic */ nok a;

    public qpd(nok nokVar) {
        this.a = nokVar;
    }

    @Override // defpackage.qpb
    public final void a(String str) throws RemoteException {
        oni.l(str != null ? Status.a : new Status(3006, null, null, null), str, this.a);
    }
}
