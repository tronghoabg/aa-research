package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class adpp extends BroadcastReceiver {
    final /* synthetic */ adpq a;

    public adpp(adpq adpqVar) {
        this.a = adpqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        adpq adpqVar = this.a;
        adpo adpoVar = new adpo(adpqVar, 1);
        adnw adnwVar = adpqVar.g;
        adnwVar.b(adpoVar);
        adpqVar.f.execute(new adpo(adnwVar, 0));
    }
}
