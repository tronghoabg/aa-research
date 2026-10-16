package com.waze.navigate.location_preview;

import com.waze.search.v2.cu;
import com.waze.ui.m.dl;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class x implements com.waze.z.a.c.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f31767a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f31768b;

    public /* synthetic */ x(Object obj, int i2) {
        this.f31768b = i2;
        this.f31767a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        ?? r7;
        Object objD;
        int i2 = this.f31768b;
        if (i2 == 0) {
            h.g.b.x.f((com.waze.z.a.c.c) obj, "<unused var>");
            h.g.b.x.f((com.waze.z.a.c.d) obj2, "<unused var>");
            do {
                r7 = this.f31767a;
                objD = r7.d();
            } while (!r7.f(objD, dl.y((dl) objD, null, null, null, false, 16711679)));
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.g.b.x.f((com.waze.z.a.c.c) obj, "<unused var>");
            h.g.b.x.f((com.waze.z.a.c.d) obj2, "<unused var>");
            this.f31767a.invoke();
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            int i3 = cu.f36302a;
            h.g.b.x.f((com.waze.z.a.c.c) obj, "<unused var>");
            h.g.b.x.f((com.waze.z.a.c.d) obj2, "<unused var>");
            this.f31767a.invoke(new com.waze.search.v2.be(false));
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            h.g.b.x.f((com.waze.z.a.c.c) obj, "<unused var>");
            h.g.b.x.f((com.waze.z.a.c.d) obj2, "<unused var>");
            this.f31767a.invoke(new com.waze.ui.g.e(true));
            return h.ab.f48028a;
        }
        if (i2 == 4) {
            h.g.b.x.f((com.waze.z.a.c.c) obj, "<unused var>");
            h.g.b.x.f((com.waze.z.a.c.d) obj2, "<unused var>");
            this.f31767a.invoke();
            return h.ab.f48028a;
        }
        if (i2 != 5) {
            h.g.b.x.f((com.waze.z.a.c.c) obj, "<unused var>");
            h.g.b.x.f((com.waze.z.a.c.d) obj2, "<unused var>");
            this.f31767a.invoke();
            return h.ab.f48028a;
        }
        h.g.b.x.f((com.waze.z.a.c.c) obj, "<unused var>");
        h.g.b.x.f((com.waze.z.a.c.d) obj2, "<unused var>");
        this.f31767a.invoke(com.waze.ui.m.bm.f42829a);
        return h.ab.f48028a;
    }
}
