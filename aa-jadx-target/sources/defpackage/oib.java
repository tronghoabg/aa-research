package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oib extends defpackage.dwz {
    public static final defpackage.yqm b = defpackage.yqm.c("GH.LocalInCallService");
    public final java.util.Map c = new java.util.LinkedHashMap();
    public final ajnd d;

    public oib(ajnd ajndVar) {
        this.d = ajndVar;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    protected final void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.telecom.InCallService
    public final void onCallAdded(android.telecom.Call call) {
        call.getClass();
        ((defpackage.yqj) b.f()).u("onCallAdded");
        ahoc.d(defpackage.eqy.b(this), defpackage.mks.a.e().i(), 0, new defpackage.nle(this, call, (defpackage.afdk) null, 10), 2);
        this.d.o(new ohp(call, 3));
    }

    @Override // android.telecom.InCallService
    public final void onCallAudioStateChanged(android.telecom.CallAudioState callAudioState) {
        callAudioState.getClass();
        ((defpackage.yqj) b.f()).u("onCallAudioStateChanged");
        this.d.o(new ohp(callAudioState, 4));
    }

    @Override // android.telecom.InCallService
    public final void onCallRemoved(android.telecom.Call call) {
        call.getClass();
        ((defpackage.yqj) b.f()).u("onCallRemoved");
        this.d.o(new ohp(call, 5));
        this.c.remove(call);
    }
}
