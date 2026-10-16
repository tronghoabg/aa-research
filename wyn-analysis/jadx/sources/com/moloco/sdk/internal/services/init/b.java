package com.moloco.sdk.internal.services.init;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f29627a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f29628b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f29629c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f29630d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f29631e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f29632f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b[] f29633g;

    static {
        b bVar = new b("RequestTimeout", 0);
        f29627a = bVar;
        b bVar2 = new b("UnknownHostHttpError", 1);
        f29628b = bVar2;
        b bVar3 = new b("HttpSocketError", 2);
        f29629c = bVar3;
        b bVar4 = new b("HttpSslError", 3);
        f29630d = bVar4;
        b bVar5 = new b("PersistentHttpUnavailableError", 4);
        f29631e = bVar5;
        b bVar6 = new b("Unknown", 5);
        f29632f = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        f29633g = bVarArr;
        ic.d.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f29633g.clone();
    }
}
