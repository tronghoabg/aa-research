package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ar extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27045a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f27046b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27047c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bf bfVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27047c = i2;
        this.f27046b = bfVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f27047c) {
            case 0:
                return new ar((bf) this.f27046b, eVar, 0);
            case 1:
                return new ar((bf) this.f27046b, eVar, 1, (byte[]) null);
            case 2:
                return new ar((bf) this.f27046b, eVar, 2, (char[]) null);
            case 3:
                return new ar((bf) this.f27046b, eVar, 3, (short[]) null);
            case 4:
                return new ar((bf) this.f27046b, eVar, 4, (int[]) null);
            case 5:
                return new ar((bf) this.f27046b, eVar, 5, (boolean[]) null);
            case 6:
                return new ar((bf) this.f27046b, eVar, 6, (float[]) null);
            case 7:
                return new ar((bf) this.f27046b, eVar, 7, (byte[][]) null);
            case 8:
                return new ar((bf) this.f27046b, eVar, 8, (char[][]) null);
            case 9:
                return new ar((bf) this.f27046b, eVar, 9, (short[][]) null);
            case 10:
                return new ar((bf) this.f27046b, eVar, 10, (int[][]) null);
            case 11:
                return new ar((bs) this.f27046b, eVar, 11);
            default:
                return new ar((bs) this.f27046b, eVar, 12, (byte[]) null);
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f27047c) {
        }
        return ((ar) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27047c) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.f27045a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj2 = this.f27046b;
                    this.f27045a = 1;
                    if (((bf) obj2).v().e().collect(new aq(obj2, 0), this) == aVar) {
                        return aVar;
                    }
                }
                return h.ab.f48028a;
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                if (this.f27045a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f27045a = 1;
                    if (((bf) this.f27046b).h().o(this) == aVar2) {
                        return aVar2;
                    }
                }
                return h.ab.f48028a;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                if (this.f27045a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f27045a = 1;
                    if (((bf) this.f27046b).h().o(this) == aVar3) {
                        return aVar3;
                    }
                }
                return h.ab.f48028a;
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                if (this.f27045a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f27045a = 1;
                    if (((bf) this.f27046b).h().e().m(this) == aVar4) {
                        return aVar4;
                    }
                }
                return h.ab.f48028a;
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                if (this.f27045a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f27045a = 1;
                    if (((bf) this.f27046b).h().e().o(this) == aVar5) {
                        return aVar5;
                    }
                }
                return h.ab.f48028a;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                if (this.f27045a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f27045a = 1;
                    if (((bf) this.f27046b).h().e().m(this) == aVar6) {
                        return aVar6;
                    }
                }
                return h.ab.f48028a;
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                if (this.f27045a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f27045a = 1;
                    if (((bf) this.f27046b).h().e().o(this) == aVar7) {
                        return aVar7;
                    }
                }
                return h.ab.f48028a;
            case 7:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                if (this.f27045a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f27045a = 1;
                    if (((bf) this.f27046b).h().e().m(this) == aVar8) {
                        return aVar8;
                    }
                }
                return h.ab.f48028a;
            case 8:
                h.c.a.a aVar9 = h.c.a.a.f48038a;
                if (this.f27045a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f27045a = 1;
                    if (((bf) this.f27046b).h().e().o(this) == aVar9) {
                        return aVar9;
                    }
                }
                return h.ab.f48028a;
            case 9:
                h.c.a.a aVar10 = h.c.a.a.f48038a;
                if (this.f27045a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f27045a = 1;
                    if (((bf) this.f27046b).h().e().m(this) == aVar10) {
                        return aVar10;
                    }
                }
                return h.ab.f48028a;
            case 10:
                h.c.a.a aVar11 = h.c.a.a.f48038a;
                if (this.f27045a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f27045a = 1;
                    if (((bf) this.f27046b).h().e().o(this) == aVar11) {
                        return aVar11;
                    }
                }
                return h.ab.f48028a;
            case 11:
                h.c.a.a aVar12 = h.c.a.a.f48038a;
                if (this.f27045a == 0) {
                    e.b.c.b(obj);
                    Object obj3 = this.f27046b;
                    this.f27045a = 1;
                    if (((bs) obj3).o.a().collect(new aq(obj3, 6), this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            default:
                h.c.a.a aVar13 = h.c.a.a.f48038a;
                if (this.f27045a == 0) {
                    e.b.c.b(obj);
                    Object obj4 = this.f27046b;
                    this.f27045a = 1;
                    if (((bs) obj4).f27228d.ag().collect(new aq(obj4, 7), this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bf bfVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27047c = i2;
        this.f27046b = bfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bf bfVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f27047c = i2;
        this.f27046b = bfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bf bfVar, h.c.e eVar, int i2, float[] fArr) {
        super(2, eVar);
        this.f27047c = i2;
        this.f27046b = bfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bf bfVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f27047c = i2;
        this.f27046b = bfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bf bfVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f27047c = i2;
        this.f27046b = bfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bf bfVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f27047c = i2;
        this.f27046b = bfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bf bfVar, h.c.e eVar, int i2, byte[][] bArr) {
        super(2, eVar);
        this.f27047c = i2;
        this.f27046b = bfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bf bfVar, h.c.e eVar, int i2, char[][] cArr) {
        super(2, eVar);
        this.f27047c = i2;
        this.f27046b = bfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bf bfVar, h.c.e eVar, int i2, int[][] iArr) {
        super(2, eVar);
        this.f27047c = i2;
        this.f27046b = bfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bf bfVar, h.c.e eVar, int i2, short[][] sArr) {
        super(2, eVar);
        this.f27047c = i2;
        this.f27046b = bfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bs bsVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27047c = i2;
        this.f27046b = bsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(bs bsVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27047c = i2;
        this.f27046b = bsVar;
    }
}
