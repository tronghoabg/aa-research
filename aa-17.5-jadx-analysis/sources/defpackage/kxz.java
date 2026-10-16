package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* loaded from: classes2.dex */
final class kxz extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("query");
        if (TextUtils.isEmpty(stringExtra)) {
            ((ype) ((ype) kya.a.g()).ai((char) 3527)).u("Received DEBUG_DIRECT_QUERY broadcast with no query. Use: --es query \"your query here\"");
        } else {
            ((ype) ((ype) kya.a.g()).ai((char) 3526)).y("Sending debug direct query: %s", stringExtra);
            kfl.h().C(stringExtra);
        }
    }
}
