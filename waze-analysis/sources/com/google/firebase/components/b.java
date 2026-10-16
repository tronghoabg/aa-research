package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f8926a = null;

    /* renamed from: b, reason: collision with root package name */
    private final Set f8927b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f8928c;

    /* renamed from: d, reason: collision with root package name */
    private int f8929d;

    /* renamed from: e, reason: collision with root package name */
    private int f8930e;

    /* renamed from: f, reason: collision with root package name */
    private g f8931f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f8932g;

    /* synthetic */ b(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f8927b = hashSet;
        this.f8928c = new HashSet();
        this.f8929d = 0;
        this.f8930e = 0;
        this.f8932g = new HashSet();
        hashSet.add(new ae(ad.class, cls));
        for (Class cls2 : clsArr) {
            com.google.firebase.concurrent.v.e(cls2, "Null interface");
            this.f8927b.add(new ae(ad.class, cls2));
        }
    }

    private final void h(int i2) {
        com.google.firebase.concurrent.v.c(this.f8929d == 0, "Instantiation type has already been set.");
        this.f8929d = i2;
    }

    public final c a() {
        com.google.firebase.concurrent.v.c(this.f8931f != null, "Missing required property: factory.");
        return new c(this.f8926a, new HashSet(this.f8927b), new HashSet(this.f8928c), this.f8929d, this.f8930e, this.f8931f, this.f8932g, null);
    }

    public final void b(r rVar) {
        if (this.f8927b.contains(rVar.j())) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.f8928c.add(rVar);
    }

    public final void c(g gVar) {
        this.f8931f = gVar;
    }

    public final void d(String str) {
        this.f8926a = str;
    }

    public final void f() {
        h(1);
    }

    public final void g() {
        h(2);
    }

    /* synthetic */ b(ae aeVar, ae[] aeVarArr) {
        HashSet hashSet = new HashSet();
        this.f8927b = hashSet;
        this.f8928c = new HashSet();
        this.f8929d = 0;
        this.f8930e = 0;
        this.f8932g = new HashSet();
        hashSet.add(aeVar);
        for (ae aeVar2 : aeVarArr) {
            com.google.firebase.concurrent.v.e(aeVar2, "Null interface");
        }
        Collections.addAll(this.f8927b, aeVarArr);
    }
}
