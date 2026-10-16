package com.waze.car_lib.screens.b;

import androidx.lifecycle.LifecycleOwnerKt;
import h.ab;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.waze.car_lib.screens.core.n f21834a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f21835b;

    public /* synthetic */ e(com.waze.car_lib.screens.core.n nVar, int i2) {
        this.f21835b = i2;
        this.f21834a = nVar;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f21835b) {
            case 0:
                com.waze.car_lib.screens.core.n nVar = this.f21834a;
                aj.z(LifecycleOwnerKt.getLifecycleScope(nVar), null, null, new h((j) nVar, (h.c.e) null, 0), 3);
                break;
            case 1:
                break;
            case 2:
                j jVar = (j) this.f21834a;
                jVar.n().a(new f((Object) jVar.f21842b, 2, (char[]) null));
                break;
            case 3:
                j jVar2 = (j) this.f21834a;
                jVar2.n().a(new f((Object) jVar2.f21842b, 3, (short[]) null));
                break;
            case 4:
                com.waze.car_lib.screens.core.n nVar2 = this.f21834a;
                aj.z(LifecycleOwnerKt.getLifecycleScope(nVar2), null, null, new m((j) nVar2, (h.c.e) null, 1), 3);
                break;
            case 5:
                break;
            case 6:
                com.waze.car_lib.screens.core.n nVar3 = this.f21834a;
                aj.z(LifecycleOwnerKt.getLifecycleScope(nVar3), null, null, new h((o) nVar3, (h.c.e) null, 3, (byte[]) null), 3);
                break;
            case 7:
                o oVar = (o) this.f21834a;
                oVar.n().a(new f(oVar.f21852b, 6, (float[]) null));
                break;
            case 8:
                o oVar2 = (o) this.f21834a;
                oVar2.n().a(new f(oVar2.f21852b, 7, (byte[][]) null));
                break;
            default:
                com.waze.car_lib.screens.core.n nVar4 = this.f21834a;
                aj.z(LifecycleOwnerKt.getLifecycleScope(nVar4), null, null, new m((o) nVar4, (h.c.e) null, 0), 3);
                break;
        }
        return ab.f48028a;
    }
}
