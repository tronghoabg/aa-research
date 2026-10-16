package org.chromium.net.impl;

import android.content.Context;
import android.net.http.ConnectionMigrationOptions;
import android.net.http.DnsOptions;
import android.net.http.HttpEngine;
import android.net.http.QuicOptions;
import defpackage.ahkw;
import defpackage.akbz;
import defpackage.akcb;
import j$.time.Duration;
import j$.time.TimeConversions;
import j$.util.DateRetargetClass;
import j$.util.DesugarCollections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.chromium.net.AndroidProxyOptions;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes2.dex */
class AndroidHttpEngineBuilderWrapper extends ICronetEngineBuilder {
    private static boolean a;
    private static boolean b;
    private boolean c;
    private final Context d;
    private final HttpEngine.Builder e;

    /* renamed from: org.chromium.net.impl.AndroidHttpEngineBuilderWrapper$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[akcb.values().length];
            a = iArr;
            try {
                iArr[akcb.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[akcb.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[akcb.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public AndroidHttpEngineBuilderWrapper(Context context, HttpEngine.Builder builder) {
        this.d = context;
        this.e = builder;
    }

    private static int a(akcb akcbVar) {
        int iOrdinal = akcbVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        throw new AssertionError("Invalid OptionalBoolean value: ".concat(akcbVar.toString()));
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
        this.e.addPublicKeyPins(str, set, z, TimeConversions.convert(DateRetargetClass.toInstant(date)));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        this.e.addQuicHint(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        if (!this.c) {
            setUserAgent(getDefaultUserAgent());
        }
        return new AndroidHttpEngineWrapper(this.e.build());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z) {
        this.e.setEnableBrotli(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z) {
        this.e.setEnableHttp2(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i, long j) {
        this.e.setEnableHttpCache(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        if (!b) {
            ahkw.e("HttpEngBuilderWrap", "NetworkQualityEstimator is unsupported when HttpEngineNativeProvider is used");
            b = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.e.setEnablePublicKeyPinningBypassForLocalTrustAnchors(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z) {
        this.e.setEnableQuic(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return UserAgent.a(this.d, CronetLogger.CronetSource.CRONET_SOURCE_PLATFORM, HttpEngine.getVersionString());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set<Integer> getSupportedConfigOptions() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        akbz akbzVar = new akbz(str);
        ConnectionMigrationOptions.Builder builder = new ConnectionMigrationOptions.Builder();
        builder.setDefaultNetworkMigration(a(akbzVar.j()));
        builder.setPathDegradationMigration(a(akcb.a((Boolean) akbzVar.f("QUIC", "allow_port_migration", null, Boolean.class))));
        akcb akcbVarI = akbzVar.i();
        builder.setAllowNonDefaultNetworkUsage(a(akcbVarI));
        akcb akcbVar = akcb.TRUE;
        if (akcbVarI == akcbVar) {
            builder.setPathDegradationMigration(a(akcbVar));
        }
        HttpEngine.Builder builder2 = this.e;
        builder2.setConnectionMigrationOptions(builder.build());
        DnsOptions.StaleDnsOptions.Builder builder3 = new DnsOptions.StaleDnsOptions.Builder();
        int iC = akbzVar.c();
        if (iC != -1) {
            builder3.setFreshLookupTimeout(TimeConversions.convert(Duration.ofMillis(iC)));
        }
        int iD = akbzVar.d();
        if (iD != -1) {
            builder3.setMaxExpiredDelay(TimeConversions.convert(Duration.ofMillis(iD)));
        }
        builder3.setAllowCrossNetworkUsage(a(akbzVar.k())).setUseStaleOnNameNotResolved(a(akbzVar.n()));
        DnsOptions.Builder builder4 = new DnsOptions.Builder();
        builder4.setUseHttpStackDnsResolver(a(akbzVar.h())).setStaleDns(a(akbzVar.l())).setStaleDnsOptions(builder3.build()).setPreestablishConnectionsToStaleDnsResults(a(akcb.a((Boolean) akbzVar.f("QUIC", "race_stale_dns_on_connection", null, Boolean.class)))).setPersistHostCache(a(akbzVar.m()));
        int iE = akbzVar.e();
        if (iE != -1) {
            builder4.setPersistHostCachePeriod(TimeConversions.convert(Duration.ofMillis(iE)));
        }
        builder2.setDnsOptions(builder4.build());
        QuicOptions.Builder builder5 = new QuicOptions.Builder();
        if (akbzVar.g() != null) {
            for (String str2 : akbzVar.g().split(",")) {
                builder5.addAllowedQuicHost(str2);
            }
        }
        int iB = akbzVar.b();
        if (iB != -1) {
            builder5.setInMemoryServerConfigsCacheSize(iB);
        }
        String str3 = (String) akbzVar.f("QUIC", "user_agent_id", null, String.class);
        if (str3 != null) {
            builder5.setHandshakeUserAgent(str3);
        }
        int iA = akbzVar.a();
        if (iA != -1) {
            builder5.setIdleConnectionTimeout(TimeConversions.convert(Duration.ofSeconds(iA)));
        }
        builder2.setQuicOptions(builder5.build());
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        if (!a) {
            ahkw.e("HttpEngBuilderWrap", "Custom library loader is unsupported when HttpEngineNativeProvider is used.");
            a = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setProxyOptionsV2(ProxyOptions proxyOptions) {
        AndroidProxyOptions.apply(this.e, proxyOptions);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.e.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.e.setUserAgent(str);
        this.c = str != null;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
