package defpackage;

import android.net.Uri;
import android.telecom.CallAudioState;
import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes2.dex */
final class ohn extends ebf {
    final /* synthetic */ ohp a;

    public ohn(ohp ohpVar) {
        this.a = ohpVar;
    }

    @Override // defpackage.ebf
    public final void m(CallAudioState callAudioState) {
        ohp ohpVar = this.a;
        ond ondVar = new ond(ohpVar.g);
        ondVar.g(callAudioState.isMuted());
        ondVar.b(ncp.k(callAudioState.getRoute()));
        ohpVar.g = ondVar.a();
        ohpVar.X();
    }

    @Override // defpackage.ebf
    public final void n(CarCall carCall) {
        this.a.X();
    }

    @Override // defpackage.ebf
    public final void o(CarCall carCall) {
        this.a.X();
    }

    @Override // defpackage.ebf
    public final void p(CarCall carCall) {
        this.a.X();
    }

    @Override // defpackage.ebf
    public final void t(CarCall carCall, String str) {
        this.a.X();
    }

    @Override // defpackage.ebf
    public final void u(CarCall carCall, CarCall.Details details) {
        this.a.X();
    }

    @Override // defpackage.ebf
    public final void w(CarCall carCall, int i) {
        this.a.X();
    }

    @Override // defpackage.ebf
    public final void y(CarCall carCall, int i) {
        this.a.X();
    }

    @Override // defpackage.ebf
    public final void z(CarCall carCall, Uri uri) {
        this.a.X();
    }
}
