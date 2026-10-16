package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ax implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f40702a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f40703b;

    ax(Object obj, int i2) {
        this.f40703b = i2;
        this.f40702a = obj;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        if (this.f40703b != 0) {
            ((ag) this.f40702a).M(((Boolean) obj).booleanValue(), false);
            return h.ab.f48028a;
        }
        ((az) this.f40702a).f40708b.add((cb) obj);
        return h.ab.f48028a;
    }
}
