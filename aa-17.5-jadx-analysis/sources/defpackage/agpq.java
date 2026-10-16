package defpackage;

import java.util.Collection;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class agpq {
    public static final agpr getExtension(agnq agnqVar, agpv agpvVar) {
        agnqVar.getClass();
        agpvVar.getClass();
        return (agpr) singleOfType(agnqVar.getExtensions$org_jetbrains_kotlin_kotlin_metadata(), agpvVar);
    }

    private static final <N extends agpu> N singleOfType(Collection<? extends N> collection, agpv agpvVar) {
        N n = null;
        for (N n2 : collection) {
            if (affa.f(n2.getType(), agpvVar)) {
                if (n != null) {
                    Objects.toString(agpvVar);
                    throw new IllegalStateException("Multiple extensions handle the same extension type: ".concat(String.valueOf(agpvVar)));
                }
                n = n2;
            }
        }
        if (n != null) {
            return n;
        }
        Objects.toString(agpvVar);
        throw new IllegalStateException("No extensions handle the extension type: ".concat(String.valueOf(agpvVar)));
    }

    public static final agps getExtension(agnw agnwVar, agpv agpvVar) {
        agnwVar.getClass();
        agpvVar.getClass();
        return (agps) singleOfType(agnwVar.getExtensions$org_jetbrains_kotlin_kotlin_metadata(), agpvVar);
    }

    public static final agpw getExtension(agog agogVar, agpv agpvVar) {
        agogVar.getClass();
        agpvVar.getClass();
        return (agpw) singleOfType(agogVar.getExtensions$org_jetbrains_kotlin_kotlin_metadata(), agpvVar);
    }

    public static final agpx getExtension(agoi agoiVar, agpv agpvVar) {
        agoiVar.getClass();
        agpvVar.getClass();
        return (agpx) singleOfType(agoiVar.getExtensions$org_jetbrains_kotlin_kotlin_metadata(), agpvVar);
    }

    public static final agpy getExtension(agoj agojVar, agpv agpvVar) {
        agojVar.getClass();
        agpvVar.getClass();
        return (agpy) singleOfType(agojVar.getExtensions$org_jetbrains_kotlin_kotlin_metadata(), agpvVar);
    }

    public static final agqa getExtension(agol agolVar, agpv agpvVar) {
        agolVar.getClass();
        agpvVar.getClass();
        return (agqa) singleOfType(agolVar.getExtensions$org_jetbrains_kotlin_kotlin_metadata(), agpvVar);
    }

    public static final agqb getExtension(agon agonVar, agpv agpvVar) {
        agonVar.getClass();
        agpvVar.getClass();
        return (agqb) singleOfType(agonVar.getExtensions$org_jetbrains_kotlin_kotlin_metadata(), agpvVar);
    }
}
