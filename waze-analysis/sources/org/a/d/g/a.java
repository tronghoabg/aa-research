package org.a.d.g;

import e.a.dx;
import h.a.i;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.a.d.e.b;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f56400a;

    /* renamed from: b, reason: collision with root package name */
    private HashSet f56401b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f56402c;

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f56403d;

    /* renamed from: e, reason: collision with root package name */
    private final List f56404e;

    public a(byte[] bArr) {
        String string = UUID.randomUUID().toString();
        x.e(string, "toString(...)");
        this.f56400a = string;
        this.f56401b = new HashSet();
        this.f56402c = new HashMap();
        this.f56403d = new HashSet();
        this.f56404e = new ArrayList();
    }

    public final HashMap a() {
        return this.f56402c;
    }

    public final HashSet b() {
        return this.f56401b;
    }

    public final HashSet c() {
        return this.f56403d;
    }

    public final List d() {
        return this.f56404e;
    }

    public final List e(a aVar) {
        x.f(aVar, "module");
        return i.i(this, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && x.n(this.f56400a, ((a) obj).f56400a);
    }

    public final void f(b bVar) {
        x.f(bVar, "instanceFactory");
        org.a.d.c.a aVarB = bVar.b();
        g(org.a.b.c.a.b(aVarB.c(), aVarB.e(), aVarB.f()), bVar);
    }

    public final void g(String str, b bVar) {
        x.f(str, "mapping");
        x.f(bVar, "factory");
        this.f56402c.put(str, bVar);
    }

    public final void h(org.a.d.i.a aVar, l lVar) {
        x.f(aVar, "qualifier");
        x.f(lVar, "scopeSet");
        lVar.invoke(new dx(aVar, this));
        this.f56403d.add(aVar);
    }

    public final int hashCode() {
        return this.f56400a.hashCode();
    }

    public a() {
        this(null);
    }
}
