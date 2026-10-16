package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acx {
    public static final defpackage.acx a;
    private static final defpackage.acx c;
    public final defpackage.ack b;

    static {
        java.util.Map map = null;
        defpackage.acy acyVar = null;
        defpackage.adq adqVar = null;
        defpackage.acd acdVar = null;
        defpackage.adf adfVar = null;
        a = new defpackage.acx(new defpackage.ack(acyVar, adqVar, acdVar, adfVar, false, map, 127));
        c = new defpackage.acx(new defpackage.ack(acyVar, adqVar, acdVar, adfVar, true, map, 95));
    }

    public acx(defpackage.ack ackVar) {
        this.b = ackVar;
    }

    public final defpackage.acx a(defpackage.acx acxVar) {
        defpackage.acx acxVar2 = a;
        if (defpackage.afga.f(this, acxVar2)) {
            return acxVar;
        }
        if (defpackage.afga.f(acxVar, acxVar2)) {
            return this;
        }
        defpackage.ack ackVar = acxVar.b;
        defpackage.acy acyVar = ackVar.a;
        if (acyVar == null) {
            acyVar = this.b.a;
        }
        defpackage.adq adqVar = ackVar.b;
        if (adqVar == null) {
            adqVar = this.b.b;
        }
        defpackage.acd acdVar = ackVar.c;
        if (acdVar == null) {
            acdVar = this.b.c;
        }
        defpackage.adf adfVar = ackVar.d;
        if (adfVar == null) {
            adfVar = this.b.d;
        }
        defpackage.adt adtVar = ackVar.e;
        defpackage.ack ackVar2 = this.b;
        defpackage.adt adtVar2 = ackVar2.e;
        boolean z = true;
        if (!ackVar.f && !ackVar2.f) {
            z = false;
        }
        boolean z2 = z;
        java.util.Map map = ackVar2.g;
        java.util.Map map2 = ackVar.g;
        map.getClass();
        map2.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new defpackage.acx(new defpackage.ack(acyVar, adqVar, acdVar, adfVar, z2, linkedHashMap));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.acx) && defpackage.afga.f(((defpackage.acx) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        if (defpackage.afga.f(this, a)) {
            return "ExitTransition.None";
        }
        if (defpackage.afga.f(this, c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        defpackage.ack ackVar = this.b;
        defpackage.acy acyVar = ackVar.a;
        java.lang.String string = acyVar != null ? acyVar.toString() : null;
        defpackage.adq adqVar = ackVar.b;
        java.lang.String string2 = adqVar != null ? adqVar.toString() : null;
        defpackage.acd acdVar = ackVar.c;
        java.lang.String string3 = acdVar != null ? acdVar.toString() : null;
        defpackage.adf adfVar = ackVar.d;
        java.lang.String string4 = adfVar != null ? adfVar.toString() : null;
        defpackage.adt adtVar = ackVar.e;
        return "ExitTransition:  Fade - " + string + ",  Slide - " + string2 + ",  Shrink - " + string3 + ",  Scale - " + string4 + ",  Veil - null,  KeepUntilTransitionsFinished - " + ackVar.f;
    }

    public acx() {
        throw null;
    }
}
