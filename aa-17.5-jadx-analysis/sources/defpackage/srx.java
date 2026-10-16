package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;

/* loaded from: classes2.dex */
final class srx extends ssa {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Bundle e;
    final /* synthetic */ long f;
    final /* synthetic */ GoogleHelp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srx(sld sldVar, FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(sldVar);
        this.a = feedbackOptions;
        this.e = bundle;
        this.f = j;
        this.g = googleHelp;
    }

    @Override // defpackage.srz
    protected final void l(ssf ssfVar) throws RemoteException {
        try {
            FeedbackOptions feedbackOptions = this.a;
            Bundle bundle = this.e;
            long j = this.f;
            GoogleHelp googleHelp = this.g;
            srw srwVar = new srw(this);
            Parcel parcelGh = ssfVar.gh();
            ijp.g(parcelGh, feedbackOptions);
            ijp.g(parcelGh, bundle);
            parcelGh.writeLong(j);
            ijp.g(parcelGh, googleHelp);
            ijp.i(parcelGh, srwVar);
            ssfVar.gk(10, parcelGh);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            h(ssb.a);
        }
    }
}
