package com.waze.main_screen.p;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aw extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f27064a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bf f27065b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f27066c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f27067d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f27067d) {
            case 0:
                return new aw(this.f27065b, this.f27066c, eVar, 0);
            case 1:
                return new aw(this.f27065b, this.f27066c, eVar, 1, (byte[]) null);
            case 2:
                return new aw(this.f27065b, this.f27066c, eVar, 2, (char[]) null);
            case 3:
                return new aw(this.f27065b, this.f27066c, eVar, 3, (short[]) null);
            case 4:
                return new aw(this.f27065b, this.f27066c, eVar, 4, (int[]) null);
            case 5:
                return new aw(this.f27065b, this.f27066c, eVar, 5, (boolean[]) null);
            case 6:
                return new aw(this.f27065b, this.f27066c, eVar, 6, (float[]) null);
            case 7:
                return new aw(this.f27065b, this.f27066c, eVar, 7, (byte[][]) null);
            case 8:
                return new aw(this.f27065b, this.f27066c, eVar, 8, (char[][]) null);
            case 9:
                return new aw(this.f27065b, this.f27066c, eVar, 9, (short[][]) null);
            case 10:
                return new aw(this.f27065b, this.f27066c, eVar, 10, (int[][]) null);
            case 11:
                return new aw(this.f27065b, this.f27066c, eVar, 11, (boolean[][]) null);
            case 12:
                return new aw(this.f27065b, this.f27066c, eVar, 12, (float[][]) null);
            case 13:
                return new aw(this.f27065b, this.f27066c, eVar, 13, (byte[][][]) null);
            case 14:
                return new aw(this.f27065b, this.f27066c, eVar, 14, (char[][][]) null);
            case 15:
                return new aw(this.f27065b, this.f27066c, eVar, 15, (short[][][]) null);
            default:
                return new aw(this.f27065b, this.f27066c, eVar, 16, (int[][][]) null);
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f27067d) {
        }
        return ((aw) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f27067d) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar = this.f27065b;
                    float f2 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar.d(), Dp.m11162boximpl(f2), null, null, null, this, 14, null) == aVar) {
                        return aVar;
                    }
                }
                return h.ab.f48028a;
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar2 = this.f27065b;
                    float f3 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar2.c(), Dp.m11162boximpl(f3), null, null, null, this, 14, null) == aVar2) {
                        return aVar2;
                    }
                }
                return h.ab.f48028a;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar3 = this.f27065b;
                    float f4 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar3.c(), Dp.m11162boximpl(f4), null, null, null, this, 14, null) == aVar3) {
                        return aVar3;
                    }
                }
                return h.ab.f48028a;
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar4 = this.f27065b;
                    float f5 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar4.c(), Dp.m11162boximpl(f5), null, null, null, this, 14, null) == aVar4) {
                        return aVar4;
                    }
                }
                return h.ab.f48028a;
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar5 = this.f27065b;
                    float f6 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar5.d(), Dp.m11162boximpl(f6), null, null, null, this, 14, null) == aVar5) {
                        return aVar5;
                    }
                }
                return h.ab.f48028a;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar6 = this.f27065b;
                    float f7 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar6.c(), Dp.m11162boximpl(f7), null, null, null, this, 14, null) == aVar6) {
                        return aVar6;
                    }
                }
                return h.ab.f48028a;
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar7 = this.f27065b;
                    float f8 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar7.c(), Dp.m11162boximpl(f8), null, null, null, this, 14, null) == aVar7) {
                        return aVar7;
                    }
                }
                return h.ab.f48028a;
            case 7:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar8 = this.f27065b;
                    float f9 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar8.d(), Dp.m11162boximpl(f9), null, null, null, this, 14, null) == aVar8) {
                        return aVar8;
                    }
                }
                return h.ab.f48028a;
            case 8:
                h.c.a.a aVar9 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar9 = this.f27065b;
                    float f10 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar9.c(), Dp.m11162boximpl(f10), null, null, null, this, 14, null) == aVar9) {
                        return aVar9;
                    }
                }
                return h.ab.f48028a;
            case 9:
                h.c.a.a aVar10 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar10 = this.f27065b;
                    float f11 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar10.c(), Dp.m11162boximpl(f11), null, null, null, this, 14, null) == aVar10) {
                        return aVar10;
                    }
                }
                return h.ab.f48028a;
            case 10:
                h.c.a.a aVar11 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar11 = this.f27065b;
                    float f12 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar11.d(), Dp.m11162boximpl(f12), null, null, null, this, 14, null) == aVar11) {
                        return aVar11;
                    }
                }
                return h.ab.f48028a;
            case 11:
                h.c.a.a aVar12 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar12 = this.f27065b;
                    float f13 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar12.c(), Dp.m11162boximpl(f13), null, null, null, this, 14, null) == aVar12) {
                        return aVar12;
                    }
                }
                return h.ab.f48028a;
            case 12:
                h.c.a.a aVar13 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar13 = this.f27065b;
                    float f14 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar13.d(), Dp.m11162boximpl(f14), null, null, null, this, 14, null) == aVar13) {
                        return aVar13;
                    }
                }
                return h.ab.f48028a;
            case 13:
                h.c.a.a aVar14 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar14 = this.f27065b;
                    float f15 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar14.c(), Dp.m11162boximpl(f15), null, null, null, this, 14, null) == aVar14) {
                        return aVar14;
                    }
                }
                return h.ab.f48028a;
            case 14:
                h.c.a.a aVar15 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar15 = this.f27065b;
                    float f16 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar15.d(), Dp.m11162boximpl(f16), null, null, null, this, 14, null) == aVar15) {
                        return aVar15;
                    }
                }
                return h.ab.f48028a;
            case 15:
                h.c.a.a aVar16 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar16 = this.f27065b;
                    float f17 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar16.c(), Dp.m11162boximpl(f17), null, null, null, this, 14, null) == aVar16) {
                        return aVar16;
                    }
                }
                return h.ab.f48028a;
            default:
                h.c.a.a aVar17 = h.c.a.a.f48038a;
                if (this.f27064a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    bf bfVar17 = this.f27065b;
                    float f18 = this.f27066c;
                    this.f27064a = 1;
                    if (Animatable.animateTo$default(bfVar17.d(), Dp.m11162boximpl(f18), null, null, null, this, 14, null) == aVar17) {
                        return aVar17;
                    }
                }
                return h.ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, float[] fArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, byte[][] bArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, char[][] cArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, float[][] fArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, int[][] iArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, short[][] sArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, boolean[][] zArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, byte[][][] bArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, char[][][] cArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, int[][][] iArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bf bfVar, float f2, h.c.e eVar, int i2, short[][][] sArr) {
        super(2, eVar);
        this.f27067d = i2;
        this.f27065b = bfVar;
        this.f27066c = f2;
    }
}
