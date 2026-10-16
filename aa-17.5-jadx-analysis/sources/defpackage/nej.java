package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class nej extends mdd {
    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("TemperatureUnitReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        if (affa.f("android.intent.action.LOCALE_CHANGED", intent != null ? intent.getAction() : null)) {
            onu.a().e.run();
        }
    }

    public final void c(Context context) {
        dup.e(context, this, new IntentFilter("android.intent.action.LOCALE_CHANGED"), null, 2);
    }
}
