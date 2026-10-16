package com.waze.location.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25300a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f25301b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f25302c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ b[] f25303d;

    static {
        b bVar = new b("Raw", 0);
        f25300a = bVar;
        b bVar2 = new b("LocationService", 1);
        f25301b = bVar2;
        b bVar3 = new b("LastKnown", 2);
        f25302c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f25303d = bVarArr;
        h.d.b.a(bVarArr);
    }

    public static b[] values() {
        return (b[]) f25303d.clone();
    }
}
