package com.google.d.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
abstract class cs extends ci {
    cs() {
    }

    abstract Object a(int i2);

    @Override // com.google.d.d.bh
    final int d(Object[] objArr, int i2) {
        return g().d(objArr, i2);
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: h */
    public final fu listIterator() {
        return g().iterator();
    }

    @Override // com.google.d.d.ci
    final bn k() {
        return new cr(this);
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
