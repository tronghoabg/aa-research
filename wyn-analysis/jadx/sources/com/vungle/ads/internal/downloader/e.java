package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static OkHttpClient f32948a;

    public static OkHttpClient a(PathProvider pathProvider) {
        AbstractC3340k.e(pathProvider, "pathProvider");
        OkHttpClient okHttpClient = f32948a;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.b(60L, timeUnit);
        builder.a(60L, timeUnit);
        builder.k = null;
        builder.f42349h = true;
        builder.f42350i = true;
        ConfigManager.INSTANCE.getClass();
        long jE = ConfigManager.e();
        int iD = ConfigManager.d();
        String absolutePath = pathProvider.getCleverCacheDir().getAbsolutePath();
        AbstractC3340k.d(absolutePath, "pathProvider.getCleverCacheDir().absolutePath");
        long jMin = Math.min(jE, (PathProvider.a(absolutePath) * iD) / 100);
        if (jMin > 0) {
            builder.k = new Cache(pathProvider.getCleverCacheDir(), jMin);
        } else {
            boolean z2 = u.f33874a;
            t.c("AssetDownloader", "cache disk capacity size <=0, no clever cache active.");
        }
        OkHttpClient okHttpClient2 = new OkHttpClient(builder);
        f32948a = okHttpClient2;
        return okHttpClient2;
    }
}
