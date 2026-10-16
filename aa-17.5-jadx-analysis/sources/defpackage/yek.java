package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class yek extends yel implements yks {
    protected yek() {
    }

    @Override // defpackage.yks
    public final boolean A() {
        return e().A();
    }

    @Override // defpackage.yks
    public boolean B(yks yksVar) {
        return e().B(yksVar);
    }

    @Override // defpackage.yks
    public boolean C(Object obj, Object obj2) {
        return e().C(obj, obj2);
    }

    @Override // defpackage.yks
    public void D(Object obj, Iterable iterable) {
        throw null;
    }

    public Collection c(Object obj) {
        throw null;
    }

    protected abstract yks e();

    @Override // defpackage.yks
    public final boolean equals(Object obj) {
        return obj == this || e().equals(obj);
    }

    @Override // defpackage.yks
    public final int h() {
        throw null;
    }

    @Override // defpackage.yks
    public final int hashCode() {
        return e().hashCode();
    }

    @Override // defpackage.yks
    public void q() {
        throw null;
    }

    @Override // defpackage.yks
    public final boolean s(Object obj) {
        throw null;
    }

    @Override // defpackage.yks
    public boolean t(Object obj, Object obj2) {
        return e().t(obj, obj2);
    }

    @Override // defpackage.yks
    public Collection u() {
        return e().u();
    }

    @Override // defpackage.yks
    public Collection v() {
        throw null;
    }

    @Override // defpackage.yks
    public Map w() {
        return e().w();
    }

    @Override // defpackage.yks
    public Set x() {
        return e().x();
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
