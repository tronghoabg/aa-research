package com.waze.av.a;

import com.waze.navigate.AddressItem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f15819a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f15820b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f15821c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f15822d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f15823e;

    /* renamed from: f, reason: collision with root package name */
    public static final n f15824f;

    /* renamed from: g, reason: collision with root package name */
    public static final n f15825g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ n[] f15826h;

    static {
        n nVar = new n("All", 0);
        f15819a = nVar;
        n nVar2 = new n(AddressItem.HOME, 1);
        f15820b = nVar2;
        n nVar3 = new n(AddressItem.WORK, 2);
        f15821c = nVar3;
        n nVar4 = new n("Recent", 3);
        f15822d = nVar4;
        n nVar5 = new n("Favorite", 4);
        f15823e = nVar5;
        n nVar6 = new n("CalendarEvent", 5);
        f15824f = nVar6;
        n nVar7 = new n("PlannedDrive", 6);
        f15825g = nVar7;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7};
        f15826h = nVarArr;
        h.d.b.a(nVarArr);
    }

    public static n[] values() {
        return (n[]) f15826h.clone();
    }
}
