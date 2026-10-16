package com.waze.uid.stats;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f44765a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f44766b;

    /* renamed from: c, reason: collision with root package name */
    public static final m f44767c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ m[] f44768d;

    static {
        m mVar = new m("GUEST", 0);
        f44765a = mVar;
        m mVar2 = new m("EXISTING_USER", 1);
        f44766b = mVar2;
        m mVar3 = new m("NEW_ACCOUNT", 2);
        f44767c = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
        f44768d = mVarArr;
        h.d.b.a(mVarArr);
    }

    public static m[] values() {
        return (m[]) f44768d.clone();
    }
}
