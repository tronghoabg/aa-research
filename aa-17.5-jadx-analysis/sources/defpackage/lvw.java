package defpackage;

import android.app.IntentService;
import android.content.Intent;

/* loaded from: classes.dex */
public class lvw extends IntentService {
    private static final yph a = yph.c("GH.MessagingIntentSrvc");

    protected lvw() {
        super("ProjectedProxyMessagingService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        ((ype) a.l().ai((char) 4357)).M("%s received an #onHandleIntent with action %s", getClass().getSimpleName(), intent.getAction());
        String action = intent.getAction();
        action.getClass();
        boolean z = false;
        boolean z2 = actj.w() || actj.x();
        boolean z3 = actj.w() && actj.x();
        if (!lvl.d().c(action, intent) && !jxn.b().c(action, intent)) {
            z = true;
        }
        if (z2) {
            if (!z) {
                return;
            } else {
                z = !((lwk) mki.a.i(lwk.class)).a(action, intent);
            }
        }
        if (z) {
            if (z3 || !((lwj) mki.a.i(lwj.class)).a(action, intent)) {
                throw new IllegalArgumentException("Received a malformed read/reply request with an unknown conversation action: ".concat(String.valueOf(intent.getAction())));
            }
        }
    }
}
