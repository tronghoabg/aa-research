package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    static final Pattern f10709a;

    /* renamed from: b, reason: collision with root package name */
    static final Pattern f10710b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10711c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Set f10712d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Executor f10713e;

    /* renamed from: f, reason: collision with root package name */
    private final f f10714f;

    /* renamed from: g, reason: collision with root package name */
    private final f f10715g;

    static {
        Charset.forName("UTF-8");
        f10709a = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f10710b = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public n(Executor executor, f fVar, f fVar2) {
        this.f10713e = executor;
        this.f10714f = fVar;
        this.f10715g = fVar2;
    }

    private static String c(f fVar, String str) throws ExecutionException, TimeoutException {
        h hVarG = fVar.g();
        if (hVarG == null) {
            return null;
        }
        try {
            return hVarG.h().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Set d(f fVar) throws ExecutionException, TimeoutException {
        HashSet hashSet = new HashSet();
        h hVarG = fVar.g();
        if (hVarG != null) {
            Iterator<String> itKeys = hVarG.h().keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    public final Map a() throws ExecutionException, TimeoutException {
        z zVar;
        HashSet<String> hashSet = new HashSet();
        f fVar = this.f10714f;
        hashSet.addAll(d(fVar));
        f fVar2 = this.f10715g;
        hashSet.addAll(d(fVar2));
        HashMap map = new HashMap();
        for (String str : hashSet) {
            String strC = c(fVar, str);
            if (strC != null) {
                h hVarG = fVar.g();
                if (hVarG != null) {
                    Set set = this.f10712d;
                    synchronized (set) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            this.f10713e.execute(new android.support.v4.app.n((com.google.firebase.messaging.l) it.next(), str, hVarG, 8, (byte[]) null));
                        }
                    }
                }
                zVar = new z(strC, 2);
            } else {
                String strC2 = c(fVar2, str);
                if (strC2 != null) {
                    zVar = new z(strC2, 1);
                } else {
                    Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", "FirebaseRemoteConfigValue", str));
                    zVar = new z("", 0);
                }
            }
            map.put(str, zVar);
        }
        return map;
    }

    public final void b(com.google.firebase.messaging.l lVar) {
        Set set = this.f10712d;
        synchronized (set) {
            set.add(lVar);
        }
    }
}
