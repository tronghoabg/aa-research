package com.bumptech.glide.d;

import androidx.collection.ArrayMap;
import com.bumptech.glide.g.o;
import com.bumptech.glide.load.a.at;
import com.bumptech.glide.load.a.s;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final at f2802a = new at(Object.class, Object.class, Object.class, Collections.singletonList(new s(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new com.bumptech.glide.load.c.e.f(0), null)), null);

    /* renamed from: b, reason: collision with root package name */
    private final ArrayMap f2803b = new ArrayMap();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f2804c = new AtomicReference();

    public static final boolean c(at atVar) {
        return f2802a.equals(atVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final at a(Class cls, Class cls2, Class cls3) {
        at atVar;
        o oVar = (o) this.f2804c.getAndSet(null);
        if (oVar == null) {
            oVar = new o();
        }
        oVar.a(cls, cls2, cls3);
        ArrayMap arrayMap = this.f2803b;
        synchronized (arrayMap) {
            atVar = (at) arrayMap.get(oVar);
        }
        this.f2804c.set(oVar);
        return atVar;
    }

    public final void b(Class cls, Class cls2, Class cls3, at atVar) {
        ArrayMap arrayMap = this.f2803b;
        synchronized (arrayMap) {
            o oVar = new o(cls, cls2, cls3);
            if (atVar == null) {
                atVar = f2802a;
            }
            arrayMap.put(oVar, atVar);
        }
    }
}
