package com.waze.location.b;

import h.ab;
import h.g.a.p;
import java.util.Objects;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f25317a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f25318b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f25319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(CompletableDeferred completableDeferred, i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f25318b = completableDeferred;
        this.f25319c = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new g(this.f25318b, this.f25319c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f25317a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f25317a = 1;
            obj = this.f25318b.c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        c cVar = (c) obj;
        com.waze.shared_infra.i.e eVar = this.f25319c.f25329d;
        Objects.toString(cVar);
        eVar.a("fresh location lookup done within timeout, result: ".concat(String.valueOf(cVar)));
        return obj;
    }
}
