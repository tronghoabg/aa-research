package com.bumptech.glide.load.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final f f3474a = new h();

    /* renamed from: b, reason: collision with root package name */
    private final Map f3475b = new HashMap();

    public final synchronized g a(Object obj) {
        f fVar;
        com.bumptech.glide.g.p.f(obj);
        Map map = this.f3475b;
        fVar = (f) map.get(obj.getClass());
        if (fVar == null) {
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f fVar2 = (f) it.next();
                if (fVar2.b().isAssignableFrom(obj.getClass())) {
                    fVar = fVar2;
                    break;
                }
            }
        }
        if (fVar == null) {
            fVar = f3474a;
        }
        return fVar.a(obj);
    }

    public final synchronized void b(f fVar) {
        this.f3475b.put(fVar.b(), fVar);
    }
}
