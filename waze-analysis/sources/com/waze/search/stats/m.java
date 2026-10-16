package com.waze.search.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f36070a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f36071b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ m[] f36072c;

    static {
        m mVar = new m("WAZE", 0);
        f36070a = mVar;
        m mVar2 = new m("GOOGLE", 1);
        f36071b = mVar2;
        m[] mVarArr = {mVar, mVar2};
        f36072c = mVarArr;
        h.d.b.a(mVarArr);
    }

    public static m[] values() {
        return (m[]) f36072c.clone();
    }
}
