package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bb extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ float f27165a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bf f27166b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f27167c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f27168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bb(float f2, bf bfVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27168d = i2;
        this.f27165a = f2;
        this.f27166b = bfVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f27168d;
        if (i2 == 0) {
            bb bbVar = new bb(this.f27165a, this.f27166b, eVar, 0);
            bbVar.f27167c = obj;
            return bbVar;
        }
        if (i2 != 1) {
            bb bbVar2 = new bb(this.f27166b, this.f27165a, eVar, 2, null);
            bbVar2.f27167c = obj;
            return bbVar2;
        }
        bb bbVar3 = new bb(this.f27166b, this.f27165a, eVar, 1);
        bbVar3.f27167c = obj;
        return bbVar3;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f27168d;
        return i2 != 0 ? i2 != 1 ? ((bb) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bb) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((bb) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f27168d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f27167c;
            bf bfVar = this.f27166b;
            float f2 = this.f27165a + 16.0f;
            kotlinx.coroutines.aj.z(afVar, null, null, new aw(bfVar, f2, (h.c.e) null, 11, (boolean[][]) null), 3);
            kotlinx.coroutines.aj.z(afVar, null, null, new aw(bfVar, f2, (h.c.e) null, 12, (float[][]) null), 3);
            return kotlinx.coroutines.aj.z(afVar, null, null, new ar(bfVar, (h.c.e) null, 8, (char[][]) null), 3);
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            kotlinx.coroutines.af afVar2 = (kotlinx.coroutines.af) this.f27167c;
            bf bfVar2 = this.f27166b;
            if (bfVar2.h().e().h() != com.waze.z.a.b.ad.f45733a) {
                bfVar2.u().w();
                kotlinx.coroutines.aj.z(afVar2, null, null, new ar(bfVar2, (h.c.e) null, 9, (short[][]) null), 3);
            }
            float f3 = this.f27165a;
            kotlinx.coroutines.aj.z(afVar2, null, null, new aw(bfVar2, f3, (h.c.e) null, 13, (byte[][][]) null), 3);
            kotlinx.coroutines.aj.z(afVar2, null, null, new aw(bfVar2, f3, (h.c.e) null, 14, (char[][][]) null), 3);
            bfVar2.u().q();
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        kotlinx.coroutines.af afVar3 = (kotlinx.coroutines.af) this.f27167c;
        bf bfVar3 = this.f27166b;
        if (bfVar3.h().e().h() != com.waze.z.a.b.ad.f45733a) {
            bfVar3.u().w();
            kotlinx.coroutines.aj.z(afVar3, null, null, new ar(bfVar3, (h.c.e) null, 5, (boolean[]) null), 3);
        }
        float f4 = this.f27165a;
        kotlinx.coroutines.aj.z(afVar3, null, null, new aw(bfVar3, f4, (h.c.e) null, 3, (short[]) null), 3);
        kotlinx.coroutines.aj.z(afVar3, null, null, new aw(bfVar3, f4, (h.c.e) null, 4, (int[]) null), 3);
        bfVar3.u().q();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bb(bf bfVar, float f2, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27168d = i2;
        this.f27166b = bfVar;
        this.f27165a = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bb(bf bfVar, float f2, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f27168d = i2;
        this.f27166b = bfVar;
        this.f27165a = f2;
    }
}
