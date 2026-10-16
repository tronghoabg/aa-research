package com.waze.network.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f32212a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f32213b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ m[] f32214c;

    static {
        m mVar = new m("AAOS", 0);
        f32212a = mVar;
        m mVar2 = new m("ANDROID", 1);
        f32213b = mVar2;
        m[] mVarArr = {mVar, mVar2};
        f32214c = mVarArr;
        h.d.b.a(mVarArr);
    }

    public static m[] values() {
        return (m[]) f32214c.clone();
    }
}
