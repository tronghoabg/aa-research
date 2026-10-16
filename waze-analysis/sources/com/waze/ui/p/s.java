package com.waze.ui.p;

import com.waze.map.co;
import com.waze.map.cp;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f43229a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f43230b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(boolean z, i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f43229a = z;
        this.f43230b = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new s(this.f43229a, this.f43230b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((s) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f43229a;
        i iVar = this.f43230b;
        if (z) {
            iVar.a().D(cp.f28685a);
        } else {
            iVar.a().D(co.f28684a);
        }
        return ab.f48028a;
    }
}
