package com.waze.car_lib.i.b;

import com.waze.map.canvas.MainCanvasDelegatorImpl;
import com.waze.map.gb;
import com.waze.map.isolated.WazeMapWidgetNativeRenderer;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20002a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f20003b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f20004c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f20005d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f20006e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(ab abVar, kotlinx.coroutines.b.k kVar, WazeMapWidgetNativeRenderer wazeMapWidgetNativeRenderer, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20006e = i2;
        this.f20003b = abVar;
        this.f20004c = kVar;
        this.f20005d = wazeMapWidgetNativeRenderer;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.coroutines.b.ch, kotlinx.coroutines.b.k] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.b.ch, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f20006e;
        if (i2 == 0) {
            return new l((o) this.f20003b, (ch) this.f20004c, (MainCanvasDelegatorImpl) this.f20005d, eVar, 0);
        }
        if (i2 == 1) {
            return new l((kotlinx.coroutines.b.k) this.f20005d, (ch) this.f20004c, (MainCanvasDelegatorImpl) this.f20003b, eVar, 1);
        }
        Object obj2 = this.f20003b;
        if (i2 == 2) {
            return new l((ab) obj2, this.f20004c, (WazeMapWidgetNativeRenderer) this.f20005d, eVar, 2);
        }
        return new l((ah) obj2, (gb) this.f20005d, this.f20004c, eVar, 3);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f20006e;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? ((l) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((l) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((l) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((l) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f20006e;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f20002a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f20002a = 1;
                if (new j(ai.y(ai.q(((o) this.f20003b).f20017f.b(), this.f20004c, new t(null, 1, null))), 2).collect(new g(this.f20005d, 2), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f20002a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f20002a = 1;
                if (new j(ai.y(ai.q(this.f20005d, this.f20004c, new f(null))), 0).collect(new g(this.f20003b, 0), this) == aVar2) {
                    return aVar2;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f20002a == 0) {
                e.b.c.b(obj);
                Object obj2 = this.f20003b;
                Object obj3 = this.f20005d;
                kotlinx.coroutines.b.k kVar = this.f20004c;
                this.f20002a = 1;
                if (((ah) obj2).f19967a.collect(new af((gb) obj3, kVar), this) == aVar3) {
                    return aVar3;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar4 = h.c.a.a.f48038a;
        if (this.f20002a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj4 = this.f20003b;
            kotlinx.coroutines.b.k kVar2 = this.f20004c;
            ab abVar = (ab) obj4;
            ch chVar = abVar.f19953j;
            this.f20002a = 1;
            if (ai.r(chVar, kVar2, abVar.f19951h.b(), new v(null)).collect(new g(this.f20005d, 3), this) == aVar4) {
                return aVar4;
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(ah ahVar, gb gbVar, kotlinx.coroutines.b.k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20006e = i2;
        this.f20003b = ahVar;
        this.f20005d = gbVar;
        this.f20004c = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(o oVar, ch chVar, MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20006e = i2;
        this.f20003b = oVar;
        this.f20004c = chVar;
        this.f20005d = mainCanvasDelegatorImpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(kotlinx.coroutines.b.k kVar, ch chVar, MainCanvasDelegatorImpl mainCanvasDelegatorImpl, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f20006e = i2;
        this.f20005d = kVar;
        this.f20004c = chVar;
        this.f20003b = mainCanvasDelegatorImpl;
    }
}
