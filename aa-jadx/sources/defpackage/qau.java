package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qau implements java.io.Serializable {
    private final int a;
    private final int b;

    public qau(int i) {
        this.b = 1;
        this.a = i;
    }

    public static defpackage.qat a() {
        defpackage.qat qatVar = new defpackage.qat();
        qatVar.c = 1;
        qatVar.a = -1;
        qatVar.b = (byte) 1;
        return qatVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.qau)) {
            return false;
        }
        defpackage.qau qauVar = (defpackage.qau) obj;
        int i = this.b;
        int i2 = qauVar.b;
        if (i != 0) {
            return i2 == 1 && this.a == qauVar.a;
        }
        throw null;
    }

    public final int hashCode() {
        defpackage.a.aV(this.b);
        return (this.a ^ (-722379962)) * 1525764945;
    }

    public final java.lang.String toString() {
        defpackage.xym xymVar = new defpackage.xym("ImpressionParams");
        xymVar.c();
        int i = this.b;
        java.lang.String str = i != 1 ? "null" : "VISIBILITY_VISIBLE";
        if (i == 0) {
            throw null;
        }
        xymVar.b("visibility", str);
        xymVar.f("elementIndex", this.a);
        xymVar.b("geoUgcData", null);
        xymVar.b("mapsData", null);
        xymVar.b("tronData", null);
        xymVar.b("mapsImpressionData", null);
        return xymVar.toString();
    }

    public qau() {
        throw null;
    }
}
