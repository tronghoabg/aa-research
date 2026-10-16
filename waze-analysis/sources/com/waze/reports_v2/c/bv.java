package com.waze.reports_v2.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bv {

    /* renamed from: a, reason: collision with root package name */
    public static final bv f34293a;

    /* renamed from: b, reason: collision with root package name */
    public static final bv f34294b;

    /* renamed from: c, reason: collision with root package name */
    public static final bv f34295c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ bv[] f34296d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ h.d.a f34297e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f34298f;

    /* renamed from: g, reason: collision with root package name */
    private final String f34299g;

    static {
        bv bvVar = new bv("NEVER_SET", 0, false, "NEVER_SET");
        f34293a = bvVar;
        bv bvVar2 = new bv("ENABLED", 1, true, "ENABLED");
        f34294b = bvVar2;
        bv bvVar3 = new bv("DISABLED", 2, false, "DISABLED");
        f34295c = bvVar3;
        bv[] bvVarArr = {bvVar, bvVar2, bvVar3};
        f34296d = bvVarArr;
        f34297e = h.d.b.a(bvVarArr);
    }

    private bv(String str, int i2, boolean z, String str2) {
        this.f34298f = z;
        this.f34299g = str2;
    }

    public static h.d.a b() {
        return f34297e;
    }

    public static bv[] values() {
        return (bv[]) f34296d.clone();
    }

    public final String a() {
        return this.f34299g;
    }

    public final boolean c() {
        return this.f34298f;
    }
}
