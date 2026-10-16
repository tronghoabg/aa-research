package com.waze;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f25473a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f25474b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f25475c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ m[] f25476d;

    static {
        m mVar = new m("CLEAN_RUN", 0);
        f25473a = mVar;
        m mVar2 = new m("UPGRADE", 1);
        f25474b = mVar2;
        m mVar3 = new m("NORMAL", 2);
        f25475c = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
        f25476d = mVarArr;
        h.d.b.a(mVarArr);
    }

    public static m[] values() {
        return (m[]) f25476d.clone();
    }
}
