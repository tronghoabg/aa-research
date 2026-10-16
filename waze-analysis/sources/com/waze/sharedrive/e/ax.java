package com.waze.sharedrive.e;

import android.graphics.Bitmap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ax extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f38370a;

    /* renamed from: b, reason: collision with root package name */
    int f38371b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedrive.c.a.l f38372c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bc f38373d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bitmap f38374e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ax(com.waze.sharedrive.c.a.l lVar, bc bcVar, Bitmap bitmap, h.c.e eVar) {
        super(2, eVar);
        this.f38372c = lVar;
        this.f38373d = bcVar;
        this.f38374e = bitmap;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ax(this.f38372c, this.f38373d, this.f38374e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ax) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        String str;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f38371b != 0) {
            str = (String) this.f38370a;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.sharedrive.c.a.l lVar = this.f38372c;
            bc bcVar = this.f38373d;
            Bitmap bitmap = this.f38374e;
            String strD = lVar.d();
            this.f38370a = strD;
            this.f38371b = 1;
            obj = bc.e(bcVar, lVar, bitmap, this);
            if (obj == aVar) {
                return aVar;
            }
            str = strD;
        }
        return new h.k(str, obj);
    }
}
