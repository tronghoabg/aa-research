package com.waze.trip_overview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f41471a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f41472b;

    /* renamed from: c, reason: collision with root package name */
    public static final i f41473c;

    /* renamed from: d, reason: collision with root package name */
    public static final i f41474d;

    /* renamed from: e, reason: collision with root package name */
    public static final i f41475e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f41476f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ i[] f41477g;

    /* renamed from: h, reason: collision with root package name */
    private final bc f41478h;

    /* renamed from: i, reason: collision with root package name */
    private final bd f41479i;

    static {
        i iVar = new i("UNKNOWN", 0, null, null);
        f41471a = iVar;
        i iVar2 = new i("ROUTE", 1, bc.f41056a, bd.f41060a);
        f41472b = iVar2;
        i iVar3 = new i("ETA_LABEL", 2, bc.f41056a, bd.f41061b);
        f41473c = iVar3;
        i iVar4 = new i("CARD", 3, bc.f41057b, bd.f41062c);
        f41474d = iVar4;
        i iVar5 = new i("CARD_TOGGLE_ON", 4, bc.f41057b, bd.f41063d);
        f41475e = iVar5;
        i iVar6 = new i("CARD_TOGGLE_OFF", 5, bc.f41057b, bd.f41064e);
        f41476f = iVar6;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6};
        f41477g = iVarArr;
        h.d.b.a(iVarArr);
    }

    private i(String str, int i2, bc bcVar, bd bdVar) {
        this.f41478h = bcVar;
        this.f41479i = bdVar;
    }

    public static i[] values() {
        return (i[]) f41477g.clone();
    }

    public final bc a() {
        return this.f41478h;
    }

    public final bd b() {
        return this.f41479i;
    }
}
