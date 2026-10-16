package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akfl extends defpackage.akdf implements java.io.Serializable {
    private static java.util.HashMap a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final defpackage.akdh b;
    private final defpackage.akdm c;

    private akfl(defpackage.akdh akdhVar, defpackage.akdm akdmVar) {
        if (akdmVar == null) {
            throw new java.lang.IllegalArgumentException();
        }
        this.b = akdhVar;
        this.c = akdmVar;
    }

    private java.lang.Object readResolve() {
        return w(this.b, this.c);
    }

    public static synchronized defpackage.akfl w(defpackage.akdh akdhVar, defpackage.akdm akdmVar) {
        java.util.HashMap map = a;
        defpackage.akfl akflVar = null;
        if (map == null) {
            a = new java.util.HashMap(7);
        } else {
            defpackage.akfl akflVar2 = (defpackage.akfl) map.get(akdhVar);
            if (akflVar2 == null || akflVar2.c == akdmVar) {
                akflVar = akflVar2;
            }
        }
        if (akflVar != null) {
            return akflVar;
        }
        defpackage.akfl akflVar3 = new defpackage.akfl(akdhVar, akdmVar);
        a.put(akdhVar, akflVar3);
        return akflVar3;
    }

    private final java.lang.UnsupportedOperationException x() {
        return new java.lang.UnsupportedOperationException(this.b.y.concat(" field is unsupported"));
    }

    @Override // defpackage.akdf
    public final int a(long j) {
        throw x();
    }

    @Override // defpackage.akdf
    public final int b(java.util.Locale locale) {
        throw x();
    }

    @Override // defpackage.akdf
    public final int c() {
        throw x();
    }

    @Override // defpackage.akdf
    public final int d() {
        throw x();
    }

    @Override // defpackage.akdf
    public final long e(long j, int i) {
        return this.c.a(j, i);
    }

    @Override // defpackage.akdf
    public final long f(long j) {
        throw x();
    }

    @Override // defpackage.akdf
    public final long g(long j) {
        throw x();
    }

    @Override // defpackage.akdf
    public final long h(long j, int i) {
        throw x();
    }

    @Override // defpackage.akdf
    public final long i(long j, java.lang.String str, java.util.Locale locale) {
        throw x();
    }

    @Override // defpackage.akdf
    public final java.lang.String k(int i, java.util.Locale locale) {
        throw x();
    }

    @Override // defpackage.akdf
    public final java.lang.String l(long j, java.util.Locale locale) {
        throw x();
    }

    @Override // defpackage.akdf
    public final java.lang.String m(int i, java.util.Locale locale) {
        throw x();
    }

    @Override // defpackage.akdf
    public final java.lang.String n(long j, java.util.Locale locale) {
        throw x();
    }

    @Override // defpackage.akdf
    public final java.lang.String o() {
        return this.b.y;
    }

    @Override // defpackage.akdf
    public final defpackage.akdh p() {
        return this.b;
    }

    @Override // defpackage.akdf
    public final defpackage.akdm q() {
        return this.c;
    }

    @Override // defpackage.akdf
    public final defpackage.akdm r() {
        return null;
    }

    @Override // defpackage.akdf
    public final defpackage.akdm s() {
        return null;
    }

    @Override // defpackage.akdf
    public final boolean t(long j) {
        throw x();
    }

    public final java.lang.String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // defpackage.akdf
    public final boolean u() {
        return false;
    }

    @Override // defpackage.akdf
    public final void v() {
    }
}
