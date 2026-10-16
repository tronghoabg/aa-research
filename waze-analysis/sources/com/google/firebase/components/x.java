package com.google.firebase.components;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class x implements com.google.firebase.g.c {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set f8980b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set f8979a = Collections.newSetFromMap(new ConcurrentHashMap());

    x(Collection collection) {
        this.f8979a.addAll(collection);
    }

    static x b(Collection collection) {
        return new x((Set) collection);
    }

    private final synchronized void d() {
        Iterator it = this.f8979a.iterator();
        while (it.hasNext()) {
            this.f8980b.add(((com.google.firebase.g.c) it.next()).a());
        }
        this.f8979a = null;
    }

    @Override // com.google.firebase.g.c
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.f8980b == null) {
            synchronized (this) {
                if (this.f8980b == null) {
                    this.f8980b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.f8980b);
    }

    final synchronized void c(com.google.firebase.g.c cVar) {
        if (this.f8980b == null) {
            this.f8979a.add(cVar);
        } else {
            this.f8980b.add(cVar.a());
        }
    }
}
