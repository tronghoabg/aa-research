package defpackage;

import android.telecom.CallAudioState;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import java.util.List;

/* loaded from: classes.dex */
public final class ofk extends ebf {
    private final afdr a;

    public ofk(afdr afdrVar) {
        this.a = afdrVar;
    }

    @Override // defpackage.ebf
    public final void m(CallAudioState callAudioState) {
        callAudioState.getClass();
        if (callAudioState.getRoute() == 0) {
            ((ynz) ofq.a.f().ai(5853)).B("AudioState changed. No update needed: %#X(%#X)", callAudioState.getRoute(), callAudioState.getSupportedRouteMask());
        } else {
            ((ynz) ofq.a.f().ai(5852)).B("AudioState changed. New route: %#X(%#X)", callAudioState.getRoute(), callAudioState.getSupportedRouteMask());
            this.a.invoke();
        }
    }

    @Override // defpackage.ebf
    public final void n(CarCall carCall) {
        carCall.getClass();
        this.a.invoke();
    }

    @Override // defpackage.ebf
    public final void p(CarCall carCall) {
        carCall.getClass();
        this.a.invoke();
    }

    @Override // defpackage.ebf
    public final void r(CarCall carCall, List list) {
        this.a.invoke();
    }

    @Override // defpackage.ebf
    public final void u(CarCall carCall, CarCall.Details details) {
        carCall.getClass();
        this.a.invoke();
    }

    @Override // defpackage.ebf
    public final void v(CarCall carCall, CarCall carCall2) {
        this.a.invoke();
    }

    @Override // defpackage.ebf
    public final void y(CarCall carCall, int i) {
        carCall.getClass();
        this.a.invoke();
    }
}
