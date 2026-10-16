package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akfm extends defpackage.akdm implements java.io.Serializable {
    private static java.util.HashMap a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final defpackage.akdo b;

    private akfm(defpackage.akdo akdoVar) {
        this.b = akdoVar;
    }

    public static synchronized defpackage.akfm h(defpackage.akdo akdoVar) {
        defpackage.akfm akfmVar;
        java.util.HashMap map = a;
        if (map == null) {
            a = new java.util.HashMap(7);
            akfmVar = null;
        } else {
            akfmVar = (defpackage.akfm) map.get(akdoVar);
        }
        if (akfmVar != null) {
            return akfmVar;
        }
        defpackage.akfm akfmVar2 = new defpackage.akfm(akdoVar);
        a.put(akdoVar, akfmVar2);
        return akfmVar2;
    }

    private final java.lang.UnsupportedOperationException i() {
        return new java.lang.UnsupportedOperationException(this.b.m.concat(" field is unsupported"));
    }

    private java.lang.Object readResolve() {
        return h(this.b);
    }

    @Override // defpackage.akdm
    public final long a(long j, int i) {
        throw i();
    }

    @Override // defpackage.akdm
    public final long b(long j, long j2) {
        throw i();
    }

    @Override // defpackage.akdm
    public final long c() {
        return 0L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return 0;
    }

    @Override // defpackage.akdm
    public final defpackage.akdo d() {
        return this.b;
    }

    @Override // defpackage.akdm
    public final boolean e() {
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.akfm)) {
            return false;
        }
        defpackage.akfm akfmVar = (defpackage.akfm) obj;
        akfmVar.g();
        return akfmVar.g().equals(g());
    }

    @Override // defpackage.akdm
    public final boolean f() {
        return false;
    }

    public final java.lang.String g() {
        return this.b.m;
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final java.lang.String toString() {
        return "UnsupportedDurationField[" + g() + "]";
    }
}
