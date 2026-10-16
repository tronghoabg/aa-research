package com.google.v;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class fx implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fz f12987a;

    /* renamed from: b, reason: collision with root package name */
    private int f12988b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f12989c;

    /* synthetic */ fx(fz fzVar) {
        Objects.requireNonNull(fzVar);
        this.f12987a = fzVar;
        this.f12988b = -1;
    }

    private final Iterator a() {
        Iterator it = this.f12989c;
        if (it != null) {
            return it;
        }
        Iterator it2 = this.f12987a.f12993c.entrySet().iterator();
        this.f12989c = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f12988b + 1;
        fz fzVar = this.f12987a;
        if (i2 >= fzVar.f12992b) {
            return !fzVar.f12993c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i2 = this.f12988b + 1;
        this.f12988b = i2;
        fz fzVar = this.f12987a;
        return i2 < fzVar.f12992b ? (fw) fzVar.f12991a[i2] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        fz fzVar = this.f12987a;
        fzVar.o();
        int i2 = this.f12988b;
        if (i2 >= fzVar.f12992b) {
            a().remove();
        } else {
            this.f12988b = i2 - 1;
            fzVar.m(i2);
        }
    }
}
