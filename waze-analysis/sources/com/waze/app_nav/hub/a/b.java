package com.waze.app_nav.hub.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f15213a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f15214b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f15215c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b[] f15216d;

    static {
        b bVar = new b("LOW", 0);
        f15213a = bVar;
        b bVar2 = new b("STANDARD", 1);
        f15214b = bVar2;
        b bVar3 = new b("HIGH", 2);
        f15215c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f15216d = bVarArr;
        h.d.b.a(bVarArr);
    }

    public static b[] values() {
        return (b[]) f15216d.clone();
    }
}
