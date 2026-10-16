package com.waze.settings;

import androidx.lifecycle.FlowLiveDataConversions;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cz extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f36996a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f36997b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cz(bf bfVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36997b = i2;
        this.f36996a = bfVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f36997b;
        if (i2 == 0) {
            return new cz((dc) this.f36996a, eVar, 0);
        }
        if (i2 == 1) {
            return new cz((bf) this.f36996a, eVar, 1);
        }
        Object obj2 = this.f36996a;
        return i2 != 2 ? new cz((ds) obj2, eVar, 3, null) : new cz((ds) obj2, eVar, 2);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f36997b;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((cz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((cz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((cz) create((String) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((cz) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        be beVar;
        Object objD2;
        int i2 = this.f36997b;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            Object obj2 = this.f36996a;
            FlowLiveDataConversions.asLiveData$default(((dc) obj2).w().h(), (h.c.j) null, 0L, 3, (Object) null).observe(((android.support.v4.app.ar) obj2).getViewLifecycleOwner(), new aw(new com.waze.config.cv(obj2, 10), 3, (short[]) null));
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            kotlinx.coroutines.b.bn bnVar = ((bf) this.f36996a).f36866c;
            do {
                objD = bnVar.d();
                beVar = (be) objD;
            } while (!bnVar.f(objD, be.c(beVar, beVar.b())));
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ds dsVar = (ds) this.f36996a;
            kotlinx.coroutines.aj.z(dsVar.v, null, null, new cz(dsVar, null, 3, null), 3);
            return h.ab.f48028a;
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ds dsVar2 = (ds) this.f36996a;
        String strA = dsVar2.o.a(false);
        if (strA != null) {
            kotlinx.coroutines.b.bn bnVar2 = dsVar2.x;
            do {
                objD2 = bnVar2.d();
            } while (!bnVar2.f(objD2, bs.B((bs) objD2, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, strA, null, null, null, false, null, 132120575)));
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cz(dc dcVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36997b = i2;
        this.f36996a = dcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cz(ds dsVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f36997b = i2;
        this.f36996a = dsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cz(ds dsVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f36997b = i2;
        this.f36996a = dsVar;
    }
}
