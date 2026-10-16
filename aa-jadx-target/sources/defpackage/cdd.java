package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cdd extends defpackage.cca implements j$.util.Map, defpackage.cbm {
    public static final defpackage.cdd d = new defpackage.cdd(defpackage.cck.a, 0);

    @Override // defpackage.cca, defpackage.afbs, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (obj instanceof defpackage.bvm) {
            return super.containsKey((defpackage.bvm) obj);
        }
        return false;
    }

    @Override // defpackage.afbs, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (obj instanceof defpackage.byx) {
            return super.containsValue((defpackage.byx) obj);
        }
        return false;
    }

    public final java.lang.Object f(defpackage.bvm bvmVar) {
        return defpackage.dai.az(this, bvmVar);
    }

    public final defpackage.cdd g(defpackage.bvm bvmVar, defpackage.byx byxVar) {
        defpackage.ccj ccjVarD = this.b.d(bvmVar.hashCode(), bvmVar, byxVar, 0);
        if (ccjVarD == null) {
            return this;
        }
        return new defpackage.cdd(ccjVarD.a, this.c + ccjVarD.b);
    }

    @Override // defpackage.cca, defpackage.afbs, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof defpackage.bvm) {
            return (defpackage.byx) super.get((defpackage.bvm) obj);
        }
        return null;
    }

    @Override // defpackage.afbs, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof defpackage.bvm) ? obj2 : (defpackage.byx) j$.util.Map.-CC.$default$getOrDefault(this, (defpackage.bvm) obj, (defpackage.byx) obj2);
    }
}
