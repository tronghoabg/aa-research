package defpackage;

import android.os.RemoteException;
import android.telecom.Call;
import java.util.List;

/* loaded from: classes.dex */
final class ogj extends Call.Callback {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ ogp a;

    public ogj(ogp ogpVar) {
        this.a = ogpVar;
    }

    @Override // android.telecom.Call.Callback
    public final void onCallDestroyed(Call call) {
        this.a.a(new ogl(this, call, 1));
    }

    @Override // android.telecom.Call.Callback
    public final void onCannedTextResponsesLoaded(Call call, List list) {
        this.a.a(new ogi(this, call, list, 2));
    }

    @Override // android.telecom.Call.Callback
    public final void onChildrenChanged(Call call, List list) {
        this.a.a(new ogi(this, call, list, 3));
    }

    @Override // android.telecom.Call.Callback
    public final void onConferenceableCallsChanged(Call call, List list) {
        this.a.a(new ogi(this, call, list, 4));
    }

    @Override // android.telecom.Call.Callback
    public final void onDetailsChanged(Call call, Call.Details details) {
        ogp ogpVar = this.a;
        ogpVar.a(new ogk(ogpVar.b.c(call), 1));
    }

    @Override // android.telecom.Call.Callback
    public final void onParentChanged(Call call, Call call2) {
        this.a.a(new ogi(this, call, call2, 0));
    }

    @Override // android.telecom.Call.Callback
    public final void onPostDialWait(Call call, String str) {
        this.a.a(new ogi(this, call, str, 1));
    }

    @Override // android.telecom.Call.Callback
    public final void onStateChanged(final Call call, final int i) {
        this.a.a(new ogo() { // from class: ogh
            @Override // defpackage.ogo
            public final void a(ogs ogsVar) throws RemoteException {
                ogsVar.q(this.a.a.b.c(call), i);
            }
        });
    }
}
