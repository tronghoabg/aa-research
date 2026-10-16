package defpackage;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class oqs extends mdd {
    final /* synthetic */ oqt a;

    public oqs(oqt oqtVar) {
        this.a = oqtVar;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("BtAdapterStateChangeReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        this.a.m(Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE)));
    }
}
