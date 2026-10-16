package com.google.l.b.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ac implements com.google.l.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f12231a;

    /* synthetic */ ac(ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.f12231a = aeVar;
    }

    @Override // com.google.l.o
    public final com.google.l.i a(Object obj) {
        if (obj == null) {
            return com.google.l.k.f12459a;
        }
        ae aeVar = this.f12231a;
        n nVar = new n();
        aeVar.f12236a.i(obj, obj.getClass(), nVar);
        return nVar.a();
    }
}
