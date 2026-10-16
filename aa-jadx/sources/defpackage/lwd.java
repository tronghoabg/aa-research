package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class lwd extends android.app.IntentService {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.MessagingIntentSrvc");

    protected lwd() {
        super("ProjectedProxyMessagingService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        ((defpackage.yqj) a.l().ai((char) 4360)).M("%s received an #onHandleIntent with action %s", getClass().getSimpleName(), intent.getAction());
        java.lang.String action = intent.getAction();
        action.getClass();
        boolean z = false;
        boolean z2 = defpackage.acul.x() || defpackage.acul.y();
        boolean z3 = defpackage.acul.x() && defpackage.acul.y();
        if (!defpackage.lvs.d().c(action, intent) && !defpackage.juu.d().c(action, intent)) {
            z = true;
        }
        if (z2) {
            if (!z) {
                return;
            } else {
                z = !((defpackage.lwr) defpackage.mkp.a.i(defpackage.lwr.class)).a(action, intent);
            }
        }
        if (z) {
            if (z3 || !((defpackage.lwq) defpackage.mkp.a.i(defpackage.lwq.class)).a(action, intent)) {
                throw new java.lang.IllegalArgumentException("Received a malformed read/reply request with an unknown conversation action: ".concat(java.lang.String.valueOf(intent.getAction())));
            }
        }
    }
}
