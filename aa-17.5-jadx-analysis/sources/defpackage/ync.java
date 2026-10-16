package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ync extends ynd implements yks {
    private static final long serialVersionUID = 0;
    transient Collection a;
    transient Map b;

    public ync(yks yksVar) {
        super(yksVar, null);
    }

    @Override // defpackage.yks
    public final boolean A() {
        throw null;
    }

    @Override // defpackage.yks
    public final boolean B(yks yksVar) {
        throw null;
    }

    @Override // defpackage.yks
    public final boolean C(Object obj, Object obj2) {
        boolean zC;
        synchronized (this.g) {
            zC = a().C(obj, obj2);
        }
        return zC;
    }

    @Override // defpackage.yks
    public final void D(Object obj, Iterable iterable) {
        throw null;
    }

    final yks a() {
        return (yks) this.f;
    }

    @Override // defpackage.yks
    public final Collection c(Object obj) {
        Collection collectionK;
        Object obj2 = this.g;
        synchronized (obj2) {
            collectionK = yrm.k(a().c(obj), obj2);
        }
        return collectionK;
    }

    @Override // defpackage.yks
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            zEquals = a().equals(obj);
        }
        return zEquals;
    }

    @Override // defpackage.yks
    public final int h() {
        throw null;
    }

    @Override // defpackage.yks
    public final int hashCode() {
        int iHashCode;
        synchronized (this.g) {
            iHashCode = a().hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.yks
    public final void q() {
        throw null;
    }

    @Override // defpackage.yks
    public final boolean s(Object obj) {
        throw null;
    }

    @Override // defpackage.yks
    public final boolean t(Object obj, Object obj2) {
        boolean zT;
        synchronized (this.g) {
            zT = a().t(obj, obj2);
        }
        return zT;
    }

    @Override // defpackage.yks
    public final Collection u() {
        Collection collectionK;
        Object obj = this.g;
        synchronized (obj) {
            collectionK = this.a;
            if (collectionK == null) {
                collectionK = yrm.k(a().u(), obj);
                this.a = collectionK;
            }
        }
        return collectionK;
    }

    @Override // defpackage.yks
    public final Collection v() {
        throw null;
    }

    @Override // defpackage.yks
    public final Map w() {
        Map map;
        Object obj = this.g;
        synchronized (obj) {
            if (this.b == null) {
                this.b = new ymt(a().w(), obj);
            }
            map = this.b;
        }
        return map;
    }

    @Override // defpackage.yks
    public final Set x() {
        throw null;
    }

    @Override // defpackage.yks
    public final boolean y(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.yks
    public final boolean z(Object obj) {
        throw null;
    }
}
