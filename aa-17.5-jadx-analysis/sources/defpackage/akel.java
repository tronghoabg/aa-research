package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class akel extends akcf implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final akch b;
    private final akcm c;

    private akel(akch akchVar, akcm akcmVar) {
        if (akcmVar == null) {
            throw new IllegalArgumentException();
        }
        this.b = akchVar;
        this.c = akcmVar;
    }

    private Object readResolve() {
        return w(this.b, this.c);
    }

    public static synchronized akel w(akch akchVar, akcm akcmVar) {
        HashMap map = a;
        akel akelVar = null;
        if (map == null) {
            a = new HashMap(7);
        } else {
            akel akelVar2 = (akel) map.get(akchVar);
            if (akelVar2 == null || akelVar2.c == akcmVar) {
                akelVar = akelVar2;
            }
        }
        if (akelVar != null) {
            return akelVar;
        }
        akel akelVar3 = new akel(akchVar, akcmVar);
        a.put(akchVar, akelVar3);
        return akelVar3;
    }

    private final UnsupportedOperationException x() {
        return new UnsupportedOperationException(this.b.y.concat(" field is unsupported"));
    }

    @Override // defpackage.akcf
    public final int a(long j) {
        throw x();
    }

    @Override // defpackage.akcf
    public final int b(Locale locale) {
        throw x();
    }

    @Override // defpackage.akcf
    public final int c() {
        throw x();
    }

    @Override // defpackage.akcf
    public final int d() {
        throw x();
    }

    @Override // defpackage.akcf
    public final long e(long j, int i) {
        return this.c.a(j, i);
    }

    @Override // defpackage.akcf
    public final long f(long j) {
        throw x();
    }

    @Override // defpackage.akcf
    public final long g(long j) {
        throw x();
    }

    @Override // defpackage.akcf
    public final long h(long j, int i) {
        throw x();
    }

    @Override // defpackage.akcf
    public final long i(long j, String str, Locale locale) {
        throw x();
    }

    @Override // defpackage.akcf
    public final String k(int i, Locale locale) {
        throw x();
    }

    @Override // defpackage.akcf
    public final String l(long j, Locale locale) {
        throw x();
    }

    @Override // defpackage.akcf
    public final String m(int i, Locale locale) {
        throw x();
    }

    @Override // defpackage.akcf
    public final String n(long j, Locale locale) {
        throw x();
    }

    @Override // defpackage.akcf
    public final String o() {
        return this.b.y;
    }

    @Override // defpackage.akcf
    public final akch p() {
        return this.b;
    }

    @Override // defpackage.akcf
    public final akcm q() {
        return this.c;
    }

    @Override // defpackage.akcf
    public final akcm r() {
        return null;
    }

    @Override // defpackage.akcf
    public final akcm s() {
        return null;
    }

    @Override // defpackage.akcf
    public final boolean t(long j) {
        throw x();
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // defpackage.akcf
    public final boolean u() {
        return false;
    }

    @Override // defpackage.akcf
    public final void v() {
    }
}
