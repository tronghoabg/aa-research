package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class akdr extends akcy {
    public static final akdr o;
    private static final ConcurrentHashMap p;
    private static final long serialVersionUID = -6212696554273812441L;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        p = concurrentHashMap;
        akdr akdrVar = new akdr(akdp.H);
        o = akdrVar;
        concurrentHashMap.put(akcl.a, akdrVar);
    }

    private akdr(akcd akcdVar) {
        super(akcdVar, null);
    }

    public static akdr N() {
        return O(akcl.j());
    }

    public static akdr O(akcl akclVar) {
        if (akclVar == null) {
            akclVar = akcl.j();
        }
        ConcurrentHashMap concurrentHashMap = p;
        akdr akdrVar = (akdr) concurrentHashMap.get(akclVar);
        if (akdrVar != null) {
            return akdrVar;
        }
        akdr akdrVar2 = new akdr(akdv.N(o, akclVar));
        akdr akdrVar3 = (akdr) concurrentHashMap.putIfAbsent(akclVar, akdrVar2);
        return akdrVar3 == null ? akdrVar2 : akdrVar3;
    }

    private Object writeReplace() {
        return new akdq(z());
    }

    @Override // defpackage.akcy
    protected final void M(akcx akcxVar) {
        if (this.a.z() == akcl.a) {
            akcxVar.H = new akeb(akds.a, akch.d);
            akcxVar.k = akcxVar.H.q();
            akcxVar.G = new akej((akeb) akcxVar.H, akch.e);
            akcxVar.C = new akej((akeb) akcxVar.H, akcxVar.h, akch.j);
        }
    }

    @Override // defpackage.akcd
    public final akcd a() {
        return o;
    }

    @Override // defpackage.akcd
    public final akcd b(akcl akclVar) {
        return akclVar == z() ? this : O(akclVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof akdr) {
            return z().equals(((akdr) obj).z());
        }
        return false;
    }

    public final int hashCode() {
        return z().hashCode() + 800855;
    }

    public final String toString() {
        akcl akclVarZ = z();
        if (akclVarZ == null) {
            return "ISOChronology";
        }
        return "ISOChronology[" + akclVarZ.c + "]";
    }
}
