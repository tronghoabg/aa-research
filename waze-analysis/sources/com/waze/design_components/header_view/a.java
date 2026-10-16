package com.waze.design_components.header_view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f23473a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f23474b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f23475c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f23476d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23477e;

    static {
        a aVar = new a("NONE", 0, 0);
        f23473a = aVar;
        a aVar2 = new a("ICON", 1, 1);
        f23474b = aVar2;
        a aVar3 = new a("BUTTON", 2, 2);
        f23475c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f23476d = aVarArr;
        h.d.b.a(aVarArr);
    }

    private a(String str, int i2, int i3) {
        this.f23477e = i3;
    }

    public static a[] values() {
        return (a[]) f23476d.clone();
    }

    public final int a() {
        return this.f23477e;
    }
}
