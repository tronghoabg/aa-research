package com.waze.notifications.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32572a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f32573b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ a[] f32574c;

    static {
        a aVar = new a("OPEN", 0);
        f32572a = aVar;
        a aVar2 = new a("CLOSED", 1);
        f32573b = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f32574c = aVarArr;
        h.d.b.a(aVarArr);
    }

    public static a[] values() {
        return (a[]) f32574c.clone();
    }
}
