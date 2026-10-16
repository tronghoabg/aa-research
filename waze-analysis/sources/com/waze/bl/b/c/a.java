package com.waze.bl.b.c;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16919a;

    public a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f16919a = h.e.b.h(new kotlinx.coroutines.e.ab(8, false));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.f, java.lang.Object] */
    public final long a() {
        Object value = this.f16919a.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Number) value).longValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void b(com.waze.shared_infra.f.b bVar) {
        h.g.b.x.f(bVar, "receiver");
        this.f16919a.add(bVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Set] */
    public final void c(com.waze.shared_infra.f.b bVar) {
        h.g.b.x.f(bVar, "receiver");
        this.f16919a.remove(bVar);
    }

    public final boolean d(com.waze.shared_infra.f.a aVar) {
        h.g.b.x.f(aVar, "deeplink");
        Iterator it = h.a.i.ai((Iterable) this.f16919a).iterator();
        while (it.hasNext()) {
            if (((com.waze.shared_infra.f.b) it.next()).a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int e() {
        return ((kotlinx.coroutines.e.ab) ((kotlinx.a.d) this.f16919a).b()).b();
    }

    public final Object f() {
        while (true) {
            kotlinx.a.d dVar = (kotlinx.a.d) this.f16919a;
            kotlinx.coroutines.e.ab abVar = (kotlinx.coroutines.e.ab) dVar.b();
            Object objC = abVar.c();
            if (objC != kotlinx.coroutines.e.ab.f51853a) {
                return objC;
            }
            dVar.e(abVar, abVar.d());
        }
    }

    public final void g() {
        while (true) {
            kotlinx.a.d dVar = (kotlinx.a.d) this.f16919a;
            kotlinx.coroutines.e.ab abVar = (kotlinx.coroutines.e.ab) dVar.b();
            if (abVar.e()) {
                return;
            } else {
                dVar.e(abVar, abVar.d());
            }
        }
    }

    public final boolean h(Object obj) {
        while (true) {
            kotlinx.a.d dVar = (kotlinx.a.d) this.f16919a;
            kotlinx.coroutines.e.ab abVar = (kotlinx.coroutines.e.ab) dVar.b();
            int iA = abVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return false;
            }
            dVar.e(abVar, abVar.d());
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final Object i(kotlinx.b.a.q qVar, kotlinx.coroutines.d.d dVar) {
        h.g.b.x.f(qVar, "descriptor");
        h.g.b.x.f(dVar, "key");
        Map map = (Map) this.f16919a.get(qVar);
        Object obj = map != null ? map.get(dVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final Object j(kotlinx.b.a.q qVar, kotlinx.coroutines.d.d dVar, h.g.a.a aVar) {
        h.g.b.x.f(qVar, "descriptor");
        h.g.b.x.f(dVar, "key");
        h.g.b.x.f(aVar, "defaultValue");
        Object objI = i(qVar, dVar);
        if (objI != null) {
            return objI;
        }
        Object objInvoke = aVar.invoke();
        h.g.b.x.f(qVar, "descriptor");
        h.g.b.x.f(dVar, "key");
        h.g.b.x.f(objInvoke, "value");
        ?? r3 = this.f16919a;
        Object objG = r3.get(qVar);
        if (objG == null) {
            objG = kotlinx.coroutines.a.ab.g(2);
            r3.put(qVar, objG);
        }
        ((Map) objG).put(dVar, objInvoke);
        return objInvoke;
    }

    public a(byte[] bArr) {
        this.f16919a = new LinkedHashSet();
    }

    public a() {
        this.f16919a = h.g.a(new com.waze.native_managers.n(19));
    }

    public a(byte[] bArr, byte[] bArr2) {
        this(null, null, null);
    }

    public a(char[] cArr) {
        this.f16919a = kotlinx.coroutines.a.ab.g(16);
    }
}
