package com.google.l.b.a;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class v extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    private final y f12312a;

    v(y yVar) {
        this.f12312a = yVar;
    }

    abstract Object a();

    @Override // com.google.l.u
    public final Object b(com.google.l.d.b bVar) throws IOException {
        if (bVar.r() == 9) {
            bVar.m();
            return null;
        }
        Object objA = a();
        Map map = this.f12312a.f12324b;
        try {
            bVar.j();
            while (bVar.p()) {
                w wVar = (w) map.get(bVar.g());
                if (wVar == null) {
                    bVar.o();
                } else {
                    f(objA, bVar, wVar);
                }
            }
            bVar.l();
            return c(objA);
        } catch (IllegalAccessException e2) {
            throw com.google.l.b.b.d.b(e2);
        } catch (IllegalStateException e3) {
            throw new com.google.l.q(e3);
        }
    }

    abstract Object c(Object obj);

    @Override // com.google.l.u
    public final void d(com.google.l.d.c cVar, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        if (obj == null) {
            cVar.g();
            return;
        }
        cVar.c();
        try {
            for (w wVar : this.f12312a.f12325c) {
                if (wVar.f12316d) {
                    Method method = wVar.f12317e;
                    if (method == null) {
                        aa.b(obj, wVar.f12314b);
                    } else {
                        aa.b(obj, method);
                    }
                }
                Method method2 = wVar.f12317e;
                if (method2 != null) {
                    try {
                        objInvoke = method2.invoke(obj, null);
                    } catch (InvocationTargetException e2) {
                        throw new com.google.l.j("Accessor " + com.google.l.b.b.d.e(wVar.f12317e, false) + " threw exception", e2.getCause());
                    }
                } else {
                    objInvoke = wVar.f12314b.get(obj);
                }
                if (objInvoke != obj) {
                    cVar.f(wVar.f12313a);
                    wVar.f12318f.d(cVar, objInvoke);
                }
            }
            cVar.e();
        } catch (IllegalAccessException e3) {
            throw com.google.l.b.b.d.b(e3);
        }
    }

    abstract void f(Object obj, com.google.l.d.b bVar, w wVar);
}
