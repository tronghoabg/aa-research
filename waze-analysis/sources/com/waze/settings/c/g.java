package com.waze.settings.c;

import com.waze.settings.de;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f36936a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f36937b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ de f36938c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, de deVar, h.c.e eVar) {
        super(2, eVar);
        this.f36937b = hVar;
        this.f36938c = deVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new g(this.f36937b, this.f36938c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f36936a == 0) {
            e.b.c.b(obj);
            h hVar = this.f36937b;
            this.f36936a = 1;
            if (hVar.f36939a.f().collect(new f(hVar, this.f36938c), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
