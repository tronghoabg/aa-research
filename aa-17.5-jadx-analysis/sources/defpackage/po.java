package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class po extends pp implements Iterator {
    pm a;
    pm b;

    public po(pm pmVar, pm pmVar2) {
        this.a = pmVar2;
        this.b = pmVar;
    }

    private final pm a() {
        pm pmVar = this.b;
        pm pmVar2 = this.a;
        if (pmVar == pmVar2 || pmVar2 == null) {
            return null;
        }
        return pmVar.c;
    }

    @Override // defpackage.pp
    public final void b(pm pmVar) {
        if (this.a == pmVar && pmVar == this.b) {
            this.b = null;
            this.a = null;
        }
        pm pmVar2 = this.a;
        if (pmVar2 == pmVar) {
            this.a = pmVar2.d;
        }
        if (this.b == pmVar) {
            this.b = a();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        pm pmVar = this.b;
        this.b = a();
        return pmVar;
    }
}
