package com.google.firebase.sessions;

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ar extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f10838a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f10839b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f10840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(ag agVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f10840c = i2;
        this.f10839b = agVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f10840c;
        Object obj2 = this.f10839b;
        return i2 != 0 ? new ar((ag) obj2, eVar, 1) : new ar((String) obj2, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f10840c != 0 ? ((ar) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ar) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f10840c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f10838a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                ag agVar = (ag) this.f10839b;
                this.f10838a = 1;
                if (agVar.f10798f.collect(new y(agVar), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f10838a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f10838a = 1;
            obj = com.google.firebase.sessions.a.c.f10774a.a(this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        Collection collectionValues = ((Map) obj).values();
        Object obj2 = this.f10839b;
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            String str = (String) obj2;
            ((com.google.firebase.crashlytics.a.c.j) it.next()).b(new com.google.firebase.sessions.a.e(str));
            Log.d("SessionLifecycleClient", "Notified " + com.google.firebase.sessions.a.d.f10776a + " of new session " + str);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f10840c = i2;
        this.f10839b = str;
    }
}
