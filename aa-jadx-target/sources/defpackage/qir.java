package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class qir extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.qit a;

    public qir(defpackage.qit qitVar) {
        this.a = qitVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.view.KeyEvent keyEvent = (android.view.KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null || keyEvent.getKeyCode() != 84) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.qit.a.g()).ai((char) 7300)).y("Unhandled event %s", keyEvent);
            return;
        }
        defpackage.qit qitVar = this.a;
        defpackage.yqm yqmVar = defpackage.qit.a;
        ((defpackage.yqj) yqmVar.l().ai((char) 7306)).y("handleSearchKeyEvent %s", keyEvent);
        if (keyEvent.getAction() == 0) {
            if (!keyEvent.isLongPress()) {
                ((defpackage.yqj) yqmVar.l().ai((char) 7310)).y("Non long-press, start tracking %s", java.lang.Boolean.valueOf(!qitVar.k));
                if (qitVar.k) {
                    return;
                }
                keyEvent.startTracking();
                return;
            }
            ((defpackage.yqj) yqmVar.l().ai((char) 7311)).u("Long press on search key");
            qitVar.k = true;
            if (qitVar.r()) {
                ((defpackage.yqj) yqmVar.l().ai((char) 7313)).u("Restarting voice session");
                qitVar.j.F(3);
                return;
            } else {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 7312)).u("Starting voice session");
                qitVar.n(3);
                return;
            }
        }
        if (qitVar.k) {
            ((defpackage.yqj) yqmVar.l().ai((char) 7309)).u("Long press search already fired. Ignore up event.");
            qitVar.k = false;
            return;
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 7307)).u("Non long press, triggering assistant");
        if (qitVar.r() && qitVar.i == defpackage.kxh.b) {
            ((defpackage.yqj) yqmVar.l().ai((char) 7308)).u("Assistant already open, closing it");
            qitVar.j(defpackage.yxp.HARDWARE_BUTTON_CLICKED);
        } else if (defpackage.acnf.B() && j$.util.Objects.equals(qitVar.j.h().e(), java.lang.Boolean.TRUE)) {
            qitVar.j.p();
        } else {
            qitVar.n(3);
        }
    }
}
