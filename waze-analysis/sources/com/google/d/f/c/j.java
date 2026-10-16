package com.google.d.f.c;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator f7815a = new e(1);

    /* renamed from: b, reason: collision with root package name */
    private static final j f7816b = new j(new h(Collections.EMPTY_LIST));

    /* renamed from: c, reason: collision with root package name */
    private final h f7817c;

    private j(h hVar) {
        this.f7817c = hVar;
    }

    public static j a() {
        return f7816b;
    }

    public final j b(j jVar) {
        return jVar.e() ? this : e() ? jVar : new j(new h(this.f7817c, jVar.f7817c));
    }

    public final Map d() {
        return this.f7817c;
    }

    public final boolean e() {
        return this.f7817c.isEmpty();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j) && ((j) obj).f7817c.equals(this.f7817c);
    }

    public final int hashCode() {
        return ~this.f7817c.hashCode();
    }

    public final String toString() {
        return this.f7817c.toString();
    }
}
