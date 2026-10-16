package com.waze.an.c;

import androidx.compose.runtime.SnapshotStateKt;
import com.waze.ui.l.cg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f14788a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.main_screen.k.a.u f14789b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f14790c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f14791d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(com.waze.main_screen.k.a.u uVar, kotlinx.coroutines.a.o oVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f14791d = i2;
        this.f14789b = uVar;
        this.f14790c = oVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.a.o] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f14791d == 0) {
            return new n(this.f14789b, (kotlinx.coroutines.a.o) this.f14790c, eVar, 0);
        }
        return new n((cg) this.f14790c, this.f14789b, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f14791d != 0 ? ((n) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((n) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f14791d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f14788a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f14788a = 1;
                if (kotlinx.coroutines.b.ai.y(SnapshotStateKt.snapshotFlow(new com.waze.beacons.m(this.f14790c, 13))).collect(new m(this.f14789b, 1), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f14788a == 0) {
            e.b.c.b(obj);
            com.waze.main_screen.k.a.u uVar = this.f14789b;
            Object obj2 = this.f14790c;
            this.f14788a = 1;
            if (uVar.h().collect(new m(obj2, 0), this) == aVar2) {
                return aVar2;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(cg cgVar, com.waze.main_screen.k.a.u uVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f14791d = i2;
        this.f14790c = cgVar;
        this.f14789b = uVar;
    }
}
