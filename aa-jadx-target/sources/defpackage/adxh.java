package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adxh {
    public final adzh a;
    public final java.lang.Object b;
    public final java.util.Map c;
    private final defpackage.adxf d;
    private final java.util.Map e;
    private final java.util.Map f;

    public adxh(defpackage.adxf adxfVar, java.util.Map map, java.util.Map map2, adzh adzhVar, java.lang.Object obj, java.util.Map map3) {
        this.d = adxfVar;
        this.e = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map));
        this.f = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map2));
        this.a = adzhVar;
        this.b = obj;
        this.c = map3 != null ? j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map3)) : null;
    }

    final defpackage.adll a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return new defpackage.adxg(this);
    }

    final defpackage.adxf b(defpackage.adng adngVar) {
        defpackage.adxf adxfVar = (defpackage.adxf) this.e.get(adngVar.b);
        if (adxfVar == null) {
            adxfVar = (defpackage.adxf) this.f.get(adngVar.c);
        }
        return adxfVar == null ? this.d : adxfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.adxh adxhVar = (defpackage.adxh) obj;
            if (j$.util.Objects.equals(this.d, adxhVar.d) && j$.util.Objects.equals(this.e, adxhVar.e) && j$.util.Objects.equals(this.f, adxhVar.f) && j$.util.Objects.equals(this.a, adxhVar.a) && j$.util.Objects.equals(this.b, adxhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.d, this.e, this.f, this.a, this.b});
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("defaultMethodConfig", this.d);
        xymVarBy.b("serviceMethodMap", this.e);
        xymVarBy.b("serviceMap", this.f);
        xymVarBy.b("retryThrottling", this.a);
        xymVarBy.b("loadBalancingConfig", this.b);
        return xymVarBy.toString();
    }
}
