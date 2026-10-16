package com.waze.ui.l;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class au extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f42525a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f42526b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f42527c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(ba baVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42527c = i2;
        this.f42526b = baVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f42527c) {
            case 0:
                return new au((ba) this.f42526b, eVar, 0);
            case 1:
                return new au((ba) this.f42526b, eVar, 1, (byte[]) null);
            case 2:
                return new au((ba) this.f42526b, eVar, 2, (char[]) null);
            case 3:
                return new au((ba) this.f42526b, eVar, 3, (short[]) null);
            case 4:
                return new au((ba) this.f42526b, eVar, 4, (int[]) null);
            case 5:
                return new au((ba) this.f42526b, eVar, 5, (boolean[]) null);
            case 6:
                return new au((cg) this.f42526b, eVar, 6);
            default:
                return new au((cg) this.f42526b, eVar, 7, (byte[]) null);
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f42527c) {
        }
        return ((au) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f42527c) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.f42525a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    ba baVar = (ba) this.f42526b;
                    this.f42525a = 1;
                    if (Animatable.animateTo$default(baVar.d(), Dp.m11162boximpl(0.0f), baVar.f42559g, null, null, this, 12, null) == aVar) {
                        return aVar;
                    }
                }
                return h.ab.f48028a;
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                if (this.f42525a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    ba baVar2 = (ba) this.f42526b;
                    this.f42525a = 1;
                    if (Animatable.animateTo$default(baVar2.c(), new Float(1.0f), baVar2.f42558f, null, null, this, 12, null) == aVar2) {
                        return aVar2;
                    }
                }
                return h.ab.f48028a;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                if (this.f42525a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    ba baVar3 = (ba) this.f42526b;
                    this.f42525a = 1;
                    if (Animatable.animateTo$default(baVar3.c(), new Float(0.0f), baVar3.f42554b, null, null, this, 12, null) == aVar3) {
                        return aVar3;
                    }
                }
                return h.ab.f48028a;
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                if (this.f42525a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    ba baVar4 = (ba) this.f42526b;
                    this.f42525a = 1;
                    if (Animatable.animateTo$default(baVar4.d(), Dp.m11162boximpl(-10.0f), baVar4.f42555c, null, null, this, 12, null) == aVar4) {
                        return aVar4;
                    }
                }
                return h.ab.f48028a;
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                if (this.f42525a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj2 = this.f42526b;
                    this.f42525a = 1;
                    if (ba.H((ba) obj2, null, new ci(), 0.0f, this, 12) == aVar5) {
                        return aVar5;
                    }
                }
                return h.ab.f48028a;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                if (this.f42525a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    Object obj3 = this.f42526b;
                    this.f42525a = 1;
                    if (ba.H((ba) obj3, null, new ci(), 0.0f, this, 12) == aVar6) {
                        return aVar6;
                    }
                }
                return h.ab.f48028a;
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                if (this.f42525a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f42525a = 1;
                    if (ba.H(((cg) this.f42526b).h(), null, new ci(), 0.0f, this, 12) == aVar7) {
                        return aVar7;
                    }
                }
                return h.ab.f48028a;
            default:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                if (this.f42525a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f42525a = 1;
                    if (ba.H(((cg) this.f42526b).i(), null, new ci(), 0.0f, this, 12) == aVar8) {
                        return aVar8;
                    }
                }
                return h.ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(ba baVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f42527c = i2;
        this.f42526b = baVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(ba baVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f42527c = i2;
        this.f42526b = baVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(ba baVar, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f42527c = i2;
        this.f42526b = baVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(ba baVar, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f42527c = i2;
        this.f42526b = baVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(ba baVar, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f42527c = i2;
        this.f42526b = baVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(cg cgVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42527c = i2;
        this.f42526b = cgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    au(cg cgVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f42527c = i2;
        this.f42526b = cgVar;
    }
}
