package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oge extends defpackage.omf {
    private final defpackage.afer a;

    public oge(defpackage.afer aferVar) {
        super(null);
        this.a = aferVar;
    }

    @Override // defpackage.omf
    public final void a(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        carCall.getClass();
        this.a.invoke();
    }

    @Override // defpackage.omf
    public final void b(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        carCall.getClass();
        this.a.invoke();
    }

    @Override // defpackage.omf
    public final void c(com.google.android.apps.auto.components.telecom.call.CarCall carCall, int i) {
        carCall.getClass();
        this.a.invoke();
    }

    @Override // defpackage.omf
    public final void e(android.telecom.CallAudioState callAudioState) {
        callAudioState.getClass();
        if (callAudioState.getRoute() == 0) {
            ((defpackage.ype) defpackage.ogk.a.f().ai(5879)).B("AudioState changed. No update needed: %#X(%#X)", callAudioState.getRoute(), callAudioState.getSupportedRouteMask());
        } else {
            ((defpackage.ype) defpackage.ogk.a.f().ai(5878)).B("AudioState changed. New route: %#X(%#X)", callAudioState.getRoute(), callAudioState.getSupportedRouteMask());
            this.a.invoke();
        }
    }

    @Override // defpackage.omf
    public final void h(com.google.android.apps.auto.components.telecom.call.CarCall carCall, java.util.List list) {
        this.a.invoke();
    }

    @Override // defpackage.omf
    public final void k(com.google.android.apps.auto.components.telecom.call.CarCall carCall, com.google.android.apps.auto.components.telecom.call.CarCall.Details details) {
        carCall.getClass();
        this.a.invoke();
    }

    @Override // defpackage.omf
    public final void l(com.google.android.apps.auto.components.telecom.call.CarCall carCall, com.google.android.apps.auto.components.telecom.call.CarCall carCall2) {
        this.a.invoke();
    }
}
