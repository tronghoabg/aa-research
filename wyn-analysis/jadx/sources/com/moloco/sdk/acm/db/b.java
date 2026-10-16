package com.moloco.sdk.acm.db;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f28352a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f28353b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f28354c;

    static {
        b bVar = new b("TIMER", 0);
        f28352a = bVar;
        b bVar2 = new b("COUNT", 1);
        f28353b = bVar2;
        b[] bVarArr = {bVar, bVar2};
        f28354c = bVarArr;
        ic.d.t(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f28354c.clone();
    }
}
