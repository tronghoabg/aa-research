package defpackage;

import android.net.Uri;
import android.telecom.CallAudioState;
import android.view.KeyEvent;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import java.util.List;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class odl extends ebf {
    private final yph a;
    private final ebf b;

    public odl(String str, ebf ebfVar) {
        this.a = yph.c(str);
        this.b = ebfVar;
    }

    @Override // defpackage.ebf
    public final void l(KeyEvent keyEvent) {
        ((ype) this.a.a(Level.INFO).ai(5573)).y("dispatchPhoneKeyEvent: %s", keyEvent);
        this.b.l(keyEvent);
    }

    @Override // defpackage.ebf
    public final void m(CallAudioState callAudioState) {
        ((ype) this.a.a(Level.INFO).ai(5574)).R("onAudioStateChanged: %s,%s,%s", Boolean.valueOf(callAudioState.isMuted()), Integer.valueOf(callAudioState.getRoute()), Integer.valueOf(callAudioState.getSupportedRouteMask()));
        this.b.m(callAudioState);
    }

    @Override // defpackage.ebf
    public final void n(CarCall carCall) {
        ((ype) this.a.a(Level.INFO).ai(5575)).y("onCallAdded: %s", carCall);
        this.b.n(carCall);
    }

    @Override // defpackage.ebf
    public final void o(CarCall carCall) {
        ((ype) this.a.a(Level.INFO).ai(5576)).y("onCallDestroyed: %s", carCall);
        this.b.o(carCall);
    }

    @Override // defpackage.ebf
    public final void p(CarCall carCall) {
        ((ype) this.a.a(Level.INFO).ai(5577)).y("onCallRemoved: %s", carCall);
        this.b.p(carCall);
    }

    @Override // defpackage.ebf
    public final void q(CarCall carCall, List list) {
        ((ype) this.a.a(Level.INFO).ai(5578)).M("onCannedTextResponsesLoaded: %s,%s", carCall, list);
        this.b.q(carCall, list);
    }

    @Override // defpackage.ebf
    public final void r(CarCall carCall, List list) {
        ((ype) this.a.a(Level.INFO).ai(5579)).M("onChildrenChanged: %s,%s", carCall, list);
        this.b.r(carCall, list);
    }

    @Override // defpackage.ebf
    public final void s(CarCall carCall, List list) {
        ((ype) this.a.a(Level.INFO).ai(5580)).M("onConferenceableCallsChanged: %s,%s", carCall, list);
        this.b.s(carCall, list);
    }

    @Override // defpackage.ebf
    public final void t(CarCall carCall, String str) {
        ((ype) this.a.a(Level.INFO).ai(5581)).M("onCurrentSpeakerChanged: %s,%s", carCall, str);
        this.b.t(carCall, str);
    }

    @Override // defpackage.ebf
    public final void u(CarCall carCall, CarCall.Details details) {
        ((ype) this.a.a(Level.INFO).ai(5582)).M("onDetailsChanged: %s,%s", carCall, details);
        this.b.u(carCall, details);
    }

    @Override // defpackage.ebf
    public final void v(CarCall carCall, CarCall carCall2) {
        ((ype) this.a.a(Level.INFO).ai(5583)).M("onParentChanged: %s,%s", carCall, carCall2);
        this.b.v(carCall, carCall2);
    }

    @Override // defpackage.ebf
    public final void w(CarCall carCall, int i) {
        ((ype) this.a.a(Level.INFO).ai(5584)).K("onParticipantCountChanged: %s,%s", carCall, i);
        this.b.w(carCall, i);
    }

    @Override // defpackage.ebf
    public final void x(CarCall carCall, String str) {
        ((ype) this.a.a(Level.INFO).ai(5585)).M("onPostDialWait: %s,%s", carCall, str);
        this.b.x(carCall, str);
    }

    @Override // defpackage.ebf
    public final void y(CarCall carCall, int i) {
        ((ype) this.a.a(Level.INFO).ai(5586)).K("onStateChanged: %s,%s", carCall, i);
        this.b.y(carCall, i);
    }

    @Override // defpackage.ebf
    public final void z(CarCall carCall, Uri uri) {
        ((ype) this.a.a(Level.INFO).ai(5587)).M("onVoipCallIconChanged: %s,%s", carCall, uri);
        this.b.z(carCall, uri);
    }
}
