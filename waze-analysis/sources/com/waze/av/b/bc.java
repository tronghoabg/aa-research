package com.waze.av.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bc extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f15929a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ be f15930b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f15931c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(be beVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f15931c = i2;
        this.f15930b = beVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f15931c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? new bc(this.f15930b, eVar, 3, (short[]) null) : new bc(this.f15930b, eVar, 2, (char[]) null) : new bc(this.f15930b, eVar, 1, (byte[]) null) : new bc(this.f15930b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f15931c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((bc) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bc) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bc) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bc) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f15931c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f15929a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f15929a = 1;
                if (this.f15930b.f15935c.c(this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f15929a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f15929a = 1;
                if (this.f15930b.f15933a.c(this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f15929a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f15929a = 1;
                if (this.f15930b.f15934b.c(this) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        if (this.f15929a == 0) {
            e.b.c.b(obj);
            be beVar = this.f15930b;
            this.f15929a = 1;
            if (beVar.f15941i.collect(new bd(beVar), this) == aVar4) {
                return aVar4;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(be beVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f15931c = i2;
        this.f15930b = beVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(be beVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f15931c = i2;
        this.f15930b = beVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(be beVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f15931c = i2;
        this.f15930b = beVar;
    }
}
