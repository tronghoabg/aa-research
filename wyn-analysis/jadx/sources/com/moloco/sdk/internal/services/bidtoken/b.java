package com.moloco.sdk.internal.services.bidtoken;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f29415a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f29416b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f29417c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f29418d;

    static {
        b bVar = new b("NEEDS_REFRESH", 0);
        f29415a = bVar;
        b bVar2 = new b("EXPIRING", 1);
        f29416b = bVar2;
        b bVar3 = new b("NO_REFRESH_NEEDED", 2);
        f29417c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f29418d = bVarArr;
        ic.d.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f29418d.clone();
    }
}
