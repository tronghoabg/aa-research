package com.google.d.b;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class af implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CharSequence f7202a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f7203b;

    af(ag agVar, CharSequence charSequence) {
        this.f7202a = charSequence;
        Objects.requireNonNull(agVar);
        this.f7203b = agVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this.f7203b.i(this.f7202a);
    }

    public final String toString() {
        w wVarB = w.b(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        wVarB.h(sb, this);
        sb.append(']');
        return sb.toString();
    }
}
