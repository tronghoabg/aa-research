package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* loaded from: classes2.dex */
final class srv extends ssa {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long e;
    final /* synthetic */ GoogleHelp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srv(sld sldVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(sldVar);
        this.a = bundle;
        this.e = j;
        this.f = googleHelp;
    }

    @Override // defpackage.srz
    protected final void l(ssf ssfVar) throws RemoteException {
        try {
            Bundle bundle = this.a;
            long j = this.e;
            GoogleHelp googleHelp = this.f;
            sru sruVar = new sru(this);
            Parcel parcelGh = ssfVar.gh();
            ijp.g(parcelGh, bundle);
            parcelGh.writeLong(j);
            ijp.g(parcelGh, googleHelp);
            ijp.i(parcelGh, sruVar);
            ssfVar.gk(9, parcelGh);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            h(ssb.a);
        }
    }
}
