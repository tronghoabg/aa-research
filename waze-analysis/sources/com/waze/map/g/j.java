package com.waze.map.g;

import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f29065a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f29066b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f29067c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f29068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(s sVar, h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29066b = sVar;
        this.f29067c = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r2v15, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r3v10, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f29068d) {
            case 0:
                return new j((kotlinx.coroutines.b.k) this.f29067c, this.f29066b, eVar, 0);
            case 1:
                return new j((kotlinx.coroutines.b.k) this.f29067c, this.f29066b, eVar, 1, (byte[]) null);
            case 2:
                return new j((kotlinx.coroutines.b.k) this.f29067c, this.f29066b, eVar, 2, (char[]) null);
            case 3:
                return new j((kotlinx.coroutines.b.k) this.f29067c, this.f29066b, eVar, 3, (short[]) null);
            case 4:
                return new j((kotlinx.coroutines.b.k) this.f29067c, this.f29066b, eVar, 4, (int[]) null);
            case 5:
                return new j((kotlinx.coroutines.b.k) this.f29067c, this.f29066b, eVar, 5, (boolean[]) null);
            case 6:
                return new j(this.f29066b, (h.g.a.l) this.f29067c, eVar, 6);
            case 7:
                return new j(this.f29066b, (h.g.a.l) this.f29067c, eVar, 7, (byte[]) null);
            case 8:
                return new j(this.f29066b, (h.g.a.l) this.f29067c, eVar, 8, (char[]) null);
            case 9:
                return new j(this.f29066b, (h.g.a.l) this.f29067c, eVar, 9, (short[]) null);
            case 10:
                return new j(this.f29066b, (h.g.a.l) this.f29067c, eVar, 10, (int[]) null);
            case 11:
                return new j(this.f29066b, (h.g.a.l) this.f29067c, eVar, 11, (boolean[]) null);
            case 12:
                return new j(this.f29066b, (h.g.a.l) this.f29067c, eVar, 12, (float[]) null);
            case 13:
                return new j(this.f29066b, (h.g.a.l) this.f29067c, eVar, 13, (byte[][]) null);
            case 14:
                return new j(this.f29066b, (h.g.a.l) this.f29067c, eVar, 14, (char[][]) null);
            case 15:
                return new j(this.f29066b, (h.g.a.l) this.f29067c, eVar, 15, (short[][]) null);
            case 16:
                return new j(this.f29066b, (h.g.a.l) this.f29067c, eVar, 16, (int[][]) null);
            case 17:
                return new j(this.f29066b, (h.g.a.l) this.f29067c, eVar, 17, (boolean[][]) null);
            default:
                return new j(this.f29066b, (h.g.a.l) this.f29067c, eVar, 18, (float[][]) null);
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f29068d) {
        }
        return ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r1v33, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29068d) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f29065a = 1;
                    if (ai.e(this.f29067c, new i(this.f29066b, null, 0), this) == aVar) {
                        return aVar;
                    }
                }
                return ab.f48028a;
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f29065a = 1;
                    if (this.f29067c.collect(new d(this.f29066b, 0), this) == aVar2) {
                        return aVar2;
                    }
                }
                return ab.f48028a;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f29065a = 1;
                    if (this.f29067c.collect(new d(this.f29066b, 3), this) == aVar3) {
                        return aVar3;
                    }
                }
                return ab.f48028a;
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f29065a = 1;
                    if (this.f29067c.collect(new d(this.f29066b, 4), this) == aVar4) {
                        return aVar4;
                    }
                }
                return ab.f48028a;
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f29065a = 1;
                    if (this.f29067c.collect(new d(this.f29066b, 7), this) == aVar5) {
                        return aVar5;
                    }
                }
                return ab.f48028a;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f29065a = 1;
                    if (ai.e(this.f29067c, new k(this.f29066b, null), this) == aVar6) {
                        return aVar6;
                    }
                }
                return ab.f48028a;
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    s sVar = this.f29066b;
                    this.f29065a = 1;
                    if (sVar.f29092a.j().collect(new l(sVar, this.f29067c, 0), this) == aVar7) {
                        return aVar7;
                    }
                }
                return ab.f48028a;
            case 7:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    s sVar2 = this.f29066b;
                    this.f29065a = 1;
                    if (sVar2.f29092a.p().collect(new l(sVar2, this.f29067c, 2), this) == aVar8) {
                        return aVar8;
                    }
                }
                return ab.f48028a;
            case 8:
                h.c.a.a aVar9 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    s sVar3 = this.f29066b;
                    this.f29065a = 1;
                    if (new o(sVar3.f29092a.x(), 0).collect(new l(sVar3, this.f29067c, 3), this) == aVar9) {
                        return aVar9;
                    }
                }
                return ab.f48028a;
            case 9:
                h.c.a.a aVar10 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    s sVar4 = this.f29066b;
                    this.f29065a = 1;
                    if (sVar4.f29092a.l().collect(new l(sVar4, this.f29067c, 4), this) == aVar10) {
                        return aVar10;
                    }
                }
                return ab.f48028a;
            case 10:
                h.c.a.a aVar11 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    s sVar5 = this.f29066b;
                    this.f29065a = 1;
                    if (sVar5.f29092a.h().collect(new l(sVar5, this.f29067c, 1), this) == aVar11) {
                        return aVar11;
                    }
                }
                return ab.f48028a;
            case 11:
                h.c.a.a aVar12 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    s sVar6 = this.f29066b;
                    this.f29065a = 1;
                    if (sVar6.f29092a.k().collect(new l(sVar6, this.f29067c, 5), this) == aVar12) {
                        return aVar12;
                    }
                }
                return ab.f48028a;
            case 12:
                h.c.a.a aVar13 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    s sVar7 = this.f29066b;
                    this.f29065a = 1;
                    if (sVar7.f29092a.e().collect(new l(sVar7, this.f29067c, 6), this) == aVar13) {
                        return aVar13;
                    }
                }
                return ab.f48028a;
            case 13:
                h.c.a.a aVar14 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    s sVar8 = this.f29066b;
                    this.f29065a = 1;
                    if (sVar8.f29092a.i().collect(new l(sVar8, this.f29067c, 7), this) == aVar14) {
                        return aVar14;
                    }
                }
                return ab.f48028a;
            case 14:
                h.c.a.a aVar15 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    s sVar9 = this.f29066b;
                    this.f29065a = 1;
                    if (sVar9.f29092a.f().collect(new l(sVar9, this.f29067c, 8), this) == aVar15) {
                        return aVar15;
                    }
                }
                return ab.f48028a;
            case 15:
                h.c.a.a aVar16 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    s sVar10 = this.f29066b;
                    this.f29065a = 1;
                    if (sVar10.f29092a.r().collect(new l(sVar10, this.f29067c, 9), this) == aVar16) {
                        return aVar16;
                    }
                }
                return ab.f48028a;
            case 16:
                h.c.a.a aVar17 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    s sVar11 = this.f29066b;
                    this.f29065a = 1;
                    if (sVar11.f29092a.n().collect(new l(sVar11, this.f29067c, 10), this) == aVar17) {
                        return aVar17;
                    }
                }
                return ab.f48028a;
            case 17:
                h.c.a.a aVar18 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    s sVar12 = this.f29066b;
                    this.f29065a = 1;
                    if (sVar12.f29092a.m().collect(new l(sVar12, this.f29067c, 11), this) == aVar18) {
                        return aVar18;
                    }
                }
                return ab.f48028a;
            default:
                h.c.a.a aVar19 = h.c.a.a.f48038a;
                if (this.f29065a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    s sVar13 = this.f29066b;
                    this.f29065a = 1;
                    if (sVar13.f29092a.q().collect(new l(sVar13, this.f29067c, 12), this) == aVar19) {
                        return aVar19;
                    }
                }
                return ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(s sVar, h.g.a.l lVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29066b = sVar;
        this.f29067c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(s sVar, h.g.a.l lVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29066b = sVar;
        this.f29067c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(s sVar, h.g.a.l lVar, h.c.e eVar, int i2, float[] fArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29066b = sVar;
        this.f29067c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(s sVar, h.g.a.l lVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29066b = sVar;
        this.f29067c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(s sVar, h.g.a.l lVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29066b = sVar;
        this.f29067c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(s sVar, h.g.a.l lVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29066b = sVar;
        this.f29067c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(s sVar, h.g.a.l lVar, h.c.e eVar, int i2, byte[][] bArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29066b = sVar;
        this.f29067c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(s sVar, h.g.a.l lVar, h.c.e eVar, int i2, char[][] cArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29066b = sVar;
        this.f29067c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(s sVar, h.g.a.l lVar, h.c.e eVar, int i2, float[][] fArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29066b = sVar;
        this.f29067c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(s sVar, h.g.a.l lVar, h.c.e eVar, int i2, int[][] iArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29066b = sVar;
        this.f29067c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(s sVar, h.g.a.l lVar, h.c.e eVar, int i2, short[][] sArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29066b = sVar;
        this.f29067c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(s sVar, h.g.a.l lVar, h.c.e eVar, int i2, boolean[][] zArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29066b = sVar;
        this.f29067c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(kotlinx.coroutines.b.k kVar, s sVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29067c = kVar;
        this.f29066b = sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(kotlinx.coroutines.b.k kVar, s sVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29067c = kVar;
        this.f29066b = sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(kotlinx.coroutines.b.k kVar, s sVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29067c = kVar;
        this.f29066b = sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(kotlinx.coroutines.b.k kVar, s sVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29067c = kVar;
        this.f29066b = sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(kotlinx.coroutines.b.k kVar, s sVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29067c = kVar;
        this.f29066b = sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(kotlinx.coroutines.b.k kVar, s sVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f29068d = i2;
        this.f29067c = kVar;
        this.f29066b = sVar;
    }
}
