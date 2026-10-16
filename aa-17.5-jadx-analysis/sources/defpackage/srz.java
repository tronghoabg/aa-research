package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes2.dex */
abstract class srz extends slt {
    public srz(sld sldVar) {
        super(sldVar);
    }

    @Override // defpackage.slt
    protected final /* bridge */ /* synthetic */ void b(skq skqVar) throws RemoteException {
        ssd ssdVar = (ssd) skqVar;
        Context context = ssdVar.b;
        l((ssf) ssdVar.v());
    }

    protected abstract void l(ssf ssfVar) throws RemoteException;
}
