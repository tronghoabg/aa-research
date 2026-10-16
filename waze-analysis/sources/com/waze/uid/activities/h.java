package com.waze.uid.activities;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f44093a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ UidFragmentActivity f44094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(UidFragmentActivity uidFragmentActivity, h.c.e eVar) {
        super(2, eVar);
        this.f44094b = uidFragmentActivity;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new h(this.f44094b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f44093a == 0) {
            e.b.c.b(obj);
            UidFragmentActivity uidFragmentActivity = this.f44094b;
            this.f44093a = 1;
            if (uidFragmentActivity.f().t().collect(new g(uidFragmentActivity), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
