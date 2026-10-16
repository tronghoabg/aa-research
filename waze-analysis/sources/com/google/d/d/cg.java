package com.google.d.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class cg extends bf {
    public cg() {
        super(4);
    }

    public final ci f() {
        int i2 = this.f7447b;
        if (i2 == 0) {
            return fb.f7608a;
        }
        if (i2 == 1) {
            return new fm(Objects.requireNonNull(this.f7446a[0]));
        }
        ci ciVarA = ci.a(i2, this.f7446a);
        this.f7447b = ciVarA.size();
        this.f7448c = true;
        return ciVarA;
    }

    public final void g(Object... objArr) {
        super.c(objArr);
    }

    public final void h(Iterable iterable) {
        com.google.d.b.an.B(iterable);
        super.d(iterable);
    }

    @Override // com.google.d.d.bf, com.google.d.d.bg
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void b(Object obj) {
        com.google.d.b.an.B(obj);
        super.a(obj);
    }
}
