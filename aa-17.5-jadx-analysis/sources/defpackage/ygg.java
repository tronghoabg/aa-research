package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class ygg extends yfg {
    public final yfy a;

    public ygg(yfy yfyVar) {
        this.a = yfyVar;
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return obj != null && yrm.ae(new ygd(this), obj);
    }

    @Override // defpackage.yfg
    public final yfq d() {
        return new yge(this.a.entrySet().d());
    }

    @Override // defpackage.yfg
    /* renamed from: e */
    public final yno iterator() {
        return new ygd(this);
    }

    @Override // defpackage.yfg
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new ygd(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.yfg
    public Object writeReplace() {
        return new ygf(this.a);
    }
}
