package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final /* synthetic */ class swk implements smy {
    @Override // defpackage.smy
    public final void a(Object obj, Object obj2) throws RemoteException {
        swl swlVar = new swl((nok) obj2);
        swv swvVar = (swv) ((sxa) obj).v();
        Parcel parcelGh = swvVar.gh();
        ClassLoader classLoader = ijp.a;
        parcelGh.writeStrongBinder(swlVar);
        swvVar.gj(2, parcelGh);
    }
}
