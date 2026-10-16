package com.waze.trip_overview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f40977a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f40978b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a[] f40979c;

    /* renamed from: d, reason: collision with root package name */
    private final bc f40980d;

    static {
        a aVar = new a("ON_SCREEN_BUTTON", 0, bc.f41056a);
        f40977a = aVar;
        a aVar2 = new a("KEYBOARD_BUTTON", 1, bc.f41058c);
        f40978b = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f40979c = aVarArr;
        h.d.b.a(aVarArr);
    }

    private a(String str, int i2, bc bcVar) {
        this.f40980d = bcVar;
    }

    public static a[] values() {
        return (a[]) f40979c.clone();
    }

    public final bc a() {
        return this.f40980d;
    }
}
