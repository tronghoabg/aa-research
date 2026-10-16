package com.google.firebase.sessions.b;

import androidx.datastore.preferences.core.Preferences;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class l extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f10902a;

    /* renamed from: b, reason: collision with root package name */
    int f10903b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o f10904c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(o oVar, h.c.e eVar) {
        super(2, eVar);
        this.f10904c = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new l(this.f10904c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((l) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        o oVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f10903b != 0) {
            oVar = (o) this.f10902a;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            o oVar2 = this.f10904c;
            this.f10902a = oVar2;
            this.f10903b = 1;
            Object objH = ai.h(oVar2.f10917f.getData(), this);
            if (objH == aVar) {
                return aVar;
            }
            obj = objH;
            oVar = oVar2;
        }
        Preferences preferences = ((Preferences) obj).toPreferences();
        oVar.f10918g = new h((Boolean) preferences.get(o.f10912a), (Double) preferences.get(o.f10913b), (Integer) preferences.get(o.f10914c), (Integer) preferences.get(o.f10915d), (Long) preferences.get(o.f10916e));
        return ab.f48028a;
    }
}
