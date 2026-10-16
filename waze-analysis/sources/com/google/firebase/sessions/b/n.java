package com.google.firebase.sessions.b;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f10908a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f10909b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Preferences.Key f10910c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o f10911d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(Object obj, Preferences.Key key, o oVar, h.c.e eVar) {
        super(2, eVar);
        this.f10909b = obj;
        this.f10910c = key;
        this.f10911d = oVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        n nVar = new n(this.f10909b, this.f10910c, this.f10911d, eVar);
        nVar.f10908a = obj;
        return nVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((n) create((MutablePreferences) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.f10908a;
        Object obj2 = this.f10909b;
        Preferences.Key key = this.f10910c;
        if (obj2 != null) {
            mutablePreferences.set(key, obj2);
        } else {
            mutablePreferences.remove(key);
        }
        MutablePreferences mutablePreferences2 = mutablePreferences;
        this.f10911d.f10918g = new h((Boolean) mutablePreferences2.get(o.f10912a), (Double) mutablePreferences2.get(o.f10913b), (Integer) mutablePreferences2.get(o.f10914c), (Integer) mutablePreferences2.get(o.f10915d), (Long) mutablePreferences2.get(o.f10916e));
        return ab.f48028a;
    }
}
