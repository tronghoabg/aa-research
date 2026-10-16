package com.waze.planned_drive;

import com.waze.settings.cj;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aw implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ay f33207a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33208b;

    aw(ay ayVar, int i2) {
        this.f33208b = i2;
        this.f33207a = ayVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (this.f33208b != 0) {
            if (h.g.b.x.n((String) obj, "denied")) {
                this.f33207a.O();
            }
            return h.ab.f48028a;
        }
        ay.t(this.f33207a, (cj) obj);
        return h.ab.f48028a;
    }
}
