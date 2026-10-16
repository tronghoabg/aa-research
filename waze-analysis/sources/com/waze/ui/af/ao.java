package com.waze.ui.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ao implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f41849a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f41850b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f41851c;

    ao(h.g.a.l lVar, q qVar, int i2) {
        this.f41851c = i2;
        this.f41849a = lVar;
        this.f41850b = qVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        if (this.f41851c == 0) {
            this.f41849a.invoke(this.f41850b);
            return h.ab.f48028a;
        }
        this.f41849a.invoke(new l((y) this.f41850b));
        return h.ab.f48028a;
    }
}
