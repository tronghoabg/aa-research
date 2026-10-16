package com.google.d.d;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ca<K, V> extends ac<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final transient bs<K, ? extends bh<V>> map;
    final transient int size;

    ca(bs bsVar, int i2) {
        this.map = bsVar;
        this.size = i2;
    }

    @Override // com.google.d.d.y, com.google.d.d.dw
    public final /* bridge */ /* synthetic */ Collection A() {
        return (bh) super.A();
    }

    @Override // com.google.d.d.y, com.google.d.d.dw
    public /* synthetic */ Map B() {
        return this.map;
    }

    @Override // com.google.d.d.y
    public final boolean E(Object obj) {
        return obj != null && super.E(obj);
    }

    @Override // com.google.d.d.y, com.google.d.d.dw
    @Deprecated
    public final boolean G(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.d.d.dw
    /* renamed from: c */
    public /* bridge */ /* synthetic */ Collection g(Object obj) {
        throw null;
    }

    @Override // com.google.d.d.dw
    @Deprecated
    public /* bridge */ /* synthetic */ Collection d(Object obj) {
        throw null;
    }

    public final bs e() {
        return this.map;
    }

    @Override // com.google.d.d.y, com.google.d.d.dw
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ci C() {
        return this.map.keySet();
    }

    public final boolean h(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.d.d.dw
    public final int i() {
        return this.size;
    }

    @Override // com.google.d.d.y
    final /* synthetic */ Collection j() {
        return new by(this);
    }

    @Override // com.google.d.d.y
    final /* synthetic */ Collection k() {
        return new bz(this);
    }

    @Override // com.google.d.d.y
    final /* synthetic */ Iterator l() {
        return new bv(this);
    }

    @Override // com.google.d.d.y
    final Map q() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.d.d.y
    final Set s() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.d.d.dw
    @Deprecated
    public final void w() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.d.d.y, com.google.d.d.dw
    @Deprecated
    public final void y(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.d.d.y, com.google.d.d.dw
    public final /* bridge */ /* synthetic */ Collection z() {
        return (bh) super.z();
    }
}
