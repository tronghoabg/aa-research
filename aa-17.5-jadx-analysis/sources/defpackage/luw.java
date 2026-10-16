package defpackage;

import android.R;
import android.content.ComponentName;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import j$.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import mesquite.messaging.model.Container;

/* loaded from: classes2.dex */
public final class luw implements luh {
    public static final yph a = yph.c("GH.NotifMsgAppDataStore");
    static final Container b;
    private static final eqj c;
    private final Map d = new HashMap();
    private final eqm e;
    private final luj f;

    static {
        Container.Builder builder = new Container.Builder();
        builder.b("notification container");
        Container containerA = builder.a();
        b = containerA;
        yfq yfqVarQ = yfq.q(containerA);
        afco afcoVar = tby.a;
        c = new eqm(yfqVarQ);
    }

    public luw(String str) {
        eqm eqmVar = new eqm();
        this.e = eqmVar;
        int i = yfq.d;
        eqmVar.m(yls.a);
        ComponentName componentNameA = lup.e().a(str);
        mon monVar = new mon(mki.a.c, componentNameA);
        lui luiVar = new lui();
        luiVar.c(monVar.c());
        luiVar.d(componentNameA);
        luiVar.a = GhIcon.j(componentNameA);
        luiVar.b(monVar.a(R.attr.colorAccent));
        this.f = luiVar.a();
    }

    @Override // defpackage.luh
    public final eqj a() {
        return c;
    }

    @Override // defpackage.luh
    public final eqj b(Container container) {
        String str = b.a;
        String str2 = container.a;
        if (str.equals(str2)) {
            return this.e;
        }
        throw new IllegalArgumentException("Attempted to access a container from a notification-based app: ".concat(str2));
    }

    @Override // defpackage.luh
    public final luj e() {
        return this.f;
    }

    @Override // defpackage.luh
    public final void f(String str) {
        Map map = this.d;
        if (map.containsKey(str)) {
            lug lugVar = (lug) map.get(str);
            luf lufVar = new luf();
            lufVar.b(lugVar.a);
            lufVar.f(lugVar.b);
            lufVar.e(lugVar.d);
            lufVar.d(true);
            lufVar.c(lugVar.g);
            lufVar.b = lugVar.e;
            g(lufVar.a());
        }
    }

    @Override // defpackage.luh
    public final void g(lug lugVar) {
        Map map = this.d;
        map.put(lugVar.a, lugVar);
        this.e.m(yfq.z(Comparator.EL.reversed(Comparator.CC.comparingLong(new luz(1))), map.values()));
    }
}
