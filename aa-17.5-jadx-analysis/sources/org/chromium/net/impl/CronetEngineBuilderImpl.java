package org.chromium.net.impl;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import defpackage.a;
import j$.util.DesugarCollections;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.ApiVersion;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;
import org.chromium.net.VersionSafeProxyOptions;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.impl.VersionSafeCallbacks;
import org.chromium.url.IDNStringUtil;

/* loaded from: classes2.dex */
public abstract class CronetEngineBuilderImpl extends ICronetEngineBuilder {
    protected final CronetLogger b;
    public final Context c;
    public boolean d;
    public String e;
    public String f;
    public boolean g;
    public boolean h;
    public boolean i;
    public HttpCacheMode j;
    public String k;
    public boolean l;
    private final List n;
    private final List o;
    private final CronetLogger.CronetSource p;
    private static final Pattern m = Pattern.compile("^[0-9\\.]*$");
    static final int a = VersionSafeCallbacks.ApiVersion.a();

    enum HttpCacheMode {
        DISABLED(0, false),
        DISK(1, true),
        DISK_NO_HTTP(1, false),
        MEMORY(2, true);

        public final int e;

        HttpCacheMode(int i, boolean z) {
            this.e = i;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpCacheSetting {
    }

    public static class Pkp {
        public Pkp(String str, byte[][] bArr, boolean z, Date date) {
        }
    }

    public static class QuicHint {
        public QuicHint(String str, int i, int i2) {
        }
    }

    public CronetEngineBuilderImpl(Context context, CronetLogger.CronetSource cronetSource) {
        this.n = new ArrayList();
        this.o = new ArrayList();
        long jUptimeMillis = SystemClock.uptimeMillis();
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.p = cronetSource;
        this.b = CronetLoggerFactory.a(applicationContext, cronetSource);
        try {
            this.g = true;
            this.h = true;
            this.i = false;
            c(0);
            this.l = false;
            this.d = true;
            e(jUptimeMillis, true, cronetSource);
        } catch (Throwable th) {
            e(jUptimeMillis, false, cronetSource);
            throw th;
        }
    }

    private final void e(long j, boolean z, CronetLogger.CronetSource cronetSource) {
        if (a >= 30) {
            return;
        }
        CronetLogger.CronetEngineBuilderInitializedInfo cronetEngineBuilderInitializedInfo = new CronetLogger.CronetEngineBuilderInitializedInfo();
        cronetEngineBuilderInitializedInfo.e = false;
        try {
            cronetEngineBuilderInitializedInfo.b = CronetLogger.CronetEngineBuilderInitializedInfo.Author.IMPL;
            cronetEngineBuilderInitializedInfo.h = Process.myUid();
            cronetEngineBuilderInitializedInfo.g = new CronetLogger.CronetVersion(ImplVersion.getCronetVersion());
            cronetEngineBuilderInitializedInfo.d = cronetSource;
            cronetEngineBuilderInitializedInfo.f = new CronetLogger.CronetVersion(ApiVersion.getCronetVersion());
            cronetEngineBuilderInitializedInfo.a = getLogCronetInitializationRef();
            cronetEngineBuilderInitializedInfo.e = Boolean.valueOf(z);
        } finally {
            cronetEngineBuilderInitializedInfo.c = (int) (SystemClock.uptimeMillis() - j);
            this.b.b(cronetEngineBuilderInitializedInfo);
        }
    }

    public final void a(String str, Set set, boolean z, Date date) {
        str.getClass();
        set.getClass();
        date.getClass();
        if (m.matcher(str).matches()) {
            throw new IllegalArgumentException(a.bq(str, "Hostname ", " is illegal. A hostname should not consist of digits and/or dots only."));
        }
        if (str.length() > 253) {
            throw new IllegalArgumentException(a.bq(str, "Hostname ", " is too long. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
        try {
            String strA = IDNStringUtil.a(str);
            HashMap map = new HashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                if (bArr == null || bArr.length != 32) {
                    throw new IllegalArgumentException("Public key pin is invalid");
                }
                map.put(Base64.encodeToString(bArr, 0), bArr);
            }
            this.o.add(new Pkp(strA, (byte[][]) map.values().toArray(new byte[map.size()][]), z, date));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(a.bq(str, "Hostname ", " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123."), e);
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        a(str, set, z, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        b(str, i, i2);
        return this;
    }

    public final void b(String str, int i, int i2) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(String.valueOf(str)));
        }
        this.n.add(new QuicHint(str, i, i2));
    }

    public final void c(int i) {
        HttpCacheMode httpCacheMode;
        HttpCacheMode httpCacheMode2 = HttpCacheMode.DISABLED;
        if (i == 0) {
            httpCacheMode = HttpCacheMode.DISABLED;
        } else if (i == 1) {
            httpCacheMode = HttpCacheMode.MEMORY;
        } else if (i == 2) {
            httpCacheMode = HttpCacheMode.DISK_NO_HTTP;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Unknown public builder cache mode");
            }
            httpCacheMode = HttpCacheMode.DISK;
        }
        if (httpCacheMode.e == 1 && this.f == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.j = httpCacheMode;
    }

    public final void d(String str) {
        if (!new File(str).isDirectory()) {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
        this.f = str;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        this.i = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        this.h = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        c(i);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.l = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.d = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        this.g = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return UserAgent.a(this.c, this.p, ImplVersion.getCronetVersion());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    protected long getLogCronetInitializationRef() {
        return 0L;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set<Integer> getSupportedConfigOptions() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        this.k = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setProxyOptionsV2(ProxyOptions proxyOptions) {
        new VersionSafeProxyOptions(proxyOptions);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        d(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.e = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }

    public CronetEngineBuilderImpl(Context context) {
        this(context, CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED);
    }
}
