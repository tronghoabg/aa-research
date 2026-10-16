package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class acp {
    public static final acp a = new acp(new acd(null, null, null, null, false, null, 127));
    public final acd b;

    public acp(acd acdVar) {
        this.b = acdVar;
    }

    public final acp a(acp acpVar) {
        acp acpVar2 = a;
        if (affa.f(this, acpVar2)) {
            return acpVar;
        }
        if (affa.f(acpVar, acpVar2)) {
            return this;
        }
        acd acdVar = acpVar.b;
        acr acrVar = acdVar.a;
        if (acrVar == null) {
            acrVar = this.b.a;
        }
        acr acrVar2 = acrVar;
        adj adjVar = acdVar.b;
        if (adjVar == null) {
            adjVar = this.b.b;
        }
        adj adjVar2 = adjVar;
        abw abwVar = acdVar.c;
        if (abwVar == null) {
            abwVar = this.b.c;
        }
        abw abwVar2 = abwVar;
        acy acyVar = acdVar.d;
        if (acyVar == null) {
            acyVar = this.b.d;
        }
        acd acdVar2 = this.b;
        Map map = acdVar.g;
        Map map2 = acdVar2.g;
        map2.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        linkedHashMap.putAll(map);
        return new acp(new acd(acrVar2, adjVar2, abwVar2, acyVar, false, linkedHashMap, 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof acp) && affa.f(((acp) obj).b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        if (affa.f(this, a)) {
            return "EnterTransition.None";
        }
        acd acdVar = this.b;
        acr acrVar = acdVar.a;
        String string = acrVar != null ? acrVar.toString() : null;
        adj adjVar = acdVar.b;
        String string2 = adjVar != null ? adjVar.toString() : null;
        abw abwVar = acdVar.c;
        String string3 = abwVar != null ? abwVar.toString() : null;
        acy acyVar = acdVar.d;
        return "EnterTransition: Fade - " + string + ", Slide - " + string2 + ", Shrink - " + string3 + ", Scale - " + (acyVar != null ? acyVar.toString() : null) + ", Veil - null";
    }

    public acp() {
        throw null;
    }
}
