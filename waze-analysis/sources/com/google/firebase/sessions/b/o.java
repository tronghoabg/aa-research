package com.google.firebase.sessions.b;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static final Preferences.Key f10912a = PreferencesKeys.booleanKey("firebase_sessions_enabled");

    /* renamed from: b, reason: collision with root package name */
    private static final Preferences.Key f10913b = PreferencesKeys.doubleKey("firebase_sessions_sampling_rate");

    /* renamed from: c, reason: collision with root package name */
    private static final Preferences.Key f10914c = PreferencesKeys.intKey("firebase_sessions_restart_timeout");

    /* renamed from: d, reason: collision with root package name */
    private static final Preferences.Key f10915d = PreferencesKeys.intKey("firebase_sessions_cache_duration");

    /* renamed from: e, reason: collision with root package name */
    private static final Preferences.Key f10916e = PreferencesKeys.longKey("firebase_sessions_cache_updated_time");

    /* renamed from: f, reason: collision with root package name */
    private final DataStore f10917f;

    /* renamed from: g, reason: collision with root package name */
    private h f10918g;

    public o(DataStore dataStore) {
        x.f(dataStore, "dataStore");
        this.f10917f = dataStore;
        aj.t(h.c.k.f48060a, new l(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(androidx.datastore.preferences.core.Preferences.Key r6, java.lang.Object r7, h.c.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.firebase.sessions.b.m
            if (r0 == 0) goto L13
            r0 = r8
            com.google.firebase.sessions.b.m r0 = (com.google.firebase.sessions.b.m) r0
            int r1 = r0.f10907c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10907c = r1
            goto L18
        L13:
            com.google.firebase.sessions.b.m r0 = new com.google.firebase.sessions.b.m
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f10905a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f10907c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r8)     // Catch: java.io.IOException -> L45
            goto L58
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r8)
            androidx.datastore.core.DataStore r8 = r5.f10917f     // Catch: java.io.IOException -> L45
            com.google.firebase.sessions.b.n r2 = new com.google.firebase.sessions.b.n     // Catch: java.io.IOException -> L45
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L45
            h.g.a.p r2 = (h.g.a.p) r2     // Catch: java.io.IOException -> L45
            r0.f10907c = r3     // Catch: java.io.IOException -> L45
            java.lang.Object r5 = androidx.datastore.preferences.core.PreferencesKt.edit(r8, r2, r0)     // Catch: java.io.IOException -> L45
            if (r5 != r1) goto L58
            return r1
        L45:
            r5 = move-exception
            r5.toString()
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Failed to update cache config value: "
            java.lang.String r5 = r6.concat(r5)
            java.lang.String r6 = "SettingsCache"
            android.util.Log.w(r6, r5)
        L58:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.b.o.m(androidx.datastore.preferences.core.Preferences$Key, java.lang.Object, h.c.e):java.lang.Object");
    }

    public final Boolean b() {
        h hVar = this.f10918g;
        if (hVar == null) {
            x.j("sessionConfigs");
            hVar = null;
        }
        return hVar.a();
    }

    public final Double c() {
        h hVar = this.f10918g;
        if (hVar == null) {
            x.j("sessionConfigs");
            hVar = null;
        }
        return hVar.b();
    }

    public final Integer d() {
        h hVar = this.f10918g;
        if (hVar == null) {
            x.j("sessionConfigs");
            hVar = null;
        }
        return hVar.d();
    }

    public final Object e(Double d2, h.c.e eVar) {
        Object objM = m(f10913b, d2, eVar);
        return objM == h.c.a.a.f48038a ? objM : ab.f48028a;
    }

    public final Object f(Integer num, h.c.e eVar) {
        Object objM = m(f10915d, num, eVar);
        return objM == h.c.a.a.f48038a ? objM : ab.f48028a;
    }

    public final Object g(Long l2, h.c.e eVar) {
        Object objM = m(f10916e, l2, eVar);
        return objM == h.c.a.a.f48038a ? objM : ab.f48028a;
    }

    public final Object h(Integer num, h.c.e eVar) {
        Object objM = m(f10914c, num, eVar);
        return objM == h.c.a.a.f48038a ? objM : ab.f48028a;
    }

    public final Object i(Boolean bool, h.c.e eVar) {
        Object objM = m(f10912a, bool, eVar);
        return objM == h.c.a.a.f48038a ? objM : ab.f48028a;
    }

    public final boolean k() {
        h hVar = this.f10918g;
        h hVar2 = null;
        if (hVar == null) {
            x.j("sessionConfigs");
            hVar = null;
        }
        Long lE = hVar.e();
        h hVar3 = this.f10918g;
        if (hVar3 == null) {
            x.j("sessionConfigs");
        } else {
            hVar2 = hVar3;
        }
        Integer numC = hVar2.c();
        if (lE == null || numC == null) {
            return true;
        }
        return (System.currentTimeMillis() - lE.longValue()) / 1000 >= ((long) numC.intValue());
    }
}
