package com.waze.main_screen;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f25829a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f25830b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f25831c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(af afVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f25831c = i2;
        this.f25830b = afVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f25831c) {
            case 0:
                return new aj((ax) this.f25830b, eVar, 0);
            case 1:
                return new aj((af) this.f25830b, eVar, 1);
            case 2:
                return new aj((ax) this.f25830b, eVar, 2, (byte[]) null);
            case 3:
                return new aj((ax) this.f25830b, eVar, 3, (char[]) null);
            case 4:
                return new aj((ax) this.f25830b, eVar, 4, (short[]) null);
            case 5:
                return new aj((ax) this.f25830b, eVar, 5, (int[]) null);
            case 6:
                return new aj((ax) this.f25830b, eVar, 6, (boolean[]) null);
            case 7:
                return new aj((ax) this.f25830b, eVar, 7, (float[]) null);
            case 8:
                return new aj((ax) this.f25830b, eVar, 8, (byte[][]) null);
            case 9:
                return new aj((ax) this.f25830b, eVar, 9, (char[][]) null);
            case 10:
                return new aj((be) this.f25830b, eVar, 10);
            default:
                return new aj((be) this.f25830b, eVar, 11, (byte[]) null);
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f25831c) {
        }
        return ((aj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25831c) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.f25829a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj2 = this.f25830b;
                    ax axVar = (ax) obj2;
                    com.waze.shared_infra.s.f<String> wazerMoodObservable = axVar.f25854c.getWazerMoodObservable();
                    h.g.b.x.e(wazerMoodObservable, "getWazerMoodObservable(...)");
                    this.f25829a = 1;
                    if (kotlinx.coroutines.b.ai.q(new bd(com.waze.shared_infra.s.h.a(wazerMoodObservable), 1), axVar.f25858g.e(), new au(null, 1, null)).collect(new ag(obj2, 2), this) == aVar) {
                        return aVar;
                    }
                }
                return h.ab.f48028a;
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                if (this.f25829a == 0) {
                    e.b.c.b(obj);
                    Object obj3 = this.f25830b;
                    this.f25829a = 1;
                    if (((af) obj3).k().m().collect(new ag(obj3, 1), this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                if (this.f25829a == 0) {
                    e.b.c.b(obj);
                    Object obj4 = this.f25830b;
                    this.f25829a = 1;
                    if (((ax) obj4).f25856e.c().collect(new ag(obj4, 4), this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                if (this.f25829a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f25829a = 1;
                    if (((ax) this.f25830b).m.emit(ak.f25832a, this) == aVar4) {
                        return aVar4;
                    }
                }
                return h.ab.f48028a;
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                if (this.f25829a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj5 = this.f25830b;
                    ax axVar2 = (ax) obj5;
                    this.f25829a = 1;
                    if (kotlinx.coroutines.b.ai.q(axVar2.f25858g.d(), axVar2.f25857f.e(), new au(null, 0)).collect(new ag(obj5, 5), this) == aVar5) {
                        return aVar5;
                    }
                }
                return h.ab.f48028a;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                if (this.f25829a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f25829a = 1;
                    if (((ax) this.f25830b).m.emit(ao.f25836a, this) == aVar6) {
                        return aVar6;
                    }
                }
                return h.ab.f48028a;
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                if (this.f25829a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f25829a = 1;
                    if (((ax) this.f25830b).m.emit(am.f25834a, this) == aVar7) {
                        return aVar7;
                    }
                }
                return h.ab.f48028a;
            case 7:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                if (this.f25829a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f25829a = 1;
                    if (((ax) this.f25830b).m.emit(aq.f25838a, this) == aVar8) {
                        return aVar8;
                    }
                }
                return h.ab.f48028a;
            case 8:
                h.c.a.a aVar9 = h.c.a.a.f48038a;
                if (this.f25829a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f25829a = 1;
                    if (((ax) this.f25830b).m.emit(ar.f25839a, this) == aVar9) {
                        return aVar9;
                    }
                }
                return h.ab.f48028a;
            case 9:
                h.c.a.a aVar10 = h.c.a.a.f48038a;
                if (this.f25829a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f25829a = 1;
                    if (((ax) this.f25830b).m.emit(at.f25841a, this) == aVar10) {
                        return aVar10;
                    }
                }
                return h.ab.f48028a;
            case 10:
                h.c.a.a aVar11 = h.c.a.a.f48038a;
                if (this.f25829a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f25829a = 1;
                    if (((be) this.f25830b).f25912g.b(this) == aVar11) {
                        return aVar11;
                    }
                }
                return h.ab.f48028a;
            default:
                h.c.a.a aVar12 = h.c.a.a.f48038a;
                if (this.f25829a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f25829a = 1;
                    if (((be) this.f25830b).f25911f.b(this) == aVar12) {
                        return aVar12;
                    }
                }
                return h.ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ax axVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f25831c = i2;
        this.f25830b = axVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ax axVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f25831c = i2;
        this.f25830b = axVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ax axVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f25831c = i2;
        this.f25830b = axVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ax axVar, h.c.e eVar, int i2, float[] fArr) {
        super(2, eVar);
        this.f25831c = i2;
        this.f25830b = axVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ax axVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f25831c = i2;
        this.f25830b = axVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ax axVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f25831c = i2;
        this.f25830b = axVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ax axVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f25831c = i2;
        this.f25830b = axVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ax axVar, h.c.e eVar, int i2, byte[][] bArr) {
        super(2, eVar);
        this.f25831c = i2;
        this.f25830b = axVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ax axVar, h.c.e eVar, int i2, char[][] cArr) {
        super(2, eVar);
        this.f25831c = i2;
        this.f25830b = axVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(be beVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f25831c = i2;
        this.f25830b = beVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(be beVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f25831c = i2;
        this.f25830b = beVar;
    }
}
