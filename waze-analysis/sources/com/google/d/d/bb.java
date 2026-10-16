package com.google.d.d;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bb extends bc {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Iterable[] f7445a;

    bb(Iterable[] iterableArr) {
        this.f7445a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new cz(new ba(this, this.f7445a));
    }
}
