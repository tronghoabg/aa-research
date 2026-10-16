package com.bumptech.glide.manager;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Set f3537a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Set f3538b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f3539c;

    public final void a() {
        Iterator it = com.bumptech.glide.g.r.g(this.f3537a).iterator();
        while (it.hasNext()) {
            f((com.bumptech.glide.e.d) it.next());
        }
        this.f3538b.clear();
    }

    public final void b() {
        this.f3539c = true;
        for (com.bumptech.glide.e.d dVar : com.bumptech.glide.g.r.g(this.f3537a)) {
            if (dVar.o()) {
                dVar.f();
                this.f3538b.add(dVar);
            }
        }
    }

    public final void c() {
        for (com.bumptech.glide.e.d dVar : com.bumptech.glide.g.r.g(this.f3537a)) {
            if (!dVar.m() && !dVar.l()) {
                dVar.c();
                if (this.f3539c) {
                    this.f3538b.add(dVar);
                } else {
                    dVar.b();
                }
            }
        }
    }

    public final void d() {
        this.f3539c = false;
        for (com.bumptech.glide.e.d dVar : com.bumptech.glide.g.r.g(this.f3537a)) {
            if (!dVar.m() && !dVar.o()) {
                dVar.b();
            }
        }
        this.f3538b.clear();
    }

    public final void e(com.bumptech.glide.e.d dVar) {
        this.f3537a.add(dVar);
        if (!this.f3539c) {
            dVar.b();
            return;
        }
        dVar.c();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f3538b.add(dVar);
    }

    public final boolean f(com.bumptech.glide.e.d dVar) {
        boolean z = true;
        if (dVar == null) {
            return true;
        }
        Set set = this.f3537a;
        Set set2 = this.f3538b;
        boolean zRemove = set.remove(dVar);
        if (!set2.remove(dVar) && !zRemove) {
            z = false;
        }
        if (z) {
            dVar.c();
        }
        return z;
    }

    public final String toString() {
        Set set = this.f3537a;
        return super.toString() + "{numRequests=" + set.size() + ", isPaused=" + this.f3539c + "}";
    }
}
