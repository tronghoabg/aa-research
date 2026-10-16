package defpackage;

import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class akem extends akcm implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -6390301302770925357L;
    private final akco b;

    private akem(akco akcoVar) {
        this.b = akcoVar;
    }

    public static synchronized akem h(akco akcoVar) {
        akem akemVar;
        HashMap map = a;
        if (map == null) {
            a = new HashMap(7);
            akemVar = null;
        } else {
            akemVar = (akem) map.get(akcoVar);
        }
        if (akemVar != null) {
            return akemVar;
        }
        akem akemVar2 = new akem(akcoVar);
        a.put(akcoVar, akemVar2);
        return akemVar2;
    }

    private final UnsupportedOperationException i() {
        return new UnsupportedOperationException(this.b.m.concat(" field is unsupported"));
    }

    private Object readResolve() {
        return h(this.b);
    }

    @Override // defpackage.akcm
    public final long a(long j, int i) {
        throw i();
    }

    @Override // defpackage.akcm
    public final long b(long j, long j2) {
        throw i();
    }

    @Override // defpackage.akcm
    public final long c() {
        return 0L;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // defpackage.akcm
    public final akco d() {
        return this.b;
    }

    @Override // defpackage.akcm
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akem)) {
            return false;
        }
        akem akemVar = (akem) obj;
        akemVar.g();
        return akemVar.g().equals(g());
    }

    @Override // defpackage.akcm
    public final boolean f() {
        return false;
    }

    public final String g() {
        return this.b.m;
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final String toString() {
        return "UnsupportedDurationField[" + g() + "]";
    }
}
