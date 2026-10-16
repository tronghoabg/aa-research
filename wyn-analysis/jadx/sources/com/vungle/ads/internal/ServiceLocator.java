package com.vungle.ads.internal;

import Va.M6;
import android.content.Context;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0007\bJ!\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/ServiceLocator;", "", "T", "Ljava/lang/Class;", "serviceClass", "getService", "(Ljava/lang/Class;)Ljava/lang/Object;", "com/vungle/ads/internal/v1", "com/vungle/ads/internal/w1", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class ServiceLocator {

    @Nullable
    private static volatile ServiceLocator INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    public static final v1 f32912d = new v1();

    /* renamed from: a, reason: collision with root package name */
    public final Context f32913a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f32914b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f32915c;

    public /* synthetic */ ServiceLocator(Context context, int i5) {
        this(context);
    }

    public final void b() {
        this.f32914b.put(com.vungle.ads.internal.task.e.class, new d2(this));
        this.f32914b.put(com.vungle.ads.internal.task.h.class, new e2(this));
        this.f32914b.put(VungleApiClient.class, new f2(this));
        this.f32914b.put(com.vungle.ads.internal.platform.f.class, new g2(this));
        this.f32914b.put(com.vungle.ads.internal.executor.a.class, new h2());
        this.f32914b.put(com.vungle.ads.internal.omsdk.c.class, new i2(this));
        this.f32914b.put(com.vungle.ads.internal.omsdk.d.class, new j2());
        this.f32914b.put(FilePreferences.class, new k2(this));
        this.f32914b.put(com.vungle.ads.internal.locale.a.class, new l2());
        this.f32914b.put(com.vungle.ads.internal.bidding.e.class, new x1(this));
        this.f32914b.put(PathProvider.class, new y1(this));
        this.f32914b.put(com.vungle.ads.internal.downloader.m.class, new z1(this));
        this.f32914b.put(com.vungle.ads.internal.util.k.class, new a2());
        this.f32914b.put(com.vungle.ads.internal.signals.j.class, new b2(this));
        this.f32914b.put(com.vungle.ads.internal.network.r.class, new c2(this));
    }

    public final synchronized <T> T getService(@NotNull Class<T> serviceClass) {
        AbstractC3340k.e(serviceClass, "serviceClass");
        return (T) a(serviceClass);
    }

    public ServiceLocator(Context context) {
        Context applicationContext = context.getApplicationContext();
        AbstractC3340k.d(applicationContext, "context.applicationContext");
        this.f32913a = applicationContext;
        this.f32914b = new HashMap();
        this.f32915c = new HashMap();
        b();
    }

    public final Object a(Class cls) {
        for (Class cls2 : this.f32914b.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                Object obj = this.f32915c.get(cls2);
                if (obj != null) {
                    return obj;
                }
                w1 w1Var = (w1) this.f32914b.get(cls2);
                if (w1Var != null) {
                    Object objA = w1Var.a();
                    if (w1Var.f33883a) {
                        this.f32915c.put(cls2, objA);
                    }
                    return objA;
                }
                throw new IllegalArgumentException("Unknown class");
            }
        }
        throw new IllegalArgumentException(M6.n(cls, "Unknown dependency for "));
    }
}
