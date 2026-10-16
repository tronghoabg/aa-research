package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f21665a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f21666b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f21667c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(ae aeVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21667c = i2;
        this.f21666b = aeVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f21667c) {
            case 0:
                return new j((k) this.f21666b, eVar, 0);
            case 1:
                return new j((e) this.f21666b, eVar, 1);
            case 2:
                return new j((u) this.f21666b, eVar, 2);
            case 3:
                return new j((an) this.f21666b, eVar, 3);
            case 4:
                return new j((bc) this.f21666b, eVar, 4);
            case 5:
                return new j((bc) this.f21666b, eVar, 5, (byte[]) null);
            case 6:
                return new j((bc) this.f21666b, eVar, 6, (char[]) null);
            case 7:
                return new j((bk) this.f21666b, eVar, 7);
            case 8:
                return new j((bk) this.f21666b, eVar, 8, (byte[]) null);
            case 9:
                return new j((bk) this.f21666b, eVar, 9, (char[]) null);
            case 10:
                return new j((bk) this.f21666b, eVar, 10, (short[]) null);
            case 11:
                return new j((ae) this.f21666b, eVar, 11);
            case 12:
                return new j((de) this.f21666b, eVar, 12);
            case 13:
                return new j((ey) this.f21666b, eVar, 13);
            default:
                return new j((ay) this.f21666b, eVar, 14);
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f21667c) {
        }
        return ((j) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f21667c) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.f21665a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f21665a = 1;
                    if (((k) this.f21666b).f21670c.emit(i.f21664a, this) == aVar) {
                        return aVar;
                    }
                }
                return h.ab.f48028a;
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                if (this.f21665a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj2 = this.f21666b;
                    this.f21665a = 1;
                    if (((e) obj2).f21475b.d().collect(new am(obj2, 1), this) == aVar2) {
                        return aVar2;
                    }
                }
                return h.ab.f48028a;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                if (this.f21665a == 0) {
                    e.b.c.b(obj);
                    u uVar = (u) this.f21666b;
                    this.f21665a = 1;
                    if (uVar.f21707b.d().collect(new s(uVar), this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                if (this.f21665a == 0) {
                    e.b.c.b(obj);
                    Object obj3 = this.f21666b;
                    this.f21665a = 1;
                    if (((an) obj3).f20958e.collect(new am(obj3, 0), this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                if (this.f21665a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj4 = this.f21666b;
                    bc bcVar = (bc) obj4;
                    this.f21665a = 1;
                    if (kotlinx.coroutines.b.ai.q(bcVar.f21027k.m(), new bg(bcVar.f21022f.a(), 1), new az(bcVar, null)).collect(new am(obj4, 2), this) == aVar5) {
                        return aVar5;
                    }
                }
                return h.ab.f48028a;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                if (this.f21665a == 0) {
                    e.b.c.b(obj);
                    Object obj5 = this.f21666b;
                    this.f21665a = 1;
                    if (((bc) obj5).f21027k.l().collect(new am(obj5, 3), this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                if (this.f21665a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj6 = this.f21666b;
                    bc bcVar2 = (bc) obj6;
                    this.f21665a = 1;
                    if (kotlinx.coroutines.b.ai.d(kotlinx.coroutines.b.ai.r(bcVar2.f21018b.a(), com.waze.map.el.b(bcVar2.f21021e.g()), bcVar2.f21024h, new bb(obj6)), this) == aVar7) {
                        return aVar7;
                    }
                }
                return h.ab.f48028a;
            case 7:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                if (this.f21665a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj7 = this.f21666b;
                    this.f21665a = 1;
                    if (kotlinx.coroutines.b.ai.y(new bg(((bk) obj7).n, 0)).collect(new am(obj7, 4), this) == aVar8) {
                        return aVar8;
                    }
                }
                return h.ab.f48028a;
            case 8:
                h.c.a.a aVar9 = h.c.a.a.f48038a;
                if (this.f21665a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj8 = this.f21666b;
                    bk bkVar = (bk) obj8;
                    this.f21665a = 1;
                    if (new bg(com.waze.network.b.ay.d(bkVar.f21053h.a(), bkVar.f21054i), 2).collect(new am(obj8, 6), this) == aVar9) {
                        return aVar9;
                    }
                }
                return h.ab.f48028a;
            case 9:
                h.c.a.a aVar10 = h.c.a.a.f48038a;
                if (this.f21665a == 0) {
                    e.b.c.b(obj);
                    Object obj9 = this.f21666b;
                    this.f21665a = 1;
                    if (((bk) obj9).x().l().collect(new am(obj9, 7), this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 10:
                h.c.a.a aVar11 = h.c.a.a.f48038a;
                if (this.f21665a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f21665a = 1;
                    obj = ((bk) this.f21666b).f21055j.a(this);
                    if (obj == aVar11) {
                        return aVar11;
                    }
                }
                com.waze.main_screen.u.a aVar12 = (com.waze.main_screen.u.a) obj;
                if (aVar12 != null) {
                    bk.n((bk) this.f21666b, aVar12);
                }
                return h.ab.f48028a;
            case 11:
                h.c.a.a aVar13 = h.c.a.a.f48038a;
                if (this.f21665a == 0) {
                    e.b.c.b(obj);
                    Object obj10 = this.f21666b;
                    this.f21665a = 1;
                    if (ae.d((ae) obj10).d().collect(new am(obj10, 11), this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 12:
                h.c.a.a aVar14 = h.c.a.a.f48038a;
                if (this.f21665a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f21665a = 1;
                    if (((de) this.f21666b).f21371g.a(this) == aVar14) {
                        return aVar14;
                    }
                }
                return h.ab.f48028a;
            case 13:
                h.c.a.a aVar15 = h.c.a.a.f48038a;
                if (this.f21665a == 0) {
                    e.b.c.b(obj);
                    Object obj11 = this.f21666b;
                    this.f21665a = 1;
                    if (((ey) obj11).b().a().collect(new am(obj11, 14), this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            default:
                h.c.a.a aVar16 = h.c.a.a.f48038a;
                if (this.f21665a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Long lB = ay.f((ay) this.f21666b).b();
                    h.g.b.x.e(lB, "getValue(...)");
                    this.f21665a = 1;
                    if (kotlinx.coroutines.aj.r(h.o.c.j(lB.longValue(), h.o.d.f48273d), this) == aVar16) {
                        return aVar16;
                    }
                }
                ay ayVar = (ay) this.f21666b;
                ayVar.f20988e.e(ay.e(ayVar));
                return h.ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(an anVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21667c = i2;
        this.f21666b = anVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(ay ayVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21667c = i2;
        this.f21666b = ayVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(bc bcVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21667c = i2;
        this.f21666b = bcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(bc bcVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f21667c = i2;
        this.f21666b = bcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(bc bcVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f21667c = i2;
        this.f21666b = bcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(bk bkVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21667c = i2;
        this.f21666b = bkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(bk bkVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f21667c = i2;
        this.f21666b = bkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(bk bkVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f21667c = i2;
        this.f21666b = bkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(bk bkVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f21667c = i2;
        this.f21666b = bkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(de deVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21667c = i2;
        this.f21666b = deVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(e eVar, h.c.e eVar2, int i2) {
        super(2, eVar2);
        this.f21667c = i2;
        this.f21666b = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(ey eyVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21667c = i2;
        this.f21666b = eyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21667c = i2;
        this.f21666b = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(u uVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21667c = i2;
        this.f21666b = uVar;
    }
}
