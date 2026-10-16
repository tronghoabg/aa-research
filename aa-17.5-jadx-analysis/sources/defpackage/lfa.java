package defpackage;

import android.app.KeyguardManager$KeyguardDismissCallback;
import com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity;

/* loaded from: classes2.dex */
public final class lfa extends KeyguardManager$KeyguardDismissCallback {
    final /* synthetic */ WirelessPreflightActivity a;

    public lfa(WirelessPreflightActivity wirelessPreflightActivity) {
        this.a = wirelessPreflightActivity;
    }

    public final void onDismissCancelled() {
        ((ype) ((ype) WirelessPreflightActivity.n.f()).ai((char) 3830)).u("Keyguard unlock cancelled");
    }

    public final void onDismissError() {
        ((ype) ((ype) WirelessPreflightActivity.n.g()).ai((char) 3831)).u("Keyguard unlock error");
    }

    public final void onDismissSucceeded() {
        ((ype) ((ype) WirelessPreflightActivity.n.f()).ai((char) 3832)).u("Keyguard unlock successful");
        WirelessPreflightActivity wirelessPreflightActivity = this.a;
        wirelessPreflightActivity.u = true;
        wirelessPreflightActivity.J();
        wirelessPreflightActivity.F();
        wirelessPreflightActivity.H();
        lex.D(yzz.FRX_WIRELESS_PREFLIGHT_ACTIVITY, yzy.ck);
    }
}
