package com.google.d.d;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ce implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final cf f7488a;

    ce(cf cfVar) {
        this.f7488a = cfVar;
    }

    Object readResolve() {
        return this.f7488a.c();
    }
}
