package com.google.d.d;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aj extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f7414a;

    /* synthetic */ aj(ao aoVar) {
        Objects.requireNonNull(aoVar);
        this.f7414a = aoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f7414a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        ao aoVar = this.f7414a;
        Map mapM = aoVar.m();
        if (mapM != null) {
            return mapM.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iX = aoVar.x(entry.getKey());
            if (iX != -1 && Objects.equals(aoVar.C(iX), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return this.f7414a.l();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iW;
        int iAb;
        ao aoVar = this.f7414a;
        Map mapM = aoVar.m();
        if (mapM != null) {
            return mapM.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (aoVar.s() || (iAb = fo.ab(entry.getKey(), entry.getValue(), (iW = aoVar.w()), aoVar.B(), aoVar.F(), aoVar.G(), aoVar.H())) == -1) {
            return false;
        }
        aoVar.r(iAb, iW);
        aoVar.f7430g--;
        aoVar.p();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7414a.size();
    }
}
