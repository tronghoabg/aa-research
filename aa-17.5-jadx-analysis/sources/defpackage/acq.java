package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class acq {
    public static final acq a;
    private static final acq c;
    public final acd b;

    static {
        Map map = null;
        acr acrVar = null;
        adj adjVar = null;
        abw abwVar = null;
        acy acyVar = null;
        a = new acq(new acd(acrVar, adjVar, abwVar, acyVar, false, map, 127));
        c = new acq(new acd(acrVar, adjVar, abwVar, acyVar, true, map, 95));
    }

    public acq(acd acdVar) {
        this.b = acdVar;
    }

    public final acq a(acq acqVar) {
        acq acqVar2 = a;
        if (affa.f(this, acqVar2)) {
            return acqVar;
        }
        if (affa.f(acqVar, acqVar2)) {
            return this;
        }
        acd acdVar = acqVar.b;
        acr acrVar = acdVar.a;
        if (acrVar == null) {
            acrVar = this.b.a;
        }
        adj adjVar = acdVar.b;
        if (adjVar == null) {
            adjVar = this.b.b;
        }
        abw abwVar = acdVar.c;
        if (abwVar == null) {
            abwVar = this.b.c;
        }
        acy acyVar = acdVar.d;
        if (acyVar == null) {
            acyVar = this.b.d;
        }
        adm admVar = acdVar.e;
        acd acdVar2 = this.b;
        adm admVar2 = acdVar2.e;
        boolean z = true;
        if (!acdVar.f && !acdVar2.f) {
            z = false;
        }
        boolean z2 = z;
        Map map = acdVar2.g;
        Map map2 = acdVar.g;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new acq(new acd(acrVar, adjVar, abwVar, acyVar, z2, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof acq) && affa.f(((acq) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        if (affa.f(this, a)) {
            return "ExitTransition.None";
        }
        if (affa.f(this, c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        acd acdVar = this.b;
        acr acrVar = acdVar.a;
        String string = acrVar != null ? acrVar.toString() : null;
        adj adjVar = acdVar.b;
        String string2 = adjVar != null ? adjVar.toString() : null;
        abw abwVar = acdVar.c;
        String string3 = abwVar != null ? abwVar.toString() : null;
        acy acyVar = acdVar.d;
        String string4 = acyVar != null ? acyVar.toString() : null;
        adm admVar = acdVar.e;
        return "ExitTransition:  Fade - " + string + ",  Slide - " + string2 + ",  Shrink - " + string3 + ",  Scale - " + string4 + ",  Veil - null,  KeepUntilTransitionsFinished - " + acdVar.f;
    }

    public acq() {
        throw null;
    }
}
