package com.moloco.sdk.internal.services.bidtoken;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c[] f29419a;

    static {
        c[] cVarArr = {new c("UNKNOWN", 0), new c("HTTP_REQUEST_TIMEOUT", 1), new c("UNKNOWN_HOST", 2)};
        f29419a = cVarArr;
        ic.d.t(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f29419a.clone();
    }
}
