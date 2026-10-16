package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class evq {
    public static final Map a = new LinkedHashMap();
    private final Map b = new LinkedHashMap();

    public final evp a(String str) {
        str.getClass();
        if (!ebh.g(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        evp evpVar = (evp) this.b.get(str);
        if (evpVar != null) {
            return evpVar;
        }
        throw new IllegalStateException(a.bq(str, "Could not find Navigator with name \"", "\". You must call NavController.addNavigator() for each navigation type."));
    }

    public final Map b() {
        return woy.bd(this.b);
    }

    public final void c(evp evpVar) {
        String strH = ebh.h(evpVar.getClass());
        if (!ebh.g(strH)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Map map = this.b;
        evp evpVar2 = (evp) map.get(strH);
        if (affa.f(evpVar2, evpVar)) {
            return;
        }
        if (evpVar2 != null && evpVar2.a) {
            throw new IllegalStateException(a.bt(evpVar2, evpVar, "Navigator ", " is replacing an already attached "));
        }
        if (evpVar.a) {
            throw new IllegalStateException(a.bm(evpVar, "Navigator ", " is already attached to another NavController"));
        }
    }
}
