package com.waze.network.d;

import com.waze.authentication.x;
import e.a.ch;
import e.a.cm;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f32203a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f32204b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f32205c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f32206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(e eVar, com.waze.authentication.a aVar, h.c.e eVar2, int i2) {
        super(2, eVar2);
        this.f32206d = i2;
        this.f32205c = eVar;
        this.f32204b = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f32206d != 0) {
            return new j((e) this.f32205c, (com.waze.authentication.a) this.f32204b, eVar, 1);
        }
        return new j((l) this.f32204b, (e.a.d) this.f32205c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f32206d != 0 ? ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((j) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f32206d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f32203a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f32205c;
                Object obj3 = this.f32204b;
                this.f32203a = 1;
                if (((e) obj2).f32187a.c(obj3, false, this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f32203a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f32203a = 1;
            obj = ((l) this.f32204b).f32210b.a(new x(false), this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        cm cmVar = new cm();
        ch chVar = l.f32209a;
        String strB = ((com.waze.authentication.a) obj).b();
        h.g.b.x.f(strB, "<this>");
        cmVar.i(chVar, "Waze ".concat(String.valueOf(strB)));
        ((e.a.d) this.f32205c).a(cmVar);
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(l lVar, e.a.d dVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f32206d = i2;
        this.f32204b = lVar;
        this.f32205c = dVar;
    }
}
