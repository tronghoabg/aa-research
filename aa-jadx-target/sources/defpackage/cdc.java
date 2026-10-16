package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cdc extends defpackage.ccc implements j$.util.Map, java.util.Map, defpackage.afhg {
    private defpackage.cdd f;

    public cdc(defpackage.cdd cddVar) {
        super(cddVar);
        this.f = cddVar;
    }

    @Override // defpackage.ccc, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (obj instanceof defpackage.bvm) {
            return super.containsKey((defpackage.bvm) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (obj instanceof defpackage.byx) {
            return super.containsValue((defpackage.byx) obj);
        }
        return false;
    }

    @Override // defpackage.ccc
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final defpackage.cdd b() {
        defpackage.cck cckVar = this.a;
        defpackage.cdd cddVar = this.f;
        if (cckVar != cddVar.b) {
            this.e = new defpackage.bzo();
            cddVar = new defpackage.cdd(cckVar, this.d);
        }
        this.f = cddVar;
        return cddVar;
    }

    @Override // defpackage.ccc, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof defpackage.bvm) {
            return (defpackage.byx) super.get((defpackage.bvm) obj);
        }
        return null;
    }

    @Override // defpackage.ccc, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof defpackage.bvm) ? obj2 : (defpackage.byx) j$.util.Map.-CC.$default$getOrDefault(this, (defpackage.bvm) obj, (defpackage.byx) obj2);
    }

    @Override // defpackage.ccc, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof defpackage.bvm) {
            return (defpackage.byx) super.remove((defpackage.bvm) obj);
        }
        return null;
    }
}
