package com.waze.car_lib;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class bq implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.l f19210a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19211b;

    public /* synthetic */ bq(h.g.a.l lVar, int i2) {
        this.f19211b = i2;
        this.f19210a = lVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        int i2 = this.f19211b;
        return i2 != 0 ? i2 != 1 ? Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate) : Predicate$CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        int i2 = this.f19211b;
        return i2 != 0 ? i2 != 1 ? Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this) : Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        int i2 = this.f19211b;
        return i2 != 0 ? i2 != 1 ? Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate) : Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i2 = this.f19211b;
        if (i2 == 0) {
            return ((Boolean) this.f19210a.invoke(obj)).booleanValue();
        }
        if (i2 != 1) {
            int i3 = com.waze.t.b.ag.f40668a;
            return ((Boolean) this.f19210a.invoke(obj)).booleanValue();
        }
        com.waze.app_nav.a.ay ayVar = com.waze.app_nav.a.ay.f15122a;
        return ((Boolean) this.f19210a.invoke(obj)).booleanValue();
    }
}
