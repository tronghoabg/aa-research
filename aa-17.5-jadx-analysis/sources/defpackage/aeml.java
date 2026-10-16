package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class aeml extends aekw implements Serializable {
    private static final long serialVersionUID = -7046029254386353129L;
    protected final aemj b;

    protected aeml(aemj aemjVar) {
        this.b = aemjVar;
    }

    @Override // defpackage.aekw, defpackage.aemj
    public final long a() {
        return ((aekw) this.b).a;
    }

    @Override // defpackage.aekw, defpackage.aemj
    public final long b(long j, long j2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aekw, defpackage.aemj
    public final long c(long j) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aekw, defpackage.aemj
    @Deprecated
    public final Long d(Object obj) {
        return adqq.aW(this.b, obj);
    }

    @Override // defpackage.aekw, defpackage.aemj
    public final boolean e(long j) {
        return this.b.e(j);
    }

    public boolean equals(Object obj) {
        return obj == this || this.b.equals(obj);
    }

    @Override // defpackage.aekw, defpackage.aeee
    @Deprecated
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return d(obj);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @Deprecated
    public final Long n(Long l, Long l2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Long p(Object obj) {
        throw null;
    }

    @Override // defpackage.aekw, defpackage.aeee
    public final int size() {
        return ((aend) this.b).i;
    }

    @Override // defpackage.aemj
    public final long t(long j) {
        return this.b.t(j);
    }

    public final String toString() {
        return this.b.toString();
    }
}
