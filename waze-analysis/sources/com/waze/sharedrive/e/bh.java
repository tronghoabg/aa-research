package com.waze.sharedrive.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bh {

    /* renamed from: a, reason: collision with root package name */
    public static final bh f38427a;

    /* renamed from: b, reason: collision with root package name */
    public static final bh f38428b;

    /* renamed from: c, reason: collision with root package name */
    public static final bh f38429c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ bh[] f38430d;

    static {
        bh bhVar = new bh("CONTINUE_NAVIGATION", 0);
        f38427a = bhVar;
        bh bhVar2 = new bh("DISPLAY_DIFFERENT_DESTINATION_POPUP", 1);
        f38428b = bhVar2;
        bh bhVar3 = new bh("DISPLAY_SAME_DESTINATION_VIEWER_POPUP", 2);
        f38429c = bhVar3;
        bh[] bhVarArr = {bhVar, bhVar2, bhVar3};
        f38430d = bhVarArr;
        h.d.b.a(bhVarArr);
    }

    public static bh[] values() {
        return (bh[]) f38430d.clone();
    }
}
