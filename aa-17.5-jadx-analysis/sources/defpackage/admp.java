package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class admp {
    public final adns a;
    public final adis b;
    public final admn c;

    public admp(adns adnsVar, adis adisVar, admn admnVar) {
        this.a = adnsVar;
        adisVar.getClass();
        this.b = adisVar;
        this.c = admnVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof admp)) {
            return false;
        }
        admp admpVar = (admp) obj;
        return Objects.equals(this.a, admpVar.a) && Objects.equals(this.b, admpVar.b) && Objects.equals(this.c, admpVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("addressesOrError", this.a.toString());
        xxgVarAo.b("attributes", this.b);
        xxgVarAo.b("serviceConfigOrError", this.c);
        return xxgVarAo.toString();
    }
}
