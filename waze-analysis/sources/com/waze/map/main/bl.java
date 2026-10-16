package com.waze.map.main;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bl extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f29386a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f29387b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f29388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bm bmVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29388c = i2;
        this.f29387b = bmVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f29388c) {
            case 0:
                return new bl((bm) this.f29387b, eVar, 0);
            case 1:
                return new bl((p) this.f29387b, eVar, 1);
            case 2:
                return new bl((bm) this.f29387b, eVar, 2, (byte[]) null);
            case 3:
                return new bl((bm) this.f29387b, eVar, 3, (char[]) null);
            case 4:
                return new bl((bm) this.f29387b, eVar, 4, (short[]) null);
            case 5:
                return new bl((bm) this.f29387b, eVar, 5, (int[]) null);
            case 6:
                return new bl((bm) this.f29387b, eVar, 6, (boolean[]) null);
            case 7:
                return new bl((bm) this.f29387b, eVar, 7, (float[]) null);
            case 8:
                return new bl((bm) this.f29387b, eVar, 8, (byte[][]) null);
            default:
                return new bl((bm) this.f29387b, eVar, 9, (char[][]) null);
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f29388c) {
        }
        return ((bl) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29388c) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.f29386a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj2 = this.f29387b;
                    this.f29386a = 1;
                    if (((bm) obj2).f29392d.observeOnPopupClosed().collect(new l(obj2, 16), this) == aVar) {
                        return aVar;
                    }
                }
                return h.ab.f48028a;
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                if (this.f29386a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj3 = this.f29387b;
                    this.f29386a = 1;
                    if (p.b((p) obj3).getAdIdsToShow().collect(new l(obj3, 2), this) == aVar2) {
                        return aVar2;
                    }
                }
                return h.ab.f48028a;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                if (this.f29386a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj4 = this.f29387b;
                    this.f29386a = 1;
                    if (((bm) obj4).f29393e.observeOnPopupClosed().collect(new l(obj4, 17), this) == aVar3) {
                        return aVar3;
                    }
                }
                return h.ab.f48028a;
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                if (this.f29386a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj5 = this.f29387b;
                    this.f29386a = 1;
                    if (bm.o((bm) obj5, this) == aVar4) {
                        return aVar4;
                    }
                }
                return h.ab.f48028a;
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                if (this.f29386a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj6 = this.f29387b;
                    this.f29386a = 1;
                    if (bm.m((bm) obj6, this) == aVar5) {
                        return aVar5;
                    }
                }
                return h.ab.f48028a;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                if (this.f29386a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj7 = this.f29387b;
                    this.f29386a = 1;
                    if (bm.p((bm) obj7, this) == aVar6) {
                        return aVar6;
                    }
                }
                return h.ab.f48028a;
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                if (this.f29386a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj8 = this.f29387b;
                    this.f29386a = 1;
                    if (bm.n((bm) obj8, this) == aVar7) {
                        return aVar7;
                    }
                }
                return h.ab.f48028a;
            case 7:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                if (this.f29386a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj9 = this.f29387b;
                    this.f29386a = 1;
                    if (bm.j((bm) obj9, this) == aVar8) {
                        return aVar8;
                    }
                }
                return h.ab.f48028a;
            case 8:
                h.c.a.a aVar9 = h.c.a.a.f48038a;
                if (this.f29386a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj10 = this.f29387b;
                    this.f29386a = 1;
                    if (bm.l((bm) obj10, this) == aVar9) {
                        return aVar9;
                    }
                }
                return h.ab.f48028a;
            default:
                h.c.a.a aVar10 = h.c.a.a.f48038a;
                if (this.f29386a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj11 = this.f29387b;
                    this.f29386a = 1;
                    if (bm.k((bm) obj11, this) == aVar10) {
                        return aVar10;
                    }
                }
                return h.ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bm bmVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f29388c = i2;
        this.f29387b = bmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bm bmVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f29388c = i2;
        this.f29387b = bmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bm bmVar, h.c.e eVar, int i2, float[] fArr) {
        super(2, eVar);
        this.f29388c = i2;
        this.f29387b = bmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bm bmVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f29388c = i2;
        this.f29387b = bmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bm bmVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f29388c = i2;
        this.f29387b = bmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bm bmVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f29388c = i2;
        this.f29387b = bmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bm bmVar, h.c.e eVar, int i2, byte[][] bArr) {
        super(2, eVar);
        this.f29388c = i2;
        this.f29387b = bmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bm bmVar, h.c.e eVar, int i2, char[][] cArr) {
        super(2, eVar);
        this.f29388c = i2;
        this.f29387b = bmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(p pVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29388c = i2;
        this.f29387b = pVar;
    }
}
