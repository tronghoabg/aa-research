package com.google.d.d;

import j$.util.Objects;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class fg extends a {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f7619a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Set f7620b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Set f7621c;

    fg(fh fhVar, Set set, Set set2) {
        this.f7620b = set;
        this.f7621c = set2;
        Objects.requireNonNull(fhVar);
        this.f7619a = set.iterator();
    }

    @Override // com.google.d.d.a
    protected final Object a() {
        Set set;
        Object next;
        do {
            Iterator it = this.f7619a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            set = this.f7621c;
            next = it.next();
        } while (!set.contains(next));
        return next;
    }
}
