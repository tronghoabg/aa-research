package com.google.firebase.sessions;

import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.datastore.preferences.core.PreferencesKt;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class at extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f10842a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f10843b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f10844c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f10845d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(ag agVar, String str, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f10845d = i2;
        this.f10843b = agVar;
        this.f10844c = str;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f10845d;
        Object obj2 = this.f10843b;
        if (i2 != 0) {
            return new at((ag) obj2, (String) this.f10844c, eVar, 1);
        }
        return new at((av) obj2, (List) this.f10844c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f10845d != 0 ? ((at) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((at) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws RemoteException {
        if (this.f10845d != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            try {
                if (this.f10842a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    int i2 = ag.f10793a;
                    this.f10842a = 1;
                    if (PreferencesKt.edit(z.a(((ag) this.f10843b).f10795c), new af((String) this.f10844c, null), this) == aVar) {
                        return aVar;
                    }
                }
            } catch (IOException e2) {
                e2.toString();
                Log.w("FirebaseSessionsRepo", "Failed to update session Id: ".concat(e2.toString()));
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f10842a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f10842a = 1;
            obj = com.google.firebase.sessions.a.c.f10774a.a(this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        Map map = (Map) obj;
        if (map.isEmpty()) {
            new Integer(Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent."));
        } else {
            Collection collectionValues = map.values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                new Integer(Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event"));
            } else {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((com.google.firebase.crashlytics.a.c.j) it.next()).d()) {
                        Object obj2 = this.f10843b;
                        ?? r5 = this.f10844c;
                        Iterator it2 = h.a.i.al(h.a.i.ac(h.a.i.l(av.h(r5, 2), av.h(r5, 1))), new com.google.firebase.crashlytics.a.c.h(5)).iterator();
                        while (it2.hasNext()) {
                            av.c((av) obj2, (Message) it2.next());
                        }
                    }
                }
                new Integer(Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event"));
            }
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(av avVar, List list, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f10845d = i2;
        this.f10843b = avVar;
        this.f10844c = list;
    }
}
