package android.support.v7.widget;

import androidx.core.util.Pools;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class gq {

    /* renamed from: a, reason: collision with root package name */
    static final Pools.Pool f1583a = new Pools.SimplePool(20);

    /* renamed from: b, reason: collision with root package name */
    int f1584b;

    /* renamed from: c, reason: collision with root package name */
    eg f1585c;

    /* renamed from: d, reason: collision with root package name */
    eg f1586d;

    private gq() {
    }

    static gq a() {
        gq gqVar = (gq) f1583a.acquire();
        return gqVar == null ? new gq() : gqVar;
    }

    static void b(gq gqVar) {
        gqVar.f1584b = 0;
        gqVar.f1585c = null;
        gqVar.f1586d = null;
        f1583a.release(gqVar);
    }
}
