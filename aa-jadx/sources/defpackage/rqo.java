package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rqo {
    public final defpackage.xyn a;
    public final defpackage.xyn b;
    public final defpackage.xyn c;
    public final defpackage.xyn d;

    public rqo(defpackage.xyn xynVar, defpackage.xyn xynVar2, defpackage.xyn xynVar3, defpackage.xyn xynVar4) {
        this.a = xynVar;
        this.b = xynVar2;
        this.c = xynVar3;
        this.d = xynVar4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rqo) {
            defpackage.rqo rqoVar = (defpackage.rqo) obj;
            if (this.a.equals(rqoVar.a) && this.b.equals(rqoVar.b) && this.c.equals(rqoVar.c) && this.d.equals(rqoVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        defpackage.xyn xynVar = this.d;
        defpackage.xyn xynVar2 = this.c;
        defpackage.xyn xynVar3 = this.b;
        return "CarSensorInfo{speedMillimetersPerSec=" + java.lang.String.valueOf(this.a) + ", nightMode=" + java.lang.String.valueOf(xynVar3) + ", drivingStatus=" + java.lang.String.valueOf(xynVar2) + ", gearData=" + java.lang.String.valueOf(xynVar) + "}";
    }

    public rqo() {
        throw null;
    }
}
