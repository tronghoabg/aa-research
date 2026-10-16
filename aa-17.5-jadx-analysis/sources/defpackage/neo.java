package defpackage;

import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class neo extends eqj {
    public static final nem a = new nem();
    public static final afgl h = new kkp(mki.b, 18);
    private final nen i = new nen(this);

    public final void a(Intent intent) {
        nep nepVar;
        if (intent == null) {
            nepVar = null;
        } else {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("plugged", 0);
            nepVar = new nep(intExtra, intExtra2 != 0 ? intExtra2 != 1 ? intExtra2 != 2 ? intExtra2 != 4 ? intExtra2 != 8 ? 1 : 6 : 3 : 4 : 5 : 2, intent.getIntExtra("temperature", 0) / 10.0f);
        }
        m(nepVar);
    }

    @Override // defpackage.eqj
    protected final void c() {
        a(mki.a.c.registerReceiver(this.i, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
    }

    @Override // defpackage.eqj
    protected final void d() {
        mki.a.c.unregisterReceiver(this.i);
    }
}
