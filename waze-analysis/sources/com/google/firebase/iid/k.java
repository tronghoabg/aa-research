package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.o.t;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f9953a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f9954b = new ArrayMap();

    k(Executor executor) {
        this.f9953a = executor;
    }

    public static /* synthetic */ void b(k kVar, Pair pair) {
        synchronized (kVar) {
            kVar.f9954b.remove(pair);
        }
    }

    final synchronized t a(String str, b bVar) {
        final Pair pair = new Pair(str, ProxyConfig.MATCH_ALL_SCHEMES);
        Map map = this.f9954b;
        t tVar = (t) map.get(pair);
        if (tVar != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Joining ongoing request for: ".concat(pair.toString()));
            }
            return tVar;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Making new request for: ".concat(pair.toString()));
        }
        FirebaseInstanceId firebaseInstanceId = bVar.f9931a;
        String str2 = bVar.f9932b;
        String str3 = bVar.f9933c;
        m mVar = bVar.f9934d;
        t tVarC = FirebaseInstanceId.r(firebaseInstanceId, str2, str3, mVar).c(this.f9953a, new com.google.android.gms.o.a() { // from class: com.google.firebase.iid.j
            @Override // com.google.android.gms.o.a
            public final Object a(t tVar2) {
                k.b(this.f9951a, pair);
                return tVar2;
            }
        });
        map.put(pair, tVarC);
        return tVarC;
    }
}
