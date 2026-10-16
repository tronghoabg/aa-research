package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: r, reason: collision with root package name */
    private static IThreadPoolCallback f24328r;

    /* renamed from: s, reason: collision with root package name */
    private static ThreadPoolExecutor f24329s;

    /* renamed from: a, reason: collision with root package name */
    private final Context f24330a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.c f24331b;

    /* renamed from: c, reason: collision with root package name */
    private final IStatisticMonitor f24332c;

    /* renamed from: d, reason: collision with root package name */
    private final INetWork f24333d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f24334e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f24335f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.geckox.a.a.a f24336g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f24337h;

    /* renamed from: i, reason: collision with root package name */
    private final String f24338i;

    /* renamed from: j, reason: collision with root package name */
    private final String f24339j;
    private final String k;

    /* renamed from: l, reason: collision with root package name */
    private final String f24340l;

    /* renamed from: m, reason: collision with root package name */
    private final String f24341m;

    /* renamed from: n, reason: collision with root package name */
    private final File f24342n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f24343o;

    /* renamed from: p, reason: collision with root package name */
    private final long f24344p;

    /* renamed from: q, reason: collision with root package name */
    private JSONObject f24345q;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private INetWork f24346a;

        /* renamed from: b, reason: collision with root package name */
        private List<String> f24347b;

        /* renamed from: c, reason: collision with root package name */
        private List<String> f24348c;

        /* renamed from: d, reason: collision with root package name */
        private Context f24349d;

        /* renamed from: e, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.c f24350e;

        /* renamed from: f, reason: collision with root package name */
        private IStatisticMonitor f24351f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f24352g = true;

        /* renamed from: h, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.geckox.a.a.a f24353h;

        /* renamed from: i, reason: collision with root package name */
        private Long f24354i;

        /* renamed from: j, reason: collision with root package name */
        private String f24355j;
        private String k;

        /* renamed from: l, reason: collision with root package name */
        private String f24356l;

        /* renamed from: m, reason: collision with root package name */
        private File f24357m;

        /* renamed from: n, reason: collision with root package name */
        private String f24358n;

        /* renamed from: o, reason: collision with root package name */
        private String f24359o;

        /* renamed from: p, reason: collision with root package name */
        private long f24360p;

        public a(Context context) {
            this.f24349d = context.getApplicationContext();
        }

        public final a a(String... strArr) {
            this.f24348c = Arrays.asList(strArr);
            return this;
        }

        public final a b(String... strArr) {
            this.f24347b = Arrays.asList(strArr);
            return this;
        }

        public final a c(String str) {
            this.f24356l = str;
            return this;
        }

        public final a a(INetWork iNetWork) {
            this.f24346a = iNetWork;
            return this;
        }

        public final a b() {
            this.f24354i = 38L;
            return this;
        }

        public final a a(long j8) {
            this.f24360p = j8;
            return this;
        }

        public final a b(String str) {
            this.k = str;
            return this;
        }

        public final a a(IStatisticMonitor iStatisticMonitor) {
            this.f24351f = iStatisticMonitor;
            return this;
        }

        public final a a() {
            this.f24352g = false;
            return this;
        }

        public final a a(com.bykv.vk.openvk.preload.geckox.a.a.a aVar) {
            this.f24353h = aVar;
            return this;
        }

        public final a a(String str) {
            this.f24355j = str;
            return this;
        }

        public final a a(File file) {
            this.f24357m = file;
            return this;
        }
    }

    public /* synthetic */ b(a aVar, byte b5) {
        this(aVar);
    }

    public static Executor g() {
        return t();
    }

    public static Executor h() {
        return t();
    }

    public static ExecutorService t() {
        IThreadPoolCallback iThreadPoolCallback = f24328r;
        ExecutorService threadPool = iThreadPoolCallback != null ? iThreadPoolCallback.getThreadPool() : null;
        if (threadPool != null) {
            return threadPool;
        }
        if (f24329s == null) {
            synchronized (b.class) {
                try {
                    if (f24329s == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                        f24329s = threadPoolExecutor;
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f24329s;
    }

    public final Context a() {
        return this.f24330a;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.a b() {
        return this.f24336g;
    }

    public final boolean c() {
        return this.f24343o;
    }

    public final List<String> d() {
        return this.f24335f;
    }

    public final List<String> e() {
        return this.f24334e;
    }

    public final JSONObject f() {
        return this.f24345q;
    }

    public final INetWork i() {
        return this.f24333d;
    }

    public final String j() {
        return this.k;
    }

    public final long k() {
        return this.f24337h.longValue();
    }

    public final String l() {
        return this.f24341m;
    }

    public final String m() {
        return this.f24340l;
    }

    public final File n() {
        return this.f24342n;
    }

    public final String o() {
        return this.f24338i;
    }

    public final com.bykv.vk.openvk.preload.geckox.a.a.c p() {
        return this.f24331b;
    }

    public final IStatisticMonitor q() {
        return this.f24332c;
    }

    public final String r() {
        return this.f24339j;
    }

    public final long s() {
        return this.f24344p;
    }

    private b(a aVar) {
        Context context = aVar.f24349d;
        this.f24330a = context;
        if (context == null) {
            throw new IllegalArgumentException("context == null");
        }
        List<String> list = aVar.f24347b;
        this.f24334e = list;
        this.f24335f = aVar.f24348c;
        this.f24331b = aVar.f24350e;
        this.f24336g = aVar.f24353h;
        Long l10 = aVar.f24354i;
        this.f24337h = l10;
        if (TextUtils.isEmpty(aVar.f24355j)) {
            this.f24338i = com.bykv.vk.openvk.preload.geckox.utils.a.a(context);
        } else {
            this.f24338i = aVar.f24355j;
        }
        String str = aVar.k;
        this.f24339j = str;
        this.f24340l = aVar.f24358n;
        this.f24341m = aVar.f24359o;
        this.f24344p = aVar.f24360p;
        if (aVar.f24357m == null) {
            this.f24342n = new File(context.getFilesDir(), "gecko_offline_res_x");
        } else {
            this.f24342n = aVar.f24357m;
        }
        String str2 = aVar.f24356l;
        this.k = str2;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("host == null");
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        if (l10 == null) {
            throw new IllegalArgumentException("appId == null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("deviceId key empty");
        }
        this.f24333d = aVar.f24346a;
        this.f24332c = aVar.f24351f;
        this.f24343o = aVar.f24352g;
    }

    public final void a(JSONObject jSONObject) {
        this.f24345q = jSONObject;
    }

    public static void a(IThreadPoolCallback iThreadPoolCallback) {
        f24328r = iThreadPoolCallback;
    }
}
