package com.waze.bw.a.b;

import com.waze.av.b.at;
import h.ab;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f17599a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f17600b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f17601c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f17602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(v vVar, List list, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f17602d = i2;
        this.f17600b = vVar;
        this.f17601c = list;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f17602d != 0 ? new q(this.f17600b, (List) this.f17601c, eVar, 1) : new q(this.f17600b, (af) this.f17601c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f17602d != 0 ? ((q) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((q) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlinx.coroutines.af] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f17602d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f17599a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                this.f17599a = 1;
                if (v.i(this.f17600b, this.f17601c, this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f17599a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            v vVar = this.f17600b;
            this.f17599a = 1;
            if (at.o(vVar.f17615a, vVar.f17619e.a()).collect(new p(this.f17601c, vVar), this) == aVar2) {
                return aVar2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(v vVar, af afVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f17602d = i2;
        this.f17600b = vVar;
        this.f17601c = afVar;
    }
}
