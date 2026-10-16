package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
class yla extends yek implements Serializable {
    private static final long serialVersionUID = 0;
    final yks a;
    transient Collection b;
    transient Set c;
    transient Map d;

    public yla(yks yksVar) {
        this.a = yksVar;
    }

    @Override // defpackage.yek, defpackage.yks
    public final boolean B(yks yksVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yek, defpackage.yks
    public final boolean C(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yek, defpackage.yks
    public final void D(Object obj, Iterable iterable) {
        throw null;
    }

    @Override // defpackage.yek, defpackage.yks
    public Collection c(Object obj) {
        return yrm.D(((yeh) this.a).c(obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yel
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public yks d() {
        return this.a;
    }

    @Override // defpackage.yek, defpackage.yks
    public final void q() {
        throw null;
    }

    @Override // defpackage.yek, defpackage.yks
    public final boolean t(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yek, defpackage.yks
    public final Collection u() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        ykp ykpVar = new ykp(DesugarCollections.unmodifiableCollection(this.a.u()));
        this.b = ykpVar;
        return ykpVar;
    }

    @Override // defpackage.yek, defpackage.yks
    public final Collection v() {
        throw null;
    }

    @Override // defpackage.yek, defpackage.yks
    public final Map w() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(new yko(this.a.w(), new ykd(new ykz(0))));
        this.d = mapUnmodifiableMap;
        return mapUnmodifiableMap;
    }

    @Override // defpackage.yek, defpackage.yks
    public final Set x() {
        Set set = this.c;
        if (set != null) {
            return set;
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.a.x());
        this.c = setUnmodifiableSet;
        return setUnmodifiableSet;
    }
}
