package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class admd {
    public static final defpackage.admd a = new defpackage.admd(null, defpackage.ador.b, false, null, null);
    public final defpackage.admg b;
    public final defpackage.ador c;
    public final boolean d;
    public final java.lang.String e;
    public final java.lang.String f;
    private final defpackage.adrq g = null;

    private admd(defpackage.admg admgVar, defpackage.ador adorVar, boolean z, java.lang.String str, java.lang.String str2) {
        this.b = admgVar;
        adorVar.getClass();
        this.c = adorVar;
        this.d = z;
        this.e = str;
        this.f = str2;
    }

    public static defpackage.admd a(defpackage.ador adorVar) {
        defpackage.ysr.aY(!adorVar.g(), "drop status shouldn't be OK");
        return new defpackage.admd(null, adorVar, true, null, null);
    }

    public static defpackage.admd b(defpackage.ador adorVar) {
        defpackage.ysr.aY(!adorVar.g(), "error status shouldn't be OK");
        return new defpackage.admd(null, adorVar, false, null, null);
    }

    public static defpackage.admd d(java.lang.String str) {
        return new defpackage.admd(null, defpackage.ador.b, false, "connecting", str);
    }

    public static defpackage.admd e(defpackage.admg admgVar) {
        return new defpackage.admd(admgVar, defpackage.ador.b, false, null, null);
    }

    public final boolean c() {
        return (this.b == null && this.c.g()) ? false : true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.admd)) {
            return false;
        }
        defpackage.admd admdVar = (defpackage.admd) obj;
        if (j$.util.Objects.equals(this.b, admdVar.b) && j$.util.Objects.equals(this.c, admdVar.c)) {
            defpackage.adrq adrqVar = admdVar.g;
            if (j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && this.d == admdVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.c, null, java.lang.Boolean.valueOf(this.d)});
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("subchannel", this.b);
        xymVarBy.b("streamTracerFactory", null);
        xymVarBy.b("status", this.c);
        xymVarBy.h("drop", this.d);
        xymVarBy.b("authority-override", null);
        return xymVarBy.toString();
    }
}
