package com.google.v;

import j$.util.Objects;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class fw implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fz f12984a;

    /* renamed from: b, reason: collision with root package name */
    private final dg f12985b;

    /* renamed from: c, reason: collision with root package name */
    private Object f12986c;

    fw(fz fzVar, dg dgVar, Object obj) {
        Objects.requireNonNull(fzVar);
        this.f12984a = fzVar;
        this.f12985b = dgVar;
        this.f12986c = obj;
    }

    private static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final dg a() {
        return this.f12985b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f12985b.compareTo(((fw) obj).f12985b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return b(this.f12985b, entry.getKey()) && b(this.f12986c, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f12985b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12986c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        dg dgVar = this.f12985b;
        int iHashCode = dgVar == null ? 0 : dgVar.hashCode();
        Object obj = this.f12986c;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f12984a.o();
        Object obj2 = this.f12986c;
        this.f12986c = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f12985b) + "=" + String.valueOf(this.f12986c);
    }
}
