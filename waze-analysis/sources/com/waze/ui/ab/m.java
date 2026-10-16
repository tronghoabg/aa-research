package com.waze.ui.ab;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f41747a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f41748b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ m[] f41749c;

    static {
        m mVar = new m("BestRoute", 0);
        f41747a = mVar;
        m mVar2 = new m("SlowerRoute", 1);
        f41748b = mVar2;
        m[] mVarArr = {mVar, mVar2};
        f41749c = mVarArr;
        h.d.b.a(mVarArr);
    }

    public static m[] values() {
        return (m[]) f41749c.clone();
    }
}
