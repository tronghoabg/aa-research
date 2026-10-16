package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aker extends defpackage.akdy {
    public static final defpackage.aker o;
    private static final j$.util.concurrent.ConcurrentHashMap p;
    private static final long serialVersionUID = -6212696554273812441L;

    static {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = new j$.util.concurrent.ConcurrentHashMap();
        p = concurrentHashMap;
        defpackage.aker akerVar = new defpackage.aker(defpackage.akep.H);
        o = akerVar;
        concurrentHashMap.put(defpackage.akdl.a, akerVar);
    }

    private aker(defpackage.akdd akddVar) {
        super(akddVar, null);
    }

    public static defpackage.aker N() {
        return O(defpackage.akdl.j());
    }

    public static defpackage.aker O(defpackage.akdl akdlVar) {
        if (akdlVar == null) {
            akdlVar = defpackage.akdl.j();
        }
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = p;
        defpackage.aker akerVar = (defpackage.aker) concurrentHashMap.get(akdlVar);
        if (akerVar != null) {
            return akerVar;
        }
        defpackage.aker akerVar2 = new defpackage.aker(defpackage.akev.N(o, akdlVar));
        defpackage.aker akerVar3 = (defpackage.aker) concurrentHashMap.putIfAbsent(akdlVar, akerVar2);
        return akerVar3 == null ? akerVar2 : akerVar3;
    }

    private java.lang.Object writeReplace() {
        return new defpackage.akeq(z());
    }

    @Override // defpackage.akdy
    protected final void M(defpackage.akdx akdxVar) {
        if (this.a.z() == defpackage.akdl.a) {
            akdxVar.H = new defpackage.akfb(defpackage.akes.a, defpackage.akdh.d);
            akdxVar.k = akdxVar.H.q();
            akdxVar.G = new defpackage.akfj((defpackage.akfb) akdxVar.H, defpackage.akdh.e);
            akdxVar.C = new defpackage.akfj((defpackage.akfb) akdxVar.H, akdxVar.h, defpackage.akdh.j);
        }
    }

    @Override // defpackage.akdd
    public final defpackage.akdd a() {
        return o;
    }

    @Override // defpackage.akdd
    public final defpackage.akdd b(defpackage.akdl akdlVar) {
        return akdlVar == z() ? this : O(akdlVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aker) {
            return z().equals(((defpackage.aker) obj).z());
        }
        return false;
    }

    public final int hashCode() {
        return z().hashCode() + 800855;
    }

    public final java.lang.String toString() {
        defpackage.akdl akdlVarZ = z();
        if (akdlVarZ == null) {
            return "ISOChronology";
        }
        return "ISOChronology[" + akdlVarZ.c + "]";
    }
}
