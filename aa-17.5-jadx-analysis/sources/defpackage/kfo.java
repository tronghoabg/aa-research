package defpackage;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class kfo extends mdd {
    final /* synthetic */ kfp a;

    public kfo(kfp kfpVar) {
        this.a = kfpVar;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("BatterySaverModeReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        String action = intent.getAction();
        yph yphVar = kfp.a;
        if (!"android.os.action.POWER_SAVE_MODE_CHANGED".equals(action)) {
            ((ype) ((ype) kfp.a.g()).ai((char) 2994)).y("Unexpected action: %s", action);
            return;
        }
        kfp kfpVar = this.a;
        boolean zF = kfpVar.f();
        eqm eqmVar = kfpVar.c;
        Boolean bool = (Boolean) eqmVar.e();
        if (bool == null || bool.booleanValue() != zF) {
            kfpVar.a();
            if (zF) {
                kfp.b(yzy.ro);
                kfpVar.e(1000L);
            } else {
                kfp.b(yzy.rp);
            }
            eqmVar.m(Boolean.valueOf(zF));
        }
    }
}
