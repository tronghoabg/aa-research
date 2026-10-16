package com.google.d.d;

import j$.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class w extends ee implements Set {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(y yVar) {
        super(yVar);
        Objects.requireNonNull(yVar);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return fo.h(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return fo.b(this);
    }
}
