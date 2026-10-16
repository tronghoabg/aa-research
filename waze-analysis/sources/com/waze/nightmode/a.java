package com.waze.nightmode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32437a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f32438b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a[] f32439c;

    static {
        a aVar = new a("CarSensors", 0);
        f32437a = aVar;
        a aVar2 = new a("WazeSettings", 1);
        f32438b = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f32439c = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f32439c.clone();
    }
}
