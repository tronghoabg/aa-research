package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acw {
    public static final defpackage.acw a = new defpackage.acw(new defpackage.ack(null, null, null, null, false, null, 127));
    public final defpackage.ack b;

    public acw(defpackage.ack ackVar) {
        this.b = ackVar;
    }

    public final defpackage.acw a(defpackage.acw acwVar) {
        defpackage.acw acwVar2 = a;
        if (defpackage.afga.f(this, acwVar2)) {
            return acwVar;
        }
        if (defpackage.afga.f(acwVar, acwVar2)) {
            return this;
        }
        defpackage.ack ackVar = acwVar.b;
        defpackage.acy acyVar = ackVar.a;
        if (acyVar == null) {
            acyVar = this.b.a;
        }
        defpackage.acy acyVar2 = acyVar;
        defpackage.adq adqVar = ackVar.b;
        if (adqVar == null) {
            adqVar = this.b.b;
        }
        defpackage.adq adqVar2 = adqVar;
        defpackage.acd acdVar = ackVar.c;
        if (acdVar == null) {
            acdVar = this.b.c;
        }
        defpackage.acd acdVar2 = acdVar;
        defpackage.adf adfVar = ackVar.d;
        if (adfVar == null) {
            adfVar = this.b.d;
        }
        defpackage.ack ackVar2 = this.b;
        java.util.Map map = ackVar.g;
        java.util.Map map2 = ackVar2.g;
        map2.getClass();
        map.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map2);
        linkedHashMap.putAll(map);
        return new defpackage.acw(new defpackage.ack(acyVar2, adqVar2, acdVar2, adfVar, false, linkedHashMap, 32));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.acw) && defpackage.afga.f(((defpackage.acw) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        if (defpackage.afga.f(this, a)) {
            return "EnterTransition.None";
        }
        defpackage.ack ackVar = this.b;
        defpackage.acy acyVar = ackVar.a;
        java.lang.String string = acyVar != null ? acyVar.toString() : null;
        defpackage.adq adqVar = ackVar.b;
        java.lang.String string2 = adqVar != null ? adqVar.toString() : null;
        defpackage.acd acdVar = ackVar.c;
        java.lang.String string3 = acdVar != null ? acdVar.toString() : null;
        defpackage.adf adfVar = ackVar.d;
        return "EnterTransition: Fade - " + string + ", Slide - " + string2 + ", Shrink - " + string3 + ", Scale - " + (adfVar != null ? adfVar.toString() : null) + ", Veil - null";
    }

    public acw() {
        throw null;
    }
}
