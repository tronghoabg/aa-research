package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import java.util.Map;

/* loaded from: classes.dex */
final class qkl extends BroadcastReceiver {
    final /* synthetic */ qkn a;

    public qkl(qkn qknVar) {
        this.a = qknVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("EXTRA_STREAMITEM_ID", Long.MIN_VALUE);
        yzr yzrVar = (yzr) intent.getSerializableExtra("EXTRA_STREAMITEM_TYPE");
        if (longExtra == Long.MIN_VALUE || yzrVar == null) {
            throw new IllegalArgumentException("action intent missing id or type: ".concat(String.valueOf(String.valueOf(intent))));
        }
        Pair pair = new Pair(Long.valueOf(longExtra), yzrVar);
        yph yphVar = qkn.a;
        ((ype) yphVar.l().ai((char) 7487)).y("received action intent %s", intent);
        Map map = this.a.b;
        if (map.containsKey(pair)) {
            ((qkj) map.get(pair)).b(intent.getBundleExtra("EXTRA_PAYLOAD"));
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 7488)).y("received action for expired adapter: %s", pair);
        }
    }
}
