package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Network;
import android.net.wifi.WifiInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import j$.util.Optional;
import j$.util.OptionalInt;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pbx {
    public static final yph a = yph.c("GH.WirelessStartup");
    public final Context b;
    pbu c;
    public boolean d;
    public final List e;
    public volatile Network f;
    public ajdr g;
    private final Optional h;
    private final Looper i;

    public pbx(Context context, Looper looper) {
        Optional optionalEmpty = Optional.empty();
        this.e = new ArrayList();
        this.b = context;
        this.i = looper;
        this.h = optionalEmpty;
    }

    public final void a(Intent intent, pbw pbwVar, pbs pbsVar) {
        Bundle extras = intent.getExtras();
        SecureRandom secureRandom = new SecureRandom();
        Context context = this.b;
        Context applicationContext = context.getApplicationContext();
        yph yphVar = pcj.a;
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        yno it = ((yfy) tgx.d(new nsb(14), acrh.b()).collect(ycm.b(new kqm(17), new ric(16), new rib(4)))).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (roc.l(applicationContext, (ComponentName) entry.getKey(), ((Long) entry.getValue()).longValue())) {
                yflVar.i((ComponentName) entry.getKey());
            } else {
                ((ype) pcj.a.l().ai(6300)).M("Not considering handing off to %s because it was not installed or version was below the requested minimum (%d).", entry.getKey(), entry.getValue());
            }
        }
        yfq yfqVarG = yflVar.g();
        boolean z = this.d;
        ajdr ajdrVar = this.g;
        Looper looper = this.i;
        this.c = new pbu(z, ajdrVar, context, looper, pbwVar, new llv(this, 11), this.e, pbsVar);
        WifiInfo wifiInfo = this.d ? (WifiInfo) extras.getParcelable("wifi_info") : null;
        long jNextLong = secureRandom.nextLong();
        int iMax = wifiInfo != null ? Math.max(wifiInfo.getFrequency(), 0) : 0;
        Optional optional = this.h;
        optional.isPresent();
        jlf jlfVar = (jlf) optional.orElse(new jln(context.getApplicationContext(), jNextLong, this.c, new Handler(looper), yfqVarG, iMax));
        pbu pbuVar = this.c;
        pbuVar.d = jNextLong;
        pbuVar.j = extras;
        pbuVar.i = jlfVar;
        pbuVar.f = new jld();
        if (this.d) {
            ((kny) this.g.e).e(yxi.WIRELESS_WIFI_STARTUP_MANAGER_DIRECT_HANDOFF_STARTED, OptionalInt.of(wifiInfo != null ? wifiInfo.getRssi() : Integer.MIN_VALUE));
        } else {
            ols.M(context, yxi.STARTUP_MANAGER_DIRECT_HANDOFF_STARTED);
        }
        jlfVar.d();
    }
}
