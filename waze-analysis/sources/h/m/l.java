package h.m;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f48188a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f48189b;

    public l(Object obj, int i2) {
        this.f48189b = i2;
        this.f48188a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.p, java.lang.Object, java.util.Iterator] */
    @Override // h.m.h
    public final Iterator iterator() {
        int i2 = this.f48189b;
        ?? r1 = this.f48188a;
        return i2 != 0 ? k.a(r1) : r1;
    }
}
