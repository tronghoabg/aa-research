package com.waze.reports;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class r implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f33962a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33963b;

    r(h.g.a.l lVar, int i2) {
        this.f33963b = i2;
        this.f33962a = lVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (this.f33963b == 0) {
            this.f33962a.invoke((String) obj);
            return h.ab.f48028a;
        }
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        this.f33962a.invoke(bool);
        return h.ab.f48028a;
    }
}
