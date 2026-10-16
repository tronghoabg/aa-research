package com.waze.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f25123a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f25124b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ t[] f25125c;

    static {
        t tVar = new t("BEACON", 0);
        f25123a = tVar;
        t tVar2 = new t("TIDE", 1);
        f25124b = tVar2;
        t[] tVarArr = {tVar, tVar2};
        f25125c = tVarArr;
        h.d.b.a(tVarArr);
    }

    public static t[] values() {
        return (t[]) f25125c.clone();
    }
}
