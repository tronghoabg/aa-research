package com.moloco.sdk.internal.client_metrics_data;

import ic.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b[] f28496a;

    static {
        b[] bVarArr = {new b("Reason", 0), new b("AdType", 1), new b("Result", 2), new b("Country", 3), new b("RetryAttempt", 4), new b("Step", 5), new b("CreativeType", 6), new b("MissingFields", 7), new b("ParentViewType", 8)};
        f28496a = bVarArr;
        d.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f28496a.clone();
    }
}
