package com.waze.cg.c;

import h.g.b.x;
import okhttp3.y;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f22316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22318c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f22319d;

    public /* synthetic */ c(q qVar, p pVar, h.g.a.l lVar, int i2) {
        this.f22319d = i2;
        this.f22318c = qVar;
        this.f22317b = pVar;
        this.f22316a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f22319d;
        if (i2 == 0) {
            Object obj = this.f22318c;
            return q.b(this.f22316a, (q) this.f22317b, (String) obj);
        }
        if (i2 == 1) {
            return q.f((q) this.f22318c, (p) this.f22317b, this.f22316a);
        }
        if (i2 == 2) {
            Object obj2 = this.f22318c;
            return q.c(this.f22316a, (q) this.f22317b, (String) obj2);
        }
        int i3 = okhttp3.internal.c.m.f56033a;
        okhttp3.internal.i.c cVarC = ((okhttp3.j) this.f22318c).c();
        x.c(cVarC);
        return cVarC.a(((y) this.f22316a).b(), ((okhttp3.a) this.f22317b).j().f());
    }

    public /* synthetic */ c(h.g.a.l lVar, q qVar, String str, int i2) {
        this.f22319d = i2;
        this.f22316a = lVar;
        this.f22317b = qVar;
        this.f22318c = str;
    }

    public /* synthetic */ c(okhttp3.j jVar, y yVar, okhttp3.a aVar, int i2) {
        this.f22319d = i2;
        this.f22318c = jVar;
        this.f22316a = yVar;
        this.f22317b = aVar;
    }
}
