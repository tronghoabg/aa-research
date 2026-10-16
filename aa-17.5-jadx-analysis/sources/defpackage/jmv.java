package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.carservice.gmscorecompat.CarChimeraService;

/* loaded from: classes.dex */
public final class jmv extends BroadcastReceiver {
    final /* synthetic */ CarChimeraService a;

    public jmv(CarChimeraService carChimeraService) {
        this.a = carChimeraService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.f();
    }
}
