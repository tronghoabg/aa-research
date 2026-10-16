package com.google.l;

import j$.util.Objects;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class t extends u {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f12466a;

    /* synthetic */ t(u uVar) {
        Objects.requireNonNull(uVar);
        this.f12466a = uVar;
    }

    @Override // com.google.l.u
    public final Object b(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() != 9) {
            return this.f12466a.b(bVar);
        }
        bVar.m();
        return null;
    }

    @Override // com.google.l.u
    public final void d(com.google.l.d.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.g();
        } else {
            this.f12466a.d(cVar, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f12466a.toString() + "]";
    }
}
