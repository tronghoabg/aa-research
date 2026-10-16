package defpackage;

import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class ixq extends mdd {
    final /* synthetic */ ixs a;

    public ixq(ixs ixsVar) {
        this.a = ixsVar;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("PowerSaveModeBroadcastReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.os.action.POWER_SAVE_MODE_CHANGED")) {
            ixs ixsVar = this.a;
            ixsVar.y = ixsVar.l.a();
            ixsVar.d();
        }
    }
}
