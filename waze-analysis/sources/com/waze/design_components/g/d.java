package com.waze.design_components.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f23464a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f23465b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ d[] f23466c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23467d;

    static {
        d dVar = new d("ANDROID", 0, "http://schemas.android.com/apk/res/android");
        f23464a = dVar;
        d dVar2 = new d("APP", 1, "http://schemas.android.com/apk/res-auto");
        f23465b = dVar2;
        d[] dVarArr = {dVar, dVar2};
        f23466c = dVarArr;
        h.d.b.a(dVarArr);
    }

    private d(String str, int i2, String str2) {
        this.f23467d = str2;
    }

    public static d[] values() {
        return (d[]) f23466c.clone();
    }

    public final String a() {
        return this.f23467d;
    }
}
