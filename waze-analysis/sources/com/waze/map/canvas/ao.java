package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ao extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f28536a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MainCanvasDelegatorImpl f28537b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f28538c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f28539d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f28539d = i2;
        this.f28537b = mainCanvasDelegatorImpl;
        this.f28538c = lVar;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r3v6, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        switch (this.f28539d) {
            case 0:
                return new ao((kotlinx.coroutines.b.k) this.f28538c, this.f28537b, eVar, 0);
            case 1:
                return new ao((kotlinx.coroutines.b.k) this.f28538c, this.f28537b, eVar, 1, (byte[]) null);
            case 2:
                return new ao((kotlinx.coroutines.b.k) this.f28538c, this.f28537b, eVar, 2, (char[]) null);
            case 3:
                return new ao((kotlinx.coroutines.b.k) this.f28538c, this.f28537b, eVar, 3, (short[]) null);
            case 4:
                return new ao((kotlinx.coroutines.b.k) this.f28538c, this.f28537b, eVar, 4, (int[]) null);
            case 5:
                return new ao((kotlinx.coroutines.b.k) this.f28538c, this.f28537b, eVar, 5, (boolean[]) null);
            case 6:
                return new ao((kotlinx.coroutines.b.k) this.f28538c, this.f28537b, eVar, 6, (float[]) null);
            case 7:
                return new ao(this.f28537b, (h.g.a.l) this.f28538c, eVar, 7);
            default:
                return new ao(this.f28537b, (h.g.a.l) this.f28538c, eVar, 8, (byte[]) null);
        }
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f28539d) {
        }
        return ((ao) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f28539d) {
            case 0:
                h.c.a.a aVar = h.c.a.a.f48038a;
                if (this.f28536a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f28536a = 1;
                    if (kotlinx.coroutines.b.ai.y(new ai(this.f28538c, 3)).collect(new ak(this.f28537b, 3), this) == aVar) {
                        return aVar;
                    }
                }
                return h.ab.f48028a;
            case 1:
                h.c.a.a aVar2 = h.c.a.a.f48038a;
                if (this.f28536a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f28536a = 1;
                    if (kotlinx.coroutines.b.ai.y(new ai(this.f28538c, 2)).collect(new ak(this.f28537b, 2), this) == aVar2) {
                        return aVar2;
                    }
                }
                return h.ab.f48028a;
            case 2:
                h.c.a.a aVar3 = h.c.a.a.f48038a;
                if (this.f28536a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f28536a = 1;
                    if (this.f28538c.collect(new ak(this.f28537b, 4), this) == aVar3) {
                        return aVar3;
                    }
                }
                return h.ab.f48028a;
            case 3:
                h.c.a.a aVar4 = h.c.a.a.f48038a;
                if (this.f28536a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f28536a = 1;
                    if (this.f28538c.collect(new ak(this.f28537b, 5), this) == aVar4) {
                        return aVar4;
                    }
                }
                return h.ab.f48028a;
            case 4:
                h.c.a.a aVar5 = h.c.a.a.f48038a;
                if (this.f28536a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f28536a = 1;
                    if (this.f28538c.collect(new ak(this.f28537b, 6), this) == aVar5) {
                        return aVar5;
                    }
                }
                return h.ab.f48028a;
            case 5:
                h.c.a.a aVar6 = h.c.a.a.f48038a;
                if (this.f28536a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f28536a = 1;
                    if (this.f28538c.collect(new ak(this.f28537b, 7), this) == aVar6) {
                        return aVar6;
                    }
                }
                return h.ab.f48028a;
            case 6:
                h.c.a.a aVar7 = h.c.a.a.f48038a;
                if (this.f28536a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f28536a = 1;
                    if (this.f28538c.collect(new ak(this.f28537b, 8), this) == aVar7) {
                        return aVar7;
                    }
                }
                return h.ab.f48028a;
            case 7:
                h.c.a.a aVar8 = h.c.a.a.f48038a;
                if (this.f28536a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    this.f28536a = 1;
                    if (this.f28537b.f28486g.a().collect(new ak(this.f28538c, 9), this) == aVar8) {
                        return aVar8;
                    }
                }
                return h.ab.f48028a;
            default:
                h.c.a.a aVar9 = h.c.a.a.f48038a;
                if (this.f28536a == 0) {
                    e.b.c.b(obj);
                    MainCanvasDelegatorImpl mainCanvasDelegatorImpl = this.f28537b;
                    Object obj2 = this.f28538c;
                    this.f28536a = 1;
                    if (mainCanvasDelegatorImpl.f28491l.collect(new ak(obj2, 10), this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    e.b.c.b(obj);
                }
                throw new h.e();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.g.a.l lVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f28539d = i2;
        this.f28537b = mainCanvasDelegatorImpl;
        this.f28538c = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(kotlinx.coroutines.b.k kVar, MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f28539d = i2;
        this.f28538c = kVar;
        this.f28537b = mainCanvasDelegatorImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(kotlinx.coroutines.b.k kVar, MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f28539d = i2;
        this.f28538c = kVar;
        this.f28537b = mainCanvasDelegatorImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(kotlinx.coroutines.b.k kVar, MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f28539d = i2;
        this.f28538c = kVar;
        this.f28537b = mainCanvasDelegatorImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(kotlinx.coroutines.b.k kVar, MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar, int i2, float[] fArr) {
        super(2, eVar);
        this.f28539d = i2;
        this.f28538c = kVar;
        this.f28537b = mainCanvasDelegatorImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(kotlinx.coroutines.b.k kVar, MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar, int i2, int[] iArr) {
        super(2, eVar);
        this.f28539d = i2;
        this.f28538c = kVar;
        this.f28537b = mainCanvasDelegatorImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(kotlinx.coroutines.b.k kVar, MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f28539d = i2;
        this.f28538c = kVar;
        this.f28537b = mainCanvasDelegatorImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(kotlinx.coroutines.b.k kVar, MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar, int i2, boolean[] zArr) {
        super(2, eVar);
        this.f28539d = i2;
        this.f28538c = kVar;
        this.f28537b = mainCanvasDelegatorImpl;
    }
}
