package com.waze.design_components.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23456a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f23457b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f23458c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f23459d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ b[] f23460e;

    static {
        b bVar = new b("TOP_RIGHT", 0);
        f23456a = bVar;
        b bVar2 = new b("BOTTOM_RIGHT", 1);
        f23457b = bVar2;
        b bVar3 = new b("BOTTOM_LEFT", 2);
        f23458c = bVar3;
        b bVar4 = new b("TOP_LEFT", 3);
        f23459d = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f23460e = bVarArr;
        h.d.b.a(bVarArr);
    }

    public static b[] values() {
        return (b[]) f23460e.clone();
    }
}
