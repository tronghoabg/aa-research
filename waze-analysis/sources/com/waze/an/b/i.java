package com.waze.an.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f14633a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f14634b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f14635c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f14636d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ i[] f14637e;

    static {
        i iVar = new i("OutOfRange", 0);
        f14633a = iVar;
        i iVar2 = new i("Detected", 1);
        f14634b = iVar2;
        i iVar3 = new i("Approaching", 2);
        f14635c = iVar3;
        i iVar4 = new i("NoSurfaceZone", 3);
        f14636d = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        f14637e = iVarArr;
        h.d.b.a(iVarArr);
    }

    public static i[] values() {
        return (i[]) f14637e.clone();
    }
}
