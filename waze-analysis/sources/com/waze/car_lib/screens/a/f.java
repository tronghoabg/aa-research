package com.waze.car_lib.screens.a;

import com.waze.car_lib.f.a.j;
import com.waze.car_lib.f.a.k;
import com.waze.car_lib.r.a.p;
import h.ab;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class f extends u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21747a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(Object obj, int i2) {
        super(0, obj, com.waze.car_lib.f.a.f.class, "tollInfoClicked", "tollInfoClicked()V", 0);
        this.f21747a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f21747a;
        if (i2 == 0) {
            ((com.waze.car_lib.f.a.f) this.receiver).H(k.f19346a);
            return ab.f48028a;
        }
        if (i2 == 1) {
            ((p) this.receiver).p();
            return ab.f48028a;
        }
        if (i2 == 2) {
            ((p) this.receiver).l();
            return ab.f48028a;
        }
        if (i2 != 3) {
            ((com.waze.car_lib.f.a.f) this.receiver).H(j.f19345a);
            return ab.f48028a;
        }
        ((p) this.receiver).m();
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(Object obj, int i2, byte[] bArr) {
        super(0, obj, p.class, "onStartNavigationClicked", "onStartNavigationClicked()V", 0);
        this.f21747a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(Object obj, int i2, char[] cArr) {
        super(0, obj, p.class, "onMapZoomIn", "onMapZoomIn()V", 0);
        this.f21747a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(Object obj, int i2, int[] iArr) {
        super(0, obj, com.waze.car_lib.f.a.f.class, "navigationSettingsClicked", "navigationSettingsClicked()V", 0);
        this.f21747a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(Object obj, int i2, short[] sArr) {
        super(0, obj, p.class, "onMapZoomOut", "onMapZoomOut()V", 0);
        this.f21747a = i2;
    }
}
