package com.waze.c.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f18679a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f18680b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ m[] f18681c;

    static {
        m mVar = new m("NoAlternatives", 0);
        f18679a = mVar;
        m mVar2 = new m("Other", 1);
        f18680b = mVar2;
        m[] mVarArr = {mVar, mVar2};
        f18681c = mVarArr;
        h.d.b.a(mVarArr);
    }

    public static m[] values() {
        return (m[]) f18681c.clone();
    }
}
