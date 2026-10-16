package com.waze.planned_drive;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bs {

    /* renamed from: a, reason: collision with root package name */
    private final List f33274a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f33275b;

    public bs(List list, Object obj) {
        h.g.b.x.f(list, "list");
        this.f33274a = list;
        this.f33275b = obj;
    }

    public static final bs g(List list, Object obj) {
        h.g.b.x.f(list, "list");
        return new bs(list, obj);
    }

    public final int a() {
        return this.f33274a.indexOf(d());
    }

    public final bs b(List list) {
        h.g.b.x.f(list, "newList");
        Object obj = this.f33275b;
        if (obj == null || !list.contains(obj)) {
            obj = null;
        }
        return g(list, obj);
    }

    public final bs c(Object obj) {
        if (obj == null || !this.f33274a.contains(obj)) {
            obj = null;
        }
        return g(this.f33274a, obj);
    }

    public final Object d() {
        Object obj = this.f33275b;
        h.g.b.x.c(obj);
        return obj;
    }

    public final Object e() {
        return this.f33275b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs)) {
            return false;
        }
        bs bsVar = (bs) obj;
        return h.g.b.x.n(this.f33274a, bsVar.f33274a) && h.g.b.x.n(this.f33275b, bsVar.f33275b);
    }

    public final List f() {
        return this.f33274a;
    }

    public final int hashCode() {
        int iHashCode = this.f33274a.hashCode() * 31;
        Object obj = this.f33275b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ListWithSelected(list=" + this.f33274a + ", selected=" + this.f33275b + ")";
    }

    public bs() {
        this(null);
    }

    public /* synthetic */ bs(byte[] bArr) {
        this(h.a.i.h(), null);
    }
}
