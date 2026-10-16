package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
final class qne extends BroadcastReceiver {
    static final String a = "qne";
    public final qmh b;
    public boolean c;
    public boolean d;

    public qne(qmh qmhVar) {
        this.b = qmhVar;
    }

    @ResultIgnorabilityUnspecified
    private final qmd e() {
        return this.b.c();
    }

    @ResultIgnorabilityUnspecified
    private final qnd f() {
        return this.b.e();
    }

    public final Context a() {
        return this.b.b;
    }

    public final void b() {
        f();
        e();
    }

    public final void c() {
        if (this.c) {
            this.b.e().p(2, "Unregistering connectivity change receiver", null, null, null);
            this.c = false;
            this.d = false;
            try {
                a().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                f().p(6, "Failed to unregister the network broadcast receiver", e, null, null);
            }
        }
    }

    protected final boolean d() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) a().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (SecurityException unused) {
        }
        return false;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b();
        String action = intent.getAction();
        qmh qmhVar = this.b;
        qmhVar.e().p(2, "NetworkBroadcastReceiver received action", action, null, null);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zD = d();
            if (this.d != zD) {
                this.d = zD;
                e().c(zD);
                return;
            }
            return;
        }
        if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            qmhVar.e().p(5, "NetworkBroadcastReceiver received unknown action", action, null, null);
        } else {
            if (intent.hasExtra(a)) {
                return;
            }
            e().e();
        }
    }
}
