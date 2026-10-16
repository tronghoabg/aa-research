package com.waze.sharedui.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f38840a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f38841b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a[] f38842c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38843d;

    static {
        a aVar = new a("VERIFY_EMAIL", 0, "verify_email");
        f38840a = aVar;
        a aVar2 = new a("RESTART_ONBOARDING", 1, "restart_onboarding");
        f38841b = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f38842c = aVarArr;
        h.d.b.a(aVarArr);
    }

    private a(String str, int i2, String str2) {
        this.f38843d = str2;
    }

    public static a[] values() {
        return (a[]) f38842c.clone();
    }

    public final String a() {
        return this.f38843d;
    }
}
