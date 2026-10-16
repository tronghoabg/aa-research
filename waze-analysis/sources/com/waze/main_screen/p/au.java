package com.waze.main_screen.p;

import androidx.compose.runtime.SnapshotStateKt;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class au extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27057a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bf f27058b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f27059c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.m.p f27060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(bf bfVar, int i2, com.waze.main_screen.m.p pVar, h.c.e eVar) {
        super(2, eVar);
        this.f27058b = bfVar;
        this.f27059c = i2;
        this.f27060d = pVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new au(this.f27058b, this.f27059c, this.f27060d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((au) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f27057a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            bf bfVar = this.f27058b;
            this.f27057a = 1;
            if (kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.r(SnapshotStateKt.snapshotFlow(new com.waze.car_lib.a.a(bfVar, 3)), SnapshotStateKt.snapshotFlow(new com.waze.car_lib.a.a(bfVar, 4)), SnapshotStateKt.snapshotFlow(new com.waze.car_lib.a.a(bfVar, 5)), new at(this.f27059c, null))).collect(new aq(this.f27060d, 3), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
