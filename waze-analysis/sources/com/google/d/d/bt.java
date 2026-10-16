package com.google.d.d;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bt implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final bs f7470a;

    bt(bs bsVar) {
        this.f7470a = bsVar;
    }

    Object readResolve() {
        return this.f7470a.entrySet();
    }
}
