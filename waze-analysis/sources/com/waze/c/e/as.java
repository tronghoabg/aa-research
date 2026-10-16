package com.waze.c.e;

import com.waze.navigate.ei;
import com.waze.navigate.ek;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class as extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18547a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18548b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18548b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f18548b;
        if (i2 == 0) {
            as asVar = new as(eVar, 0);
            asVar.f18547a = obj;
            return asVar;
        }
        if (i2 == 1) {
            as asVar2 = new as(eVar, 1, (byte[]) null);
            asVar2.f18547a = obj;
            return asVar2;
        }
        if (i2 != 2) {
            as asVar3 = new as(eVar, 3, (short[]) null);
            asVar3.f18547a = obj;
            return asVar3;
        }
        as asVar4 = new as(eVar, 2, (char[]) null);
        asVar4.f18547a = obj;
        return asVar4;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f18548b;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((as) create((g) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((as) create((g) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((as) create((ek) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((as) create((com.waze.c.d.t) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f18548b;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(((com.waze.c.d.t) this.f18547a).d() == ei.f31310a);
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            return Boolean.valueOf(((ek) this.f18547a) != null);
        }
        if (i2 != 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            g gVar = (g) this.f18547a;
            return Boolean.valueOf(gVar.b().f() && !h.g.b.x.n(gVar.a(), d.f18660a));
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        g gVar2 = (g) this.f18547a;
        return Boolean.valueOf(gVar2.b().f() && h.g.b.x.n(gVar2.a(), d.f18660a));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f18548b = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f18548b = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    as(h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f18548b = i2;
    }
}
