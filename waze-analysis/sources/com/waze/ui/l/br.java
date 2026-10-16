package com.waze.ui.l;

import androidx.compose.animation.core.Animatable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class br extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f42601a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f42602b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f42603c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f42604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    br(Animatable animatable, cg cgVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42604d = i2;
        this.f42603c = animatable;
        this.f42602b = cgVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.waze.ui.l.ad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.waze.ui.l.ad, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f42604d;
        if (i2 == 0) {
            return new br((ba) this.f42602b, (ad) this.f42603c, eVar, 0);
        }
        if (i2 == 1) {
            return new br((ba) this.f42602b, (ad) this.f42603c, eVar, 1, (byte[]) null);
        }
        if (i2 == 2) {
            return new br((Animatable) this.f42603c, (cg) this.f42602b, eVar, 2);
        }
        if (i2 == 3) {
            return new br((ba) this.f42602b, (r) this.f42603c, eVar, 3);
        }
        Object obj2 = this.f42602b;
        if (i2 != 4) {
            return new br((ba) obj2, (r) this.f42603c, eVar, 5, (byte[]) null);
        }
        return new br((ba) obj2, (aa) this.f42603c, eVar, 4);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f42604d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? ((br) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((br) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((br) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((br) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((br) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((br) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.waze.ui.l.ad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.waze.ui.l.ad, java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f42604d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f42601a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f42602b;
                this.f42601a = 1;
                if (ba.H((ba) obj2, this.f42603c, new ci(), 0.0f, this, 12) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f42601a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj3 = this.f42602b;
                this.f42601a = 1;
                if (ba.o((ba) obj3, this.f42603c, this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f42601a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj4 = this.f42603c;
                this.f42601a = 1;
                if (Animatable.animateTo$default((Animatable) obj4, new Float(0.5f), ((cg) this.f42602b).f42676c, null, null, this, 12, null) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f42601a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj5 = this.f42602b;
                this.f42601a = 1;
                if (ba.H((ba) obj5, (ad) this.f42603c, new ci(), 0.0f, this, 12) == aVar4) {
                    return aVar4;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 4) {
            h.c.a.a aVar5 = h.c.a.a.f48038a;
            if (this.f42601a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj6 = this.f42602b;
                this.f42601a = 1;
                if (ba.H((ba) obj6, (ad) this.f42603c, new ci(), 0.0f, this, 12) == aVar5) {
                    return aVar5;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar6 = h.c.a.a.f48038a;
        if (this.f42601a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj7 = this.f42602b;
            this.f42601a = 1;
            if (ba.H((ba) obj7, (ad) this.f42603c, new ci(), l.d(), this, 8) == aVar6) {
                return aVar6;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    br(ba baVar, aa aaVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42604d = i2;
        this.f42602b = baVar;
        this.f42603c = aaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    br(ba baVar, ad adVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42604d = i2;
        this.f42602b = baVar;
        this.f42603c = adVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    br(ba baVar, ad adVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f42604d = i2;
        this.f42602b = baVar;
        this.f42603c = adVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    br(ba baVar, r rVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f42604d = i2;
        this.f42602b = baVar;
        this.f42603c = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    br(ba baVar, r rVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f42604d = i2;
        this.f42602b = baVar;
        this.f42603c = rVar;
    }
}
