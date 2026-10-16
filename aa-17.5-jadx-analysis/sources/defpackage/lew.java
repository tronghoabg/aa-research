package defpackage;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class lew extends mdd {
    private final lex a;

    public lew(lex lexVar) {
        this.a = lexVar;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("CloseReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        ((ype) lex.o.l().ai((char) 3826)).u("CloseReceiver::onReceive");
        if ("com.google.android.apps.auto.components.frx.phonescreen.WirelessFrxPhonescreenBottomSheetActivity.CLOSE".equals(intent.getAction()) || "com.google.android.apps.auto.components.frx.phonescreen.WirelessConnectingActivity.CLOSE".equals(intent.getAction())) {
            lex lexVar = this.a;
            lexVar.r = !intent.getBooleanExtra("com.google.android.apps.auto.components.frx.phonescreen.WirelessFrxPhonescreenBottomSheetActivity.PROJECTION_STARTED", false);
            lexVar.E();
        }
    }
}
