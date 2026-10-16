package defpackage;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class akdv extends akcy {
    private static final long serialVersionUID = -1079258847191166848L;

    private akdv(akcd akcdVar, akcl akclVar) {
        super(akcdVar, akclVar);
    }

    public static akdv N(akcd akcdVar, akcl akclVar) {
        if (akcdVar == null) {
            throw new IllegalArgumentException("Must supply a chronology");
        }
        akcd akcdVarA = akcdVar.a();
        if (akcdVarA == null) {
            throw new IllegalArgumentException("UTC chronology must not be null");
        }
        if (akclVar != null) {
            return new akdv(akcdVarA, akclVar);
        }
        throw new IllegalArgumentException("DateTimeZone must not be null");
    }

    static boolean O(akcm akcmVar) {
        return akcmVar != null && akcmVar.c() < 43200000;
    }

    private final akcf P(akcf akcfVar, HashMap map) {
        if (akcfVar == null || !akcfVar.u()) {
            return akcfVar;
        }
        if (map.containsKey(akcfVar)) {
            return (akcf) map.get(akcfVar);
        }
        akdt akdtVar = new akdt(akcfVar, (akcl) this.b, Q(akcfVar.q(), map), Q(akcfVar.s(), map), Q(akcfVar.r(), map));
        map.put(akcfVar, akdtVar);
        return akdtVar;
    }

    private final akcm Q(akcm akcmVar, HashMap map) {
        if (akcmVar == null || !akcmVar.f()) {
            return akcmVar;
        }
        if (map.containsKey(akcmVar)) {
            return (akcm) map.get(akcmVar);
        }
        akdu akduVar = new akdu(akcmVar, (akcl) this.b);
        map.put(akcmVar, akduVar);
        return akduVar;
    }

    @Override // defpackage.akcy
    protected final void M(akcx akcxVar) {
        HashMap map = new HashMap();
        akcxVar.l = Q(akcxVar.l, map);
        akcxVar.k = Q(akcxVar.k, map);
        akcxVar.j = Q(akcxVar.j, map);
        akcxVar.i = Q(akcxVar.i, map);
        akcxVar.h = Q(akcxVar.h, map);
        akcxVar.g = Q(akcxVar.g, map);
        akcxVar.f = Q(akcxVar.f, map);
        akcxVar.e = Q(akcxVar.e, map);
        akcxVar.d = Q(akcxVar.d, map);
        akcxVar.c = Q(akcxVar.c, map);
        akcxVar.b = Q(akcxVar.b, map);
        akcxVar.a = Q(akcxVar.a, map);
        akcxVar.E = P(akcxVar.E, map);
        akcxVar.F = P(akcxVar.F, map);
        akcxVar.G = P(akcxVar.G, map);
        akcxVar.H = P(akcxVar.H, map);
        akcxVar.I = P(akcxVar.I, map);
        akcxVar.x = P(akcxVar.x, map);
        akcxVar.y = P(akcxVar.y, map);
        akcxVar.z = P(akcxVar.z, map);
        akcxVar.D = P(akcxVar.D, map);
        akcxVar.A = P(akcxVar.A, map);
        akcxVar.B = P(akcxVar.B, map);
        akcxVar.C = P(akcxVar.C, map);
        akcxVar.m = P(akcxVar.m, map);
        akcxVar.n = P(akcxVar.n, map);
        akcxVar.o = P(akcxVar.o, map);
        akcxVar.p = P(akcxVar.p, map);
        akcxVar.q = P(akcxVar.q, map);
        akcxVar.r = P(akcxVar.r, map);
        akcxVar.s = P(akcxVar.s, map);
        akcxVar.u = P(akcxVar.u, map);
        akcxVar.t = P(akcxVar.t, map);
        akcxVar.v = P(akcxVar.v, map);
        akcxVar.w = P(akcxVar.w, map);
    }

    @Override // defpackage.akcd
    public final akcd a() {
        return this.a;
    }

    @Override // defpackage.akcd
    public final akcd b(akcl akclVar) {
        if (akclVar == this.b) {
            return this;
        }
        akcl akclVar2 = akcl.a;
        akcd akcdVar = this.a;
        return akclVar == akclVar2 ? akcdVar : new akdv(akcdVar, akclVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akdv)) {
            return false;
        }
        akdv akdvVar = (akdv) obj;
        if (this.a.equals(akdvVar.a)) {
            if (((akcl) this.b).equals(akdvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((akcl) this.b).hashCode() * 11) + 326565 + (this.a.hashCode() * 7);
    }

    public final String toString() {
        return "ZonedChronology[" + String.valueOf(this.a) + ", " + ((akcl) this.b).c + "]";
    }

    @Override // defpackage.akcy, defpackage.akcd
    public final akcl z() {
        return (akcl) this.b;
    }
}
