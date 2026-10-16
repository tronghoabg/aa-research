package com.moloco.sdk.internal.services.init;

import R8.v;
import android.content.SharedPreferences;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f29664a;

    /* renamed from: b, reason: collision with root package name */
    public final Lf.d f29665b;

    public k(SharedPreferences sharedPreferences, Lf.d ioDispatcherContext) {
        AbstractC3340k.e(ioDispatcherContext, "ioDispatcherContext");
        this.f29664a = sharedPreferences;
        this.f29665b = ioDispatcherContext;
    }

    public static final void a(k kVar, a aVar, SharedPreferences sharedPreferences) {
        String str;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Performing migration for cache key: " + aVar.a(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Migrating from v0 to v1 for cache key: " + aVar.a(), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Total keys in cache: " + sharedPreferences.getAll().size(), null, false, 12, null);
        Map<String, ?> all = sharedPreferences.getAll();
        AbstractC3340k.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            str = aVar.f29626a;
            if (!zHasNext) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            AbstractC3340k.d(key, "<get-key>(...)");
            List listI0 = Bf.k.I0(key, new String[]{"___"});
            if (AbstractC3340k.a(ff.o.s0(listI0), str) && AbstractC3340k.a(ff.o.z0(listI0), "v0")) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "Number of existing V0 keys in cache: " + linkedHashMap.size(), null, false, 12, null);
        if (linkedHashMap.isEmpty()) {
            MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", v.f("No v0 cache keys found for migration for appKey: ", str), null, false, 12, null);
            return;
        }
        MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "Found v0 cache key: " + ((String) ff.o.p0(linkedHashMap.keySet())) + ", migrating to new key: " + aVar.a(), null, false, 12, null);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        AbstractC3340k.d(editor, "editor");
        String strA = aVar.a();
        Object objP0 = ff.o.p0(linkedHashMap.values());
        editor.putString(strA, objP0 instanceof String ? (String) objP0 : null);
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            editor.remove((String) ((Map.Entry) it2.next()).getKey());
        }
        editor.commit();
    }
}
