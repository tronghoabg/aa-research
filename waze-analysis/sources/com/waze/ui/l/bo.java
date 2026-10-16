package com.waze.ui.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bo {

    /* renamed from: a, reason: collision with root package name */
    public static final bo f42584a;

    /* renamed from: b, reason: collision with root package name */
    public static final bo f42585b;

    /* renamed from: c, reason: collision with root package name */
    public static final bo f42586c;

    /* renamed from: d, reason: collision with root package name */
    public static final bo f42587d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ bo[] f42588e;

    static {
        bo boVar = new bo("Idle", 0);
        f42584a = boVar;
        bo boVar2 = new bo("AnimatingCurrentContentOut", 1);
        f42585b = boVar2;
        bo boVar3 = new bo("AnimatingSizeForTargetContent", 2);
        f42586c = boVar3;
        bo boVar4 = new bo("AnimatingTargetContentIn", 3);
        f42587d = boVar4;
        bo[] boVarArr = {boVar, boVar2, boVar3, boVar4};
        f42588e = boVarArr;
        h.d.b.a(boVarArr);
    }

    public static bo[] values() {
        return (bo[]) f42588e.clone();
    }
}
