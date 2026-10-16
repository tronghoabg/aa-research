package defpackage;

import android.telecom.CallAudioState;
import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes2.dex */
final class odv extends ebf {
    final /* synthetic */ odw a;

    public odv(odw odwVar) {
        this.a = odwVar;
    }

    @Override // defpackage.ebf
    public final void m(CallAudioState callAudioState) {
        this.a.m(new odu(odw.a(), callAudioState.getRoute(), callAudioState.getSupportedRouteMask()));
    }

    @Override // defpackage.ebf
    public final void u(CarCall carCall, CarCall.Details details) {
        this.a.m(new odu(odw.a(), ebf.A().a(), ebf.A().l()));
    }
}
