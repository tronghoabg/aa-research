package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class zcs extends yei {
    Set a;
    Collection b;
    final /* synthetic */ Map c;
    final /* synthetic */ zct d;

    public zcs(zct zctVar, Map map) {
        this.c = map;
        this.d = zctVar;
    }

    @Override // defpackage.yei
    protected final Map a() {
        return this.c;
    }

    @Override // defpackage.yei, java.util.Map
    public final boolean containsValue(Object obj) {
        return ((yec) values()).e(obj);
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.c;
    }

    @Override // defpackage.yei, java.util.Map
    public final Set<Map.Entry> entrySet() {
        Set<Map.Entry> set = this.a;
        if (set != null) {
            return set;
        }
        zcl zclVar = new zcl(this.c.entrySet());
        this.a = zclVar;
        return zclVar;
    }

    @Override // defpackage.yei, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        List listC = this.d.c(obj);
        if (listC.isEmpty()) {
            return null;
        }
        return listC;
    }

    @Override // defpackage.yei, java.util.Map
    public final Collection<Collection> values() {
        Collection<Collection> collection = this.b;
        if (collection != null) {
            return collection;
        }
        zcn zcnVar = new zcn(this.c.values(), entrySet());
        this.b = zcnVar;
        return zcnVar;
    }
}
