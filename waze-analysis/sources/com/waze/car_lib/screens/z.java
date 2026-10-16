package com.waze.car_lib.screens;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f22045a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.screens.core.n f22046b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(ac acVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f22047c = i2;
        this.f22046b = acVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f22047c;
        if (i2 == 0) {
            return new z((ac) this.f22046b, eVar, 0);
        }
        if (i2 == 1) {
            return new z((ac) this.f22046b, eVar, 1, (byte[]) null);
        }
        if (i2 == 2) {
            return new z((cy) this.f22046b, eVar, 2);
        }
        com.waze.car_lib.screens.core.n nVar = this.f22046b;
        return i2 != 3 ? new z((cy) nVar, eVar, 4, (char[]) null) : new z((cy) nVar, eVar, 3, (byte[]) null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f22047c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f22047c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f22045a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                com.waze.car_lib.screens.core.n nVar = this.f22046b;
                Lifecycle lifecycle = nVar.getLifecycle();
                h.g.b.x.e(lifecycle, "<get-lifecycle>(...)");
                this.f22045a = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, Lifecycle.State.STARTED, new z((ac) nVar, (h.c.e) null, 1, (byte[]) null), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f22045a == 0) {
                e.b.c.b(obj);
                com.waze.car_lib.screens.core.n nVar2 = this.f22046b;
                this.f22045a = 1;
                if (((ac) nVar2).f21754a.c().collect(new y(nVar2, 0), this) == aVar2) {
                    return aVar2;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f22045a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                com.waze.car_lib.screens.core.n nVar3 = this.f22046b;
                kotlinx.coroutines.b.k kVarAsFlow = FlowLiveDataConversions.asFlow(((cy) nVar3).f21989b.a(LifecycleOwnerKt.getLifecycleScope(nVar3)));
                Lifecycle lifecycle2 = nVar3.getLifecycle();
                h.g.b.x.e(lifecycle2, "<get-lifecycle>(...)");
                this.f22045a = 1;
                if (FlowExtKt.flowWithLifecycle(kVarAsFlow, lifecycle2, Lifecycle.State.STARTED).collect(new y(nVar3, 3), this) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f22045a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f22045a = 1;
                if (((cy) this.f22046b).f21989b.d(this) == aVar4) {
                    return aVar4;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar5 = h.c.a.a.f48038a;
        if (this.f22045a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f22045a = 1;
            if (((cy) this.f22046b).f21989b.e(this) == aVar5) {
                return aVar5;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(ac acVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f22047c = i2;
        this.f22046b = acVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(cy cyVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f22047c = i2;
        this.f22046b = cyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(cy cyVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f22047c = i2;
        this.f22046b = cyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(cy cyVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f22047c = i2;
        this.f22046b = cyVar;
    }
}
