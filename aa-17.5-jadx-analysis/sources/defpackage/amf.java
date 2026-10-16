package defpackage;

/* loaded from: classes.dex */
public final class amf<T> extends cxt<amq<T>> {
    private final amv a;
    private final api b;
    private final boolean c;
    private final aom h;
    private final Boolean d = null;
    private final asf f = null;
    private final Boolean g = null;
    private final aiu i = null;

    public amf(amv amvVar, api apiVar, boolean z, aom aomVar) {
        this.a = amvVar;
        this.b = apiVar;
        this.c = z;
        this.h = aomVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new amq(this.a, this.b, this.c, this.h);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        boolean z;
        boolean z2;
        amq amqVar = (amq) cfxVar;
        aom aomVar = this.h;
        amqVar.b = aomVar;
        amv amvVar = amqVar.a;
        amv amvVar2 = this.a;
        if (affa.f(amvVar, amvVar2)) {
            z = false;
        } else {
            amqVar.a = amvVar2;
            amqVar.i(aomVar);
            z = true;
        }
        api apiVar = this.b;
        if (amqVar.d != apiVar) {
            amqVar.d = apiVar;
            z2 = true;
        } else {
            z2 = z;
        }
        amqVar.G(amqVar.e, this.c, null, apiVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amf)) {
            return false;
        }
        amf amfVar = (amf) obj;
        if (!affa.f(this.a, amfVar.a) || this.b != amfVar.b || this.c != amfVar.c) {
            return false;
        }
        Boolean bool = amfVar.d;
        asf asfVar = amfVar.f;
        Boolean bool2 = amfVar.g;
        aiu aiuVar = amfVar.i;
        return affa.f(this.h, amfVar.h);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        aom aomVar = this.h;
        return (((iHashCode * 31) + (true != this.c ? 1237 : 1231)) * 28629151) + (aomVar != null ? aomVar.hashCode() : 0);
    }
}
