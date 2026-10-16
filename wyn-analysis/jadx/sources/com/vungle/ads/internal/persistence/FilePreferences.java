package com.vungle.ads.internal.persistence;

import C8.d;
import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.n;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/persistence/FilePreferences;", "", "", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "getString", "com/vungle/ads/internal/persistence/a", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class FilePreferences {

    /* renamed from: d, reason: collision with root package name */
    public static final a f33485d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f33486e = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Executor f33487a;

    /* renamed from: b, reason: collision with root package name */
    public final File f33488b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f33489c;

    public /* synthetic */ FilePreferences(j jVar, PathProvider pathProvider, String str, int i5) {
        this(jVar, pathProvider, str);
    }

    public final void b() {
        this.f33487a.execute(new d(6, this, new HashMap(this.f33489c)));
    }

    public final String c() {
        Object obj = this.f33489c.get("previous_tcf_token");
        return obj instanceof String ? (String) obj : "";
    }

    @Nullable
    public final String getString(@NotNull String key) {
        AbstractC3340k.e(key, "key");
        Object obj = this.f33489c.get(key);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public FilePreferences(j jVar, PathProvider pathProvider, String str) throws Throwable {
        this.f33487a = jVar;
        File file = new File(pathProvider.a(), str);
        this.f33488b = file;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f33489c = concurrentHashMap;
        Object objC = n.c(file);
        if (objC instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) objC);
        }
    }

    public static final void a(FilePreferences this$0, Serializable serializable) throws Throwable {
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(serializable, "$serializable");
        n.a(this$0.f33488b, serializable);
    }

    public final FilePreferences a(boolean z2, String key) {
        AbstractC3340k.e(key, "key");
        this.f33489c.put(key, Boolean.valueOf(z2));
        return this;
    }

    public final FilePreferences b(String key, int i5) {
        AbstractC3340k.e(key, "key");
        this.f33489c.put(key, Integer.valueOf(i5));
        return this;
    }

    public final Boolean a(String key) {
        AbstractC3340k.e(key, "key");
        Object obj = this.f33489c.get(key);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final FilePreferences b(String key, long j8) {
        AbstractC3340k.e(key, "key");
        this.f33489c.put(key, Long.valueOf(j8));
        return this;
    }

    public final FilePreferences a(String key, String value) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        this.f33489c.put(key, value);
        return this;
    }

    public final int a(String key, int i5) {
        AbstractC3340k.e(key, "key");
        Object obj = this.f33489c.get(key);
        return obj instanceof Integer ? ((Number) obj).intValue() : i5;
    }

    public final long a(String key, long j8) {
        AbstractC3340k.e(key, "key");
        Object obj = this.f33489c.get(key);
        return obj instanceof Long ? ((Number) obj).longValue() : j8;
    }
}
