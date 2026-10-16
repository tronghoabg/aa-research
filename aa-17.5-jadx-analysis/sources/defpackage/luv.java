package defpackage;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class luv implements lhg {
    private static final yph a = yph.c("GH.NotifMsgAppConn");
    private final Map b = new HashMap();
    private final lxr c = new luu(this);

    public static luv a() {
        return (luv) mki.a.b(luv.class, new lpu(9));
    }

    public final luw b(String str, mqa mqaVar) {
        Pair pair = new Pair(str, mqaVar);
        Map map = this.b;
        luw luwVar = (luw) map.get(pair);
        if (luwVar != null) {
            return luwVar;
        }
        luw luwVar2 = new luw(str);
        map.put(pair, luwVar2);
        return luwVar2;
    }

    @Override // defpackage.lhg
    public final void c() {
        mbs.a().f(this.c);
    }

    @Override // defpackage.lhg
    public final void d() {
        mbs.a().g(this.c);
        this.b.clear();
    }

    public final void e(StatusBarNotification statusBarNotification) {
        if (lup.e().i(statusBarNotification.getPackageName())) {
            ((ype) ((ype) a.f()).ai((char) 4277)).y("Processing notification from package: %s", statusBarNotification.getPackageName());
            luw luwVarB = b(statusBarNotification.getPackageName(), mqa.b);
            yph yphVar = luw.a;
            ((ype) ((ype) yphVar.f()).ai((char) 4278)).y("update() called with SBN from %s", statusBarNotification.getPackageName());
            lwd lwdVar = new lwd(statusBarNotification, false);
            if (lwdVar.j()) {
                lwe lweVar = lwdVar.c;
                if (lweVar == null || !lweVar.b()) {
                    Context context = mki.a.c;
                    yfq yfqVarE = lwdVar.e();
                    if (lvx.e(yfqVarE, statusBarNotification.getPackageName())) {
                        ((ype) yphVar.l().ai((char) 4279)).y("Dropped bugle voice message in data store that contains null URI or Uri.EMPTY, sbn: %s", statusBarNotification);
                        return;
                    }
                    luf lufVar = new luf();
                    lufVar.b(statusBarNotification.getKey());
                    lufVar.f(lwdVar.f());
                    lufVar.e(yfqVarE);
                    lufVar.b = lwdVar.a(context);
                    lufVar.d(false);
                    lufVar.c(lwdVar.i());
                    luwVarB.g(lufVar.a());
                }
            }
        }
    }
}
