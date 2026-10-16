package com.waze.car_lib.i.a;

import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private int f19850a;

    /* renamed from: b, reason: collision with root package name */
    private final bn f19851b = ck.b(false);

    public static final /* synthetic */ void c(ac acVar) {
        int i2 = acVar.f19850a - 1;
        acVar.f19850a = i2;
        if (i2 == 0) {
            acVar.f19851b.e(false);
        }
    }

    public static final /* synthetic */ void d(ac acVar) {
        if (acVar.f19850a == 0) {
            acVar.f19851b.e(true);
        }
        acVar.f19850a++;
    }

    public final aa a() {
        return new aa(new ab(this, 1, null), new ab(this, 0));
    }

    public final ch b() {
        return this.f19851b;
    }
}
