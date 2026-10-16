package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.ArrayMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f10117a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f10118b = new ArrayMap();

    ab(Executor executor) {
        this.f10117a = executor;
    }

    public static /* synthetic */ void b(ab abVar, String str) {
        synchronized (abVar) {
            abVar.f10118b.remove(str);
        }
    }

    final synchronized com.google.android.gms.o.t a(final String str, o oVar) {
        Map map = this.f10118b;
        com.google.android.gms.o.t tVar = (com.google.android.gms.o.t) map.get(str);
        if (tVar != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: ".concat(String.valueOf(str)));
            }
            return tVar;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: ".concat(String.valueOf(str)));
        }
        FirebaseMessaging firebaseMessaging = oVar.f10218a;
        String str2 = oVar.f10219b;
        ag agVar = oVar.f10220c;
        com.google.android.gms.o.t tVarC = firebaseMessaging.f10064i.b().e(firebaseMessaging.m, new com.google.android.gms.o.s() { // from class: com.google.firebase.messaging.k
            @Override // com.google.android.gms.o.s
            public final com.google.android.gms.o.t a(Object obj) {
                return FirebaseMessaging.b(this.f10209a, str2, agVar, (String) obj);
            }
        }).c(this.f10117a, new com.google.android.gms.o.a() { // from class: com.google.firebase.messaging.aa
            @Override // com.google.android.gms.o.a
            public final Object a(com.google.android.gms.o.t tVar2) {
                ab.b(this.f10115a, str);
                return tVar2;
            }
        });
        map.put(str, tVarC);
        return tVarC;
    }
}
