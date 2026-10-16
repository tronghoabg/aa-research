package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class zpb implements zpc {
    public final zpa a;
    private final ConcurrentMap b = new ConcurrentHashMap();

    private zpb(zpa zpaVar) {
        this.a = zpaVar;
    }

    public static zpb c() {
        return new zpb(new zoz(0));
    }

    public static zpb d() {
        return new zpb(new zoz(1));
    }

    @Override // defpackage.zpc
    public final void a(zoi zoiVar) {
        this.b.put(this.a.a(zoiVar), zoiVar);
    }

    public final zoi b(Object obj) {
        if (obj != null) {
            return (zoi) this.b.get(obj);
        }
        return null;
    }
}
