package com.waze.uid.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f44415a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f44416b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ t[] f44417c;

    /* renamed from: d, reason: collision with root package name */
    private final int f44418d;

    static {
        t tVar = new t("TABLE", 0, 0);
        f44415a = tVar;
        t tVar2 = new t("SEPARATOR", 1, 1);
        f44416b = tVar2;
        t[] tVarArr = {tVar, tVar2};
        f44417c = tVarArr;
        h.d.b.a(tVarArr);
    }

    private t(String str, int i2, int i3) {
        this.f44418d = i3;
    }

    public static t[] values() {
        return (t[]) f44417c.clone();
    }

    public final int a() {
        return this.f44418d;
    }
}
