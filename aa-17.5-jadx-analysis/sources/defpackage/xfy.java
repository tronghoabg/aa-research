package defpackage;

import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class xfy extends mdd {
    public static final yph a = yph.c("GH.WifiScanReceiver");
    public boolean b;

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("WifiScanReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        String action = intent.getAction();
        if (!Objects.equals(action, "android.net.wifi.SCAN_RESULTS")) {
            ((ype) ((ype) a.h()).ai((char) 10278)).y("Unexpected action: %s", action);
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("resultsUpdated", true);
        ((ype) a.l().ai((char) 10277)).y("WIFI scan completed; successful scan: %b", Boolean.valueOf(booleanExtra));
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.WIRELESS, yzy.lI).l());
    }
}
