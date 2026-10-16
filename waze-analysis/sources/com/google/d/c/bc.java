package com.google.d.c;

import j$.util.Objects;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bc implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    final Object f7341a;

    /* renamed from: b, reason: collision with root package name */
    Object f7342b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bd f7343c;

    bc(bd bdVar, Object obj, Object obj2) {
        Objects.requireNonNull(bdVar);
        this.f7343c = bdVar;
        this.f7341a = obj;
        this.f7342b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.f7341a.equals(entry.getKey()) && this.f7342b.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7341a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7342b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f7342b.hashCode() ^ this.f7341a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object objPut = this.f7343c.put(this.f7341a, obj);
        this.f7342b = obj;
        return objPut;
    }

    public final String toString() {
        return String.valueOf(this.f7341a) + "=" + String.valueOf(this.f7342b);
    }
}
