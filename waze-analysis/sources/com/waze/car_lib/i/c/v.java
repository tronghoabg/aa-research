package com.waze.car_lib.i.c;

import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class v implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f20143a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20144b;

    v(Object obj, int i2) {
        this.f20144b = i2;
        this.f20143a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        ?? r7;
        Object objD;
        int i2 = this.f20144b;
        if (i2 != 0) {
            if (i2 != 1) {
                ((ai) this.f20143a).f20084c.e((e) obj);
                return h.ab.f48028a;
            }
            ((t) this.f20143a).f20137i.e((dh) obj);
            return h.ab.f48028a;
        }
        String str = (String) obj;
        do {
            r7 = this.f20143a;
            objD = r7.d();
        } while (!r7.f(objD, u.c((u) objD, str != null ? new e(str, null) : null, null, 2)));
        return h.ab.f48028a;
    }
}
