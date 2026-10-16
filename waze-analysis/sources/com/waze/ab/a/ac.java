package com.waze.ab.a;

import android.net.Uri;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ac extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f13681a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f13682b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f13683c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Uri f13684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ad adVar, Uri uri, Uri uri2, h.c.e eVar) {
        super(2, eVar);
        this.f13682b = adVar;
        this.f13683c = uri;
        this.f13684d = uri2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ac(this.f13682b, this.f13683c, this.f13684d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ac) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f13681a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ad adVar = this.f13682b;
            Uri uri = this.f13683c;
            Uri uri2 = this.f13684d;
            this.f13681a = 1;
            if (adVar.n.emit(new r(uri, uri2, adVar.o), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
