package com.waze.aa;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;
import h.l;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final h.l.c f13664a;

    /* renamed from: b, reason: collision with root package name */
    private Object f13665b;

    public d(h.l.c cVar) {
        x.f(cVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f13664a = cVar;
    }

    public final Object a() {
        Object objA;
        Object obj = this.f13665b;
        if (obj == null) {
            try {
                d dVar = this;
                org.a.d.a aVarB = org.a.d.b.a.b();
                objA = aVarB != null ? aVarB.f(this.f13664a, null) : null;
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
            obj = true != (objA instanceof l) ? objA : null;
            this.f13665b = obj;
        }
        return obj;
    }
}
