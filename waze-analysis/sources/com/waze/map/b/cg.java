package com.waze.map.b;

import com.waze.navigate.AddressItem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cg {

    /* renamed from: a, reason: collision with root package name */
    public static final cg f28139a;

    /* renamed from: b, reason: collision with root package name */
    public static final cg f28140b;

    /* renamed from: c, reason: collision with root package name */
    public static final cg f28141c;

    /* renamed from: d, reason: collision with root package name */
    public static final cg f28142d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ cg[] f28143e;

    static {
        cg cgVar = new cg(AddressItem.HOME, 0);
        f28139a = cgVar;
        cg cgVar2 = new cg(AddressItem.WORK, 1);
        f28140b = cgVar2;
        cg cgVar3 = new cg("Parked", 2);
        f28141c = cgVar3;
        cg cgVar4 = new cg("Departure", 3);
        f28142d = cgVar4;
        cg[] cgVarArr = {cgVar, cgVar2, cgVar3, cgVar4};
        f28143e = cgVarArr;
        h.d.b.a(cgVarArr);
    }

    public static cg[] values() {
        return (cg[]) f28143e.clone();
    }
}
