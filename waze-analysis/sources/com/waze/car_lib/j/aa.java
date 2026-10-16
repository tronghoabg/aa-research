package com.waze.car_lib.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aa {

    /* renamed from: a, reason: collision with root package name */
    public static final aa f20167a;

    /* renamed from: b, reason: collision with root package name */
    public static final aa f20168b;

    /* renamed from: c, reason: collision with root package name */
    public static final aa f20169c;

    /* renamed from: d, reason: collision with root package name */
    public static final aa f20170d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ aa[] f20171e;

    static {
        aa aaVar = new aa("NoTraffic", 0);
        f20167a = aaVar;
        aa aaVar2 = new aa("InTrafficHiddenTooCloseToTurn", 1);
        f20168b = aaVar2;
        aa aaVar3 = new aa("InTrafficHiddenWithTimer", 2);
        f20169c = aaVar3;
        aa aaVar4 = new aa("InTraffic", 3);
        f20170d = aaVar4;
        aa[] aaVarArr = {aaVar, aaVar2, aaVar3, aaVar4};
        f20171e = aaVarArr;
        h.d.b.a(aaVarArr);
    }

    public static aa[] values() {
        return (aa[]) f20171e.clone();
    }
}
