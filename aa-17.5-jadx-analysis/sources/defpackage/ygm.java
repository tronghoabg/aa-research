package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class ygm<K, V> extends ycb<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final transient yfy<K, ? extends yfg<V>> map;
    final transient int size;

    public ygm(yfy yfyVar, int i) {
        this.map = yfyVar;
        this.size = i;
    }

    @Override // defpackage.ybu, defpackage.yks
    @Deprecated
    public final boolean B(yks yksVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ybu, defpackage.yks
    @Deprecated
    public final boolean C(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ybu, defpackage.yks
    @Deprecated
    public final void D(Object obj, Iterable iterable) {
        throw null;
    }

    @Override // defpackage.ybu, defpackage.yks
    /* renamed from: b */
    public yfg u() {
        return (yfg) super.u();
    }

    @Override // defpackage.yks
    public /* bridge */ /* synthetic */ Collection c(Object obj) {
        throw null;
    }

    public final yfg d() {
        return (yfg) super.v();
    }

    @Override // defpackage.ybu, defpackage.yks
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ygr x() {
        return this.map.keySet();
    }

    @Override // defpackage.yks
    public final int h() {
        return this.size;
    }

    @Override // defpackage.ybu
    public final /* synthetic */ Collection i() {
        return new ygk(this);
    }

    @Override // defpackage.ybu
    public final /* synthetic */ Collection j() {
        return new ygl(this);
    }

    @Override // defpackage.ybu
    public final /* bridge */ /* synthetic */ Iterator l() {
        throw null;
    }

    @Override // defpackage.ybu
    public final Map o() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.ybu
    public final Set p() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.yks
    @Deprecated
    public final void q() {
        throw null;
    }

    @Override // defpackage.yks
    public final boolean s(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // defpackage.ybu, defpackage.yks
    @Deprecated
    public final boolean t(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ybu, defpackage.yks
    public final /* bridge */ /* synthetic */ Collection v() {
        throw null;
    }

    @Override // defpackage.ybu, defpackage.yks
    public /* synthetic */ Map w() {
        return this.map;
    }

    @Override // defpackage.ybu, defpackage.yks
    public final boolean z(Object obj) {
        return obj != null && super.z(obj);
    }
}
