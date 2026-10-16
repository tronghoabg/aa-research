package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zdy extends defpackage.yfo {
    java.util.Set a;
    java.util.Collection b;
    final /* synthetic */ java.util.Map c;
    final /* synthetic */ defpackage.zdz d;

    public zdy(defpackage.zdz zdzVar, java.util.Map map) {
        this.c = map;
        this.d = zdzVar;
    }

    @Override // defpackage.yfo
    protected final java.util.Map a() {
        return this.c;
    }

    @Override // defpackage.yfo, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return ((defpackage.yfi) values()).e(obj);
    }

    @Override // defpackage.yfr
    protected final /* synthetic */ java.lang.Object d() {
        return this.c;
    }

    @Override // defpackage.yfo, java.util.Map
    public final java.util.Set<java.util.Map.Entry> entrySet() {
        java.util.Set<java.util.Map.Entry> set = this.a;
        if (set != null) {
            return set;
        }
        defpackage.zdr zdrVar = new defpackage.zdr(this.c.entrySet());
        this.a = zdrVar;
        return zdrVar;
    }

    @Override // defpackage.yfo, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        java.util.List listC = this.d.c(obj);
        if (listC.isEmpty()) {
            return null;
        }
        return listC;
    }

    @Override // defpackage.yfo, java.util.Map
    public final java.util.Collection<java.util.Collection> values() {
        java.util.Collection<java.util.Collection> collection = this.b;
        if (collection != null) {
            return collection;
        }
        defpackage.zdt zdtVar = new defpackage.zdt(this.c.values(), entrySet());
        this.b = zdtVar;
        return zdtVar;
    }
}
