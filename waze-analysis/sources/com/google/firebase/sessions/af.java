package com.google.firebase.sessions;

import androidx.datastore.preferences.core.MutablePreferences;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class af extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f10791a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f10792b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(String str, h.c.e eVar) {
        super(2, eVar);
        this.f10792b = str;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        af afVar = new af(this.f10792b, eVar);
        afVar.f10791a = obj;
        return afVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((af) create((MutablePreferences) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.f10791a;
        int i2 = aa.f10781a;
        mutablePreferences.set(aa.a(), this.f10792b);
        return h.ab.f48028a;
    }
}
