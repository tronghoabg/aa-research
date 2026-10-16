package org.a.b.c.b;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import h.a.i;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.l.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class b extends org.a.d.h.a {

    /* renamed from: a, reason: collision with root package name */
    private final CreationExtras f56366a;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(h.g.a.a aVar, CreationExtras creationExtras) {
        org.a.d.h.a aVar2;
        List listE;
        x.f(creationExtras, "extras");
        super((aVar == null || (aVar2 = (org.a.d.h.a) aVar.invoke()) == null || (listE = aVar2.e()) == null) ? new ArrayList() : i.aq(listE), 2);
        this.f56366a = creationExtras;
    }

    static final Object b(b bVar, c cVar) {
        return super.a(cVar);
    }

    static final Object d(b bVar, c cVar) {
        return super.c(cVar);
    }

    private final Object g(c cVar, h.g.a.a aVar) {
        int i2 = ar.f48106a;
        return x.n(cVar, new m(SavedStateHandle.class)) ? SavedStateHandleSupport.createSavedStateHandle(this.f56366a) : aVar.invoke();
    }

    @Override // org.a.d.h.a
    public final Object a(c cVar) {
        x.f(cVar, "clazz");
        return g(cVar, new a(this, cVar, 1));
    }

    @Override // org.a.d.h.a
    public final Object c(c cVar) {
        x.f(cVar, "clazz");
        return g(cVar, new a(this, cVar, 0));
    }
}
