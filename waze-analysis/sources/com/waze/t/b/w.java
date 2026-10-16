package com.waze.t.b;

import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class w extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40822a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f40823b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f40824c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ag agVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40824c = i2;
        this.f40823b = agVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f40824c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? new w(this.f40823b, eVar, 4, (int[]) null) : new w(this.f40823b, eVar, 3, (short[]) null) : new w(this.f40823b, eVar, 2, (char[]) null) : new w(this.f40823b, eVar, 1, (byte[]) null) : new w(this.f40823b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f40824c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? ((w) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((w) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((w) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((w) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((w) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f40824c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f40822a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ag agVar = this.f40823b;
                agVar.P(ag.W(agVar.b()), true);
                this.f40822a = 1;
                if (h.g.b.o.b(agVar.t, this) == aVar) {
                    return aVar;
                }
            }
            ag agVar2 = this.f40823b;
            agVar2.t = h.g.b.o.i();
            agVar2.R();
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            Object obj2 = h.c.a.a.f48038a;
            if (this.f40822a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ag agVar3 = this.f40823b;
                az azVar = agVar3.A;
                ch chVarB = agVar3.b();
                this.f40822a = 1;
                Object objD = kotlinx.coroutines.aj.d(new at(azVar, chVarB, null), this);
                if (objD != obj2) {
                    objD = h.ab.f48028a;
                }
                if (objD == obj2) {
                    return obj2;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f40822a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f40822a = 1;
                if (ag.l(this.f40823b, com.waze.h.a.i.f24315a, this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 3) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f40822a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f40822a = 1;
                if (ag.m(this.f40823b, this) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        if (this.f40822a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f40822a = 1;
            if (ag.l(this.f40823b, com.waze.h.a.i.f24316b, this) == aVar4) {
                return aVar4;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ag agVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f40824c = i2;
        this.f40823b = agVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ag agVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f40824c = i2;
        this.f40823b = agVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ag agVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f40824c = i2;
        this.f40823b = agVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(ag agVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f40824c = i2;
        this.f40823b = agVar;
    }
}
