package com.waze.ab.a;

import android.net.Uri;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ab extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f13678a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f13679b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f13680c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ad adVar, Uri uri, h.c.e eVar) {
        super(2, eVar);
        this.f13679b = adVar;
        this.f13680c = uri;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ab(this.f13679b, this.f13680c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ab) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f13678a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f13678a = 1;
            obj = aj.v(av.b(), new aa(this.f13679b, this.f13680c, null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ad adVar = this.f13679b;
        if (zBooleanValue) {
            adVar.F();
        } else {
            adVar.D();
        }
        return h.ab.f48028a;
    }
}
