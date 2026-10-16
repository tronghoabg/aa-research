package com.waze.t.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f40781a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f40782b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f40783c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ m[] f40784d;

    static {
        m mVar = new m("START_INITIAL_CONVERSATION_FLOW", 0);
        f40781a = mVar;
        m mVar2 = new m("START_NEW_CONVERSATION", 1);
        f40782b = mVar2;
        m mVar3 = new m("INTERRUPT", 2);
        f40783c = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
        f40784d = mVarArr;
        h.d.b.a(mVarArr);
    }

    public static m[] values() {
        return (m[]) f40784d.clone();
    }
}
