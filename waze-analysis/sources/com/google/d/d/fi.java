package com.google.d.d;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class fi extends ae implements Set {
    fi(Set set, com.google.d.b.ab abVar) {
        super(set, abVar);
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
