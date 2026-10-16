package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.preferences.core.PreferencesFactory;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ab extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f10783a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f10784b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f10785c;

    ab(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ab abVar = new ab((h.c.e) obj3);
        abVar.f10785c = (kotlinx.coroutines.b.l) obj;
        abVar.f10784b = (Throwable) obj2;
        return abVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f10783a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.f10785c;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f10784b);
            this.f10785c = null;
            this.f10783a = 1;
            if (lVar.emit(PreferencesFactory.createEmpty(), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
