package com.google.d.d;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class ek extends y {

    /* renamed from: a, reason: collision with root package name */
    final dw f7565a;

    /* renamed from: b, reason: collision with root package name */
    final dp f7566b;

    ek(dw dwVar, dp dpVar) {
        com.google.d.b.an.B(dwVar);
        this.f7565a = dwVar;
        this.f7566b = dpVar;
    }

    @Override // com.google.d.d.y, com.google.d.d.dw
    public final boolean F() {
        return this.f7565a.F();
    }

    @Override // com.google.d.d.y, com.google.d.d.dw
    public final boolean G(Object obj, Object obj2) {
        return g(obj).remove(obj2);
    }

    Collection a(final Object obj, Collection collection) {
        com.google.d.b.t tVar = new com.google.d.b.t() { // from class: com.google.d.d.ej
            @Override // com.google.d.b.t
            public final Object apply(Object obj2) {
                return this.f7563a.f7566b.a(obj, obj2);
            }
        };
        return collection instanceof List ? fo.G((List) collection, tVar) : new af(collection, tVar);
    }

    @Override // com.google.d.d.dw
    /* renamed from: c */
    public Collection g(Object obj) {
        return a(obj, this.f7565a.g(obj));
    }

    @Override // com.google.d.d.dw
    public Collection d(Object obj) {
        throw null;
    }

    @Override // com.google.d.d.dw
    public final int i() {
        return this.f7565a.i();
    }

    @Override // com.google.d.d.y
    final Collection j() {
        return new ee(this);
    }

    @Override // com.google.d.d.y
    final Collection k() {
        return new af(this.f7565a.z(), new com.google.d.b.t() { // from class: com.google.d.d.eh
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return this.f7561a.f7566b.a(entry.getKey(), entry.getValue());
            }
        });
    }

    @Override // com.google.d.d.y
    final Iterator l() {
        return fo.K(this.f7565a.z().iterator(), fo.v(this.f7566b));
    }

    @Override // com.google.d.d.y
    final Map q() {
        return new dt(this.f7565a.B(), new dp() { // from class: com.google.d.d.ei
            @Override // com.google.d.d.dp
            public final Object a(Object obj, Object obj2) {
                return this.f7562a.a(obj, (Collection) obj2);
            }
        });
    }

    @Override // com.google.d.d.y
    final Set s() {
        return this.f7565a.C();
    }

    @Override // com.google.d.d.dw
    public final void w() {
        this.f7565a.w();
    }

    @Override // com.google.d.d.y, com.google.d.d.dw
    public final void y(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }
}
