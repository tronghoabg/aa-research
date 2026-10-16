package com.google.firebase.perf.config;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g extends w {

    /* renamed from: a, reason: collision with root package name */
    private static g f10309a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map f10310b = DesugarCollections.unmodifiableMap(new f());

    public static synchronized g a() {
        g gVar;
        gVar = f10309a;
        if (gVar == null) {
            gVar = new g();
            f10309a = gVar;
        }
        return gVar;
    }

    protected static String e(long j2) {
        return (String) f10310b.get(Long.valueOf(j2));
    }

    protected static boolean f(long j2) {
        return f10310b.containsKey(Long.valueOf(j2));
    }

    @Override // com.google.firebase.perf.config.w
    protected final String c() {
        return "com.google.firebase.perf.LogSourceName";
    }

    @Override // com.google.firebase.perf.config.w
    protected final String d() {
        return "fpr_log_source";
    }
}
