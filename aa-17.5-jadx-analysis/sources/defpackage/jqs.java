package defpackage;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class jqs extends mdd {
    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("AapmHunReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        if (action.equals("com.google.android.projection.gearhead.ACTION_DSA_AAPM_HUN")) {
            jqt.a(yzz.AAPM, yzy.Na);
            context.getSharedPreferences("gh_notification_pref", 0).edit().putBoolean("aapm_hun_dsa_pref", true).apply();
        }
        nuj.b().g("AAPM_HUN", 0L, context.getPackageName());
    }
}
