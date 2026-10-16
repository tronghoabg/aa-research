package com.waze.sound;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bi extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f39534a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f39535b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f39536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(ax axVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = axVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f39536c) {
            case 0:
                return new bi((bj) this.f39535b, eVar, 0);
            case 1:
                return new bi((ax) this.f39535b, eVar, 1);
            case 2:
                return new bi((dd) this.f39535b, eVar, 2);
            case 3:
                return new bi((dd) this.f39535b, eVar, 3, (byte[]) null);
            case 4:
                return new bi((dd) this.f39535b, eVar, 4, (char[]) null);
            case 5:
                return new bi((dr) this.f39535b, eVar, 5);
            case 6:
                return new bi((dr) this.f39535b, eVar, 6, (byte[]) null);
            case 7:
                return new bi((dr) this.f39535b, eVar, 7, (char[]) null);
            case 8:
                return new bi((dr) this.f39535b, eVar, 8, (short[]) null);
            case 9:
                return new bi((fl) this.f39535b, eVar, 9);
            case 10:
                return new bi((fl) this.f39535b, eVar, 10, (byte[]) null);
            case 11:
                return new bi((gb) this.f39535b, eVar, 11);
            case 12:
                return new bi((gb) this.f39535b, eVar, 12, (byte[]) null);
            case 13:
                return new bi((gb) this.f39535b, eVar, 13, (char[]) null);
            case 14:
                return new bi((gb) this.f39535b, eVar, 14, (short[]) null);
            default:
                return new bi((ke) this.f39535b, eVar, 15);
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f39536c) {
        }
        return ((bi) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f39536c) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.f39534a == 0) {
                    e.b.c.b(obj);
                    Object obj2 = this.f39535b;
                    this.f39534a = 1;
                    if (((bj) obj2).f39537a.getCustomPromptsListChanged().collect(new bh(obj2, 0), this) == aVar) {
                        return aVar;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                if (this.f39534a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj3 = this.f39535b;
                    this.f39534a = 1;
                    if (ax.b((ax) obj3, this) == aVar2) {
                        return aVar2;
                    }
                }
                return h.ab.f48028a;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                if (this.f39534a == 0) {
                    e.b.c.b(obj);
                    Object obj4 = this.f39535b;
                    this.f39534a = 1;
                    if (((dd) obj4).f39754f.b().collect(new bh(obj4, 2), this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                if (this.f39534a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj5 = this.f39535b;
                    dd ddVar = (dd) obj5;
                    kotlinx.coroutines.b.k[] kVarArr = {ddVar.f39749a.c(), ddVar.f39749a.b()};
                    this.f39534a = 1;
                    if (kotlinx.coroutines.b.ai.I(kVarArr).collect(new bh(obj5, 3), this) == aVar4) {
                        return aVar4;
                    }
                }
                return h.ab.f48028a;
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                if (this.f39534a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj6 = this.f39535b;
                    this.f39534a = 1;
                    if (((dd) obj6).f39753e.e().collect(new bh(obj6, 5), this) == aVar5) {
                        return aVar5;
                    }
                }
                return h.ab.f48028a;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                if (this.f39534a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj7 = this.f39535b;
                    this.f39534a = 1;
                    if (kotlinx.coroutines.b.ai.y(((dr) obj7).f39818l.a()).collect(new bh(obj7, 6), this) == aVar6) {
                        return aVar6;
                    }
                }
                return h.ab.f48028a;
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                if (this.f39534a == 0) {
                    e.b.c.b(obj);
                    Object obj8 = this.f39535b;
                    this.f39534a = 1;
                    if (((dr) obj8).n.P().collect(new bh(obj8, 7), this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 7:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                if (this.f39534a == 0) {
                    e.b.c.b(obj);
                    Object obj9 = this.f39535b;
                    this.f39534a = 1;
                    if (((dr) obj9).f39809c.k().collect(new bh(obj9, 8), this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 8:
                h.c.a.a aVar9 = h.c.a.a.f48038a;
                if (this.f39534a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj10 = this.f39535b;
                    dr drVar = (dr) obj10;
                    this.f39534a = 1;
                    if (kotlinx.coroutines.b.ai.r(kotlinx.coroutines.b.ai.y(new Cdo(drVar.f39810d.R(), 1)), kotlinx.coroutines.b.ai.y(new Cdo(drVar.f39810d.R(), 0)), drVar.f39813g.d(), new dk(null)).collect(new bh(obj10, 9), this) == aVar9) {
                        return aVar9;
                    }
                }
                return h.ab.f48028a;
            case 9:
                h.c.a.a aVar10 = h.c.a.a.f48038a;
                if (this.f39534a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj11 = this.f39535b;
                    this.f39534a = 1;
                    if (new Cdo(((fl) obj11).f40018a.a(), 2).collect(new bh(obj11, 11), this) == aVar10) {
                        return aVar10;
                    }
                }
                return h.ab.f48028a;
            case 10:
                h.c.a.a aVar11 = h.c.a.a.f48038a;
                if (this.f39534a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    kotlinx.coroutines.b.k kVarK = ConfigValues.CONFIG_VALUE_SOUND_ROUTE_TO_SPEAKER_ANDROID.k();
                    h.g.b.x.e(kVarK, "getFlow(...)");
                    this.f39534a = 1;
                    if (kVarK.collect(new bh(this.f39535b, 12), this) == aVar11) {
                        return aVar11;
                    }
                }
                return h.ab.f48028a;
            case 11:
                h.c.a.a aVar12 = h.c.a.a.f48038a;
                if (this.f39534a != 0) {
                    e.b.c.b(obj);
                    return obj;
                }
                e.b.c.b(obj);
                this.f39534a = 1;
                Object objC = ((gb) this.f39535b).f40079l.c(this);
                return objC == aVar12 ? aVar12 : objC;
            case 12:
                h.c.a.a aVar13 = h.c.a.a.f48038a;
                if (this.f39534a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj12 = this.f39535b;
                    this.f39534a = 1;
                    if (gb.f((gb) obj12, this) == aVar13) {
                        return aVar13;
                    }
                }
                return h.ab.f48028a;
            case 13:
                h.c.a.a aVar14 = h.c.a.a.f48038a;
                if (this.f39534a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    kotlinx.coroutines.b.k kVarK2 = ConfigValues.CONFIG_VALUE_SOUND_PROMPTS_VOLUME_ANDROID.k();
                    h.g.b.x.e(kVarK2, "getFlow(...)");
                    this.f39534a = 1;
                    if (kVarK2.collect(new bh(this.f39535b, 13), this) == aVar14) {
                        return aVar14;
                    }
                }
                return h.ab.f48028a;
            case 14:
                h.c.a.a aVar15 = h.c.a.a.f48038a;
                if (this.f39534a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    gb gbVar = (gb) this.f39535b;
                    this.f39534a = 1;
                    if (gbVar.f40070c.a().collect(new fu(gbVar), this) == aVar15) {
                        return aVar15;
                    }
                }
                return h.ab.f48028a;
            default:
                h.c.a.a aVar16 = h.c.a.a.f48038a;
                if (this.f39534a != 0) {
                    e.b.c.b(obj);
                    return obj;
                }
                e.b.c.b(obj);
                Object obj13 = this.f39535b;
                this.f39534a = 1;
                Object objB = ((ke) obj13).b(this);
                return objB == aVar16 ? aVar16 : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(bj bjVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = bjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(dd ddVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = ddVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(dd ddVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = ddVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(dd ddVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = ddVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(dr drVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = drVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(dr drVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = drVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(dr drVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = drVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(dr drVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = drVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(fl flVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = flVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(fl flVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = flVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(gb gbVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = gbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(gb gbVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = gbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(gb gbVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = gbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(gb gbVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = gbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bi(ke keVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39536c = i2;
        this.f39535b = keVar;
    }
}
