package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ohd extends android.telecom.Call.Callback {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ defpackage.ohj a;

    public ohd(defpackage.ohj ohjVar) {
        this.a = ohjVar;
    }

    @Override // android.telecom.Call.Callback
    public final void onCallDestroyed(android.telecom.Call call) {
        this.a.a(new ohf(this, call, 1));
    }

    @Override // android.telecom.Call.Callback
    public final void onCannedTextResponsesLoaded(android.telecom.Call call, java.util.List list) {
        this.a.a(new ohc(this, call, list, 2));
    }

    @Override // android.telecom.Call.Callback
    public final void onChildrenChanged(android.telecom.Call call, java.util.List list) {
        this.a.a(new ohc(this, call, list, 3));
    }

    @Override // android.telecom.Call.Callback
    public final void onConferenceableCallsChanged(android.telecom.Call call, java.util.List list) {
        this.a.a(new ohc(this, call, list, 4));
    }

    @Override // android.telecom.Call.Callback
    public final void onDetailsChanged(android.telecom.Call call, android.telecom.Call.Details details) {
        defpackage.ohj ohjVar = this.a;
        ohjVar.a(new ohe(ohjVar.b.c(call), 1));
    }

    @Override // android.telecom.Call.Callback
    public final void onParentChanged(android.telecom.Call call, android.telecom.Call call2) {
        this.a.a(new ohc(this, call, call2, 0));
    }

    @Override // android.telecom.Call.Callback
    public final void onPostDialWait(android.telecom.Call call, java.lang.String str) {
        this.a.a(new ohc(this, call, str, 1));
    }

    @Override // android.telecom.Call.Callback
    public final void onStateChanged(android.telecom.Call call, int i) {
        this.a.a(new ohb(this, call, i));
    }
}
