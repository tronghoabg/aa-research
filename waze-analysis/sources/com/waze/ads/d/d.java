package com.waze.ads.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f14004a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f14005b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f14006c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f14007d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f14008e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ d[] f14009f;

    static {
        d dVar = new d("DISMISS_UNSPECIFIED", 0);
        f14004a = dVar;
        d dVar2 = new d("SWIPE_DOWN", 1);
        f14005b = dVar2;
        d dVar3 = new d("TAP_ON_MAP", 2);
        f14006c = dVar3;
        d dVar4 = new d("TAP_X_ICON", 3);
        f14007d = dVar4;
        d dVar5 = new d("BACK_BUTTON", 4);
        f14008e = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        f14009f = dVarArr;
        h.d.b.a(dVarArr);
    }

    public static d[] values() {
        return (d[]) f14009f.clone();
    }
}
