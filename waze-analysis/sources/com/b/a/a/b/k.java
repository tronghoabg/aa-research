package com.b.a.a.b;

import com.b.b.a.n;
import com.b.b.a.u;
import com.b.b.a.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    private final n f2571a;

    /* renamed from: b, reason: collision with root package name */
    private final List f2572b = new ArrayList();

    public k(n nVar) {
        u.c(nVar);
        this.f2571a = nVar;
    }

    @Override // com.b.b.a.n
    public final com.b.b.a.b a(String str, Class cls) {
        Throwable thD = d();
        if (thD == null) {
            return this.f2571a.a(str, cls);
        }
        com.b.b.a.b bVar = new com.b.b.a.b();
        bVar.e(thD);
        return bVar;
    }

    @Override // com.b.b.a.n
    public final com.b.b.a.b b(String str, Object obj, Class cls) {
        Throwable thD = d();
        if (thD == null) {
            return this.f2571a.b(str, obj, cls);
        }
        com.b.b.a.b bVar = new com.b.b.a.b();
        bVar.e(thD);
        return bVar;
    }

    @Override // com.b.b.a.n
    public final x c(String str, Class cls) {
        Throwable thD = d();
        if (thD == null) {
            return this.f2571a.c(str, cls);
        }
        x xVar = new x();
        xVar.e(thD);
        return xVar;
    }

    final Throwable d() {
        Iterator it = this.f2572b.iterator();
        while (it.hasNext()) {
            if (!((i) it.next()).a()) {
                return new com.b.a.a.a.a.g();
            }
        }
        return null;
    }

    @Override // com.b.b.a.n
    public final void e() {
        this.f2571a.e();
    }

    public final void f(i iVar) {
        this.f2572b.add(iVar);
    }
}
