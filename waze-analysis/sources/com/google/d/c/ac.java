package com.google.d.c;

import j$.util.Objects;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class ac implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    int f7259a;

    /* renamed from: b, reason: collision with root package name */
    int f7260b;

    /* renamed from: c, reason: collision with root package name */
    aj f7261c;

    /* renamed from: d, reason: collision with root package name */
    AtomicReferenceArray f7262d;

    /* renamed from: e, reason: collision with root package name */
    be f7263e;

    /* renamed from: f, reason: collision with root package name */
    bc f7264f;

    /* renamed from: g, reason: collision with root package name */
    bc f7265g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ bd f7266h;

    ac(bd bdVar) {
        Objects.requireNonNull(bdVar);
        this.f7266h = bdVar;
        this.f7259a = bdVar.f7349f.length - 1;
        this.f7260b = -1;
        b();
    }

    final bc a() {
        bc bcVar = this.f7264f;
        if (bcVar == null) {
            throw new NoSuchElementException();
        }
        this.f7265g = bcVar;
        b();
        return this.f7265g;
    }

    final void b() {
        this.f7264f = null;
        if (d() || e()) {
            return;
        }
        while (true) {
            int i2 = this.f7259a;
            if (i2 < 0) {
                return;
            }
            bd bdVar = this.f7266h;
            this.f7259a = i2 - 1;
            aj ajVar = bdVar.f7349f[i2];
            this.f7261c = ajVar;
            if (ajVar.f7287b != 0) {
                this.f7262d = this.f7261c.f7291f;
                this.f7260b = r0.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    final boolean c(be beVar) {
        Object obj;
        boolean z;
        try {
            bd bdVar = this.f7266h;
            long j2 = bdVar.r.read();
            Object objJ = beVar.j();
            Object obj2 = null;
            if (beVar.j() != null && (obj = beVar.d().get()) != null && !bdVar.k(beVar, j2)) {
                obj2 = obj;
            }
            if (obj2 != null) {
                this.f7264f = new bc(bdVar, objJ, obj2);
                z = true;
            } else {
                z = false;
            }
            return z;
        } finally {
            this.f7261c.n();
        }
    }

    final boolean d() {
        be beVar = this.f7263e;
        if (beVar == null) {
            return false;
        }
        while (true) {
            this.f7263e = beVar.e();
            be beVar2 = this.f7263e;
            if (beVar2 == null) {
                return false;
            }
            if (c(beVar2)) {
                return true;
            }
            beVar = this.f7263e;
        }
    }

    final boolean e() {
        while (true) {
            int i2 = this.f7260b;
            if (i2 < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.f7262d;
            this.f7260b = i2 - 1;
            be beVar = (be) atomicReferenceArray.get(i2);
            this.f7263e = beVar;
            if (beVar != null && (c(beVar) || d())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7264f != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.d.b.an.u(this.f7265g != null);
        this.f7266h.remove(this.f7265g.f7341a);
        this.f7265g = null;
    }
}
