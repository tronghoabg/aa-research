package com.google.d.d;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class cv extends a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterator f7515a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.d.b.ab f7516b;

    cv(Iterator it, com.google.d.b.ab abVar) {
        this.f7515a = it;
        this.f7516b = abVar;
    }

    @Override // com.google.d.d.a
    protected final Object a() {
        com.google.d.b.ab abVar;
        Object next;
        do {
            Iterator it = this.f7515a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            abVar = this.f7516b;
            next = it.next();
        } while (!abVar.apply(next));
        return next;
    }
}
