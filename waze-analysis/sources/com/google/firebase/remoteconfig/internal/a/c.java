package com.google.firebase.remoteconfig.internal.a;

import android.support.v4.app.ac;
import android.util.Log;
import com.google.android.gms.o.o;
import com.google.android.gms.o.t;
import com.google.firebase.remoteconfig.d;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.h;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final f f10644a;

    /* renamed from: b, reason: collision with root package name */
    private final a f10645b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f10646c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f10647d = Collections.newSetFromMap(new ConcurrentHashMap());

    public c(f fVar, a aVar, Executor executor) {
        this.f10644a = fVar;
        this.f10645b = aVar;
        this.f10646c = executor;
    }

    public static /* synthetic */ void c(c cVar, t tVar, com.google.firebase.crashlytics.a.f fVar) throws JSONException {
        try {
            h hVar = (h) tVar.g();
            if (hVar != null) {
                cVar.f10646c.execute(new ac(fVar, cVar.f10645b.b(hVar), 19, null));
            }
        } catch (d e2) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e2);
        }
    }

    public final void a(h hVar) {
        try {
            com.google.firebase.remoteconfig.a.a.f fVarB = this.f10645b.b(hVar);
            Iterator it = this.f10647d.iterator();
            while (it.hasNext()) {
                this.f10646c.execute(new ac((com.google.firebase.crashlytics.a.f) it.next(), fVarB, 20, null));
            }
        } catch (d e2) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e2);
        }
    }

    public final void b(final com.google.firebase.crashlytics.a.f fVar) {
        this.f10647d.add(fVar);
        final t tVarA = this.f10644a.a();
        tVarA.q(this.f10646c, new o() { // from class: com.google.firebase.remoteconfig.internal.a.b
            @Override // com.google.android.gms.o.o
            public final void onSuccess(Object obj) throws JSONException {
                c.c(this.f10641a, tVarA, fVar);
            }
        });
    }
}
