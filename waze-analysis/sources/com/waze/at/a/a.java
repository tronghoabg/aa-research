package com.waze.at.a;

import com.waze.asks.ax;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f15651a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f15652b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, e eVar) {
        super(2, eVar);
        this.f15652b = bVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new a(this.f15652b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((a) create((af) obj, (e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f15651a != 0) {
            c.b(obj);
        } else {
            c.b(obj);
            b bVar = this.f15652b;
            this.f15651a = 1;
            if (bVar.f15654b.b(new ax(bVar, 4), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
