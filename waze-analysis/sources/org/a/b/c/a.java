package org.a.b.c;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import org.a.d.k.b;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class a<T> {
    public static final ViewModel a(c cVar, ViewModelStore viewModelStore, CreationExtras creationExtras, b bVar, h.g.a.a aVar) {
        x.f(cVar, "vmClass");
        x.f(viewModelStore, "viewModelStore");
        x.f(creationExtras, "extras");
        x.f(bVar, "scope");
        return new ViewModelProvider(viewModelStore, new org.a.b.c.a.a(cVar, bVar, aVar), creationExtras).get(o.w(cVar));
    }

    public static final String b(c cVar, org.a.d.i.a aVar, org.a.d.i.a aVar2) {
        String strA;
        x.f(cVar, "clazz");
        x.f(aVar2, "scopeQualifier");
        if (aVar == null || (strA = aVar.a()) == null) {
            strA = "";
        }
        return org.a.e.a.a(cVar) + ":" + strA + ":" + aVar2;
    }

    public static final String c(Object obj) {
        x.f(obj, "<this>");
        int i2 = ar.f48106a;
        return org.a.e.a.a(new m(obj.getClass())) + "@" + obj.hashCode();
    }

    public static final org.a.d.i.c d(Object obj) {
        x.f(obj, "<this>");
        int i2 = ar.f48106a;
        return new org.a.d.i.c(new m(obj.getClass()));
    }
}
