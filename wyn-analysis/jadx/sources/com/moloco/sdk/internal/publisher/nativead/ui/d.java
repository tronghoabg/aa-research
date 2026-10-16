package com.moloco.sdk.internal.publisher.nativead.ui;

import E.L;
import N.C0740o;
import Z.i;
import ef.C2515C;
import tf.p;

/* loaded from: classes4.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V.d f29253b;

    public /* synthetic */ d(V.d dVar, int i5) {
        this.f29252a = i5;
        this.f29253b = dVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29252a) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0740o.x()) {
                    c0740o.I();
                } else {
                    this.f29253b.invoke(L.a(i.f16922a), c0740o, 6);
                }
                break;
            case 1:
                C0740o c0740o2 = (C0740o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0740o2.x()) {
                    c0740o2.I();
                } else {
                    Fe.c.c(null, null, null, V.e.b(c0740o2, -964093233, new d(this.f29253b, 0)), c0740o2, 3072, 7);
                }
                break;
            default:
                C0740o c0740o3 = (C0740o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0740o3.x()) {
                    c0740o3.I();
                } else {
                    this.f29253b.invoke(c0740o3, 0);
                }
                break;
        }
        return C2515C.f34653a;
    }
}
