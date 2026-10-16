package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ack {
    public final defpackage.acy a;
    public final defpackage.adq b;
    public final defpackage.acd c;
    public final defpackage.adf d;
    public final defpackage.adt e;
    public final boolean f;
    public final java.util.Map g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ack(defpackage.acy acyVar, defpackage.adq adqVar, defpackage.acd acdVar, defpackage.adf adfVar, boolean z, java.util.Map map, int i) {
        java.util.Map map2 = (i & 64) != 0 ? defpackage.afcf.a : map;
        int i2 = i & 8;
        int i3 = i & 4;
        int i4 = i & 2;
        boolean z2 = (i & 32) == 0;
        int i5 = i & 1;
        boolean z3 = z2 & z;
        defpackage.adf adfVar2 = i2 != 0 ? null : adfVar;
        acdVar = i3 != 0 ? null : acdVar;
        this(1 == i5 ? null : acyVar, i4 != 0 ? null : adqVar, acdVar, adfVar2, z3, map2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ack)) {
            return false;
        }
        defpackage.ack ackVar = (defpackage.ack) obj;
        if (defpackage.afga.f(this.a, ackVar.a) && defpackage.afga.f(this.b, ackVar.b) && defpackage.afga.f(this.c, ackVar.c) && defpackage.afga.f(this.d, ackVar.d)) {
            defpackage.adt adtVar = ackVar.e;
            if (this.f == ackVar.f && defpackage.afga.f(this.g, ackVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.acy acyVar = this.a;
        int iHashCode = acyVar != null ? acyVar.hashCode() : 0;
        defpackage.adq adqVar = this.b;
        int iHashCode2 = adqVar != null ? adqVar.hashCode() : 0;
        int i = iHashCode * 31;
        defpackage.acd acdVar = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (acdVar != null ? acdVar.hashCode() : 0)) * 31;
        defpackage.adf adfVar = this.d;
        return ((((iHashCode3 + (adfVar != null ? adfVar.hashCode() : 0)) * 961) + defpackage.a.e(this.f)) * 31) + this.g.hashCode();
    }

    public final java.lang.String toString() {
        return "EnterExitTransitionConfig(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + this.d + ", veil=null, hold=" + this.f + ", effectsMap=" + this.g + ")";
    }

    public ack(defpackage.acy acyVar, defpackage.adq adqVar, defpackage.acd acdVar, defpackage.adf adfVar, boolean z, java.util.Map map) {
        this.a = acyVar;
        this.b = adqVar;
        this.c = acdVar;
        this.d = adfVar;
        this.e = null;
        this.f = z;
        this.g = map;
    }

    public ack() {
        this(null, null, null, null, false, null, 127);
    }
}
