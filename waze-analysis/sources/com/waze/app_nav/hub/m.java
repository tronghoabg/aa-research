package com.waze.app_nav.hub;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f15353a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f15354b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ m[] f15355c;

    static {
        m mVar = new m("STOPPED", 0);
        f15353a = mVar;
        m mVar2 = new m("STARTED", 1);
        f15354b = mVar2;
        m[] mVarArr = {mVar, mVar2};
        f15355c = mVarArr;
        h.d.b.a(mVarArr);
    }

    public static m[] values() {
        return (m[]) f15355c.clone();
    }
}
