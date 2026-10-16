package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.auto.components.frx.phonescreen.WirelessPreflightActivity;

/* loaded from: classes2.dex */
public final class lfb extends mdd {
    private final WirelessPreflightActivity a;

    public lfb(WirelessPreflightActivity wirelessPreflightActivity) {
        this.a = wirelessPreflightActivity;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("UnlockReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            ((ype) ((ype) WirelessPreflightActivity.n.f()).ai((char) 3833)).u("Unprompted unlock received");
            WirelessPreflightActivity wirelessPreflightActivity = this.a;
            wirelessPreflightActivity.J();
            wirelessPreflightActivity.F();
        }
    }
}
