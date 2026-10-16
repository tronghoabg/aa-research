package defpackage;

import android.content.Intent;

/* loaded from: classes2.dex */
final class ryj extends ssu {
    final /* synthetic */ ryk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ryj(ryk rykVar) {
        super(null);
        this.a = rykVar;
    }

    @Override // defpackage.ssu
    public final void a(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        if (!"com.google.android.gms.car.CONNECTIVITY_EVENT".equals(action)) {
            this.a.a(action, xvy.a);
            return;
        }
        int intExtra = intent.getIntExtra("event_type", -1);
        if (intExtra != -1) {
            this.a.a(action, xxh.h(yxi.b(intExtra)));
        }
    }
}
