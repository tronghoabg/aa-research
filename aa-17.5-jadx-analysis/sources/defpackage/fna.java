package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes2.dex */
public abstract class fna extends fnc {
    private final BroadcastReceiver e;

    public fna(Context context, ajdr ajdrVar) {
        super(context, ajdrVar);
        this.e = new fmz(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // defpackage.fnc
    public final void d() {
        fjo.a().c(fnb.a, String.valueOf(getClass().getSimpleName()).concat(": registering receiver"));
        this.a.registerReceiver(this.e, a());
    }

    @Override // defpackage.fnc
    public final void e() {
        fjo.a().c(fnb.a, String.valueOf(getClass().getSimpleName()).concat(": unregistering receiver"));
        this.a.unregisterReceiver(this.e);
    }
}
