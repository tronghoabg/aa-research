package com.google.d.d;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bi<E> extends bf<E> {
    public bi() {
        super(4);
    }

    @Override // com.google.d.d.bf, com.google.d.d.bg
    public final /* synthetic */ void b(Object obj) {
        super.a(obj);
    }

    public final bn f() {
        this.f7448c = true;
        return bn.l(this.f7446a, this.f7447b);
    }

    public final void g(Object obj) {
        super.a(obj);
    }

    public final void h(Object... objArr) {
        super.c(objArr);
    }

    public final void i(Iterable iterable) {
        super.d(iterable);
    }

    public final void j(Iterator it) {
        while (it.hasNext()) {
            super.a(it.next());
        }
    }
}
